import java.util.*;
class Dry6{
    public static void main( String[]args ){
        Scanner sc = new Scanner( System.in );
        System.out.println( "Enter Size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Insert Elements in array:");
        for( int i=0 ; i<arr.length ; i++ ){
            arr[i] = sc.nextInt() ;
        }
        System.out.println( "Display reverse array  :");
        for( int i = arr.length -1; i>=0 ; i-- ){
            System.out.println( arr[i] );
        }
    }
}