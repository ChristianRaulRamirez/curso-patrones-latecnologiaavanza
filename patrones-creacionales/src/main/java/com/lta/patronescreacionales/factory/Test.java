package com.lta.patronescreacionales.factory;

public class Test {
    public static void main(String[] args) {

        CharacterFactory factory = new GameFactory();

        // Crear un guerrero
        Character warrior = factory.createCharacter("warrior");
        warrior.introduce();
        warrior.attack();
        warrior.defend();

        // Crear un mago
        Character mage = factory.createCharacter("mage");
        mage.introduce();
        mage.attack();
        mage.defend();

        // Crear un arquero
        Character archer = factory.createCharacter("archer");
        archer.introduce();
        archer.attack();
        archer.defend();

    }
}
