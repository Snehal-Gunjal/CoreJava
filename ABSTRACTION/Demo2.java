abstract class Demo2{
        Demo2(){
                System.out.println( "In a Abstract Class Constructor" ) ;
        }
        abstract void Fun();

}
class users extends Demo2{
        users(){
                System.out.println( "In a Users Class Constructor" ) ;
        }
        void Fun(){
                System.out.println( "In a Child Class" ) ;
        }
}
class Client{
        public static void main( String[]args ){
                Demo2 obj = new users() ;
                obj.Fun() ;
        }
}
