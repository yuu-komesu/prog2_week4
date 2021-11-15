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

    /**
     * 敵の名前のgetter。
     * @return 敵の名前
     */
    public String getName () {
        return this.name;
    }

    /**
     * 敵の名前のsetter。
     * @param name 敵の名前
     */
    public void setName (String name){
        this.name = name ;
    }

    /**
     * 敵のhpのgetter。
     * @return 敵のhp
     */
    public int getHitPoint () {
        return this.hitPoint;
    }

    /**
     * 敵のhpのsetter。
     * @param hitPoint 敵のhp
     */
    public void setHitPoint (int hitPoint) {
        this.hitPoint = hitPoint;
    }

    /**
     * 敵の攻撃力のgetter。
     * @return　敵の攻撃力
     */
    public int getAttack () {
        return this.attack;
    }

    /**
     * 敵の攻撃力のsetter。
     * @param attack 敵の攻撃力
     */
    public void setAttack (int attack) {
        this.attack = attack;
    }

    /**
     * 敵の生死状態のgetter。
     * @return　敵の生死状態
     */
    public boolean isDead () {
        return this.dead;
    }

    /**
     * 敵の生死状態のsetter。
     * @param dead 敵の生死状態
     */
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