import java.util.*;
class Dry1{
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
        int sum = 0 ;
        for( int i=0 ; i<arr.length ; i++ ){
            sum = sum + arr[i] ;
        }
        int avg = sum / size ;
        System.out.println("Averege is : "+ avg);
    }
}