package com.lta.patronescreacionales.factory.abstrct;

// Fábrica concreta para crear personajes de fantasía
public class FantasyCharacterFactory implements CharacterFactory{


    @Override
    public Character createWarrior() {
        return new Gladiator();
    }

    @Override
    public Character createMage() {
        return new Sorcerer();
    }

    @Override
    public Character createArcher() {
        return new Ranger();
    }
}
