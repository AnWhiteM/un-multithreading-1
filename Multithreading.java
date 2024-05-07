public class Multithreading {
    public static void main(String[] args){
        for (int i = 0; i < 11; i++){
            TenThreads myThread = new TenThreads("thread " + (i+1));
            myThread.start();
        }
    }
}
