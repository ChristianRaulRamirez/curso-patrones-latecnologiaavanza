package com.lta.patronescreacionales.factory;

public class GameFactory implements CharacterFactory{

    @Override
    public Character createCharacter(String type) {
        switch (type.toLowerCase()) {
            case "warrior":
                return new Warrior();
            case "mage":
                return new Mage();
            case "archer":
                return new Archer();
            default:
                throw new IllegalArgumentException("Invalid character type: " + type);
        }
    }

}
