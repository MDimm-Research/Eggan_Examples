public class prt {
//   public synchronized void pr(){
   public void pr(){
     int j = 0;
     while (j < 5) {
       System.out.println("I like coffee" + j++);
        try{
           Thread.sleep(1);
         } catch ( Exception e ) {}
   }
   }
}

