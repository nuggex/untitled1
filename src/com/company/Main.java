package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account myAccount = new Account();

        System.out.print("Hur många personer vill du lägga till: ");
        int count = sc.nextInt();
        Account[] list = new Account[count];
        for (int i = 0; i < count; i++) {
            sc = new Scanner(System.in);
            do {
                System.out.println("Ge användar namn måste vara 8 tecken lång: ");
            }while(!myAccount.setUsername(sc.nextLine()));
            do {
                System.out.println("Ge födelseår: ");
            }
            while(!myAccount.setbirthYear(sc.nextInt()));
            do {
                System.out.println("Ge födelsemånad: ");
            }while (!myAccount.setbirthMonth(sc.nextInt()));
            do {
                System.out.println("Ge födelsedag: ");
            }while (!myAccount.setbirthDay(sc.nextInt()));
            myAccount.setList(i);
        }
        int i= 0;
    while(i!=3)
        for(int j= 0; j<5; j++){
    System.out.print("vilken person vill du skriva ut: ");
        int index = sc.nextInt();
    list[index].getPerson();
    }
    }

}
