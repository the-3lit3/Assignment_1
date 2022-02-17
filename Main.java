package com.sanjaeJava.domain;
import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        //Card newCard = new Card();
        Client Obj1 = new Client();
        Obj1.clientPrompt();
        System.out.print(Obj1.Display());

    }
}
