class Hospital{
        int y = 10 ;
        static{
                System.out.println( "billing Counter is in static block") ;
                System.out.println( y ) ; //error;
        }
        Hospital(){
                System.out.println( "Treatement" ) ;
                System.out.println( y ) ;
        }
        {
                System.out.println( "ICU") ;
                System.out.println( y ) ;
        }
}
class Medicine extends Hospital{
        static{
                System.out.println( "Medicine Prices" ) ;
                System.out.println( y ) ; // errors
        }
        Medicine(){
                System.out.println( "Medicines") ;
                System.out.println( y ) ;
        }
        {
                System.out.println( "Golya - Aushdhi" ) ;
                System.out.println( y ) ;
        }

}
class Treat{
        public static void main( String[]args ){
               Medicine obj = new Medicine() ;
        }

}
//2 errors