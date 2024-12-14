package hw111360120;

public class Sample6_5 {
    public static void main(String[] args) {
        Car48 car1 = new Car48("1號車");
        car1.start();

        try {
            car1.join();
        } catch (InterruptedException e) {
        }

        System.out.println("結束main()的處理工作");
    }
}

class Car48 extends Thread {
    private String name;

    public Car48(String nm) {
        this.name = nm;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("正在進行" + this.name + "的處理工作");
    }
}