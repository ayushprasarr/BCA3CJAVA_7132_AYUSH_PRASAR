  class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running...");
        System.out.println("Thread Name: " + getName());
        System.out.println("Thread Priority: " + getPriority());
    }
}

public class SetGetThread {
    public static void main(String[] args) {

       
        MyThread t1 = new Thread(new Mythread);
        t1.setName("My Thread");

        t1.setPriority(8);

        t1.start();
		System.out.println("Main thread name:"+ Thread.currentThread().getName());
		System.out.println("Main thread priority:"+ Thread.currentThread().getPriority());
	}
}
