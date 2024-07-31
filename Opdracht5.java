import java.util.Scanner;

class Opdracht5{
	public static void main(String[] args) {
		


		System.out.println("What kind of thing are we talking about?");
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        String a = input.next(); //Dit slaat de input op die de gebruiker geeft
        System.out.println("How would you describe it? Big? Azure? Tattered?");
        String b = input2.next(); /*
        dit slaat de tweede input op

        */
        String c = "of Doom"; // Dit slaat een string op
        String d = "3000"; //Dit slaat ook een string op
        System.out.println("The " + b + " " + a  + c + " " + d + "!");
	}



}