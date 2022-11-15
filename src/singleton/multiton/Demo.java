package singleton.multiton;

public class Demo {
    public static void main(String[] args) {
        Printer printer1 = Printer.get(Subsystem.PRIMARY);
        Printer printer2 = Printer.get(Subsystem.FALLBACK);
        Printer printer3 = Printer.get(Subsystem.AUXILIARY);
    }
}
