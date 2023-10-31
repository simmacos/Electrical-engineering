import java.util.Scanner;

import static java.awt.SystemColor.text;
public class Ohm {
    protected double voltage, ampere, ohm, watt;

    public void setVoltage ( double v )
    {
        while (v < 0) {
            System.out.println("Il valore non può essere negativo. Inserisci nuovamente il voltaggio:");
            v = input.nextDouble();
        }
        this.voltage = v;
    }
    public void setAmpere ( double a )
    {
        this.ampere = a;
    }
    public void setOhm ( double o )
    {
        this.ohm = o;
    }
    public void setWatt ( double w )
    {
        this.watt = w;
    }
    public double getVoltage ()
    {
        return voltage;
    }
    public double getAmpere ()
    {
        return ampere;
    }
    public double getOhm ()
    {
        return ohm;
    }
    public double getWatt ()
    {
        return watt;
    }

    Scanner input = new Scanner(System.in);
    TextOhm text = new TextOhm();

    public void calcOhm()
    {
        int choose;
        while(true)
        {
            text.printIntro();
            choose = input.nextInt();

            if(choose == 0 ) break;



        }
    }
    public void insertValues()
    {
        while(true)
        {
            text.printVoltage();
            System.out.println("(1)");

            text.printAmpere();
            System.out.println("(2)");

            text.printOhm();
            System.out.println("(3)");

            text.printWatt();
            System.out.println("(4)");

            Ohm ohmLaw = new Ohm();
            int ins = input.nextInt();
            if(ins == 0) break;
            double value = input.nextDouble();
            switch (ins) {
                case 1:
                    ohmLaw.setVoltage(value);

                    double j = ohmLaw.getVoltage();
                    System.out.println(j);
                    break;
            }
        }
    }
}
