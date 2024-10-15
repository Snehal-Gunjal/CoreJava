import java.io.*;
class FineEx{
        public static void main( String[]args )throws IOException{
                InputStreamReader isr = new InputStreamReader( System.in) ;
                BufferedReader br = new BufferedReader( isr ) ;
                int n = Integer.parseInt( br.readLine());
                try{
                        System.out.println( 10/n ) ;
                }catch( ArithmeticException e ){
                        System.out.println( "Enter integer value:" );
                        n = Integer.parseInt( br.readLine()) ;
                }finally{
                        System.out.println( "In a Finally Block" ) ;
                }
        }
}
