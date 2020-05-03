package factoryPattern;

public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("我的肤色是白色");
    }

    @Override
    public void talk() {
        System.out.println("我是白种人");
    }
}
