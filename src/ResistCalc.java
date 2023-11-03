public class ResistCalc extends Ohm{
    public ResistCalc(Ohm ohmLaw){
        super();
        this.ohmLaw = ohmLaw;
    }

    public void printResist()
    {
        double v = ohmLaw.getVoltage();
        double a = ohmLaw.getAmpere();
        double w = ohmLaw.getWatt();
        double result;

        if(v > 0 && a > 0)
        {
            ohmLaw.setOhm( v / a);
        }
        else if (v > 0 && w > 0)
        {
            ohmLaw.setOhm((v * v) / w);
        }
        else if (w > 0 && a > 0)
        {
            ohmLaw.setOhm( w / (a * a) );
        }

        result = ohmLaw.getOhm();
        System.out.println("Resistance (R) : " + result);
    }
}
