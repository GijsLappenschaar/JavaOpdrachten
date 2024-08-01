import java.util.Scanner;

class Zussen{
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in); 
    	System.out.print("Hoeveel eieren zijn er vandaag geoogst: ");
    	int inputeieren = input.nextInt();
    	int eierenperzus = inputeieren / 4;
    	int eierenover = inputeieren % 4;
    	System.out.println("Elke zus krijgt " + eierenperzus + "!");
    	System.out.println("Er blijven " + eierenover + " eieren over!");
    }



}
// Er blijven meer eieren over dan eieren die de zussen per persoon krijgen wanneer er 6, 7, 11 of 15 eieren geoogst worden.