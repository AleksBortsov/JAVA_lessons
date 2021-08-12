package Hello;
class ThreadOne extends Thread {

    @Override
    public void run() {
       for (int i=0; i<10; i++){
           try {
               Thread.sleep(500);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println("id of thread "+ Thread.currentThread().getId()+", value of FIRST thread "+i);
       }
    }
}

class ThreadTwo extends Thread{
    @Override
    public void run(){
        for (int j=0; j<10; j++){
            System.out.println("id of thread "+ Thread.currentThread().getId()+", value of SECOND thread "+j);

        }
    }
}

public class Hello {
    public static void main(String[] args) {
        ThreadOne threadOne=new ThreadOne();
        ThreadTwo threadTwo=new ThreadTwo();
        threadOne.start();
        threadTwo.start();
    }}
