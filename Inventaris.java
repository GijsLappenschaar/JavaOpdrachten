import java.util.Scanner;

class Inventaris{
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("het menu:");
        System.out.println("1. touw");
        System.out.println("2. fakkels");
        System.out.println("3. klimspullen");
        System.out.println("4. drinkwater");
        System.out.println("5. machete");
        System.out.println("6. kano");
        System.out.println("7. voedsel");
        System.out.print("Voer het nummer in van welk artikel je de prijs wilt weten: ");
        int nummer = input.nextInt();
        switch (nummer){
        case 1:
        	System.out.println("10 goud");
        	break;
        case 2:
            System.out.println("15 goud");
            break;
        case 3:
        	System.out.println("25 goud");
        	break;
        case 4:
        	System.out.println("1 goud");
        	break;
        case 5: 
        	System.out.println("20 goud");
        	break;
        case 6:
        	System.out.println("200 goud");
        	break;
        case 7:
        	System.out.println("1 goud");
        	break;




        }






    }



}