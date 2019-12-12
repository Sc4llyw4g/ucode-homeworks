package org.ucode.lesson3;

public class BasketSelection {

    public static void main(String[] args) {  //metodus es a neve main

        Student one1 = new Student("Bob", 170); //constructor  = objectum
        one1.name = "Bob";  //meghatarozom a jellegzetessegeket
        one1.hight = 170;
        if (one1.hight > 150) { //megnezem az objectum jellegzetessege nagyobb 150
            System.out.println(one1.name); // ha nagzobb kinyomtatja
        }

        Student one2 = new Student("Dave", 160);
        one2.name = "Dave";
        one2.hight = 160;
        if (one2.hight > 150) {
            System.out.println(one2.name);
        }

        Student one3 = new Student("Gyuri", 140);
        one3.name = "Gyuri";
        one3.hight = 140;
        if (one3.hight > 150) {
            System.out.println(one3.name);
        }


    }

}

