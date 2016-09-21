class Coffee extends Thread {
   prt j;
   Coffee (prt s) {
      j = s;
   }
   public void run() {
     j.pr();
  }
}
