import java.io.*;
class IfElse1{
        public static void main( String[]args )throws IOException{
                InputStreamReader isr = new InputStreamReader( System.in) ;
                BufferedReader br = new BufferedReader( isr ) ;
                System.out.println( "Enter any number ") ;
                int x = Integer.parseInt( br.readLine()) ;
                if( x > 0 ){
                        System.out.println( "Positive") ;
                }else if( x<0 ){
                        System.out.println( "Negative") ;
                }else{
                        System.out.println( "Zero") ;
                }
        }
}