package com.mytests.spring.springGraphQlInterfaceExtendsUnion.model;


public class Deer implements WildAnimal {
    String _sex;
    private String _specie;
    private String _areal;
    private Boolean _rare;

    @Override
    public String areal() {
        return this._areal;
    }

    @Override
    public Boolean isRare() {
        return _rare;
    }

    @Override
    public String sex() {
        return this._sex;
    }

    @Override
    public String specie() {
        return this._specie;
    }

    public Deer(String _sex, String specie, String areal, Boolean rare) {
        this._sex = _sex;
        _specie = specie;
        _areal = areal;
        _rare = rare;
    }

}
