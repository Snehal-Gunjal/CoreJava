import java.io.* ;
class Element{
        public static void main( String[]args )throws IOException {
                InputStreamReader isr = new InputStreamReader( System.in) ;
                BufferedReader br = new BufferedReader( isr );
                System.out.println( "Insert Elements in array:");
                int[] arr = new int[5] ;
                for( int i = 0 ; i<arr.length ; i++ ){
                        arr[i] = Integer.parseInt( br.readLine()) ;
                }
                System.out.println( "Display Array Elements:" ) ;
                for( int i = 0 ; i<arr.length ; i++ ){
                        System.out.print( arr[i] +" " ) ;
                }
        }
}