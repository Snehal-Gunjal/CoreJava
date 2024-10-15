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
				
                System.out.println( "Display Even Numbers :" ) ;
                for( int i = 0 ; i<arr.length ; i++ ){
                        if( arr[i] % 2 == 0 ){
                          System.out.print( arr[i] +" " ) ;
                        }
                }
        }
}