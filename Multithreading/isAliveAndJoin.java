//isAlive(): returns true if the thread called upon is running, false otherwise
//join(): makes a thread wait for the threads upon whic the function is called to finish

class ThreadBulid implements Runnable{                              //implementing Runnable
    Thread t;
    ThreadBulid(String name){
        t = new Thread(this,name);
    }
    public void run(){
        System.out.println(t.getName() + " counts from 1 to 10");
        for(int i = 1 ; i < 11 ; ++i){
            System.out.println(t.getName() + ": " + i);
            try{
                Thread.sleep(1700);
            }
            catch(Exception e){
            }
        }
        System.out.println(t.getName() + " has finished counting.");
    }
}

class Wait{
    public static void main(String[] args) {
        ThreadBulid th1 = new ThreadBulid("One");
        ThreadBulid th2 = new ThreadBulid("Two");
        ThreadBulid th3 = new ThreadBulid("Three");
        th1.t.start();
        th2.t.start();
        th3.t.start();
        System.out.println("th1.isAlive(): " + th1.t.isAlive());
        System.out.println("th2.isAlive(): " + th2.t.isAlive());
        System.out.println("th3.isAlive(): " + th3.t.isAlive());
        System.out.println("Waiting for the threads to finish:");
        try{
            th1.t.join();
            th2.t.join();
            th3.t.join();
        }
        catch(Exception e){
        }
        System.out.println("th1.isAlive(): " + th1.t.isAlive());
        System.out.println("th2.isAlive(): " + th2.t.isAlive());
        System.out.println("th3.isAlive(): " + th3.t.isAlive());
    }
}