package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner inputManager = new Scanner(System.in);
	    System.out.println("Indtast alder");
	    int brugerInput = inputManager.nextInt();
	    if (brugerInput >= 18){
	        System.out.println("Du er myndig");
        }
	    else{
	        System.out.println("Du er ikke myndig");
        }
	    inputManager.close();
		System.out.println("test");
    }
}
