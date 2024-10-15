interface VarInter1{
        int x = 10 ;
        void Fun() ;
}
class VarFace implements VarInter1{
        public void Fun(){
          System.out.println( x ) ;
          System.out.println( x ) ;
          System.out.println( VarInter.x ) ;
        }
}
class Client{
        public static void main( String[]args ){
                VarInter1 obj = new VarFace() ;
                obj.Fun() ;
        }
}

