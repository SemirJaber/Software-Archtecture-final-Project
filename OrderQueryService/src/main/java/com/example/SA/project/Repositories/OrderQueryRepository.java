package com.example.SA.project.Repositories;

import com.example.SA.project.domain.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderQueryRepository extends MongoRepository<Order,Long> {
    @Query("{'customer.customernumber'::#{#customernumber}}")
    Order findOrderwithcustomernumber(@Param("customernumber") long customernumber);

    @Query("{'product.productnumber'::#{#productnumber}}")
    Order findOrderwithproductnumber(@Param("productnumber") long productnumber);

    @Query("{'payment.paymentid'::#{#paymentid}}")
    Order findOrderwithpaymentnumber(@Param("paymentid") long paymentid);

}
