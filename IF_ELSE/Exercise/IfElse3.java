import java.io.*;
class IfElse3{
        public static void main( String[]args )throws IOException{
                InputStreamReader isr = new InputStreamReader( System.in) ;
                BufferedReader br = new BufferedReader( isr ) ;
                System.out.println( "Enter any number ") ;
                int x = Integer.parseInt( br.readLine()) ;
                if( x % 2 == 0 ){
                        if( x > 10 ){
                                System.out.println( x + " is an Even Number and Greater than 10 " ) ;
                        }else if( x < 10 ){
                                System.out.println( x + " is an Even Number and Less than 10 " ) ;
                        }else{
                               System.out.println( x+ " is an Even Number and Equal to 10" ) ;
                        }
                }else{
                        System.out.println( x + " is an Odd Number " ) ;
                }
        }
}