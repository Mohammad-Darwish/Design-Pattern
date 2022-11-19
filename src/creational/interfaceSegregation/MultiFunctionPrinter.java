package creational.interfaceSegregation;

public class MultiFunctionPrinter implements FaxMachine, Printer, Scanner {

    @Override
    public void print(Document d) {

    }

    @Override
    public void fax(Document d) {

    }

    @Override
    public void scan(Document d) {

    }
}
