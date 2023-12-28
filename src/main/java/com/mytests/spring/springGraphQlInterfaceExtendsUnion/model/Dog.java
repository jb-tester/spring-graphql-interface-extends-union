package com.mytests.spring.springGraphQlInterfaceExtendsUnion.model;


public class Dog implements DomesticAnimal {

    String _name;
    String _sex;
    String _breed;
    private DogKind _kind;

    public DogKind kind() {
        return this._kind;
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
        return "dog";
    }

    public Dog(String _name, String _sex, String breed, DogKind kind) {
        this._name = _name;
        this._sex = _sex;
        _breed = breed;
        _kind = kind;
    }
}
