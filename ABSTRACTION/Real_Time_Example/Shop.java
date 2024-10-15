abstract class Shop{
        void TotalAmount(){
                System.out.println( "100000" ) ;
        }
        abstract void ModeOfPay();
}
class Cust extends Shop{
        void ModeOfPay(){
                System.out.println( "Phone pay" ) ;
        }
}
class users{
        public static void main( String[]args ){
                Shop obj = new Cust() ;
                obj.ModeOfPay() ;
        }
}