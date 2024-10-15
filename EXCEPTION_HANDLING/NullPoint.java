
class NullPoint{
        void m1(){
                System.out.println("In a m1 method" ) ;
        }
        public static void main( String[]args ){
                NullPoint obj = new NullPoint() ;
                obj.m1() ;
                obj = null;
                obj.m1() ;    
                }
}