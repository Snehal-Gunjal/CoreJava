class Parent{
        Parent(){
                System.out.println( "In a Parent class Constructor" ) ;
        }
}
class Child {
        Child()
        {
                Parent obj1 = new Parent() ;
                System.out.println( "In a Child class Constructor" ) ;
        }
}
class Client{
        public static void main( String[]args ){
                Child obj = new Child();
        }
}