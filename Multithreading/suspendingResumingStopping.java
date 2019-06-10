//suspending, resuming, stopping threads
//Apart from JDK1, suspending(Make the thread wait), resuming(make the thread wake up and run), and stopping(make the execution of the thread to stop)
//requires user defined flags, which work on wait(), and notify() functions

class Control implements Runnable{
    Thread t;
    boolean threadPause;                                    //controls either waiting or resumed
    boolean threadStop;                                     //controls either running or stopped
    Control(String name){
        this.t = new Thread(this, name);
        this.threadPause = false;                           //thread is default set to run
        this.threadStop = false;
    }
    synchronized void suspend(){                            //suspend function(synchronized to avoid other thread to interact)
        this.threadPause = true;
    }
    synchronized void resume(){                             //resume function
        this.threadPause = false;
        notify();
    }
    synchronized void stop(){                               //stop function
        this.threadStop = true;
    }
    public void run(){
        for(int i = 10 ; i > 0 ; --i){
            if(this.threadStop){                            //returning from run() stops the thread
                return;
            }
            System.out.println(t.getName() + ": " + i*i);
            while(this.threadPause){                        //peroidically checking whether the thread is put to waiting state or not
                try{
                    wait();
                }
                catch(Exception e){
                }
            }
            try{
                Thread.sleep(800);
            }
            catch(Exception e){
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
            System.out.println("Resuming Thread 2 and Stopping Thread 1 ");
            th2.resume();
            th1.stop();
            Thread.sleep(5000);
            System.out.println("Resuming Thread 1");
            th1.resume();                                                   //won't display anything as the thread is stopped
            System.out.println("Waiting for the threads to finish...");
            th1.t.join();
            th2.t.join();
        }
        catch(Exception e){
        }
    }
}