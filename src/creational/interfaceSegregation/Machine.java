package creational.interfaceSegregation;

@Deprecated
interface Machine {
    void print(Document d);

    void fax(Document d);

    void scan(Document d);
}
