class SuperIn1{
        int x = 10 ;
        static int y = 20 ;
        SuperIn1(){
                System.out.println( "In a Super Class Constructor ") ;
        }
}
class SuperBe1 extends SuperIn1{
        int x = 200 ;
        static int y = 300 ;
        SuperBe( int x ){
                this.x = x ;
                System.out.println( x ) ;
        }
        SuperBe1(){
                this(50) ;      // call another constructor of a same class ;
                System.out.println( "In a SuperBe Class Constructor") ;
                System.out.println( super.x ) ;  // used to calls parent class variables and methods 
                System.out.println( super.y ) ;
                System.out.println( this.x ) ;
                System.out.println( this.y ) ;
                System.out.println( this ) ;
        }
}
class SuperMain1{
        public static void main(String[]args ){
                SuperBe1 obj = new SuperBe1() ;
                System.out.println( obj ) ;
                }
}
~                                   