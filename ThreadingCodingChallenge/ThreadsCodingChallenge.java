/*Create a class that extends the thread class
That class should OVERRIDE the run() method
Using the created class, show 3 threads (thread1, thread2, thread3) printing numbers
from 0-10 running concurrently
Make sure you use thread method to print its name
Output: Note that the order of which a thread executes doesnt matter as long as the numbers
are being printed out concourently in order */
package com.collabera.threads;

class ThreadRunner{
    public static void main(String[] args) {

       NumberCounter t1 = new NumberCounter();
       NumberCounter t2 = new NumberCounter();

        t1.start();
        t2.start();
        t1.hello();{System.out.println("goodybye world!");}
        
        
   }
}

 class NumberCounter extends Thread{
    @Override
    synchronized public void run(){
        System.out.println("Thread "+ Thread.currentThread().getId()+ " has started!");
        for (int num = 0; num <= 10; num ++){

            
                System.out.println("Thread "+ Thread.currentThread().getId() + ": \n"+ num); 
            
            //try{Thread.sleep(1000);}catch(InterruptedException ie){}        
        }
        //super.run();
    }

    @Override 
    //overrideworks similar to interfaces, where if its not implemented in a class program wont run
    void hello(){
        System.out.println("Hello world! ");
    }
}