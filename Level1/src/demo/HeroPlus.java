package demo;
import java.util.*;
import java.util.Random;
public class HeroPlus {
    Scanner into=new Scanner(System.in);
    public String setName(String name) {
        for (int i=0;i<=2;){
            int length=length(name);
            if (length<1||length>20){
                System.out.println("控制字符在1-20之间，请重新输入");
                name=into.next();
            }else i+=3;
        }
        return name;
    }
    private static int length(String value) {
        int valueLength = 0;
        String chinese = "[\u0391-\uFFE5]";
        /* 获取字段值的长度，如果含中文字符，则每个中文字符长度为2，否则为1 */
        for (int i = 0; i < value.length(); i++) {
            /* 获取一个字符 */
            String temp = value.substring(i, i + 1);
            /* 判断是否为中文字符 */
            if (temp.matches(chinese)) {
                /* 中文字符长度为2 */
                valueLength += 2;
            } else {
                /* 其他字符长度为1 */
                valueLength += 1;
            }
        }
        return valueLength;
    }
    public int setLife(int life){
        for(int i=0;i<=2; ) {
            if (life >= 1 && life <= 9999) {
                i+=3;
            } else {
                System.out.println("控制英雄生命在1-9999内");
                life= into.nextInt();
            }
        }
        return life;
    }
    public int setAttack(int attack){
        for(int i=0;i<=2; ) {
            if (attack >= 1 && attack <= 999) {
                i+=3;
            } else {
                System.out.println("控制英雄攻击在1-999内");
                attack=into.nextInt();
            }
        }
        return attack;
    }
    public int setPreserve(int pre) {
        for(int i=0;i<=2; ) {
            if (pre >= 1 && pre <= 999) {
                i+=3;
            } else {
                System.out.println("控制英雄防御在1-999内");
                pre=into.nextInt();
            }
        }
        return pre;
    }
    public void heroAttack(int att,String name){
        System.out.println("中泰姐姐对" + name + "造成" + att + "点伤害");
    }
    public int attBack(Back BeatBack) {
        BeatBack.attack();
        Random r=new Random();
        return r.nextInt(99)+1;
    }

}
interface Back{
      void attack();
}
class BeatBack implements Back{
    @Override
    public void attack() {
        System.out.println("英雄呐喊：“我要反击”");
    }
}

