//A test program to show concurrent execution of threads
//control switches between threads when other threads are paused(using sleep())

class THREAD extends Thread{
    public void run(){
        System.out.println(this.getName() + " counts to 10:");
        for(int i = 1 ; i < 11 ; ++i){
            System.out.println(this.getName() + ": " + i);
            try{
                Thread.sleep(1500);                         //1.5 sec delay
            }
            catch(Exception e){
            }
        }
        System.out.println(this.getName() + " has finished counting");
    }
}

class OtherTHREAD extends Thread{
    public void run(){
        System.out.println(this.getName() + " counts from 10:");
        for(int i = 10 ; i > 0 ; --i){
            System.out.println(this.getName() + ": " + i);
            try{
                Thread.sleep(900);                          //0.9 sec delay
            }
            catch(Exception e){
            }
        }
        System.out.println(this.getName() + " has finished counting");
    }
}

class Concurr{
    public static void main(String[] args) {
        THREAD t1 = new THREAD();               //when no name is provided, java automatically provides one with the form "Thread-n", where n is a whole number
        OtherTHREAD t2 = new OtherTHREAD();
        t1.start();
        t2.setPriority(Thread.NORM_PRIORITY - 2);       //setting priority lower than the default value(5)
        t2.start();
        try{
            Thread.sleep(16000);                //waiting for other threads to end
        }
        catch(Exception e){
        }
        System.out.println("Exiting Main thread");
    }
}