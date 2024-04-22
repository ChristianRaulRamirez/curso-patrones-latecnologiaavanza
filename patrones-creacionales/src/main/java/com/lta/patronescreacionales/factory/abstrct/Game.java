package com.lta.patronescreacionales.factory.abstrct;

// Clase cliente que utiliza la fábrica abstracta para crear personajes
public class Game {
    public static void main(String[] args) {
        // Crear una fábrica de personajes de fantasía
        CharacterFactory fantasyFactory = new FantasyCharacterFactory();
        // Crear y utilizar personajes de fantasía
        createAndUseCharacters(fantasyFactory);

        // Crear una fábrica de personajes de acción
        CharacterFactory actionFactory = new ActionCharacterFactory();
        // Crear y utilizar personajes de acción
        createAndUseCharacters(actionFactory);
    }

    public static void createAndUseCharacters(CharacterFactory factory) {
        // Crear un guerrero
        Character warrior = factory.createWarrior();
        warrior.introduce();
        warrior.attack();
        warrior.defend();

        // Crear un mago
        Character mage = factory.createMage();
        mage.introduce();
        mage.attack();
        mage.defend();

        // Crear un arquero
        Character archer = factory.createArcher();
        archer.introduce();
        archer.attack();
        archer.defend();
    }
}
