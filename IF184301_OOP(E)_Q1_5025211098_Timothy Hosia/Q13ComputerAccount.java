public class Q13ComputerAccount 
{
    /*
        Timothy Hosia Budianto
        5025211098
        PBO E

     Declare variable realname, username, and password as string.
     this class will only use "get and set" method.
     constructor function has three parameter to input realname, username, and passkey.
    */

    private String realName,userName,password;

    //get and set
    public String getRealName() 
    {
        return realName;
    }
    public String getPassword() 
    {
        return password;
    }
    public String getUserName() 
    {
        return userName;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }
    
    //constructor
    public Q13ComputerAccount(String realname,String username, String passkey)
    {
        this.password =passkey;
        this.realName =realname;
        this.userName =username;
    }
}
