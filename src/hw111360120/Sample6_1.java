package hw111360120;

public class Sample6_1 {
    public static void main(String[] args) {
        Car44 car1 = new Car44("1號車");
        car1.start();

        for (int i = 0; i < 5; i++)
            System.out.println("正在進行main()的處理工作");
    }
}

class Car44 extends Thread {
    private String name;

    public Car44(String nm) {
        this.name = nm;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("正在進行" + this.name + "的處理工作");
    }
}