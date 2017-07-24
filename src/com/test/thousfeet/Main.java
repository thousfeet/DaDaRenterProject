package com.test.thousfeet;

import java.util.Scanner;

/**
 * 主函数入口
 */
public class Main {

    public static void main(String[] args) {

        //************** 初始化待租车辆数组 *****************
        GoodsCar[] goodsCars = {
                new GoodsCar("001","轻型货车-福田",400,4),
                new GoodsCar("002","轻型货车-东风",380,3),
                new GoodsCar("003","重型货车-解放",570,8)
        };

        PassengersCar[] pasCars = {
                new PassengersCar("101","小客车-宇通",230,6),
                new PassengersCar("102","大客车-金旅",580,18)
        };

        PickupCar[] pickupCars = {
                new PickupCar("201","皮卡车-长城",400,1,3),
                new PickupCar("202","皮卡车-丰田",750,3,8)
        };

        //***************** 主程序开始 ******************

        //***是否进入租车环节分支***
        System.out.println("--------欢迎进入哒哒租车系统！----------");
        Scanner sc = new Scanner(System.in);
        boolean step1 = true;
        while(step1) {
            System.out.println("是否需要租车： 1.是  2.否");
            int choose1 = sc.nextInt();
            switch (choose1) {
                case 1:
                    step1 = false;
                    break;
                case 2:
                    step1 = false;
                    System.out.println("------------- 退出程序。 --------------");
                    return;
                default:
                    System.out.println("输入错误，请重新输入。");
            }
        }

        //***选择租车类型分支***
        boolean step2 = true;
        while(step2) {
            System.out.println("请选择租车类型： 1.载货  2.载客  3.载货载客");
            int choose2 = sc.nextInt();
            switch (choose2) {
                case 1:
                    step2 = false;
                    System.out.println("可选车辆详情如下：");
                    for(GoodsCar gc : goodsCars) {
                        gc.show();
                        gc.carryGoods();
                    }
                    for(PickupCar pc : pickupCars) {
                        pc.show();
                        pc.carryGoods();
                    }
                    break;
                case 2:
                    step2 = false;
                    System.out.println("可选车辆详情如下：");
                    for(PassengersCar psc : pasCars) {
                        psc.show();
                        psc.carryPas();
                    }
                    for(PickupCar pc : pickupCars) {
                        pc.show();
                        pc.carryPas();
                    }
                    break;
                case 3:
                    step2 = false;
                    System.out.println("可选车辆详情如下：");
                    for(PickupCar pc : pickupCars) {
                        pc.show();
                        pc.carryGoods();
                        pc.carryPas();
                    }
                    break;
                default:
                    System.out.println("输入错误，请重新输入。");
            }
        }

        //***选择车辆分支***
        boolean step3 = true;
        while (step3) {
            System.out.println("-------------------------");
            System.out.println("请输入车辆代号选择您要租的车辆：");
            String id = sc.next();
            System.out.println("请输入您要租车的天数：");
            int days = sc.nextInt();
            switch (id.charAt(0)) {
                case '0':
                    for(GoodsCar gc : goodsCars) {
                        if (id.equals(gc.getId())) {
                            step3 = false;
                            System.out.println("选车成功！租车详情如下：");
                            gc.show();
                            gc.carryGoods();
                            System.out.println("租赁天数为" + days + "天，产生费用" + gc.getRent()*days + "元。");
                        }
                    }
                    break;
                case '1':
                    for(PassengersCar pac : pasCars) {
                        if (id.equals(pac.getId())) {
                            step3 = false;
                            System.out.println("选车成功！租车详情如下：");
                            pac.show();
                            pac.carryPas();
                            System.out.println("租赁天数为" + days + "天，产生费用" + pac.getRent()*days + "元。");
                        }
                    }
                    break;
                case '2':
                    for(PickupCar pc : pickupCars) {
                        if (id.equals(pc.getId())) {
                            step3 = false;
                            System.out.println("选车成功！租车详情如下：");
                            pc.show();
                            pc.carryGoods();
                            pc.carryPas();
                            System.out.println("租赁天数为" + days + "天，产生费用" + pc.getRent()*days + "元。");
                        }
                    }
                    break;
            }
            if(step3) System.out.println("无此车辆！请重新选择。");
        }

        System.out.println("哒哒租车感谢您的使用！");
        System.out.println("------------- 退出程序。 --------------");
    }

}
