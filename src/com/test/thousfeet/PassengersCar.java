package com.test.thousfeet;

/**
 * 客车类
 * 属性：载客量
 */
public class PassengersCar extends Car implements CarryPassengers{

    private int pasNumber;

    public PassengersCar(String id, String model, int rent, int pasNumber){
        super(id, model, rent);
        this.pasNumber = pasNumber;
    }

    @Override
    public void carryPas() {
        System.out.println("载客量/人：" + pasNumber);
    }
}
