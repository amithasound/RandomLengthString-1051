import java.util.Scanner;
import java.util.Random;


public class RandomLengthStringBonus{
   public static void main (String [] args){
   
      String input; 
      Scanner kb = new Scanner(System.in);
      Random rand = new Random();
      String reversed = "";
      String newString = ""; 
      int lengthNeeded = rand.nextInt(20) + 1;
   
      for(int i = 0; i < lengthNeeded; i++){
         int ASCII = rand.nextInt(93) + 33; //ASCII values 33 - 126
         char var = (char)(ASCII); //need to type cast ASCII value so it turns to char
         newString = newString + var; //concat the char to string    
      }
      
      
      System.out.println("Generating a random string with length: " + lengthNeeded);
      System.out.println(newString);
        
      
     
      for(int i = 0; i < lengthNeeded; i++){
        
         String letter = newString.substring(i, i + 1); //take each character of the string one by one
      
         if(newString.charAt(i) >= 97 && newString.charAt(i)<= 122){//ascii values of lowercase letter 
            reversed = reversed + letter.toUpperCase(); 
         }else if(newString.charAt(i) >= 65 && newString.charAt(i)<= 90){//ascii values of uppercase
            reversed = reversed + letter.toLowerCase();
         }else{
            reversed = reversed + newString.charAt(i); // if it is another charachter
         }
      }
        
      System.out.println(reversed);
     
     
          
          
   }
}