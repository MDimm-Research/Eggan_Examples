public class drinks {
   public static void main(String[] a) {
      new Tea().start();
      prt s = new prt();
      Coffee t1 = new Coffee(s);
      t1.start();
      Coffee t2 = new Coffee(s);
      t2.start();
      Coffee t3 = new Coffee(s);
      t3.start();
      Coffee t4 = new Coffee(s);
      t4.start();
      Coffee t5 = new Coffee(s);
      t5.start();
      Coffee t6 = new Coffee(s);
      t6.start();
      Coffee t7 = new Coffee(s);
      t7.start();
      Coffee t8 = new Coffee(s);
      t8.start();
   }
}
