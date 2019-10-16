package com.company;

public class Account {

    private String username;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    Account[] list = new Account[10];
    public boolean setUsername(String u) {
        if (u.length() == 8) {
            username = u;

            return true;
        } else {
            System.out.println("Måste vara 8 tecken lång! ");
            return false;
        }

    }

    public boolean setbirthYear(int n) {
        if (n >= 0 && n <= 2019) {
            birthYear = n;
            return true;
        } else {
            System.out.print("Året måste vara mellan 0 och 2019");
            return false;
        }
    }

    public boolean setbirthMonth(int n) {
        if (n >= 0 && n <= 13) {
            birthMonth = n;
            return true;
        } else {
            System.out.print("Det finns bara 12 månader");
            return false;
        }
    }

    public boolean setbirthDay(int n) {
        if (n >= 0 && n <= 31) {
            birthDay = n;
            return true;
        } else {
            System.out.print("Det finns bara 31 dagar per månad");
            return false;
        }
    }

    public void getPerson() {

        System.out.println("Användare: " + username);
        System.out.print("Född : " + birthYear + ", " + birthMonth + ", " + birthDay);
    }
    public void setList(int i){
        for (int j=0;j<i;j++){
        list[i].username = username;
        list[i].birthYear = birthYear;
        list[i].birthMonth = birthMonth;
        list[i].birthDay = birthDay;
    }
    }
}
