import java.util.Scanner;

import static java.awt.SystemColor.text;
public class Ohm {
    protected double voltage, ampere, ohm, watt;
    Ohm ohmLaw;
    public Ohm()
    {
        ohmLaw = this;
    }

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

    boolean firstIteration = true;
    public void calcOhm()
    {
        int choose;
        boolean firstIteration = true;

            while (true)
            {
                if(!firstIteration)
                {
                    text.space();
                    text.printIteration();
                    text.space();

                    choose = input.nextInt();
                    switch (choose)
                    {
                        case 1:

                            break;
                        case 2:
                            ohmLaw.reset();
                            break;
                        case 3:
                            System.out.println("   ---/\\/\\/\\--- ");
                            System.exit(0);
                            break ;
                        default:
                            throw new IllegalStateException("Unexpected value: " + choose);
                    }
                }
                firstIteration = false;
                ohmLaw.insertValues();

                double result;
                VoltageCalc v = new VoltageCalc(ohmLaw);
                ResistCalc r = new ResistCalc(ohmLaw);
                AmpereCalc a = new AmpereCalc(ohmLaw);
                PowerCalc p = new PowerCalc(ohmLaw);

                v.printVoltage();
                a.printAmpere();
                r.printResist();
                p.printPower();
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

            System.out.println("Exit and Calculate (0)");

            int ins = input.nextInt();
            if(ins == 0) break;
            double value;
            switch (ins) {
                case 1:
                    System.out.printf("V : ");
                    value = input.nextDouble();
                    ohmLaw.setVoltage(value);
                    break;
                case 2:
                    System.out.printf("A : ");
                    value = input.nextDouble();
                    ohmLaw.setAmpere(value);
                    break;
                case 3:
                    System.out.printf("Ω : ");
                    value = input.nextDouble();
                    ohmLaw.setOhm(value);
                    break;
                case 4:
                    System.out.printf("W : ");
                    value = input.nextDouble();
                    ohmLaw.setWatt(value);
                    break;
            }
        }
    }
    public void reset()
    {
        voltage = 0.0;
        ampere = 0.0;
        ohm = 0.0;
        watt = 0.0;
    }
}
