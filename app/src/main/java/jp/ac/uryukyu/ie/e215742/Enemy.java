package jp.ac.uryukyu.ie.e215742;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public String getName () {
        return this.name;
    }

    public void setName (String name){
        this.name = name ;
    }

    public int getHitPoint () {
        return this.hitPoint;
    }

    public void setHitPoint (int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getAttack () {
        return this.attack;
    }

    public void setAttack (int attack) {
        this.attack = attack;
    }

    public boolean isDead () {
        return this.dead;
    }

    public void setDead (boolean dead) {
        this.dead = dead;
    }

    /**
     * Heroへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param hero 攻撃対象
     */
    public void attack(Hero hero){
        if (dead == false){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, hero.getName(), damage);
            hero.wounded(damage);
        }else{
            int damage = 0;
            System.out.printf("%s自身が死亡している状態では攻撃できない\n", name);
            hero.wounded(damage);
        }
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

}