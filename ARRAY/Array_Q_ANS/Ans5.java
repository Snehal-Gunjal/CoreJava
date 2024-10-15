import java.io.* ;
class Element{
        public static void main( String[]args )throws IOException {
                InputStreamReader isr = new InputStreamReader( System.in) ;
                BufferedReader br = new BufferedReader( isr );
                System.out.println( "Enter How many elements do you want to insert in array:" ) ;
                int n = Integer.parseInt( br.readLine()) ;
				
                System.out.println( "Insert Elements in array:");
                int[] arr = new int[n] ;
                for( int i = 0 ; i<arr.length ; i++ ){
                        arr[i] = Integer.parseInt( br.readLine()) ;
                }
				
                int max = 0 ;
                System.out.println( "Find Maximum Element :" ) ;
                for( int i = 0 ; i<arr.length ; i++ ){
                        for( int j = i+1 ; j<arr.length ; j++ ){
                         if( arr[i] > arr[j] ){
                                 max = arr[i] ;
                         }else
                                 max = arr[j] ;
                }
           }
           System.out.println( max ) ;

        }
}                      