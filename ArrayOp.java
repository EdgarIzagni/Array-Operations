/**
 * library for one-dimensional array operations
 * @author edgar ochoa 
 * @version 1.0.0
 */

 //packages used
 import java.util.Scanner;

public class ArrayOp{

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
        int maximun = array[0]; 

        for( int i=1; i < (size); i++){
            if(array[i] > maximun){
                maximun = array[i];
            }
        }

        return maximun;
    }

    public static float maxValue(float array[], int size){
        float maximun = array[0]; 

        for( int i=1; i < (size); i++){
            if(array[i] > maximun){
                maximun = array[i];
            }
        }

        return maximun;
    }

    public static double maxValue(double array[], int size){
        double maximun = array[0]; 

        for( int i=1; i < (size); i++){
            if(array[i] > maximun){
                maximun = array[i];
            }
        }

        return maximun;
    }

    //minimum value

    public static int minValue(int array[], int size){
        int minimun = array[0]; 

        for( int i=1; i < (size); i++){
            if(array[i] < minimun){
                minimun = array[i];
            }
        }

        return minimun;
    }

    public static float minValue(float array[], int size){
        float minimun = array[0]; 

        for( int i=1; i < (size); i++){
            if(array[i] < minimun){
                minimun = array[i];
            }
        }

        return minimun;
    }

    public static double minValue(double array[], int size){
        double minimun = array[0]; 

        for( int i=1; i < (size); i++){
            if(array[i] < minimun){
                minimun = array[i];
            }
        }

        return minimun;
    }

    //Order of values
    //Determine how the values are ordered
    /*If the array is ordered:
      Increasingly, the method will return a 0
      Decreasing, the method will return a 1
    */
    /*Special cases:
      Disordered, the method will return 2
      Equal elements, the method will return a 3
    */

    public static int orderValues(int array[], int size){
        boolean increasingly = false; 
        boolean decreasing = false; 

        for(int i = 0; i < (size - 1); i++){
            if( array[i] < array[i + 1]){
                increasingly = true;
            } 
            if( array[i] > array[i + 1]){
                decreasing = true;
            }
        }

        int reply = -1; 

        if( increasingly == true && decreasing == false){
            reply = 0;
        }

        if( increasingly == false && decreasing == true){
            reply = 1; 
        }

        if( increasingly == true && decreasing == true){
            reply = 2;
        }

        if( increasingly == false && decreasing == false){
            reply = 3;
        }

        return reply;
    }

    public static int orderValues(double array[], int size){
        boolean increasingly = false; 
        boolean decreasing = false; 

        for(int i = 0; i < (size - 1); i++){
            if( array[i] < array[i + 1]){
                increasingly = true;
            } 
            if( array[i] > array[i + 1]){
                decreasing = true;
            }
        }

        int reply = -1; 

        if( increasingly == true && decreasing == false){
            reply = 0;
        }

        if( increasingly == false && decreasing == true){
            reply = 1; 
        }

        if( increasingly == true && decreasing == true){
            reply = 2;
        }

        if( increasingly == false && decreasing == false){
            reply = 3;
        }

        return reply;
    }

    public static int orderValues(float array[], int size){
        boolean increasingly = false; 
        boolean decreasing = false; 

        for(int i = 0; i < (size - 1); i++){
            if( array[i] < array[i + 1]){
                increasingly = true;
            } 
            if( array[i] > array[i + 1]){
                decreasing = true;
            }
        }

        int reply = -1; 

        if( increasingly == true && decreasing == false){
            reply = 0;
        }

        if( increasingly == false && decreasing == true){
            reply = 1; 
        }

        if( increasingly == true && decreasing == true){
            reply = 2;
        }

        if( increasingly == false && decreasing == false){
            reply = 3;
        }

        return reply;
    }

    //Array ordering
    //The array will be sorted in increasing order
    //The same array will be returned, but with the values ordered

    public static int[] arrayOrdering(int array[], int size){
        int aux;
        while(orderValues(array, size) != 0){
            for( int i = 0; i < (size - 1); i++){
                if( array[i] > array[i + 1]){
                    aux = array[i];
                    array[i] = array[i + 1]; 
                    array[i + 1] = aux;
                }
            }
        }
        
        return array;
    }

    public static float[] arrayOrdering(float array[], int size){
        float aux;
        while(orderValues(array, size) != 0){
            for( int i = 0; i < (size - 1); i++){
                if( array[i] > array[i + 1]){
                    aux = array[i];
                    array[i] = array[i + 1]; 
                    array[i + 1] = aux;
                }
            }
        }
        
        return array;
    }

    public static double[] arrayOrdering(double array[], int size){
        double aux;
        while(orderValues(array, size) != 0){
            for( int i = 0; i < (size - 1); i++){
                if( array[i] > array[i + 1]){
                    aux = array[i];
                    array[i] = array[i + 1]; 
                    array[i + 1] = aux;
                }
            }
        }
        
        return array;
    }
}


