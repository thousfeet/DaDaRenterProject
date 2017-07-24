package com.test.thousfeet;

/**
 * 货车类
 * 属性：载货量
 */
public class GoodsCar extends Car implements CarryGoods{

    private int goodsTonnage;

    public GoodsCar(String id, String model, int rent, int goodsTonnage){
        super(id, model, rent);
        this.goodsTonnage = goodsTonnage;
    }

    @Override
    public void carryGoods() {
        System.out.println("载货量/吨：" + goodsTonnage);
    }
}
