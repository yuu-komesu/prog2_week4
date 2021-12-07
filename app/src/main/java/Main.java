import jp.ac.uryukyu.ie.e215742.*;

public class Main {
    public static void main(String[] args){
        Warrior warrior = new Warrior();
        warrior.setName("勇者");
        warrior.setHitPoint(10);
        warrior.setAttack(5);
        warrior.setDead(false);
        Enemy enemy = new Enemy();
        enemy.setName("スライム");
        enemy.setHitPoint(6);
        enemy.setAttack(3);
        enemy.setDead(false);
        System.out.printf("%s vs. %s\n", warrior.getName(), enemy.getName());
        int turn = 0;
        while( warrior.isDead() == false && enemy.isDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            warrior.attackWithWeponSkill(enemy);
            enemy.attack(warrior);
        }
        System.out.println("戦闘終了");
    }
}