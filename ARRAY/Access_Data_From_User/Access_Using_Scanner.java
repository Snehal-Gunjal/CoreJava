
import java.util.*;
class Array{
    public static void main( String[]args ){
        Scanner sc = new Scanner( System.in);
        float[] arr = new float[5];
        System.out.println( "Insert Elements in a Float array : ");
        for( int i=0 ; i<5 ; i++ ){
            arr[i] = sc.nextFloat() ;
        }
        System.out.println( "Disply Float array elemnts :");
        for( int i=0 ; i<5 ; i++ ){
          System.out.println(arr[i]);
        }
    }
}


		