package com.example.patterns.observer_pattern.observer;

public class ClientObserver implements Observer {
    String name;
    String email;
    String phoneNumber;
    boolean isOnApp;
    public ClientObserver(String name,String email,String phoneNumber, boolean isOnApp){
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.isOnApp=isOnApp;
    }

    public void sendNotification(){
        System.out.println("Sending notification to "+name+" at the app with email  "+this.email+" and phone number  "+this.phoneNumber);
    }
    public void sendEmail(){
        System.out.println("Sending notification to "+name+" at the email  "+this.email+" and phone number  "+this.phoneNumber);
    }

    @Override
    public void updateIfProductArrived() {
        if(this.isOnApp){
            sendNotification();
        }else{
            sendEmail();
        }
    }

    @Override
    public void updateIfProductFinished() {
        System.out.println("Product is out of stock!!!!!!!!!!!!!!");
    }
}
