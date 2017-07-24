package com.test.thousfeet;

/**
 * 皮卡类
 * 属性：型号，租金，载货量，载客量
 * 方法：载货，载客
 */
public class PickupCar extends Car implements CarryGoods, CarryPassengers{

    private int pasNumber;
    private int goodsTonnage;

    public PickupCar(String id, String model, int rent, int pasNumber, int goodsTonnage) {
        super(id, model, rent);
        this.pasNumber = pasNumber;
        this.goodsTonnage = goodsTonnage;
    }



    @Override
    public void carryGoods() {
        System.out.println("载货量/吨：" + goodsTonnage);
    }

    @Override
    public void carryPas() {
        System.out.println("载客量/人：" + pasNumber);
    }
}
