
interface VarInter{
        int x = 10 ;
        void Fun() ;      
}
class VarFace implements VarInter{
        public void Fun(){
          System.out.println( x ) ;
        }
}
class Client{
        public static void main( String[]args ){
                VarInter obj = new VarFace() ;
                obj.Fun() ;
        }
}


