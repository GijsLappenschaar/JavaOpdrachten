import java.util.Scanner;

class Uitkijktoren{
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Voer het x-cordinaat in: ");
    	int x = input.nextInt();
        System.out.println("Voer het y-cordinaat in: ");
    	int y = input.nextInt();
    	if (x > 0 && y > 0){
           System.out.println("De vijand is noordoost!") ;

    	}
    	else if (x < 0 && y > 0){

    		System.out.println("De vijand is noordwest!");
    	}
        else if (x > 0 && y < 0){
        	System.out.println("De vijand is zuidoost!");


        }
        else if (x < 0 && y < 0){

        	System.out.println("De vijand is zuidwest!");
        }


    }






}