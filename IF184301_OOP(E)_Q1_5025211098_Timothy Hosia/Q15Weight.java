public class Q15Weight 
{
    /*
        Timothy Hosia Budianto
        5025211098
        PBO E

        Declare the variable pounds as private double.
        The function getPounds has double variable return, to get weight in pounds.
        The method getKilograms has double variable return, to get weight in Kilograms.

        getKilograms function is using the pound returned from getpounds function then times it by 0.45359237 to get the kilograms value.

        constructor method is to assign pounds variable.
    */

    private double pounds;

    public double getPounds() 
    {
        return pounds;
    }
    public double getKilograms() 
    {
        return pounds*0.45359237;
    }

    //constructor
    public Q15Weight(double p)
    {
        this.pounds = p;
    }
}
