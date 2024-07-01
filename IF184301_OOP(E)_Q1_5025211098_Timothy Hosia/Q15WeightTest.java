public class Q15WeightTest 
{
    /*
        Timothy Hosia Budianto
        5025211098
        PBO E

        Declare the variable myWeight as Q15Weight and fill the parameter as you like.
        for this class I will use 60 to test.

        then print my weight in pound using getPounds.
        and print my weight in kilogram using getKilograms.
     */

    public static void main(String[] args) 
    {
        Q15Weight myWeight = new Q15Weight(60);
        System.out.println("The weight in pound is "+ myWeight.getPounds() + " pound");
        System.out.println("Converted weight to kilogram is "+ myWeight.getKilograms() + " kilograms");
    }
}
