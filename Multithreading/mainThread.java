//Threads
//threads are the smallest 'unit of dispatchable code' or code which are executed independently
//threading enables effcient use of CPU cycles
//all java programs run on the 'main' thread, from which many threads can be branched out


class threadMain{
    public static void main(String[] args) {
        Thread t = Thread.currentThread();      //obtain a reference to the current thread using static function              
        System.out.println("Current Thread: " + t.getName());        //returns the name of the current thread

        //every thread has a priority assigned to it, to be used in making decisions regarding the thread which assumes control when invoked
        //from other threads
        System.out.println("Current thread priority: " + t.getPriority());  //highest: 10; lowest: 1
        //priority can also be denoted by these constant values
        //MIN_PRIORITY: 1
        //NORM_PRIORITY: 5
        //MAX_PRIORITY: 10

        //changing name of the current thread
        t.setName("MainThread");
        System.out.println("Current Thread: " + t.getName());

        //sleep() delays the execution of the thread specified (static method)
        System.out.println("Conting down from 10:");
        for(int i = 10 ; i > 0 ; --i){
            System.out.println(i);
            try{
                Thread.sleep(1000);                         //the argument is delay in milliseconds
            }
            catch(InterruptedException e){                  //Thread.sleep() throws InterruptedException when inturrupted by a thread of higher priority
            }
        }
        //sleep() can be also supplied with additional value in nanoseconds
        System.out.println("\nCounting to 5:");
        for(int i = 1 ; i < 6 ; ++i){
            System.out.println(i);
            try{
                Thread.sleep(2000,10000);                     //the arguments are delay in milliseconds first, then additional nanoseconds
            }
            catch(InterruptedException e){
            }
            //delay = 2000 ms + 10000 ns = 2010 ms
        }
    }

}