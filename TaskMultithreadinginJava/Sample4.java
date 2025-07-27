package TaskMultithreadinginJava;


class MySimpleThread extends Thread {

 public void run() {
     try {
         Thread.sleep(1000);
         System.out.println("Thread is running...");
     } catch (InterruptedException e) {
         System.out.println("Thread interrupted!");
     }
 }
}
class Sample4 {
	
 public static void main(String[] args) {
     MySimpleThread thread = new MySimpleThread();

     
     System.out.println("Before start: " + thread.isAlive()); 

     thread.start(); 

   
     System.out.println("After start: " + thread.isAlive()); 

     try {
         thread.join(); 
     } catch (InterruptedException e) {
         System.out.println("Main thread interrupted!");
     }

    
     System.out.println("After join: " + thread.isAlive());
 }
}

//Task 4: Check Thread State using isAlive()
//Description:
// Start a thread and check whether it is alive before and after start() and join() calls.
//Expected Output:
//Before start: false
//After start: true
//After join: false

