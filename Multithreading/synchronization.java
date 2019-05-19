//synchronization ensures that only one thread can use the SAME resources alloted at a time
//synchronization is required to avoid the race-condition, where the threads may gain control in between the
//processing of resources by another thread

//synchronization can be achieved by two ways
//by specifing the method(having the resources) to be run in synchronization
//or, if the code of the method is not obtainable, make the execution synchronized

class Synch implements Runnable{
    Thread t;
    Lmao lol;
    Synch(Lmao lol, String name){                           //the reference to the resource 'lol' got here(they point to the same object)
        t = new Thread(this, name);
        this.lol = lol;
    }
    public void run(){
        lol.callSynch(t.getName());                         //this function has synchronization implemented
        synchronized(lol){
            lol.callNoSynch();                              //this function doesn't have synchronization implemented. Thus synchronizing with statement
        }
    }
}

class Lmao{
    synchronized void callSynch(String curr){               //synchronization in method is implemented using the keyword 'synchronized'
        System.out.print("Current Thread: ");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
        }
        System.out.println(curr);
    }
    void callNoSynch(){                                     //no synchronization
        System.out.print("Synchronized");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
        }
        System.out.println(" using statements.");
    }
}

class Monitor{
    public static void main(String[] args) {
        Lmao lol = new Lmao();
        Synch A = new Synch(lol, "First");      //lol is the resource to be executed synchronuously 
        Synch B = new Synch(lol, "Second");     //passing it when creating threads ensures that it is not being created each time seperately
        Synch C = new Synch(lol, "Third");      //for each of the threads
        A.t.start();
        B.t.start();
        C.t.start();
        try{
            A.t.join();
            B.t.join();
            C.t.join();
        }
        catch(Exception e){
        }
    }
}