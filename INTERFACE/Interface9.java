interface Interface9{
        static void Fun(){
                System.out.println( "In a VarInter Fun()" );
        }
}
interface VarFace{
        static void Fun(){
                System.out.println( "In VarFace Fun()" ) ;
        }
}
class Client implements InterFace9 , VarFace{
        void Gun(){
        Interface9.Fun() ;
        VarFace.Fun() ;
        }

}
class user{
        public static void main( String[]args ){
                Client obj = new Client();
                obj.Gun();
        }
}
