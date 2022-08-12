package com.example.RestClient.CustomerDTOs;

public class CustomerDTO {
    private long customernumber;
    private String name;
    private ContactDTO contactdto;
    private AddressDTO addressdto;

    public CustomerDTO(){}

    public ContactDTO getContactdto() {
        return contactdto;
    }

    public void setContactdto(ContactDTO contactdto) {
        this.contactdto = contactdto;
    }

    public AddressDTO getAddressdto() {
        return addressdto;
    }

    public void setAddressdto(AddressDTO addressdto) {
        this.addressdto = addressdto;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "customernumber=" + customernumber +
                ", name='" + name + '\'' +
                ", contactdto=" + contactdto +
                ", addressdto=" + addressdto +
                '}';
    }

    public CustomerDTO(long customernumber, String name) {
        this.customernumber = customernumber;
        this.name = name;
    }

    public long getCustomernumber() {
        return customernumber;
    }

    public void setCustomernumber(long customernumber) {
        this.customernumber = customernumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
