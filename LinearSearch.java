
package arraysProgram;
import java.util.Scanner;
public class LinearSearch {
public static void main(String[ ] args) 
{
// Create an object of Scanner class with System.in.
    Scanner sc = new Scanner(System.in);	
    int[ ] numbers = new int[10];
    int num, flag = 0, iLoc = 1;
    System.out.println("Enter your 10 numbers in an array: ");
 
 for(int i = 0; i < 10; i++)
 {
    numbers[i] = sc.nextInt();
 }
 System.out.println("Enter a number that has to be searched: ");
 num = sc.nextInt();
for(int j = 0; j < 10; j++)
{	
 if(numbers[j] == num)
 {
// Finding the index location of a search element.	 
     flag = 1;
     iLoc = iLoc + j;
     break;
 }  
}
if(flag == 1)
     System.out.println("Number "+num+ " found successfully at a index location " +iLoc);	
else
     System.out.println("Number not found");
}
}