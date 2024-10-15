class Method{
    static int var1 = 10 ;
    int var2 = 12 ;
    static void Fun(){
        System.out.println( "In Fun Method ");
    }
    void Gun(){
        System.out.println( "In Gun Method ");
    }
    public static void main(String[]args){
        Method8 obj = new Method8();
        System.out.println("Value of var1 = " + var1 );
        System.out.println("Value of var2 = " + obj.var2 );
        Fun() ;
        obj.Gun() ;
    }
}
  