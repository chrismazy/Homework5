package hw111360120;

public class Sample6_2 {
    public static void main(String[] args) {
        Car45 car1 = new Car45("1號車");
        car1.start();

        Car45 car2 = new Car45("2號車");
        car2.start();

        for (int i = 0; i < 5; i++)
            System.out.println("正在進行main()的處理工作");
    }
}

class Car45 extends Thread {
    private String name;

    public Car45(String nm) {
        this.name = nm;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("正在進行" + this.name + "的處理工作");
    }
}