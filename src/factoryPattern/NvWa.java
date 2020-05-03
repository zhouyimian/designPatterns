package factoryPattern;

public class NvWa {

    public static void main(String[] args) {
        AbstractHumanFactory factory = new HumanFactory();
        Human human = factory.createHuman(WhiteHuman.class);
        human.talk();
        human.getColor();
        human = factory.createHuman(YellowHuman.class);
        human.talk();
        human.getColor();
    }
}
