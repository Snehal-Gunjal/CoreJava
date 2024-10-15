interface Interface6{
        default void Fun(){
                System.out.println( "In Interface 1 " );
        }
}
interface FaceInter{
        default void Fun(){
                System.out.println( "In InterFace 2 " ) ;
        }
}
class Client implements Interface6 , FaceInter{
        public void Fun(){
                System.out.println( "In Client-Fun" );
        }

}
class IF{
        public static void main( String[]args ){
                Interface6 obj = new Client() ;
                obj.Fun() ;
        }

}
