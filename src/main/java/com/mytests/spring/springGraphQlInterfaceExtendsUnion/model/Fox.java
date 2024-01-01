package com.mytests.spring.springGraphQlInterfaceExtendsUnion.model;

/**
 * *
 * <p>Created by irina on 12/28/2023.</p>
 * <p>Project: spring-graphql-interface-extends-union</p>
 * *
 */
public class Fox implements WildAnimal {
    String _sex;
    private String _specie;
    private String _areal;
    private boolean preciousFur;
    @Override
    public String areal() {
        return this._areal;
    }

    @Override
    public Boolean isRare() {
        return false;
    }

    @Override
    public String sex() {
        return this._sex;
    }

    @Override
    public String specie() {
        return this._specie;
    }

    public boolean isPreciousFur() {
        return preciousFur;
    }



    public Fox(String _sex, String specie, String areal, boolean preciousFur) {
        this._sex = _sex;
        _specie = specie;
        _areal = areal;
        this.preciousFur = preciousFur;
    }

}
