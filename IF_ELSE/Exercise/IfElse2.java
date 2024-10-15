import java.io.*;
class IfElse2{
        public static void main( String[]args )throws IOException{
                InputStreamReader isr = new InputStreamReader( System.in) ;
                BufferedReader br = new BufferedReader( isr ) ;
                System.out.println( "Enter any number ") ;
                int x = Integer.parseInt( br.readLine()) ;
                if( x % 2 == 0 ){
                        System.out.println( "The Number is Even ") ;
                }else{
                        System.out.println( "The Number is Odd ") ;
                }
        }
}