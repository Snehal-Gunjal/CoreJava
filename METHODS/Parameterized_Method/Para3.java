import java.io.*;
class Para3{
    void Fun() {
        System.out.println( "In Fun Method ");
    }
    public static void main( String[]args ){
        Para3 obj = new Para3() ;
        obj.Fun(10);
    }
}