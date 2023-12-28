package com.mytests.spring.springGraphQlInterfaceExtendsUnion.model;


public class Tiger implements WildAnimal {
    String _sex;
    private String _areal;
    private String _specie;

    @Override
    public String areal() {
        return this._areal;
    }

    @Override
    public Boolean isRare() {
        return true;
    }

    @Override
    public String sex() {
        return this._sex;
    }

    @Override
    public String specie() {
        return this._specie;
    }

    public Tiger(String _sex, String areal, String specie) {
        this._sex = _sex;
        _areal = areal;
        _specie = specie;
    }
}
