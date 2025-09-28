package model;
// Create account backend class
// 24/09/2025

public class UserCreateAccount extends UserSignIn
{
    private String confirmPass;
    private String firstName;
    private String lastName;

    public UserCreateAccount(String email, String pass, String confirmPass, String firstName, String lastName)
    {
        super(email,pass);
        this.confirmPass = confirmPass;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName =  firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setConfirmPass(String confirmPass)
    {
        this.confirmPass = confirmPass;
    }
    public String getLastName()
    {
        return lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getConfirmPass()
    {
        return confirmPass;
    }

}