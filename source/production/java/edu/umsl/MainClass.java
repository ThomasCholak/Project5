/*
Thomas Cholak
Professor Steve Riegerix
CMP SCI 2261
10 April 2022

Assignment: Write a program which classifies plants, animals and fungi using an interface, abstract class, and a set/list of elements.
 */


package edu.umsl;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main (String[] args) {
        //Animal
        Monkey monkey = new Monkey();
        Goat goat = new Goat();
        //Plant
        Tree tree = new Tree();
        Seaweed seaweed = new Seaweed();
        //Fungi
        Chanterelle chanterelle = new Chanterelle();
        Morel morel = new Morel();

        //Animal List
        List<String> animalList = new ArrayList<>();
        animalList.add(monkey.eatFood());
        animalList.add(monkey.modeOfReproduction());
        animalList.add(monkey.infoString());
        animalList.add(goat.eatFood());
        animalList.add(goat.modeOfReproduction());
        animalList.add(goat.infoString());
        System.out.println("Animal List: " + animalList);
        //Plant List
        List<String> plantList = new ArrayList<>();
        plantList.add(tree.eatFood());
        plantList.add(tree.modeOfReproduction());
        plantList.add(tree.infoString());
        plantList.add(seaweed.eatFood());
        plantList.add(seaweed.modeOfReproduction());
        plantList.add(seaweed.infoString());
        System.out.println("Plant List: " + plantList);
        //Fungi List
        List<String> fungiList = new ArrayList<>();
        fungiList.add(chanterelle.eatFood());
        fungiList.add(chanterelle.modeOfReproduction());
        fungiList.add(chanterelle.infoString());
        fungiList.add(morel.eatFood());
        fungiList.add(morel.modeOfReproduction());
        fungiList.add(morel.infoString());
        System.out.println("Fungi List: " + fungiList);
    }
}
