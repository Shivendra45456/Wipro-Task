package TaskMultithreadinginJava;

class NumberPrinterThread extends Thread {

 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println(i);
         try {
             Thread.sleep(1000); 
         } catch (InterruptedException e) {
             System.out.println("Thread interrupted!");
         }
     }
 }

}
class Sample3{
 public static void main(String[] args) {
     NumberPrinterThread thread1 = new NumberPrinterThread(); 

     thread1.start();

     try {
         thread1.join(); 
     } catch (InterruptedException e) {
         System.out.println("Main thread interrupted!");
     }

     System.out.println("Main thread done."); 
 }

}


//Task 3: Thread with Sleep and Join
//Description:
//Create two threads:
// Thread1 should print numbers 1 to 5 with a 1-second delay.
// Main thread should wait for Thread1 to finish using join() before printing "Main thread
//done."
