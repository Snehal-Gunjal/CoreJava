abstract class Demo1{
        Demo1(){
                System.out.println( "In a Abstract Class Constructor" ) ;
        }
        abstract void Fun();

}
class users extends Demo1{
        users(){
                System.out.println( "In a Users Class Constructor" ) ;
        }
       
}
class Client{
        public static void main( String[]args ){
                Demo1 obj = new users() ;
                obj.Fun() ;
        }
}
