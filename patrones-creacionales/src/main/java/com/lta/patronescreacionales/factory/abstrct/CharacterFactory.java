package com.lta.patronescreacionales.factory.abstrct;

// Fábrica abstracta para crear familias de personajes
public interface CharacterFactory {

    Character createWarrior();
    Character createMage();
    Character createArcher();

}
