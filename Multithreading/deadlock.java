//deadlock
//a typical condition in multithreading in which a thread, having accquired a resource(say A), waits on a resource(say B) which is 
//occupied by another thread , while the other thread waits on the resource A to be freed
//analogous to a "catch-22"(Google that) situation

class Resource{
    synchronized void A(Resource other){            //the reference to other resource is passed so that the thread does not complete its execution of this resource
        System.out.println(Thread.currentThread().getName() + " has A()");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
        }
        System.out.println("Trying to invoke B()...");
        other.B(this);                              //invoking the other resource (has to wait because B() is still occupied by "second" thread)
    }
    synchronized void B(Resource other){
        System.out.println(Thread.currentThread().getName() + " has B()");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
        }
        System.out.println("Trying to invoke A()...");
        other.A(this);                              //thread has to wait because A() is still occupied by the "first" thread
    }
}

class Thread1 implements Runnable{
    Thread t;
    Resource obj1, obj2;
    Thread1(String name, Resource ref1, Resource ref2){
        this.t = new Thread(this,name);
        this.obj1 = ref1;
        this.obj2 = ref2;
    }
    public void run(){
        System.out.println("Invoking A() from " + Thread.currentThread().getName());
        obj1.A(this.obj2);
    }
}

class Thread2 implements Runnable{
    Thread t;
    Resource obj1, obj2;
    Thread2(String name, Resource ref1, Resource ref2){
        this.t = new Thread(this,name);
        this.obj1 = ref1;
        this.obj2 = ref2;
    }
    public void run(){
        System.out.println("Invoking B() from " + Thread.currentThread().getName());
        obj2.B(this.obj1);
    }
}

class DeadlockRun{
    public static void main(String[] args) {
        Resource Res1 = new Resource();                     //resource objects
        Resource Res2 = new Resource();
        Thread1 first = new Thread1("First", Res1, Res2);
        Thread2 second = new Thread2("Second", Res1, Res2);
        first.t.start();
        second.t.start();
    }
}

//in case of execution in IDE, press Ctrl + C to stop