import java.io.* ;
class Element{
        public static void main( String[]args )throws IOException {
                InputStreamReader isr = new InputStreamReader( System.in) ;
                BufferedReader br = new BufferedReader( isr );
                System.out.println( "Enter How many elements do you want to insert in array:" ) ;
                int n = Integer.parseInt( br.readLine()) ;
                System.out.println( "Insert Elements in array:");
                int i = 0 ;
                int[] arr = new int[n] ;
                for( i = 0 ; i<arr.length ; i++ ){
                        arr[i] = Integer.parseInt( br.readLine()) ;
                }
                int sum = 0,  temp = 0 ;
                for(  i = 0 ; i<arr.length ; i++ ){
                        for( int j = i+1 ; j<arr.length ; j++ ){
                                if( arr[i]  >  arr[j] ){
                                temp = arr[i] ;
                                arr[i] = arr[j ] ;
                                arr[j] = temp ;
                        }
                        }
                }
                System.out.println( "Display Sorted Array:" ) ;
                for(  i = 0 ; i<arr.length ; i++ ) {
                        System.out.print( arr[i] +" " ) ;
                }


                }
        }