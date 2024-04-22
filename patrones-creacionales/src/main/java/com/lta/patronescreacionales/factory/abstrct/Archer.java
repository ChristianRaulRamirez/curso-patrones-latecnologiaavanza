package com.lta.patronescreacionales.factory.abstrct;

class Archer implements Character {
    @Override
    public void introduce() {
        System.out.println("I am a skilled archer!");
    }

    @Override
    public void attack() {
        System.out.println("Archer shoots arrows with precision!");
    }

    @Override
    public void defend() {
        System.out.println("Archer evades attacks with agility!");
    }
}