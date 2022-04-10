package edu.umsl;

abstract class Creature {
    abstract String eatFood();
}

class Plant extends Creature implements Reproduction {
    @Override
    String eatFood() {
        return "sunlight (aka photosynthesis)";
    }

    @Override
    public String modeOfReproduction() {
        return "Seeds";
    }
}
class Animal extends Creature implements Reproduction {
    @Override
    String eatFood() {
        return "ingestion";
    }

    @Override
    public String modeOfReproduction() {
        return "Sexual Reproduction";
    }
}
class Fungi extends Creature implements Reproduction {
    @Override
    String eatFood() {
        return "external digestion with hyphae";
    }

    @Override
    public String modeOfReproduction() {
        return "Spores";
    }
}

//Animal subclasses
class Goat extends Animal {
    public String infoString() {
        return "This animal enjoys living on mountains and eating grass";
    }

}
class Monkey extends Animal {
    public String infoString() {
        return "This animal enjoys swinging in trees and eating bananas";
    }
}

//Plant subclasses
class Tree extends Plant {
    public String infoString() {
        return "This plant consists of a tall, sturdy trunk with branches full of leaves";
    }
}
class Seaweed extends Plant {
    public String infoString() {
        return "This plant lives underwater and is very slimy, but is edible and often used in sushi";
    }
}

//Fungi subclass
class Chanterelle extends Fungi {
    public String infoString() {
        return "A bright yellow mushroom that is used in cooking";
    }
}
class Morel extends Fungi {
    public String infoString() {
        return "A brown, coveted mushroom renowned for its aroma";
    }
}
