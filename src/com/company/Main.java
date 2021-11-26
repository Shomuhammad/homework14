package com.company;

public class Main {

    public static void main(String[]args) {
Iphone iphone = new Iphone();
iphone.setName("Iphone");
iphone.setPrice(15000);
        iphone.setCamera(24);
        iphone.setWifi(true);
        System.out.println(iphone.getCamera()+ iphone.getPrice() + iphone.getName() + iphone.isWifi());
    }
}
