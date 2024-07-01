import java.util.Scanner;

public class Q12Time 
{
    /*
        Timothy Hosia Budianto
        5025211098
        PBO E

        this class use function named Degree to compute the degree that is created by hour hand and minute hand from a clock

        for every minute, the minute hand moves 6 degrees.
        for every hour, the hour hand moves 30 degrees. So we can conclude that every minute, hour hand will have moved 0.5 degrees.

        modulo the hour by 12 because only 12 point of hour in clock.
        and if minutes inputted as 60, then increment the hour and turn the minutes into 0.

        The degree will be computed by counter clockwise computation and from hour hand to minute hand method,
        then we compute the degree with algororitma and save it at variable hdeg(hour hand degree)-mdeg(minute hand degree) if hdeg>=mdeg
        otherwise, use 360+hdeg-mdeg.
        
        the program will prompt the user to input hour and minute.
     */

    public static int Degree(int m, int h)
    {
        int hdeg = h*30 + m/2, mdeg = m*6;
        if(hdeg-mdeg>=0) return hdeg-mdeg;
        else return 360+hdeg-mdeg;
    }
    
    public static void main(String[] args) 
    {
        System.out.println("input the time of the clock : "); 
        Scanner in = new Scanner(System.in);
        int h = in.nextInt(), m = in.nextInt();
        if(m==60)
        {
            h++;
            m-=60;
        }
        h%=12;
        System.out.println("the degree that the 2 arm of the clock make is "+ Q12Time.Degree(m,h) + " degree"); 
    }
}
