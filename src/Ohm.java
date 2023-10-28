import java.util.Scanner;

public class Ohm {
    private double voltage, ampere, ohm, watt;

    public void setVoltage ( double v )
    {
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

    public void calcOhm()
    {
        Scanner input = new Scanner(System.in);

        Ohm text = new Ohm();
        text.printIntro();

        int num = input.nextInt();

        switch (num)
        {
            case 1:
                text.printIntro();
            break;

            default:
        }

    }
    public void printIntro()
    {
        System.out.println("What do you wanna calc?");
    }
}
