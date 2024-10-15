import java.util.*;
class Dry3{
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
        int secondmin = arr[0] ;
        for( int i=0 ; i<arr.length ; i++ ){
                if( arr[i] < min ){
                    secondmin = min ; 
                    min = arr[i] ;
                }else if( arr[i] < secondmin && arr[i] != min ){
                    secondmin = arr[i];
                }
        }
        System.out.println("Minumum Elements from array is : "+ min );
        System.out.println("Second Minumum Elements from array is : "+ secondmin );

        int max = arr[0];
        int secondmax = arr[0] ;
        
        for( int i=0 ; i<arr.length ; i++ ){
                if( arr[i] > max ){
                    secondmax = max;
                    max = arr[i] ;
                }else if(arr[i] > secondmax && arr[i] != min ){
                    secondmax = arr[i] ;

                }
        }
         System.out.println("Maximum Elements from array is : "+ max );
         System.out.println("Second Maximum Elements from array is : "+ secondmax);

    }
}