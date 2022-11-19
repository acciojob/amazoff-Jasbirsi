package com.driver;


public class Order {

    private String id;
    private int deliveryTime;

    public Order(String id, String deliveryTime) {

        // The deliveryTime has to converted from string to int and then stored in the attribute
        //deliveryTime  = HH*60 + MM
        this.id=id;
        int hour=0;
        int minute=0;
        for (int i=0; i<2; i++)
        {
            hour=(hour*10)+ (int)deliveryTime.charAt(i) -'0';
        }
        for (int i=3; i<5; i++)
        {
            minute=(minute*10)+ (int)deliveryTime.charAt(i) -'0';
        }
        this.deliveryTime=hour*60 + minute;
    }

    public String getId() {
        return id;
    }

    public int getDeliveryTime() {return deliveryTime;}
}
