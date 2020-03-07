package com.project.findurpanditji;

public class UserValuesClass {
    String name;
    String username ;
    String password;
    String confirmPassword;
    String email;
    String userOption;  //for checking whether the user is a pandit or a jajman
    String userID;  //for giving a unique id to every user
    String date_of_birth; //for the date of birth of the user
    String gender; //for the gender of user
    String contactNo;
    String address;

    public UserValuesClass() {
//        this.name = name;
    }

    public UserValuesClass(String name, String username, String password, String email) {
        this.name = name;
        this.username = username;
        this.password = password;
//        this.confirmPassword = confirmPassword;
        this.email = email;
//        this.userOption = userOption;
//        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserOption() {
        return userOption;
    }

    public void setUserOption(String userOption) {
        this.userOption = userOption;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
