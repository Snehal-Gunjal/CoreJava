interface VarInter4{
        int x = 10 ;
}
interface VarFace{
        int x = 20 ;
}
class Client implements VarInter4 , VarFace{
        void Fun(){
           System.out.println( x ) ;
        }
}
class user{
        public static void main( String[]args ){
                Client obj = new Client();
                obj.Fun() ;
        }
}
