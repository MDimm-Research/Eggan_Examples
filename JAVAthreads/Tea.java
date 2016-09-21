class Tea extends Thread {
   public void run() {
      int j = 0;
      while(j < 15) {
         System.out.println("I like tea" + j++);
         try{
             sleep(1);
         } catch ( Exception e ) {}

         //Thread.sleep(2);
         yield();
      }
   }
}
