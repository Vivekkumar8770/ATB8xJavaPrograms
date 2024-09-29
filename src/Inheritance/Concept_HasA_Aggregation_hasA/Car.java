package Inheritance.Concept_HasA_Aggregation_hasA;

public class Car {
    // Car Has-A Engine, Tyre
    protected void startCar(){
        new Engine().start();
        new Tyre().rolling();
    }
}
