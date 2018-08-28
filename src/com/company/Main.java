package com.company;


import java.util.ArrayList;
import java.util.function.Consumer;


public class Main {

    public static void main(String[] args) {

        MyArrayList lijst = new MyArrayList();

        lijst.add("Karen");
        lijst.add("Kristel");
        lijst.add("Kathleen");

        System.out.println(lijst);
    }
}


class MyArrayList extends ArrayList<String> {


    @Override
    public String toString() {

        String onderdelenLijst;

        forEach(this.) {


        }

        return "{" + onderdelenLijst + "}";
    }

}