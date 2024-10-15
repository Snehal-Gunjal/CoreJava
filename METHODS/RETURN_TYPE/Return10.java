import java.io.*;
class Return10{
    boolean Fun( int x , int y ){
        if( x > y ){
            return true ;
        }
        else
        {
            return false ;
        }
    }
    public static void main( String[]args ){
        Return10 obj = new Return10() ;
        boolean fun = obj.Fun( 10 , 20 );
        System.out.println( fun);

    }
}
