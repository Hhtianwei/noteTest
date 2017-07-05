package com.shsxt.yuanx;

public class Test {
	public static void main(String[] args) {
		Street s = new Street(true);
		Person p = new Person(s);
		Car c = new Car(s);
		p.start();
		c.start();
	}
}

/*街道： 共同使用的资源，有信号
* 	人走东西  west   true
*  车走南北   north  false
* 	
* 
* Person 	使用街道 west   true 走    false停
* Car      使用街道  north  false 走 true停
*/
class Street {
	private boolean flag;

	public Street(boolean flag) {
		this.flag = flag;
	}

	public synchronized void west() {
		if (flag == false) {
			try {
				this.wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("东西向-->人走");
		this.flag = false;
		this.notify();
	}

	public synchronized void north() {
		if (this.flag == true) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.flag = true;
		System.out.println("车在走------");
		this.notify();
	}
}

class Person extends Thread {
	private Street s;

	public Person(Street s) {

	}

	@Override
	public void run() {
		while (true) {
			s.west();
		}
	}
}

class Car extends Thread {
	private Street s;

	public Car(Street s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			s.north();
		}
	}
}