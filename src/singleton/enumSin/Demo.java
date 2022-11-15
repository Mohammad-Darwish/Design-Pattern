package singleton.enumSin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {
    public static void saveToFile(EnumBasedSingleton singleton,
                                  String fileName) throws Exception {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(singleton);
        }
    }

    static EnumBasedSingleton readFromFile(String filename) throws Exception {
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            return (EnumBasedSingleton) objectIn.readObject();
        }
    }

    public static void main(String[] args) throws Exception {
        String filename = "myfile.bin";
//        EnumBasedSingleton singleton = EnumBasedSingleton.INSTANCE;
//        singleton.setValue(111);
//        saveToFile(singleton, filename);
        EnumBasedSingleton basicSingleton = readFromFile(filename);
        System.out.println(basicSingleton.getValue());
    }
}
