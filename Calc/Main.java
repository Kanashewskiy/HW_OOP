public class Main {

    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new LogCalcFactory(new FileLog());
        View view = new View(calculableFactory);
        view.run();
    }
}
