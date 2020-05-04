package simpleFactoryPattern;

public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("我的肤色是黄色");
    }

    @Override
    public void talk() {
        System.out.println("我是黄种人");
    }
}
