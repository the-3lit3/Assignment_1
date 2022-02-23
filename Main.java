package com.sanjaeJava.domain;
import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        Card newCard = new Card(287823,1234,2500.50, true);
        Client Obj1 = new Client(0,"Sanjae","Facey",34,newCard);
        //Obj1.clientPrompt();
            System.out.println("Enter Id # : ");
            Obj1.setIdNumber(scan.nextInt());
            System.out.println("First Name : ");
            Obj1.setFirstName(scan.next());
            System.out.println("Last Name : ");
            Obj1.setLastName(scan.next());
            System.out.println("Age : ");
            Obj1.setAge(scan.nextInt());
            System.out.println("Enter card details below : == \n");
            System.out.println("Enter Card # : ");
            newCard.setCardNumber(scan.nextInt());
            System.out.println("Enter PIN # : ");
            newCard.setPin(scan.nextInt());
            System.out.println("Enter Balance : $");
            newCard.setBalance(scan.nextDouble());
            System.out.println("Enter Status : ");
            newCard.setStatus(scan.nextBoolean());
            Obj1.Display();
        }


}
