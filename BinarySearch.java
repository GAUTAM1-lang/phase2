package arraysProgram;


import java.util.Scanner;
public class BinarySearch
{
 public static int search(int[ ] arr, int key)
 {
   int loIndex = 0; // Lowest index of the array.
   int hiIndex = arr.length - 1; // Highest index.
   int midIndex; // Middle index.
  
  while(hiIndex >= loIndex)
  {
	midIndex = (hiIndex + loIndex)/2; //  Getting the middle index. 
	if(key == arr[midIndex])
	 return midIndex; // key found and exits from array. 
	if(key < arr[midIndex])
	  hiIndex = midIndex - 1;
	else
	  loIndex = midIndex + 1;	
  }
  return -1; // Indicates key not found in the array.
 }
public static void main(String[] args) 
{
  Scanner sc = new Scanner(System.in);
  int[ ] arr = new int[10];
  System.out.println("Enter 10 numbers in ascending order: ");
 for(int i = 0; i < 10; i++)
 {
     arr[i] = sc.nextInt();
 }
System.out.println("Enter a number that has to be searched: ");
int key = sc.nextInt();
int i = BinarySearch.search(arr, key);
System.out.println(i);
 }
}