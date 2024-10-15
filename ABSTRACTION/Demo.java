
abstract class Demo{
        abstract void Fun();
}
class users extends Demo{
        void Fun(){
                System.out.println( "In a Child Class" ) ;
        }
}
class Client{
        public static void main( String[]args ){
                Demo obj = new Demo() ;
                obj.Fun() ;
        }
}				

