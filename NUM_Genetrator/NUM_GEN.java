import java.util.Scanner; // import the Scanner class 
import java.util.Random;
class NUM_Genetrator {
  public static void main(String[] args) {
    Scanner mynum = new Scanner(System.in);
    int number;

    System.out.println("Enter a whole number, that you want as a mininum");  
    int min = mynum.nextInt();
    
  
    System.out.println("Enter a whole number, that you want as a max"); 
    int max = mynum.nextInt();
   
    Random actual_num = new Random();
    int rand_int1 = actual_num.nextInt(max - min + 1) + min;
    


  
  
   while(true){
    System.out.println("Enter a whole number"); 
    number = mynum.nextInt();   
       
    System.out.println("number is: " + number);   
    

    if (number == rand_int1){
        System.out.println("Congrats, you just guessed the right number");
        break;
    }else if (number<min){
      System.out.println("Number is too low");
    }else if (number>max){
      System.out.println("Number is too high");
    }else{
      System.out.println(" Wrong number choose again");
    }
   }

  }
}

