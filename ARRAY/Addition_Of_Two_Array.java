import java.io.*;
class Add{
        public static void main( String[]args ){
                InputStreamReader isr = new InputStreamReader( System.in ) ;
                BufferedReader br = new BufferedReader( isr ) ;
                int arr1[] = { 10 , 20 , 30 , 40 , 50 };
                int arr2[] = { 10 , 20 , 30 , 40 , 50 };
                int arr3[] = new int[5] ;
                for( int i=0 ; i<arr3.length ; i++ ){
                   for( int k=i ; k<=i ; k++ ){
                        for(int j = k ; j<=k ; j++ ){
                                arr3[i] = arr1[k] + arr2[j] ;
                        }
                   }
                }
                for( int i=0 ; i<arr3.length ; i++ ){
                        System.out.println( arr3[i] ) ;
                }

        }
}
