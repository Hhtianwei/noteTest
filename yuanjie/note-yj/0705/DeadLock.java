package com.shsxt.thread;

/**
 * 多线程死锁实例：两个锁进行嵌套，造成死锁
 */
public class DeadLock {
 
 
    public static void main(String[] args) {
        Task task1 = new Task(true);
        Task task2 = new Task(false);
        new Thread(task1).start();
        new Thread(task2).start();
    }
 
}
 
/**
 * 定义两个线程锁对象
 */
class Lock{
    public static final Object LOCK_A  = new Object();
    public static final Object LOCK_B  = new Object();
}
 
class  Task implements Runnable{
    private boolean flag;
    Task(boolean flag){
        this.flag = flag;
    }
    @Override
    public void run() {
        if(flag){
            while(true){
                //互相持有对方需要的锁
                synchronized (Lock.LOCK_A) {
                    System.out.println("if>>>>Lock_A");
                    synchronized (Lock.LOCK_B) {
                        System.out.println("if>>>>Lock_B");
                    }
                }
            }
        }else{
            while(true){
                //互相持有对方需要的锁
                synchronized (Lock.LOCK_B) {
                    System.out.println("else>>>>Lock_B");
                    synchronized (Lock.LOCK_A) {
                        System.out.println("else>>>>Lock_A");
                    }
                }
            }
        }
    }
}
