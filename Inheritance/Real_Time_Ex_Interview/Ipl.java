class Ipl{
        Ipl(){
                System.out.println( "In a Ipl Class Constructor") ;
        }
}
class BCCF extends Ipl{
        BCCF(){
                System.out.println( "In a BCCF class Constructor" ) ;
        }
        public static void main( String[]args ){
                BCCF obj = new BCCF() ;
        }
}