class Pr4{
	public static void main( String[]args){
		int var1 = -9;
        if( var1 >=0 && var1 <=5 ){
            if( var1 ==0){
                System.out.println( "Zero");
            }
            else if( var1==1){
                System.out.println("One");
            }
            else if( var1==2){
                System.out.println("Two");
            }
            else if(var1==3){
                System.out.println("Three");
            }
            else if(var1==4){
                System.out.println("Four");
            }
            else if( var1==5){
                System.out.println("Five");
            }
        }
        else if( var1 > 5 ){
            System.out.println( var1 + "is greater than 5 ");
        }
        else{
            System.out.println( var1 + " is a negative ");
        }
    }
}