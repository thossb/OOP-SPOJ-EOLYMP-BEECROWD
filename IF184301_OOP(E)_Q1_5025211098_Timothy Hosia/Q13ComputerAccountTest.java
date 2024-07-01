import java.util.Scanner;//library used

public class Q13ComputerAccountTest 
{
    /*
        Timothy Hosia Budianto
        5025211098
        PBO E

        Declare variable myAccount as Q13ComputerAccount that connected from that class.
        print realname, username, and password earlier for checking before changing password.
        prompt to input new password to change old password.
        then print realname, username, and password again to check if the password has been changed.
     */

    public static void main(String[] args) 
    {
        Q13ComputerAccount myAccount = new Q13ComputerAccount("Fany Faizul","fannyfaizul","qwertyuiop");
        System.out.println(myAccount.getRealName());
        System.out.println(myAccount.getUserName());
        System.out.println(myAccount.getPassword());

        Scanner in = new Scanner(System.in);
        System.out.print("Type your new password : ");
        String temp; temp = in.nextLine();
        myAccount.setPassword(temp);

        System.out.println("");
        System.out.println(myAccount.getRealName());
        System.out.println(myAccount.getUserName());
        System.out.println(myAccount.getPassword());
    }

}
