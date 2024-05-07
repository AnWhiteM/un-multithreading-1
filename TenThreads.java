import java.util.Random;
public class TenThreads extends Thread{

    public TenThreads(String name){
        super(name);
    }


    @Override
    public void run(){
        Random random = new Random();
        int number = random.nextInt(10) + 1;
        System.out.println("Thread " + this.getName() + " has number " + number);
        }
    }

    