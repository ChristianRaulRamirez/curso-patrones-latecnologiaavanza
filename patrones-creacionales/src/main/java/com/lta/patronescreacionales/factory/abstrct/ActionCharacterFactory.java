package com.lta.patronescreacionales.factory.abstrct;

// Fábrica concreta para crear personajes de acción
public class ActionCharacterFactory implements CharacterFactory {
    @Override
    public Character createWarrior() {
        return new Warrior();
    }

    @Override
    public Character createMage() {
        return new Mage();
    }

    @Override
    public Character createArcher() {
        return new Archer();
    }
}
