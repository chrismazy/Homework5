package hw111360120;

public class Sample6_6 {
    public static void main(String[] args) {
        Car50 car1 = new Car50("1號車");

        Thread th1 = new Thread(car1);
        th1.start();

        for (int i = 0; i < 5; i++)
            System.out.println("正在處理main()的處理工作");
    }
}

class Car50 implements Runnable {
    private String name;

    public Car50(String nm) {
        this.name = nm;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("正在進行" + this.name + "的處理工作");
    }
}