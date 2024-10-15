
class Para{
    void Fun(float x  ) {
        System.out.println( "In Fun Method ");
    }
    public static void main( String[]args ){
        Para obj = new Para() ;
        obj.Fun(true);
    }
}


class Para{
    void Fun(float x  ) {
        System.out.println( x );
        System.out.println( "In Fun Method ");
    }
    public static void main( String[]args ){
        Para obj = new Para() ;
        obj.Fun(10);
    }
}

class Para{
    void Fun(float x  ) {
        System.out.println( x );
        System.out.println( "In Fun Method ");
    }
    public static void main( String[]args ){
        Para obj = new Para() ;
        obj.Fun('A');
    }
}


class Para{
    void Fun(float x  ) {
        System.out.println( x );
        System.out.println( "In Fun Method ");
    }
    public static void main( String[]args ){
        Para obj = new Para() ;
        obj.Fun(12.4f);
    }
}

class Para{
    Fun() {
        System.out.println( "In Fun Method ");
    }
    public static void main( String[]args ){
        Para obj = new Para();
        obj.Fun();
    }
}


class Para{
    void () {
        System.out.println( "In Fun Method ");
    }
    public static void main( String[]args ){
        Para obj = new Para();
        obj.Fun();
    }
}


class Para{
    int Fun(){
        System.out.println( "In Fun Method ");
    }
    public static void main( String[]args ){
        Para obj = new Para();
        obj.Fun();
    }
}
class Para{
    void Fun( int x ){
        System.out.println( "In Fun Mathod " );
        System.out.println( x );
    }
    public static void main( String[]args){
        Para obj = new Para();
        obj.Fun( 10 );
        obj.Fun( 10.8f );
        obj.Fun( true );
        obj.Fun( 'A' );
    }
}
