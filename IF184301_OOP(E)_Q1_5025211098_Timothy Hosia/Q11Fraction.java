public class Q11Fraction 
{
    /*
        Timothy Hosia Budianto
        5025211098
        PBO E

        Declare variable e1,d1,e2,d2,add_num,multi_num, and denom as integer,

        for addition of two fraction, use the algoritma of addition numerator which will be called as add_num, (e1*d2+e2*d1).
        for multiplication of two fraction, use the algoritma of multiply numerator which will be called as multi_num, e1*e2.

        Finally  the algoritma of denom, d1*d2.  is used in addition and multiplication of two fractions.

        This Class will output rhe addition and multiplication of two fraction (from given testcases).       
     */

    public static void main(String[] args) 
    {
        int e1,d1,e2,d2,add_num,multi_num,denom;

        //testing 1/2 and 1/3
        e1 = 1; d1 = 2; e2 = 1; d2 = 3;
        add_num = e1*d2+e2*d1; multi_num = e1*e2;
        denom = d1*d2;
        System.out.println("The sum of 1/2 and 1/3 is "+add_num+"/"+denom);
        System.out.println("The product of 1/2 and 1/3 is "+multi_num+"/"+denom);
        System.out.println("");

        //testing 1/3 and 3/4
        e1 = 1; d1 = 3; e2 = 3; d2 = 4;
        add_num = e1*d2+e2*d1; multi_num = e1*e2;
        denom = d1*d2;
        System.out.println("The sum of 1/3 and 3/4 is "+add_num+"/"+denom);
        System.out.println("The product of 1/3 and 3/4 is "+multi_num+"/"+denom);
        System.out.println("");

        //testing 1/2 and 2/3
        e1 = 1; d1 = 2; e2 = 2; d2 = 3;
        add_num = e1*d2+e2*d1; multi_num = e1*e2;
        denom = d1*d2;
        System.out.println("The sum of 1/2 and 2/3 is "+add_num+"/"+denom);
        System.out.println("The product of 1/2 and 2/3 is "+multi_num+"/"+denom);
        System.out.println("");
        
        //testing 1/4 and 2/3
        e1 = 1; d1 = 4; e2 = 2; d2 = 3;
        add_num = e1*d2+e2*d1; multi_num = e1*e2;
        denom = d1*d2;
        System.out.println("The sum of 1/4 and 2/3 is "+add_num+"/"+denom);
        System.out.println("The product of 1/4 and 2/3 is "+multi_num+"/"+denom);
        System.out.println("");
    }
}