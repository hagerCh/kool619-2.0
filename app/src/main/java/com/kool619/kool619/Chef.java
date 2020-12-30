package com.kool619.kool619;

public class Chef {

    private String Area, ConfirmPassword,EmailID,Fname,House,Lname,Mobile,Password;

    public Chef(String Area, String confirmPassword, String emailID, String fname, String house, String lname, String mobile, String password) {
        this.Area = Area;
        ConfirmPassword = confirmPassword;
        EmailID = emailID;
        Fname = fname;
        House = house;
        Lname = lname;
        Mobile = mobile;
        Password = password;
    }

    public Chef() {
    }

    public String getArea() {
        return Area;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public String getEmailID() {
        return EmailID;
    }

    public String getFname() {
        return Fname;
    }

    public String getHouse() {
        return House;
    }

    public String getLname() {
        return Lname;
    }

    public String getMobile() {
        return Mobile;
    }

    public String getPassword() {
        return Password;
    }
}
