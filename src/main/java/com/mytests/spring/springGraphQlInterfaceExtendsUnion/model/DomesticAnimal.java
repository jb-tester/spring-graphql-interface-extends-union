package com.mytests.spring.springGraphQlInterfaceExtendsUnion.model;

/**
 * *
 * <p>Created by irina on 12/28/2023.</p>
 * <p>Project: spring-graphql-interface-extends-union</p>
 * *
 */
public interface DomesticAnimal extends Animal{
    String name();
    String breed();
    boolean isCattle();
    boolean needsCage();
}
