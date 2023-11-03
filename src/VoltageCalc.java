public class VoltageCalc extends Ohm{
    public VoltageCalc(Ohm ohmLaw){
        super();
        this.ohmLaw = ohmLaw;
    }

    public void printVoltage()
    {
        double w = ohmLaw.getWatt();
        double a = ohmLaw.getAmpere();
        double o = ohmLaw.getOhm();
        double result;

        if(o > 0 && a > 0)
        {
            ohmLaw.setVoltage(o * a);
        }
        else if (w > 0 && a > 0)
        {
            ohmLaw.setVoltage(w / a);
        }
        else if (w > 0 && o > 0)
        {
            ohmLaw.setVoltage(Math.sqrt(w * o));
        }

        result = ohmLaw.getVoltage();
        System.out.println("Voltage (V) : " + result);

    }
}


