public class Q16FractionTest 
{
    /*
        Timothy Hosia Budianto
        5025211098
        PBO E

        Declare the variable f1 and f2 as Q16Fraction. then print f1.toString() to test the program.
        print the output of getproduct and getsum function
     */
    
    public static void main(String[] args) 
    {
        Q16Fraction f1 = new Q16Fraction(1, 2); Q16Fraction f2 = new Q16Fraction(3, 7);
        System.out.println("Fraction 1 is "+f1.toString());
        System.out.println("Product of the two fraction is "+f2.getProduct(f1));
        System.out.println("Sum of the two fraction is "+f2.getSum(f1));
    }
}
