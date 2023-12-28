package com.mytests.spring.springGraphQlInterfaceExtendsUnion.model;


public class Cow implements DomesticAnimal {

    String _name;
    String _sex;
    String _breed;
    private int _milkPerDay;

    public int milkPerDay() {
        return _milkPerDay;
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
        return "cow";
    }

    public Cow(String _name, String _sex, String breed, int milkPerDay) {
        this._name = _name;
        this._sex = _sex;
        _breed = breed;
        _milkPerDay = milkPerDay;
    }
}
