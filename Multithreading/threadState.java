//thread states
//each thread in Java has the following thread states:
//NEW: The thread is created, but not yet started executing
//RUNNABLE: The thread is cuurently running/ will run once it gets the CPU cycle
//BLOCKED:  The thread has suspended execution waiting to acquire a resource
//WAITING(or TIMED_WAITING): The thread is on wait(), or sleep() (or during a duration given as argument)
//TERMINATED: The thread has finished execution

//each of these states can be obtained from the getState() method

class New extends Thread{
    New(){
        super();
    }
    public void run(){
        System.out.println("State of new thread: "  + this.getState());
    }
}

class States{
    public static void main(String[] args) {
        New NewT = new New();
        Thread MainT = Thread.currentThread();                              //obtaining a reference to main thread
        System.out.println("State of main thread: " + MainT.getState());
        System.out.println("State of new thread: "  + NewT.getState());
        NewT.start();
        try{
            Thread.sleep(500);
        }
        catch(Exception e){
        }
        System.out.println("State of new thread: "  + NewT.getState());
    }
}