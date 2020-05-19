/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class main 
{
      public static void main(String[] args) 
      {
        //Creating a new Zoo.
        Zoo laZoo = new Zoo("Los Angeles Zoo", "5333 Zoo Dr, Los Angeles, CA 90027", 133, 0);
        //Creating two different Enclosures.
        Enclosure firstEnclosure = new Enclosure("Savanna");
        Enclosure secondEnclosure = new Enclosure("River");
        //Creating our animals.
        Zebra zeb = new Zebra("Zebby");
        Gazelle gaz = new Gazelle("Gaz");
        Crocodile croc = new Crocodile("Gena");
        Lion leo = new Lion("Leo");
        //Trying to add croc to the firstEnclosure, but Crocodiles can't live in the Savannah, so it prints an error      message.
        firstEnclosure.addAnimal(croc);
        //Adding leo to the first enclosure.
        firstEnclosure.addAnimal(leo);
        //Adding croc to the second enclosure.
        secondEnclosure.addAnimal(croc);
        //Trying to add zeb to the secondEnclosure, but Crocodiles and Zebras are enemies, so it prints an error message.
        secondEnclosure.addAnimal(zeb);
        //Creating a new enclosure just for the herbivores.
        Enclosure thirdEnclosure = new Enclosure("Savanna");
        //Adding zeb and gaz to the third enclosure.
        thirdEnclosure.addAnimal(zeb);
        thirdEnclosure.addAnimal(gaz);
        //Adding all three enclosures to the zoo.
        laZoo.addEnclosure(firstEnclosure);
        laZoo.addEnclosure(secondEnclosure);
        laZoo.addEnclosure(thirdEnclosure);
        //Printing the Zoo:
        System.out.println(laZoo);
        //Getting the feeding instructions for all the animals:
        laZoo.getFeedingInstructions();
        //Feeding the animals:
        laZoo.feed();
        //However, an error message is printed because the Zoo doesn't have enough money to feed all the animals, so we add more money to the Zoo.
        laZoo.setbudget(999999999);
        //Successfully feeding the animals!
        laZoo.feed();
    }

}
