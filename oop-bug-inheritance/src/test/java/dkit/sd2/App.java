package dkit.sd2;

public class App {
    public static void main( String[] args )
    {
        App app = new App();
        app.start();
    }

    public void start() {
        Bug bugsy=new Bug(10);
        bugsy.move();
        bugsy.turn();
        bugsy.move();

    }
}
