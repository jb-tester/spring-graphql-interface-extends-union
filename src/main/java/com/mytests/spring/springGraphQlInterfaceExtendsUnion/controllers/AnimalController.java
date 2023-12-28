package com.mytests.spring.springGraphQlInterfaceExtendsUnion.controllers;

import com.mytests.spring.springGraphQlInterfaceExtendsUnion.model.*;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AnimalController {

    private List<Animal> animals = new ArrayList<>();
    private List<DomesticAnimal> domesticAnimals = new ArrayList<>();
    private List<DomesticAnimal> cattle = new ArrayList<>();
    private List<DomesticAnimal> pets = new ArrayList<>();
    private List<Deer> deers = new ArrayList<>();
    private List<WildAnimal> updatedWilds = new ArrayList<>();

    private List<WildAnimal> wildAnimals = List.of(
            new Fox("female", "fenek", "Africa"),
            new Fox("female", "silver fox", "Europe, N America"),
            new Tiger("male", "bengal tiger", "Asia"),
            new Deer("male", "reindeer", "Northern Europe, Siberia, and North America", false)
    );
    private List<Cat> cats = List.of(
            new Cat("Boromir", "male", "main coon", true),
            new Cat("Tosha", "female", "main coon", true),
            new Cat("Kotya", "male", "europian", true),
            new Cat("Ruskeala", "female", "europian", true),
            new Cat("Anomalia", "female", "europian", false)
    );
    private List<Dog> dogs = List.of(
            new Dog("Chester", "male", "corgi", DogKind.SHEPHERD),
            new Dog("Puddington", "male", "cocopoo", DogKind.PET),
            new Dog("Bolto", "male", "husky", DogKind.SLED_DOG)

    );
    private List<Cow> cows = List.of(
            new Cow("Burenka", "female", "Yaroslavskaya", 15),
            new Cow("Zor`ka", "female", "Holstein", 25),
            new Cow("Zeus", "male", "Aberdeen Angus", 0)
    );
    private List<Pig> pigs = List.of(
            new Pig("Bor`ka", "male", "Black Iberian", 150),
            new Pig("Pelageja", "female", "Berkshire", 220)
    );

    @QueryMapping()
    public List<? extends Animal> allAnimals() {
        animals.addAll(dogs);
        animals.addAll(cats);
        animals.addAll(cows);
        animals.addAll(pigs);
        animals.addAll(deers);
        animals.addAll(wildAnimals);
        return animals;
    }

    @QueryMapping()
    public List<DomesticAnimal> allDomestics() {
        domesticAnimals.addAll(dogs);
        domesticAnimals.addAll(cats);
        domesticAnimals.addAll(cows);
        domesticAnimals.addAll(pigs);
        return domesticAnimals;
    }

    @QueryMapping()
    public List<WildAnimal> allWilds() {
        updatedWilds.addAll(wildAnimals);
        updatedWilds.addAll(deers);
        return updatedWilds;
    }

    @QueryMapping()
    public List<? extends DomesticAnimal> allCattle() {
        cattle.addAll(cows);
        cattle.addAll(pigs);

        return cattle;
    }

    @QueryMapping()
    public List<? extends DomesticAnimal> allPets() {
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    // https://youtrack.jetbrains.com/issue/IDEA-339942
    @QueryMapping()
    public List<Cat> allCats() {

        return cats;
    }

    // https://youtrack.jetbrains.com/issue/IDEA-339942
    @QueryMapping()
    public List<Dog> allDogs() {

        return dogs;
    }

    @MutationMapping("addDeer")
    public Deer addDeer(@Argument("input") ExampleInput input) {
        String sex = input.getSex();
        String specie = input.getSpecie();
        String areal = input.getAreal();
        Boolean rare = input.getRare();
        Deer deer = new Deer(sex, specie, areal, rare);
        deers.add(deer);
        return deer;
    }

    // https://youtrack.jetbrains.com/issue/IDEA-339942
    @MutationMapping("addDeer2")
    public Deer addDeer2(@Argument String specie, @Argument String sex, @Argument String areal, @Argument Boolean rare) {

        Deer deer = new Deer(sex, specie, areal, rare);
        deers.add(deer);
        return deer;
    }

}
