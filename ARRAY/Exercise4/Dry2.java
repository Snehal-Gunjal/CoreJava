import java.util.*;
class Dry2{
    public static void main( String[]args ){
        Scanner sc = new Scanner( System.in );
        System.out.println( "Enter Size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Insert Elements in array:");
        for( int i=0 ; i<arr.length ; i++ ){
            arr[i] = sc.nextInt() ;
        }
        System.out.println( "Display :");
        int min =arr[0];
        for( int i=0 ; i<arr.length ; i++ ){
                if( arr[i] < min ){
                    min = arr[i] ;
                }
        }
        System.out.println("Minumum Elements from array is : "+ min );
        int max = arr[0];
        for( int i=0 ; i<arr.length ; i++ ){
                if( arr[i] > max ){
                    max = arr[i] ;
                }
        }
         System.out.println("Maximum Elements from array is : "+ max );
         System.out.println("Difference between the maximum number and minimum number from array is : "+(max-min));
    }
}