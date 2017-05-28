package com.example.david.password_validator;

public class Validator{

    public static void main(String[] args)
    {
        String pwd = "david11%1A11";
        System.out.println(valid(pwd));
    }

    public static String valid(String pwd)
    {
        //Checks each condition simultaneously:
        //Length must be >= 8
        //Must not be "password or Password"
        //Must contain at least one uppercase and at least one lowercase letter
        //Must contain at least one number
        if(notPassword(pwd) == true && passwordLength(pwd) == true && passwordUppercase(pwd)==true && passwordLowercase(pwd) == true && hasDigit(pwd)==true && hasSpecial(pwd))
        {
            return "Password is valid";
        }
        else
        {
            return "Password is invalid";
        }
    }

    //Checks if the password is "password or Password"
    public static boolean notPassword(String pwd)
    {
        String pwd1 = pwd;
        if (pwd1 != "password" && pwd1 != "Password")
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //Checks length of the password
    //Returns true if 8 or greater
    public static boolean passwordLength(String pwd)
    {
        String pwd1 = pwd;
        int pwdLength = pwd1.length();
        if(pwdLength >= 8)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //Checks for number in password string.
    public static boolean passwordNumber(String pwd)
    {
        String pwd1 = pwd;
        String regex = "[0-9]+";
        if(pwd1.matches(regex))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //Checks if the password contains an uppercase character
    //Checks the current password string against its forced lowercase form
    //If they are not the same, then it has an uppercase character
    public static boolean passwordUppercase(String pwd)
    {
        String pwd1 = pwd;
        boolean hasUppercase = !pwd1.equals(pwd1.toLowerCase());
        return hasUppercase;
    }

    //Checks if password contains a lowercase character
    public static boolean passwordLowercase(String pwd)
    {
        String pwd1 = pwd;
        boolean hasLowercase = !pwd1.equals(pwd1.toUpperCase());
        return hasLowercase;
    }

    //Checks password string for digit
    public static boolean hasDigit(String pwd)
    {
        String pwd1 = pwd;
        boolean hasDigit = pwd1.matches(".*\\d+.*");
        return hasDigit;
    }

    //Checks if password is completely alphanumeric
    //If not, hasSpecial returns true. If so, returns false.
    public static boolean hasSpecial(String pwd)
    {
        String pwd1 = pwd;
        String regex = "[a-zA-Z0-9 ]*";
        if (!pwd1.matches(regex))
        {
            return true;
        }
        else
        {
            return false;
        }

    }

}