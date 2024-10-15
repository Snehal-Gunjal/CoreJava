interface Interface4{
        void Fun() ;
        void Gun() ;
}
abstract class InterChild implements Interface4{
        public void Fun(){
                System.out.println( "In a Fun Method" ) ;
        }
}
class FaceChild extends InterChild{
        public void Gun(){
                System.out.println( "In a Gun Method" ) ;
        }
}
class Client{
        public static void main( String[]args ){
                Interface4 obj = new FaceChild() ;
                obj.Fun() ;
                obj.Gun() ;

        }
}