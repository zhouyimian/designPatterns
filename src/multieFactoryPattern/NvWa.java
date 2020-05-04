package multieFactoryPattern;

public class NvWa {

    public static void main(String[] args) {
        AbstractHumanFactory factory = new YellowHumanFactory();
        Human human = factory.createHuman();
        human.talk();
        human.getColor();
        factory = new WhiteHumanFactory();
        human = factory.createHuman();
        human.talk();
        human.getColor();
    }
}
