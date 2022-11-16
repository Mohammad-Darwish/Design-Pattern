package singleton.testability;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class SingletonDatabase {

    private Dictionary<String, Integer> capitals = new Hashtable<>();
    private static int instanceCount = 0;

    public static int getCount() {
        return instanceCount;
    }

    public SingletonDatabase() {
        instanceCount++;
        System.out.println("Initializing database");

        try {
            File file = new File(
                SingletonDatabase.class.getProtectionDomain()
                    .getCodeSource().getLocation().getPath());
            Path path = Paths.get(file.getPath(), "capital.txt");
            List<String> lines = Files.readAllLines(path);
//            Iterables.partition(lines, 2,true)
//                .forEach(kv
//                    -> capitals.put(
//                    kv.get(0).trim(),
//                    Integer.parseInt(kv.get(1))
//                ));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
