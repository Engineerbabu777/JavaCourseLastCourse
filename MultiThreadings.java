

class MultiThreadings {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        MultiThreadingViaThread demo = new MultiThreadingViaThread();
        demo.start();

        MultiThreadingViaRunnable demo2 = new MultiThreadingViaRunnable();
        Thread thread = new Thread(demo2);
        thread.start();

        Test demo3 = new Test();
        demo3.run();
        

    }
}


 // RUN PARALLEL THREADS!
 class MultiThreadingViaThread extends Thread {


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

}

class MultiThreadingViaRunnable implements Runnable {
     public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class Test {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

