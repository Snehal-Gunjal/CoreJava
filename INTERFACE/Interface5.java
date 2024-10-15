interface Interface5{
        void Fun() ;
}
interface FaceInter{
        void Fun() ;
}
class Client implements Interface5 , FaceInter{
        public void Fun(){
                System.out.println( "In a Fun() Method" ) ;
        }
}
class Face{
        public static void main( String[]args ){
                Interface5 obj = new Client() ;
                obj.Fun() ;
        }

}
