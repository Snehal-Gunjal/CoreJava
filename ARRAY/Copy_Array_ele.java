import java.io.*;
class Copy{
        public static void main( String...args ){
                int []arr1 = { 10 , 60, 30 , 40 , 50 };
                int []arr2 = new int[5] ;
                for( int i=0 ; i<arr1.length ; i++ ){
                        for( int j=i ; j<=i ; j++ ){
                                arr2[i] = arr1[j] ;
                        }
                }
                for( int i=0 ; i<arr2.length ; i++ ){
                        System.out.println( arr2[i] );
                }
        }
}