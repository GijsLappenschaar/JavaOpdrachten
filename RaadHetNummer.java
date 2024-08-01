import java.util.Scanner;

class RaadHetNummer{
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Gebruiker 1, voer een nummer in: ");
    	int nummer = input.nextInt();
    	System.out.println("Gebruiker 2, raad het nummer: ");
    	int nummer2 = input.nextInt();
    	while (nummer != nummer2){
    		if (nummer > nummer2){
                System.out.println("Te laag! Probeer opnieuw.");
                nummer2 = input.nextInt();


    		}
    		else if (nummer < nummer2){


    			System.out.println("Te hoog! Probeer opnieuw.");
    			nummer2 = input.nextInt();
    		}
    		


    	}
    	System.out.println("Goed geraden!");







    }



}