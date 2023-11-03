public class TextOhm {

    public TextOhm()
    {

    }
    public void printIntro()
    {
        System.out.println("    What do you wanna calc? (X) ");
        System.out.println("1(P) - 2(A) - 3(R) - 4(P) - 0(ExiT)");
    }
    public void printVoltage ()
    {
        System.out.printf("Insert Voltage : ");
    }
    public void printAmpere ()
    {
        System.out.printf("Insert Ampere : ");
    }
    public void printOhm ()
    {
        System.out.printf("Insert Ohm : ");
    }
    public void printWatt ()
    {
        System.out.printf("Insert Watt : ");
    }
    public void space(){ System.out.println();}

    public void printIteration(){
        System.out.println("Insert new Values (1) ");
        System.out.println("Reset all values (2) ");
        System.out.println("Exit (0) ");
    }
}
