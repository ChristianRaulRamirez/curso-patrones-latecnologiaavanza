package com.lta.patronescreacionales.factory.abstrct;

public class Sorcerer extends Mage {

    @Override
    public void introduce() {
        System.out.println("I am a powerful sorcerer!");
    }

    @Override
    public void attack() {
        System.out.println("Sorcerer casts fireball!");
    }

    @Override
    public void defend() {
        System.out.println("Sorcerer uses arcane shield!");
    }

}
