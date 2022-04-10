package edu.umsl;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main (String args[]) {
        //Animal
        Animal monkey = new Monkey();
        Animal goat = new Goat();
        //Plant
        Plant tree = new Tree();
        Plant seaweed = new Seaweed();
        //Fungi
        Fungi chanterelle = new Chanterelle();
        Fungi morel = new Morel();

        //Animal List
        List<String> animalList = new ArrayList<String>();
        animalList.add(monkey.eatFood());
        animalList.add(monkey.modeOfReproduction());
        animalList.add(((Monkey) monkey).infoString());
        animalList.add(goat.eatFood());
        animalList.add(goat.modeOfReproduction());
        animalList.add(((Goat) goat).infoString());
        System.out.println("Animal List: " + animalList.toString());
        //Plant List
        List<String> plantList = new ArrayList<String>();
        plantList.add(tree.eatFood());
        plantList.add(tree.modeOfReproduction());
        plantList.add(((Tree) tree).infoString());
        plantList.add(seaweed.eatFood());
        plantList.add(seaweed.modeOfReproduction());
        plantList.add(((Seaweed) seaweed).infoString());
        System.out.println("Plant List: " + plantList.toString());
        //Fungi List
        List<String> fungiList = new ArrayList<String>();
        fungiList.add(chanterelle.eatFood());
        fungiList.add(chanterelle.modeOfReproduction());
        fungiList.add(((Chanterelle) chanterelle).infoString());
        fungiList.add(morel.eatFood());
        fungiList.add(morel.modeOfReproduction());
        fungiList.add(((Morel) morel).infoString());
        System.out.println("Fungi List: " + fungiList.toString());
    }
}
