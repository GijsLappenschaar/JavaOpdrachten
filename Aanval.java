import java.util.Scanner;
import java.awt.Toolkit;

class Aanval{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Rij: ");
		int rij = input.nextInt();
        System.out.println("Kolom: ");
        int kolom = input.nextInt();
        System.out.println("("+ (rij-1) +"," + kolom + ")" );
        System.out.println("("+ (rij+1) +"," + kolom + ")" );
        System.out.println("("+ rij +"," + (kolom+1) + ")" );
        System.out.println("("+ rij +"," + (kolom-1) + ")" );
        Toolkit.getDefaultToolkit().beep();


	}







}