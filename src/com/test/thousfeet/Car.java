package com.test.thousfeet;

/**
 * 待租车辆类
 * 属性：车型，租金
 */
public class Car {
    protected String id;
    protected String model;
    protected int rent;

    public Car(String id, String model, int rent) {
        this.id = id;
        this.model = model;
        this.rent = rent;
    }

    public void show() {
        System.out.println("-------------------------");
        System.out.println("车辆代号：" + id);
        System.out.println("车型：" + model);
        System.out.println("租金/天：" + rent);
    }

    public String getId() {
        return id;
    }

    public int getRent() {
        return rent;
    }

}
