import java.io.*;
class DataOverFlowException extends RuntimeException{
        DataOverFlowException(String msg ){
                super( msg ) ;
        }
}
class DataUnderFlowException extends RuntimeException{
        DataUnderFlowException(String msg ){
                super( msg ) ;
                
        }

}
class ArrayDemo{
      public static void main( String[]args )throws IOException {
              InputStreamReader isr = new InputStreamReader( System.in);
              BufferedReader br = new BufferedReader( isr ) ;
              int[] arr = new int[5] ;
              System.out.println( "Enter Integer Value" ) ;
              System.out.println( "NOTE: ele > 0 && ele <100 " ) ;
              for( int i = 0 ; i<arr.length ; i++ ){
                      int data = Integer.parseInt( br.readLine()) ;
                      if( data < 0 ){
                              throw new DataUnderFlowException( "Element is less than 0 " ) ;

                      }
                      if( data > 100 ){
                              throw new DataOverFlowException( "Element is greater than  100" ) ;
                      }
                      arr[i] = data ;
              }
              System.out.println( "Show Array Elements" ) ;
              for( int i = 0 ; i < arr.length ; i++ ){
                      System.out.println( arr[i] ) ;
                      }
      }
}


