package simpleFactoryPattern;

public class HumanFactory {
    public static <T extends Human> T createHuman(Class<T> clazz) {
        Human human = null;

        try {
            human = (T)Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            System.out.println("生成人种错误");
        }
        return (T)human;
    }
}
