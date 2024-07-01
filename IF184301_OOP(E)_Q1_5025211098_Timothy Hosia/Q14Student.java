public class Q14Student {
    /*
        Timothy Hosia Budianto
        5025211098
        PBO E

        Declare variable fullname, StudentID, Degree as private String.
        constructor function for filling each variable.
        toString function is for printing the template from the test.
     */

    private String fullname, StudentID, Degree;

    // constructor
    public Q14Student (String name, String ID, String degree)
    {
        this.Degree=degree;
        this.fullname=name;
        this.StudentID=ID;
    }

    public String toString()
    {
        return ("["+fullname+", ID: "+StudentID+", "+Degree+"]");
    }
}
