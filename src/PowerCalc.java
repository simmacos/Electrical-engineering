public class PowerCalc extends Ohm{
    public PowerCalc(Ohm ohmLaw){
        super();
        this.ohmLaw = ohmLaw;
    }

    public void printPower()
    {
        double v = ohmLaw.getVoltage();
        double a = ohmLaw.getAmpere();
        double o = ohmLaw.getOhm();
        double result;

        if(v > 0 && a > 0)
        {
            ohmLaw.setWatt( v * a);
        }
        else if (o > 0 && a > 0)
        {
            ohmLaw.setWatt(o * (a * a));
        }
        else if (v > 0 && o > 0)
        {
            ohmLaw.setWatt( (v * v) / o );
        }

        result = ohmLaw.getWatt();
        System.out.println("Power (P) : " + result);
    }
}
