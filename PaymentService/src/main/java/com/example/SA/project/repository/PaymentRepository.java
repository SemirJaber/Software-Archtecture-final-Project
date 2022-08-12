package com.example.SA.project.repository;

import com.example.SA.project.domain.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends MongoRepository<Payment,Long> {
    public Payment findBycustomernumber(long customernumber);
    public Payment findByordernumber(long ordernumber);
}
