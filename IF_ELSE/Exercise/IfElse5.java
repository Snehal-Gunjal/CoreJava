import java.io.*;
class IfElse{
        public static void main( String[]args )throws IOException{
                InputStreamReader isr = new InputStreamReader( System.in) ;
                BufferedReader br = new BufferedReader( isr ) ;
                System.out.println( "Enter no month ") ;
                int x = Integer.parseInt( br.readLine() ) ;
                if( x > 0 && x<=12 ) {
                        switch( x ) {
                                case 1 : System.out.println( "January") ;
                                         break;
                                case 2 : System.out.println( "Feb") ;
                                         break;
                                case 3 : System.out.println( "March") ;
                                         break;
                                case 4 : System.out.println( "April") ;
                                         break;
                                case 5 : System.out.println( "May") ;
                                         break;
                                case 6 : System.out.println( "June") ;
                                         break;
                                case 7 : System.out.println( "July") ;
                                         break;
                                case 8 : System.out.println( "August") ;
                                         break;
                                case 9 : System.out.println( "September") ;
                                         break;
                                case 10 : System.out.println( "octomber") ;
                                         break;
                                case 11 : System.out.println( "November") ;
                                         break;
                                case 12 : System.out.println( "December") ;
                                         break;
                                default :
                                          break;
                        }
                }
        }
}
