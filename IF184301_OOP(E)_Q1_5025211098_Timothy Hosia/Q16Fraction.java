public class Q16Fraction 
{
    /*
        Timothy Hosia Budianto
        5025211098
        PBO E

        Declare variable numerator and denominator as private int.
        make getter from numerator and denominator.

        getproduct use Q16Fraction variable as parameter to operate with other fractions, same as getSum.

        getpruduct algoritma -> (f1num*f2num)/(f1den*f2den)
        getpruduct algoritma -> (f1num*f2den+f1den*f2num)/(f1den*f2den)

        and toString function is used to see the fraction.
     */

    private int numerator, denominator;

    public Q16Fraction(int num,int denom)
    {
        this.numerator=num;
        this.denominator=denom;
    }

    public int getDenominator() 
    {
        return denominator;
    }

    public int getNumerator() 
    {
        return numerator;
    }

    public String toString()
    {
        return (numerator+"/"+denominator);
    }

    public String getProduct(Q16Fraction f1)
    {
        int e3 = numerator*f1.numerator;
        int d3 = denominator* f1.denominator;
        return (e3+"/"+d3);
    }

    public String getSum(Q16Fraction f1)
    {
        int e3 = numerator*f1.denominator+ f1.numerator*denominator;
        int d3 = denominator* f1.denominator;
        return (e3+"/"+d3);

    }
}
