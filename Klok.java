import java.util.Scanner;

class Klok{
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Voer een getal in: ");
    	int getal = input.nextInt();
    	int getal2 = getal % 2;
    	if (getal2 == 0){
    		System.out.println("Tick");


    	}
    	else {

    		System.out.println("Tock");
    	}




    }




}