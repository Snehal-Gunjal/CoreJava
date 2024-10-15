class Set extends Thread{
        public void run(){
                Thread t = Thread.currentThread() ;
                System.out.println( t.getPriority() ) ;
                try{
                   t.setPriority( 11 ) ;
                }catch(IllegalArgumentException e ){
                        System.out.println( "Priority must be less than or eqal to 10" ) ;
                }
                System.out.println( t.getPriority()) ;
        }
}
class Priority4{
        public static void main( String[]args ){
                Set obj = new Set() ;
                obj.start() ;
        }
}                                                                                                                                                                                                                              