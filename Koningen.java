import java.util.Scanner;

class Koningen{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Voer het aantal provincies in van Melik: ");
        int melik_provincies = input.nextInt();
        System.out.println("Voer het aantal provincies in van Casik: ");
        int casik_provincies = input.nextInt();
        System.out.println("Voer het aantal provincies in van Balik: ");
        int balik_provincies = input.nextInt();
        System.out.println("Voer het aantal hertogdommen in van Melik: ");
        int melik_hertogdommen = input.nextInt();
        System.out.println("Voer het aantal hertogdommen in van Casik: ");
        int casik_hertogdommen = input.nextInt();
        System.out.println("Voer het aantal hertogdommen in van Balik: ");
        int balik_hertogdommen = input.nextInt();
        System.out.println("Voer het aantal landgoederen in van Melik: ");
        int melik_landgoederen = input.nextInt();
        System.out.println("Voer het aantal landgoederen in van Casik: ");
        int casik_landgoederen = input.nextInt();
        System.out.println("Voer het aantal landgoederen in van Balik: ");
        int balik_landgoederen = input.nextInt();
        int melik_totaal = (melik_provincies * 6) + (melik_hertogdommen * 3) + melik_landgoederen;
        int casik_totaal = (casik_provincies * 6) + (casik_hertogdommen * 3) + casik_landgoederen;
        int balik_totaal = (balik_provincies * 6) + (balik_hertogdommen * 3) + balik_landgoederen;
        System.out.println("Melik heeft " + melik_totaal + " punten");
        System.out.println("Casik heeft " + casik_totaal + " punten");
        System.out.println("Balik heeft " + balik_totaal + " punten");






    }





}