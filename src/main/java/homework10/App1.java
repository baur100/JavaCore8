package homework10;

public class App1 {
    public static void main(String[] args) {
        Books[] katesbooks = {Books.FAIRYTALES, Books.NARRATE, Books.POETRY};
        Friend kate = new Friend("Kate", "Petrova", 3, katesbooks);

        kate.printBooks();
        kate.printInfo();
    }
}
