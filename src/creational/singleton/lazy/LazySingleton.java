package creational.singleton.lazy;

public class LazySingleton {

    private static LazySingleton INSTANCE;

    private LazySingleton() {
        System.out.println("Initializing a lazy singleton");
    }

    // synchronized for thread safe
    private static synchronized LazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

    // Doubled checked locking, don't use it, it is outdated it. (Also lazy)
//    public static LazySingleton getInstance(){
//        if(INSTANCE == null){
//            synchronized (LazySingleton.class){
//                if(INSTANCE == null) {
//                    INSTANCE = new LazySingleton();
//                }
//            }
//        }
//        return INSTANCE;
//    }
}
