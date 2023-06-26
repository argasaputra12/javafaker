package com.arga;

import com.github.javafaker.Business;
import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        //Name
        String randomName = faker.name().fullName();
        System.out.println("My Name : " + randomName);
        //Bussiness
        String randomCompany = faker.company().name();
        String randomCCType = faker.business().creditCardType();
        String randomCCNumber = faker.business().creditCardNumber();
        System.out.println("My Company : " + randomCompany );
        System.out.println("CC Type :" + randomCCType + " CC Number " + randomCCNumber);
        //Address
        String randomAddress = faker.address().fullAddress();
        System.out.println(randomAddress);
    }
}
