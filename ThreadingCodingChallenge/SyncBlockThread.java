package com.collabera.threads;

class SyncThreadRunner{
    public static void main(String[] args) {

        SyncNumberCounter t1 = new SyncNumberCounter();
        SyncNumberCounter t2 = new SyncNumberCounter();

        t1.start();
        t2.start();
   }
}

 class SyncNumberCounter extends Thread{
    @Override
     public void run(){
        synchronized(this){ 
            System.out.println("Thread "+ Thread.currentThread().getId()+ " has started!");
        for (int num = 0; num <= 10; num ++){
                System.out.println("Thread "+ Thread.currentThread().getId() + ": \n"+ num); 
            } 
        }
        super.run();
    }
}