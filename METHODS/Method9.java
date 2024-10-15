class Method9{
    int num = 10 ;
    static int num1 = 10 ;
    void Fun(){
        System.out.println( "In Fun Method ");
        System.out.println( num );
        System.out.println( num1 );
    }
  public static void main( String[]args){
    Method9 obj = new Method9();
    obj.Fun() ;
  }

}