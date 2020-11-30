package com.scorpa;

import java.util.Scanner;

public class Main {
static class Account{

static class savings{
public static int accNumber;
public static float balance;
public static String name = new String() ;
}
static  class  current{
public static int accNumber;
public static float balance;
public static String name = new String() ;
}
}
static class Activities extends Account {
static class checkBalance {
static void savingCheckBalance(){
float bal;
bal = Account.savings.balance;
System.out.println("Your balance is :" + bal);}
static void currentCheckBalance(){
float bal;
bal = Account.current.balance;
System.out.println("Your balance is :" + bal);}

}

public static void depositSaving(float amnt) {
Account.savings.balance += amnt;
System.out.println(amnt + " Deposited successfully \n" + "Your balance is :" + Account.savings.balance);

}
public static void depositCurrent(float amnt) {
Account.current.balance += amnt;
System.out.println(amnt + " Deposited successfully \n" + "Your balance is :" + Account.current.balance);

}

public static class widhraw {


public static void current(float amnt1) {
float overdraft = Account.current.balance + (Account.current.balance * 20 / 100);
if (amnt1 <= overdraft) {
Account.current.balance -= amnt1;
System.out.println(amnt1 + " withdrawn successfully ");
} else {
System.out.println("You have insufficient money ");

}
System.out.println("Your balance is :" + Account.current.balance);
}


public static void savings(float amnt) {
if (amnt < savings.balance) {
savings.balance -= amnt;
System.out.println(amnt + " withdrawn successfully ");
} else {
System.out.println("You have insufficient money please continue saving ");

}
System.out.println("Your balance is :" + savings.balance);
}

}
}

static class Saving extends Activities{
public static void display(){
System.out.println("Account number : "+savings.accNumber+"\nUser name : "+savings.name+"\nBalance : "+savings.balance);
System.out.println("****************ACTIVITIES********************");
System.out.println("1. DEPOSIT \t|\t2. CHECK BALANCE\t|\t3. WITHDRAW");
}
}

static class Current extends Activities {
public static void display(){
System.out.println("Account number : "+current.accNumber+"\nUser name : "+current.name+"\nBalance : "+current.balance);
System.out.println("****************ACTIVITIES********************");
System.out.println("1. DEPOSIT \t|\t2. CHECK BALANCE\t|\t3. WITHDRAW");
}
}


public static void main(String[] args) {
Saving s;
Current c;
Account a;
Activities A;

System.out.println("Welcome to our bank");
System.out.println("****************************************************");


System.out.println("Please key in your account number :");
Scanner number = new Scanner(System.in);
Account.savings.accNumber = Account.current.accNumber = number.nextInt() ;
System.out.println("Enter your full names :");
Scanner name = new Scanner(System.in);
Account.current.name = Account.savings.name = name.nextLine();
System.out.println("*********************ACOUNTS***********************");
int answer;
System.out.println("1. SAVINGS \n" +
"2. CURRENT \n Which account do you want to access? :");
Scanner ans = new Scanner(System.in);
answer = ans.nextInt();
if (answer == 1){
Saving.display();
Scanner act = new Scanner(System.in);
int act1 = act.nextInt();
switch (act1){
case 1:
  System.out.println("Enter the amount to be deposited");
  Scanner amnts = new Scanner(System.in);
  float amount = amnts.nextFloat();
  Activities.depositSaving(amount);
  break;
case 2:
  Activities.checkBalance.savingCheckBalance();
  break;
case 3:
  System.out.println("Enter the amount to be deposited");
  Scanner lev = new Scanner(System.in);
  float levin = lev.nextFloat();
  Activities.widhraw.savings(levin);
  break;

}
} else {
Current.display();
Scanner act = new Scanner(System.in);
int act1 = act.nextInt();
switch (act1){
case 1:
  System.out.println("Enter the amount to be deposited");
  Scanner amnts = new Scanner(System.in);
  float amount = amnts.nextFloat();
  Activities.depositCurrent(amount);
  break;
case 2:
  Activities.checkBalance.currentCheckBalance();
  break;
case 3:
  System.out.println("Enter the amount to be deposited");
  Scanner lev = new Scanner(System.in);
  float levin = lev.nextFloat();
  Activities.widhraw.current(levin);
  break;

}
}

}
}