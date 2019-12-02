package com.hillel.lecture_12;

public class MainEnum {


    public static void main(String[] args) {

        System.out.println(Phones.IPHONE.name());
        System.out.println(Phones.IPHONE.getModel());
        System.out.println(Phones.SAMSUNG.name());
        System.out.println(Phones.SAMSUNG.getModel());
        System.out.println(Phones.OPPO.getProducer());
        System.out.println(Phones.XIAOMI.getProducer());

//       sayHello(Phones.XIAOMI);

        Phones[] phones = Phones.values();
        for (Phones phone : phones) {
            System.out.println(phone.getModel() + " " + phone.getProducer());
        }

        Phones phones1 = Phones.valueOf("OPPO");
        System.out.println(phones1.getModel());

//        public static void sayHello(Phones phones) {
//                switch (phones) {
//                    case Phones.IPHONE:
//                        System.out.println("Say Hello " + Phones.IPHONE.getModel());
//                        break;
//                    case Phones.SAMSUNG:
//                        System.out.println("Say Hello " + Phones.SAMSUNG.getModel());
//                        break;
//                }
//        }
    }
}




