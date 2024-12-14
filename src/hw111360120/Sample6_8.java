package hw111360120;

public class Sample6_8 {
    public static void main(String[] args) {
        Company cmp = new Company();

        Driver drv1 = new Driver(cmp), drv2 = new Driver(cmp);
        drv1.start();
        drv2.start();
    }
}

class Company55 {
    private int sum = 0;

    public synchronized void add(int a) {
        System.out.println("目前的合計金額是" + this.sum + "元");
        System.out.println("賺到" + a + "元了。");
        System.out.println("合計金額是" + (sum += a) + "元");
    }
}

class Driver55 extends Thread {
    private Company comp;

    public Driver55(Company c) {
        this.comp = c;
    }

    public void run() {
        for (int i = 0; i < 3; i++)
            comp.add(50);
    }
}