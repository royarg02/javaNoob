//there are two ways a thread can be created

//implementing 'Runnable' interface
class RunDemo implements Runnable{
    Thread t;              
    RunDemo(String name){
        t = new Thread(this,name);                                  //arguments are the instance of the class implementing Runnable, and the name of the thread
        System.out.println(t);
    }
    void startThread(){
        t.start();                                                  //starts the thread, invokes run()
    }
    public void run(){                                              //the thread terminates when this function returns
        System.out.println("Current Thread: " + t.getName());
    }
}

//inheriting 'Thread' class
class ThreDemo extends Thread{
    ThreDemo(String name){
        super(name);                                                //invoking Thread() with the name of the thread
    }
    public void run(){                                              //the thread terminates when this function returns
        System.out.println("Current Thread: " + this.getName());
    }
}

class CreateMain{
    public static void main(String[] args) {
        RunDemo R = new RunDemo("Created_this_first");              //Creating a object which in turn creates a new thread or its subclass
        //R.start();                                                //start() works only with instance of Thread
        R.startThread();
        ThreDemo T = new ThreDemo("Created_this_next");             //Creating a thread using extended class
        System.out.println(T);
        T.start();                                                  //starts the thread, invokes run()
    }
}