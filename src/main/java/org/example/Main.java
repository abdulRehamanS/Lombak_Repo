package org.example;

public class Main {
    public static void main(String[] args) {


        User us = new User();
        us.setName("abdul");
        us.getName();
        System.out.println(us.getName());
        us.setMail("abdulrehaman627@gmail.com");
        System.out.println(us.getMail());

//        lombok is used for avoid basic boiler code in the java classes
    }
}