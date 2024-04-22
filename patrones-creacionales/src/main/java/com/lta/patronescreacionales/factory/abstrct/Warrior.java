package com.lta.patronescreacionales.factory.abstrct;

class Warrior implements Character {
    @Override
    public void introduce() {
        System.out.println("I am a mighty warrior!");
    }

    @Override
    public void attack() {
        System.out.println("Warrior attacks with sword!");
    }

    @Override
    public void defend() {
        System.out.println("Warrior defends with shield!");
    }
}