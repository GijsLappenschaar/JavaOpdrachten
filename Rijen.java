import java.util.Scanner;
import java.util.Arrays;

class Rijen{
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("voer 5 Strings in: ");
    	String ding1 = input.next();
    	String ding2 = input.next();
    	String ding3 = input.next();
    	String ding4 = input.next();
    	String ding5 = input.next();
    	String[] dingen = {ding1, ding2, ding3, ding4, ding5};
    	String[] dingen2 = new String[5];
    	for (int i = 0;i<5;++i){
    		dingen2[i] = dingen[i];






    	}

      System.out.println(Arrays.toString(dingen));
      System.out.println(Arrays.toString(dingen2));

    	



    }


}