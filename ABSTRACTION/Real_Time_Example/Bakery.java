abstract class Bakery{
        Bakery(){
                System.out.println( "Bakery!!!!!!" ) ;
        }
        void CakeFlavour(){
                System.out.println( "PineApple/Mango/Chocolate" );
        }
        abstract void Prices() ;
}
class Customer extends Bakery{
        Customer(){
                System.out.println( "Wlc" ) ;
        }
        void Prices(){
                System.out.println( "Prices are changes according to time" ) ;
        }
}
class Process{
        public static void main( String[]args ){
                Customer obj = new Customer() ;
                obj.CakeFlavour() ;
                obj.Prices() ;
        }
}
