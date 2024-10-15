
class Set extends Thread{
        public void run(){
                Thread t = Thread.currentThread() ;
                System.out.println( t.getPriority() ) ;
                t.setPriority( 11 ) ;
                System.out.println( t.getPriority()) ;
        }
}
class Priority2{
        public static void main( String[]args ){
                Set obj = new Set() ;
                obj.start() ;
        }
}
