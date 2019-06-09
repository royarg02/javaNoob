//interthread Communication
//to ensure that the synchronisation between the threads works as desired without any blocking of resources, Java enables
//interthread communication methods to make the threads have a control on other threads in terms of when to access it
//or when to wait

class Example{                                                  //the resourse class
    int n;
    boolean gotValue = false;                                   //to be used in wait(): gotValue signifies whether any value is present in the object(resource) or not
    synchronized void getNum(int n){                            //synchronized function
        while(gotValue){                                        //to avoid abrupt waking up of sleeping threads, a while loop having the condition that requires the thread to remain sleeping
                                                                //needs to be implemented 
            try{                                                //wait might throw an InterruptedException
                wait();                                         //wait until there is no value in the resource
            }
            catch(InterruptedException e){
            }
        }
        this.n = n;                                             //put the obtained value in the resource
        this.gotValue = true;                                   //changing the control variable to make the current thread to wait and the other thread to resume
        notify();                                               //notify() wakes up the thread that was last kept to sleep on the same resource
    }
    synchronized void putSqu(){
        while(!gotValue){
            try{
                wait();                                         //wait until there is any value in the resource
            }
            catch(Exception e){
            }
        }
        System.out.println(this.n*this.n);
        this.gotValue = false;                                  //change the control variable to make the current thread to sleep and other thread to resume(value consumed)
        notifyAll();                                            //notifyAll() wakes up ALL threads that were kept to sleep on the same resource
    }
}

class Getter implements Runnable{
    Thread t;
    int start;
    Example ex;
    Getter(Example ex, String name, int n){
        t = new Thread(this, name);
        this.start = n;
        this.ex = ex;
    }
    public void run(){
        for(int i = this.start ; i < (this.start + 10) ; ++i){
            System.out.println(t.getName() + ":" + i);
            ex.getNum(i);
        }
    }
}

class Square implements Runnable{
    Thread t;
    Example ex;
    Square(Example ex, String name){
        t = new Thread(this, name);
        this.ex = ex;
    }
    public void run(){
        for(int i = 0; i < 10 ; ++i){
            ex.putSqu();
        }
    }
}

class Inter{
    public static void main(String[] args) {
        Example ex = new Example();
        Getter A = new Getter(ex, "Got", 1);
        Square B = new Square(ex, "Squ");
        A.t.start();
        B.t.start();
        try{
            A.t.join();
            B.t.join();
        }
        catch(Exception e){
        }
    }
}