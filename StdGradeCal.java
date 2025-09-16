import java.util.Scanner;
public class StdGradeCal {
    public static void main(String[]args){
         Scanner input =new Scanner(System.in);
         
         System.out.println("Enter quiz marks (1-15");
         int quiz=input.nextInt();
         System.out.println("Enter assg marks(1-10)");
         int Assigment=input.nextInt();
         
         System.out.println("Enter mids marks(1-25");
         int mids=input.nextInt();
         
         System.out.println("Enter final marks(1-50");
         int finals=input.nextInt();
         int totalmarks=quiz+Assigment+mids+finals;
         
         double Average =(double)totalmarks;
         System.out.println("Total marks"+totalmarks);
         System.out.println("Average marks"+ Average);
         
         if(Average>=85){
            System.out.println("Grade A");
         }
         else if (Average<=75)
             System.out.println("Grade B");
         
         else if(Average<=65)
             System.out.println("Grade C");
         else
             System.out.println("Grade F"); 
         
         
                 
    }
    
}
