package TaskMultithreadinginJava;


class MyPrinterThread extends Thread {
 public void run() {
     for (int i = 0; i < 5; i++) {
         System.out.println("Hello from Thread!");
         try {
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             System.out.println("Thread interrupted");
         }
     }
 }


 public static void main(String[] args) {
     MyPrinterThread thread = new MyPrinterThread();
     thread.start();
 }
}



//Task 1: Create a Thread by Extending the Thread Class
//Description:
//Write a class called MyPrinterThread that prints the message Hello from Thread! 5 times
//with a delay of 1 second between each message.
//Expected Output:
//Hello from Thread!
//... (repeated 5 times, 1 second apart)
