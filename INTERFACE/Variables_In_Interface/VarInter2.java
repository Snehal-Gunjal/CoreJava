interface VarInter2{
        int x = 10 ;
        void Fun() ;
}
class VarFace implements VarInter2{
        public void Fun(){
          x = 30 ;
          System.out.println( x ) ;
        }
}
class Client{
        public static void main( String[]args ){
                VarInter2 obj = new VarFace() ;
                obj.Fun() ;
        }
}
