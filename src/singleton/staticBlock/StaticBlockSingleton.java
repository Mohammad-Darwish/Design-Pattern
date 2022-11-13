package singleton.staticBlock;

import java.io.File;
import java.io.IOException;

public class StaticBlockSingleton {

    private StaticBlockSingleton() throws IOException {
        System.out.println("Singleton is Initializing.");
        File.createTempFile(".", ".");
    }

    private static StaticBlockSingleton INSTANCE;

    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            System.out.println("Failed to Initialize");
        }
    }

    public static StaticBlockSingleton getINSTANCE() {
        return INSTANCE;
    }
}
