class Bank {
    private int num = 0;
    public synchronized void add(int num) {
        this.num+=num;
        System.out.println(this.num);
    }

}

class Cus implements Runnable {
    private Bank b = new Bank();
    public void run() {
        for(int x = 0; x<3; ++x) {
            b.add(100);
        }
    }
}
class BankDemo {
    public static void main(String args[]) {
        Cus c = new Cus();
        new Thread(c).start();
        new Thread(c).start();
    }
}


