class Thread8 extends Thread{
       public void run(){
               System.out.println("Run Thread :"+ Thread.currentThread().getName());
              }

        public static void main( String[]args ){
                System.out.println("Main Thread :"+ Thread.currentThread().getName());
                Thread1 obj = new Thread1();
                obj.start() ;
        }
}

                                                                                                            