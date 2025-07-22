package com.xworkz.aloevera.internal;

import java.io.*;

public class PG {

    String name;
    int sharing;
    int rent;


    public PG(String name, int sharing, int rent) {
        this.name = name;
        this.sharing = sharing;
        this.rent = rent;
    }

    public static void serialize() {
        try {
            PG pg = new PG("Sai Ganesh", 2, 6500);
            FileOutputStream fos = new FileOutputStream("file.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(pg);
            oos.close();
            fos.close();
            System.out.println("Object has been serialized");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void deserialize() {
        try {
            FileInputStream file = new FileInputStream("file.txt");
            ObjectInputStream object = new ObjectInputStream(file);
            PG pg = (PG) object.readObject();
            object.close();
            file.close();
            System.out.println("Deserialized object name: " + pg.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        serialize();

        deserialize();
    }
}
