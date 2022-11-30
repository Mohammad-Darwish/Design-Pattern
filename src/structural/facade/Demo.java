package structural.facade;

public class Demo {
    public static void main(String[] args) {
        // without facade
        Buffer buffer = new Buffer(30, 20);
        Viewport viewport = new Viewport(buffer, 30, 20, 0, 0);
        Console console = new Console(30, 20);
        console.addViewport(viewport);
        console.render();
        // with facade
        Console console2 = Console.newConsole(30, 20);
    }
}
