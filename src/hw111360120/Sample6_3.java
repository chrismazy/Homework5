package hw111360120;

public class Sample6_3 {
    public static void main(String[] args) {
        Car46 car1 = new Car46("1號車");
        car1.start();

        for (int i = 0; i < 5; i++)
            System.out.println("正在進行main()的處理工作");
    }
}

class Car46 extends Thread {
    private String name;

    public Car46(String nm) {
        this.name = nm;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(1000);
                System.out.println("正在進行" + this.name + "的處理工作");
            } catch (InterruptedException e) {
            }
        }
    }
}