package com.mytests.spring.springGraphQlInterfaceExtendsUnion.model;


public class Cat implements DomesticAnimal {

    String _name;
    String _sex;
    String _breed;
    private boolean _indoor;

    public boolean indoor() {
        return this._indoor;
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
        return "cat";
    }

    public Cat(String _name, String _sex, String breed, boolean indoor) {
        this._name = _name;
        this._sex = _sex;
        _breed = breed;
        _indoor = indoor;
    }
}
