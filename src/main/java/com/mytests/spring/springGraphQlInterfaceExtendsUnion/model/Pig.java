package com.mytests.spring.springGraphQlInterfaceExtendsUnion.model;


public class Pig implements DomesticAnimal {

    String _name;
    String _sex;
    String _breed;
    private int _weight;


    public int weight() {
        return this._weight;
    }

    @Override
    public String name() {
        return this._name;
    }

    @Override
    public String breed() {
        return this._breed;
    }

    @Override
    public boolean isCattle() {
        return false;
    }

    @Override
    public boolean needsCage() {
        return false;
    }

    @Override
    public String sex() {
        return this._sex;
    }

    @Override
    public String specie() {
        return "pig";
    }

    public Pig(String _name, String _sex, String breed, int weight) {
        this._name = _name;
        this._sex = _sex;
        _breed = breed;
        _weight = weight;
    }
}
