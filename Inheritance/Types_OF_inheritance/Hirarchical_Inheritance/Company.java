
class Company{
        Company(){
                System.out.println( "In a Company Constructor" );
        }
}
class Product1 extends Company{
        Product1(){
                System.out.println( "Product1 ") ;
        }
        public static void main( String[]args ){
                Product1 obj = new Product1() ;
        }
}
class Product2 extends Company{
        Product2(){
                System.out.println( "Product2") ;
        }
        public static void main( String[]args ){
                Product2 obj = new Product2() ;
        }
}