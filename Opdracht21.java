import java.util.Scanner;

class Opdracht21 {
  public static void main(String[] args) {
    tellen(10);
    
  }
  public static int tellen(int x) {
  if (x >= 0){
    System.out.println(x);
    tellen(x - 1);
    return 0;
}
  else{

    return 0;
  }
}
}