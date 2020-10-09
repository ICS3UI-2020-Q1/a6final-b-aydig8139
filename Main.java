import java.util.Scanner;

/**
 * Compares two arrays
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create new scanner for user input
    Scanner input = new Scanner(System.in);

    //Ask the user to enter the values of the first arrays
    System.out.println("Please enter the values for the first array:");

    //create an array to store the 5 values
    int[] array1 = new int[5];

    //create a for loop to take in the numbers the user enters for array 1
    for(int i = 0; i < array1.length; i++){
      array1[i] = input.nextInt();
    }

    //ask the user for the value of the second array
    System.out.println("Please enter the values for the second array:");   

    //create an array to store the 5 values
    int[] array2 = new int[5];

    //create a for loop to take in the values of the second array
    for(int j = 0; j < array2.length; j++){
      array2[j] = input.nextInt();
    }
    
    //declare a variable that keeps count of how many times the elements of array 1 are not equal to those of array 2
    int count = 0;

    //create a for loop to keep count of how many times the elements are not equal to each other in the two arrays
    for(int i = 0; i<array1.length; i++){
     
     //write an if statement to increase the value of the variable count whenever the elements of the two arrays are not equal
     if (array1[i] != array2[i]){
      count = count + 1;
    }
    }

    //write an if statement to print out whther the arrays are the same or not depending on the count variable
    if (count >= 1){
        System.out.println("These arrays are not the same");
      }else{
        System.out.println("These arrays are the same");
      }
    } 
  }