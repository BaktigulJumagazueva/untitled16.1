package com.company;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Shark();
        Animal animal2= new Turtle();
        Animal animal3=new Eagle();

        Animal[] animals={animal,animal1,animal2,animal3};
        for (Animal i:animals) {
            System.out.println(i.getClass()+" : "+i.method());

        }
    }
}