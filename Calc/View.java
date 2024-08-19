import java.util.Scanner;

public class View {

    private final Scanner iScanner = new Scanner(System.in);
    private final ICalculableFactory calculableFactory;

    public View(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }
    public void run(){
        while (true){
            Complex firstArg = promptComplex("Введите пеpвый аpгумент: ");
            Calculable calculator = calculableFactory.create(firstArg);
            label:
            while (true){
                String cmd = prompt("Введите команду (+, *, :, -, =): ");
                switch (cmd) {
                    case "+": {
                        Complex arg = promptComplex("Введите втоpой аpгумент: ");
                        calculator.sum(arg);
                        continue;
                    }
                    case "*": {
                        Complex arg = promptComplex("Введите втоpой аpгумент: ");
                        calculator.multi(arg);
                        continue;
                    }
                    case ":": {
                        Complex arg = promptComplex("Введите втоpой аpгумент: ");
                        calculator.div(arg);
                        continue;
                    }
                    case "-": {
                        Complex arg = promptComplex("Введите втоpой аpгумент: ");
                        calculator.diff(arg);
                        continue;
                    }
                    case "=":
                        System.out.printf("Pезультат %s\n", calculator.getResult());
                        break label;
                }
            }
            String cmd = prompt("Еще посчитать (y/n)? ");
            if (cmd.equals("n")){
                break;
            }
        }
    }
    private String prompt(String msg){
        System.out.print(msg);
        return iScanner.nextLine();
    }
    private double promptDouble(String msg){
        System.out.print(msg);
        return Double.parseDouble(iScanner.nextLine());
    }
    private Complex promptComplex(String msg){
        System.out.println(msg);
        double inputRe = promptDouble("Введите вещественную часть: ");
        double inputIm = promptDouble("Введите мнимую часть: ");
        return new Complex(inputRe, inputIm);
    }
}
