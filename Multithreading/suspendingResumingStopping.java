//suspending, resuming, stopping threads
//Apart from JDK1, suspending(Make the thread wait), resuming(make the thread wake up and run), and stopping(make the execution of the thread to stop)
//requires user defined flags, which work on wait(), and notify() functions

class Control implements Runnable{
    Thread t;
    boolean threadPause;                                    //thread control flag
    Control(String name){
        this.t = new Thread(this, name);
        this.threadPause = false;                           //thread is default set to run
    }
    synchronized void suspend(){                            //suspend function(synchronized to avoid other thread to interact)
        this.threadPause = true;
    }
    synchronized void resume(){
        this.threadPause = false;                           //resume function(also notifies waiting threads)
        notify();
    }
    public void run(){
        for(int i = 10 ; i > 0 ; --i){
            System.out.println(t.getName() + ": " + i*i);
            synchronized(this){                             //synchronized block that periodically checks for control flag
                while(threadPause){
                    try{
                        wait();

                    }
                    catch(InterruptedException e){
                    }
                }
                try{
                    Thread.sleep(800);                      //sleep to give time for the other threads to continue running
                }
                catch(InterruptedException e){
                }
            }
        }
    }
}

class ControlDemo{
    public static void main(String[] args) {
        Control th1 = new Control("Thread 1");
        Control th2 = new Control("Thread 2");
        th1.t.start();
        th2.t.start();
        try{
            System.out.println("Suspending Thread 1");
            th1.suspend();
            Thread.sleep(5000);
            System.out.println("Resuming Thread 1 and Suspending Thread 2");
            th1.resume();
            th2.suspend();
            Thread.sleep(5000);
            System.out.println("Resuming Thread 2 and Suspending Thread 1 ");
            th2.resume();
            th1.suspend();
            Thread.sleep(5000);
            System.out.println("Resuming Thread 1");
            th1.resume();
            System.out.println("Waiting for the threads to finish...");
            th1.t.join();
            th2.t.join();
        }
        catch(Exception e){
        }
    }
}