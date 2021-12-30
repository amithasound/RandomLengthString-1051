import java.util.Scanner;
import java.util.Random;


public class RandomLengthString{
   public static void main (String [] args){
   
   String input; 
   Scanner kb = new Scanner(System.in);
   Random rand = new Random();
   String newString = ""; 

   int lengthNeeded = rand.nextInt(20) + 1;

   
  do{ 
      System.out.println("Please enter a string with length " + lengthNeeded + ": " );
       input = kb.nextLine();
  }while(input.length() != lengthNeeded);

       for(int i = 0; i < lengthNeeded; i++){
   
          String letter = input.substring(i, i + 1); //take each character of the string one by one
   
         if(input.charAt(i) >= 97 && input.charAt(i)<= 122){ //ascii values of lowercase letter 
                newString = newString + letter.toUpperCase(); 
         }else if(input.charAt(i) >= 65 && input.charAt(i)<= 90){ //ascii values of uppercase
                newString = newString + letter.toLowerCase();
         }else{
                newString = newString + input.charAt(i); // if it is another charachter
         }
   
   
       }

      System.out.println(newString);



   }
}