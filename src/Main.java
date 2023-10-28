
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Insert an Ihont!!");
        int numero = input.nextInt();

        switch (numero)
        {
            case 1:
                Ohm law = new Ohm();
                law.setVoltage(12);
                double stampa = law.getVoltage();
                law.calcOhm();
                System.out.println("Oggi e' un bel voltaggio " +stampa);
               // double voltage = getInput("Insert Voltage (V): ");
            break;
            default:
        }

        input.close();
    }

    private static double getInput(String prompt)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf(prompt);
        return input.nextDouble();
    }

}