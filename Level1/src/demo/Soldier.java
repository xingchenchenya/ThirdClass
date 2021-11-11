package demo;

import java.util.Random;
//父类 Soldier
public class Soldier {
    private String nameSo;
    private int soldierLife;
    private int soldierAtt;
    public String getNameSo(){
        return nameSo;
    }
    public void setNameSo(String nameSo){
        this.nameSo=nameSo;
    }
    public int getSoldierLife(){
        return soldierLife;
    }
    public void setSoldierLife(int soldierLife){
        this.soldierLife=soldierLife;
    }
    public int getSoldierAtt(){
        return soldierAtt;
    }
    public void setSoldierAtt(int soldierAtt){
        this.soldierAtt=soldierAtt;
    }
    public void start(){
        System.out.println("小兵名：" + nameSo + "\n小兵生命：" + soldierLife + "\n小兵攻击力：" + soldierAtt);
    }
    public void soldierAttack(int att,String name){
        System.out.println("小兵对中泰姐姐的"+name+"造成"+att+"点伤害");
    }
}
//五个子类  First/Second/Third/Forth/Rend Soldier
class FirstSoldier extends Soldier{
    //nameSo="近程小兵"；
    //soldierAtt=200;
    //soldierLife=1000;
    @Override
    public String getNameSo() {
        super.setNameSo("近程小兵");
        return "近程小兵";
    }
    @Override
    public int getSoldierAtt() {
        super.setSoldierAtt(200);
        return 200;
    }
    @Override
    public int getSoldierLife() {
        super.setSoldierLife(1000);
        return 1000;
    }
}
class SecondSoldier extends Soldier{
    //nameSo="远程小兵"；
    //soldierAtt=500;
    //soldierLife=1500;
    @Override
    public String getNameSo() {
        super.setNameSo("远程小兵");
        return "远程小兵";
    }
    @Override
    public int getSoldierAtt() {
        super.setSoldierAtt(500);
        return 500;
    }
    @Override
    public int getSoldierLife() {
        super.setSoldierLife(1500);
        return 1500;
    }
}
class ThirdSoldier extends Soldier{
    // nameSo="跑车";
    // soldierAtt=300;
    //  soldierLife=4000;
    @Override
    public String getNameSo() {
        super.setNameSo("跑车");
        return "跑车";
    }
    @Override
    public int getSoldierAtt() {
        super.setSoldierAtt(300);
        return 300;
    }
    @Override
    public int getSoldierLife() {
        super.setSoldierLife(4000);
        return 4000;
    }
}
class ForthSoldier extends Soldier{
    //nameSo="超级兵";
    // soldierLife=4500;
    // soldierAtt=800;
    @Override
    public String getNameSo() {
        super.setNameSo("超级兵");
        return "超级兵";
    }
    @Override
    public int getSoldierAtt() {
        super.setSoldierAtt(800);
        return 800;
    }
    @Override
    public int getSoldierLife() {
        super.setSoldierLife(4500);
        return 4500;
    }
}
class RendSoldier extends Soldier {
    Random r=new Random();
    int soldierLife=r.nextInt(4999)+1;
    int soldierAtt=r.nextInt(998)+1;
    @Override
    public String getNameSo() {
        super.setNameSo("随机兵");
        return "随机兵";
    }
    @Override
    public int getSoldierAtt() {
        super.setSoldierAtt(soldierAtt);
        return soldierAtt;
    }
    @Override
    public int getSoldierLife() {
        super.setSoldierLife(soldierLife);
        return soldierLife;
    }
}