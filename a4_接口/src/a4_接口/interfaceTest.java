package a4_接口;
/*
* 1.接口通过让类去实现（implements）的方法来使用
* 如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化
* 如果实现类没有覆盖接口中所有的抽象方法，则此实现类仍为抽象类
* 2.java中可以实现多个接口
* 3.接上接口后必须重写类，不然仍为抽象类
 */
public class interfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
         // Flyable.MIN_SPEED = 2;  已经定义了final无法修改
        Plane plane = new Plane();
        plane.fly();
    }
}
interface Flyable{
    //全局常量
    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 1; //省略了public static final

    public abstract void fly();
    void stop(); //省略了public abstract
}
class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("飞机飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速至停止");
    }
}