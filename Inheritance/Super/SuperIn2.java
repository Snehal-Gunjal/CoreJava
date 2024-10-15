class SuperIn2{
        int x = 10 ;
        int y = 20 ;
        SuperIn2(){
                System.out.println( "In parent Constructor") ;
        }
}
class SuperBe2 extends SuperIn2{
             SuperBe2( int x ){
                     super.x = x ;
             }
             SuperBe2(){
                     this( 50 ) ;
                     System.out.println( super.x ) ;
                     System.out.println( super.y ) ;
             }
}
class SuperMain2{
        public static void main( String[]args ){
                SuperBe2 obj = new SuperBe2() ;
                }
}
                                                                                                           