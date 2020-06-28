/**
 * library for one-dimensional array operations
 * @author edgar ochoa 
 * @version 1.0.0
 */

 //packages used
 import java.util.Scanner;

public class ArrayOperations{

    //Enter values
    //You must first declare an array
    //The method will return the same array, but with their values in their respective positions

    public static int[] enterValues(int array[], int size){
        Scanner entrada = new Scanner(System.in); 

        for ( int i = 0; i < size; i++){
           System.out.print("position value " + (i+1) + " -->"); 
           array[i]=entrada.nextInt();
           System.out.println();
        }

        return array;
    }

    public static float[] enterValues(float array[], int size){
        Scanner entrada = new Scanner(System.in); 
        
        for ( int i = 0; i < size; i++){
           System.out.print("position value " + (i+1) + " -->"); 
           array[i]=entrada.nextFloat();
           System.out.println();
        }
        return array;
    }

    public static double[] enterValues(double array[], int size){
        Scanner entrada = new Scanner(System.in); 
        
        for ( int i = 0; i < size; i++){
           System.out.print("position value " + (i+1) + " -->"); 
           array[i]=entrada.nextDouble();
           System.out.println();
        }

        return array;
    }

    public static char[] enterValues(char array[], int size){
        Scanner entrada = new Scanner(System.in); 
        
        for ( int i = 0; i < size; i++){
           System.out.print("position value " + (i+1) + " -->"); 
           array[i]=entrada.next().charAt(0);
           System.out.println();
        }

        return array;
    }

    public static String[] enterValues(String array[], int size){
        Scanner entrada = new Scanner(System.in); 
        
        for ( int i = 0; i < size; i++){
           System.out.print("position value " + (i+1) + " -->"); 
           array[i]=entrada.nextLine();
           System.out.println();
        }

        return array;
    }

    //Print array 

    public static void printArray(int array[], int size){
        for(int i=0; i < size; i++){
            System.out.println(array[i] + " ");
        }
    }

    public static void printArray(float array[], int size){
        for(int i=0; i < size; i++){
            System.out.println(array[i] + " ");
        }
    }

    public static void printArray(double array[], int size){
        for(int i=0; i < size; i++){
            System.out.println(array[i] + " ");
        }
    }

    public static void printArray(char array[], int size){
        for(int i=0; i < size; i++){
            System.out.println(array[i] + " ");
        }
    }

    public static void printArray(String array[], int size){
        for(int i=0; i < size; i++){
            System.out.println(array[i] + " ");
        }
    }

    //maximum value

    public static int maxValue(int array[], int size){
        int maximun=array[0]; 

        for( int i=1; i < (size); i++){
            if(array[i] > maximun){
                maximun = array[i];
            }
        }

        return maximun;
    }

    public static float maxValue(float array[], int size){
        float maximun=array[0]; 

        for( int i=1; i < (size); i++){
            if(array[i] > maximun){
                maximun = array[i];
            }
        }

        return maximun;
    }

    public static double maxValue(double array[], int size){
        double maximun=array[0]; 

        for( int i=1; i < (size); i++){
            if(array[i] > maximun){
                maximun = array[i];
            }
        }

        return maximun;
    }

    

   




 






}


