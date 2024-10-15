
import java.io.*;
class NoMoneyException extends RuntimeException{
        NoMoneyException(String msg ){
                super ( msg ) ;
        }
}
class ShoppingDemo{
        public static void main( String[]args )throws IOException{
                InputStreamReader isr = new InputStreamReader( System.in) ;
                BufferedReader br = new BufferedReader( isr ) ;
                System.out.println( "How Much Money Do You Have:" ) ;
                int money = Integer.parseInt( br.readLine());
                if( money < 50 ){
                        throw new NoMoneyException( "Money is less , That's Why Don't Do A Shopping" ) ;                }
        }
}

                                                                                                      