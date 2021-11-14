import jp.ac.uryukyu.ie.e215742.*;

public class Main {
    public static void main(String[] args){
        Hero hero = new Hero();
        hero.setName("勇者");
        hero.setHitPoint(10);
        hero.setAttack(5);
        hero.setDead(false);
        Enemy enemy = new Enemy();
        enemy.setName("スライム");
        enemy.setHitPoint(6);
        enemy.setAttack(3);
        enemy.setDead(false);
        System.out.printf("%s vs. %s\n", hero.getName(), enemy.getName());
        int turn = 0;
        while( hero.isDead() == false && enemy.isDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            hero.attack(enemy);
            enemy.attack(hero);
        }
        System.out.println("戦闘終了");
    }
}