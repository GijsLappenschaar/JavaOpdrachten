import java.util.Scanner;

class InventarisTwee{
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
        System.out.println("Wat is je naam?");
        String naam1 = input.next();
        String naam2 = "Gijs";
        if (naam1.equals(naam2)){     
        switch (nummer){
        case 1:
        	System.out.println("15 goud");
        	break;
        case 2:
            System.out.println("7.5 goud");
            break;
        case 3:
        	System.out.println("12.5 goud");
        	break;
        case 4:
        	System.out.println("0.5 goud");
        	break;
        case 5: 
        	System.out.println("10 goud");
        	break;
        case 6:
        	System.out.println("100 goud");
        	break;
        case 7:
        	System.out.println("0.5 goud");
        	break;




        }}
        else {




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






    }



