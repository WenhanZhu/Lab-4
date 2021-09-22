/*
Lab 4
Partners: Wenhan Zhu
Date: 9/21/21
*/
import java.util.Random;

class Main {
  public static void main(String[] args) {
    Random r = new Random();
    int randomNum= r.nextInt(50)+1;
    int randomNum2=randomNum;
    System.out.println("The Random number is:"+ randomNum);

    if (randomNum>=0)
   while (randomNum>=0) {
   System.out.println(randomNum);
   randomNum--;}

  /* else if (randomNum<=0)
    while (randomNum<=0) {
   System.out.println(randomNum);
   randomNum++;}
*/
   if (randomNum2<=5)
   System.out.println("Ahoy mateys!");
   else if (randomNum2>25 && randomNum2<42)
   System.out.println("Cannonball!");
   else 
    System.out.println("Blast off!");
  }
}
  
