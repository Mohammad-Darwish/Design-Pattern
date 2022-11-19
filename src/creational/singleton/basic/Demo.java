package creational.singleton.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {
    public static void saveToFile(BasicSingleton singleton,
                                  String fileName) throws Exception {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(singleton);
        }
    }

    static BasicSingleton readFromFile(String filename) throws Exception {
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            return (BasicSingleton) objectIn.readObject();
        }
    }

    public static void main(String[] args) throws Exception {
        BasicSingleton singleton = BasicSingleton.getINSTANCE();
        singleton.setValue(11);
        String filename = "singleton.bin";
        saveToFile(singleton, filename);
        singleton.setValue(222);
        BasicSingleton singleton2 = readFromFile(filename);
        System.out.println(singleton2 == singleton);
        System.out.println(singleton.getValue());
        System.out.println(singleton2.getValue());
    }
}
