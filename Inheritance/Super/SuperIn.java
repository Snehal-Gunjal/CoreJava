
class SuperIn{
        int x = 10 ;
        static int y = 20 ;
        SuperIn(){
                System.out.println( "In a Super Class Constructor ") ;
        }
}
class SuperBe extends SuperIn{
        int x = 200 ;
        static int y = 300 ;
        SuperBe(){
                System.out.println( "In a SuperBe Class Constructor") ;
                System.out.println( super.x ) ;
                System.out.println( super.y ) ;
                System.out.println( this.x ) ;
                System.out.println( this.y ) ;
                System.out.println( this ) ;
        }
}
class SuperMain{
        public static void main(String[]args ){
                SuperBe obj = new SuperBe() ;
                System.out.println( obj ) ;
                }
}