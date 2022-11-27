package structural.decorator.string;

public class Demo {
    public static void main(String[] args) {
        MagicString string = new MagicString("Hello World!");
        System.out.println("Number of vowels in string is :" + string.getNumberOfVowels());
    }
}
