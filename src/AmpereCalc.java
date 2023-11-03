public class AmpereCalc extends Ohm {
    public AmpereCalc(Ohm ohmLaw){
        super();
        this.ohmLaw = ohmLaw;
    }

    public void printAmpere()
    {
        double w = ohmLaw.getWatt();
        double v = ohmLaw.getVoltage();
        double o = ohmLaw.getOhm();
        double result;

        if(v > 0 && o > 0)
        {
            ohmLaw.setAmpere(v / o);
        }
        else if (w > 0 && v > 0)
        {
            ohmLaw.setAmpere(w / v);
        }
        else if (w > 0 && o > 0)
        {
            ohmLaw.setAmpere(Math.sqrt(w / o));
        }

        result = ohmLaw.getAmpere();
        System.out.println("Ampere (I) : " + result);

    }
}
