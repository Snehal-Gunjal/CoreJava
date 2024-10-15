interface VarInter3{
        int x = 10 ;
        void Fun() ;
}
class VarFace implements VarInter3{
        int x = 20 ;
		//Priority is given to x = 20 ;  
        public void Fun(){
          System.out.println( x ) ;
        }
}
class Client{
        public static void main( String[]args ){
                VarInter3 obj = new VarFace() ;
                obj.Fun() ;
        }
}