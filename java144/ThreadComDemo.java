/*************************************************************************
	> File Name: ThreadComDemo.java
	> Author:
	> Mail:
	> Created Time: 2015年02月13日 星期五 18时35分09秒
 ************************************************************************/

class Res {
    private String name;
    private String sex;
    public boolean flag=false;
    public void in(String name,String sex)
    {
        this.name = name;
        this.sex = sex;
    }
    public void out()
    {
        System.out.println(name+"  --  "+sex);
    }
}
class Input implements Runnable {
    private Res r;
    Input(Res r) {
        this.r = r;
    }
    public void run() {
        int x = 0;
        while(true) {
            synchronized(r) {
                if(r.flag)
                   try{r.wait();}catch(Exception e){}
                if(x==0) {
                    r.in("汉语","男");
                } else {
                    r.in("ada","male");
                }
                x = (x+1)%2;
                r.flag = true;
              r.notify();
            }
        }
    }
}
    class OutPut implements Runnable {
        private Res r;
        OutPut(Res r) {
            this.r = r;
        }
        public void run() {
            while(true)
                synchronized(r) {
                   if(!r.flag)
                      try{ r.wait();}catch(Exception e){}
                    r.out();
                    r.flag = false;
                  r.notify(); 

                }
        }
    }
    public class ThreadComDemo {
        public static void main(String args[]) {
            Res r = new Res();
            Input in = new Input(r);
            OutPut ou = new OutPut(r);
            Thread th1 = new Thread(in);
            Thread th2 = new Thread(ou);
            th1.start();
            th2.start();
        }

    }

