package array;

public class HighArrayApp {
    public static void main(String[] args) {

        HighArray app = new HighArray(5);

        app.insert(2);
        app.insert(3);
        app.insert(4);

        app.show();

        System.out.println("\n");
        System.out.println( app.find(4));
        app.detele(2);
        app.show();
    }
}
