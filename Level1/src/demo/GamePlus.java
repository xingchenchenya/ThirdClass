package demo;
import java.util.*;
public class GamePlus {
    public static void main(String[] args) {
        int round=0;
        Scanner into=new Scanner(System.in);
        HeroPlus mine = new HeroPlus();
        System.out.println("输入英雄名称：");
        String heroName=into.next();
        String aName=mine.setName(heroName);
        System.out.println("输入英雄生命：");
        int heroLife=into.nextInt();
        heroLife=mine.setLife(heroLife);
        System.out.println("输入英雄攻击力：");
        int heroAtt=into.nextInt();
        heroAtt=mine.setAttack(heroAtt);
        System.out.println("输入英雄防御力：");
        int heroPre= into.nextInt();
        heroPre=mine.setPreserve(heroPre);
        System.out.println(aName+"准备完毕");
        //选择小兵
        System.out.println("请选择一个攻击小兵");
        System.out.println("1.近战小兵");
        System.out.println("2.远战小兵");
        System.out.println("3.跑车");
        System.out.println("4.超级兵");
        System.out.println("5.随机兵");
        int x= into.nextInt();
        Soldier first=new FirstSoldier();
        Soldier second=new SecondSoldier();
        Soldier third=new ThirdSoldier();
        Soldier forth=new ForthSoldier();
        Soldier rend=new RendSoldier();
        System.out.println("是否开启反击模式？yes or no please!");
        String answer= into.next();
        switch (x) {
            case 1 -> {
                String soldierName = first.getNameSo();
                int soldierLife = first.getSoldierLife();
                int soldierAtt = first.getSoldierAtt();
                first.start();
                do {round++;
                    System.out.println("round"+round);
                    mine.heroAttack(heroAtt,soldierName);
                    soldierLife -= heroAtt;
                    first.soldierAttack(soldierAtt, aName);
                    heroLife = heroLife + heroPre - soldierAtt;
                    //反击时刻
                    if (Objects.equals(answer, "yes") &&heroLife>0){
                        Back heroB= new BeatBack();
                        int att2=mine.attBack(heroB);
                        soldierLife-=att2;
                        mine.heroAttack(att2,soldierName);
                    }else System.out.println("你未激活反击技能");
                } while (heroLife > 0 && soldierLife > 0);
            }
            case 2 -> {
                String soldierName2 = second.getNameSo();
                int soldierLife2 = second.getSoldierLife();
                int soldierAtt2 = second.getSoldierAtt();
                second.start();
                do {
                    round++;
                    mine.heroAttack(heroAtt, soldierName2);
                    soldierLife2 -= heroAtt;
                    second.soldierAttack(soldierAtt2, aName);
                    heroLife = heroLife + heroPre - soldierAtt2;
                    //反击时刻
                    if (Objects.equals(answer, "yes") &&heroLife>0){
                        Back heroB= new BeatBack();
                        int att2=mine.attBack(heroB);
                        soldierLife2-=att2;
                        mine.heroAttack(att2,soldierName2);
                    }else System.out.println("你未激活反击技能");
                } while (heroLife > 0 && soldierLife2 > 0);
            }
            case 3 -> {
                String soldierName3 = third.getNameSo();
                int soldierLife3 = third.getSoldierLife();
                int soldierAtt3 = third.getSoldierAtt();
                third.start();
                do {
                    round++;
                    mine.heroAttack(heroAtt, soldierName3);
                    soldierLife3 -= heroAtt;
                    third.soldierAttack(soldierAtt3, aName);
                    heroLife = heroLife + heroPre - soldierAtt3;
                    //反击时刻
                    if (Objects.equals(answer, "yes") &&heroLife>0){
                        Back heroB= new BeatBack();
                        int att2=mine.attBack(heroB);
                        soldierLife3-=att2;
                        mine.heroAttack(att2,soldierName3);
                    }else System.out.println("你未激活反击技能");
                } while (heroLife > 0 && soldierLife3 > 0);
            }
            case 4 -> {
                String soldierName4 = forth.getNameSo();
                int soldierLife4 = forth.getSoldierLife();
                int soldierAtt4 = forth.getSoldierAtt();
                forth.start();
                do {
                    round++;
                    mine.heroAttack(heroAtt, soldierName4);
                    soldierLife4 -= heroAtt;
                    forth.soldierAttack(soldierAtt4, aName);
                    heroLife = heroLife + heroPre - soldierAtt4;
                    //反击时刻
                    if (Objects.equals(answer, "yes") &&heroLife>0){
                        Back heroB= new BeatBack();
                        int att2=mine.attBack(heroB);
                        soldierLife4-=att2;
                        mine.heroAttack(att2,soldierName4);
                    }else System.out.println("你未激活反击技能");
                } while (heroLife > 0 && soldierLife4 > 0);
            }
            case 5 -> {
                String soldierName5 = rend.getNameSo();
                int soldierLife5 = rend.getSoldierLife();
                int soldierAtt5 = rend.getSoldierAtt();
                rend.start();
                do {
                    round++;
                    mine.heroAttack(heroAtt, soldierName5);
                    soldierLife5 -= heroAtt;
                    rend.soldierAttack(soldierAtt5, aName);
                    heroLife = heroLife + heroPre - soldierAtt5;
                    //反击时刻
                    if (Objects.equals(answer, "yes") &&heroLife>0){
                        Back heroB= new BeatBack();
                        int att2=mine.attBack(heroB);
                        soldierLife5-=att2;
                        mine.heroAttack(att2,soldierName5);
                    }else System.out.println("你未激活反击技能");
                } while (heroLife > 0 && soldierLife5 > 0);
            }
        }
        System.out.println("最终对抗："+round+"轮");
        if (heroLife<=0){
            System.out.println("游戏结束！\n中泰姐姐的"+aName+"阵亡。挑战失败！");
        }else{
            System.out.println("游戏结束！\n小兵死亡。"+aName+"存活。挑战成功！");
        }
    }
}
