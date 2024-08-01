import java.util.Scanner;

class NummerVragen{
     public static int nummerVragen(String x, int y, int z){
     	Scanner input = new Scanner(System.in);
     	System.out.println(x);
     	int nummer = input.nextInt();
     	if (y < nummer && z > nummer){
     	return nummer;
      }
      return 0;


     }
    public static void main(String[] args) {
    	System.out.println(nummerVragen("Voer hier uw getal in: ", 0, 10));




    }



}