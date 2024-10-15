import java.util.*;
class ScannerEx{
        public static void main( String[]args){
                Scanner sc = new Scanner(System.in) ;
                int x = 0;
                try{
                  x = sc.nextInt() ;
                  System.out.println( 10/x ) ;
                }catch(InputMismatchException n ){
                        System.out.println( "Here" );
                }
        }
}


