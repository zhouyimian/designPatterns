package simpleFactoryPattern;

import factoryPattern.AbstractHumanFactory;

public class NvWa {

    public static void main(String[] args) {
        HumanFactory factory = new HumanFactory();
        Human human = factory.createHuman(WhiteHuman.class);
        human.talk();
        human.getColor();
        human = factory.createHuman(YellowHuman.class);
        human.talk();
        human.getColor();
    }
}
