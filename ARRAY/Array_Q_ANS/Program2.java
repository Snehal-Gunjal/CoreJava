import java.io.*;
class CharArray{
        public static void main( String[]args )throws IOException{
                InputStreamReader isr = new  InputStreamReader( System.in) ;
                BufferedReader br = new BufferedReader( isr ) ;

                System.out.println("Enter How many Elements do you wants to insert in 1st Array:" ) ;
                int n1  = Integer.parseInt( br.readLine()) ;
                int []arr1 = new int[n1] ;

                System.out.println( "Enter Elements in 1st array:" ) ;
                for( int i = 0 ; i<arr1.length ; i++ ){
                        arr1[i] = Integer.parseInt( br.readLine()) ;
                }

                System.out.println( "Display 1st array:" );
                for( int i =0 ; i<arr1.length ; i++ ){
                        System.out.print( arr1[i] + " " ) ;
                }

                System.out.println() ;

                System.out.println( "Enter how many elements do you want to insert in 2nd array:" ) ;
                int n2 = Integer.parseInt( br.readLine()) ;
                int []arr2 = new int[n2] ;

                System.out.println( "Enter Elements in 2nd array:" ) ;
                for( int j = 0 ; j<arr2.length ; j++ ){
                        arr2[j] = Integer.parseInt( br.readLine()) ;
                }

                System.out.println( "Display 2nd array:" ) ;
                for( int j = 0 ; j<arr2.length ; j++ ){
                        System.out.print( arr2[j] +" ")  ;
                }

                System.out.println() ;

                for(int  i = 0 ; i<arr1.length ; i++ ){
                        for(int j =0 ; j<arr2.length ; j++ ){
                                if( arr1[i] == arr2[j] ){
                                        System.out.println( arr1[i] ) ;
                                }
                        }
                }

        }
}
