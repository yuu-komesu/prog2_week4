package jp.ac.uryukyu.ie.e215742;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {
    @Test
    void attackTest() {
        int defaultHeroHp = 100;
        Hero demoHero = new Hero();
        demoHero.setName("デモ勇者");
        demoHero.setHitPoint(defaultHeroHp);
        demoHero.setAttack(100);
        demoHero.setDead(false);
        Enemy slime = new Enemy();
        slime.setName("スライムもどき");
        slime.setHitPoint(10);
        slime.setAttack(100);
        slime.setDead(false);
        for(int count=0; count<10; count++){
            demoHero.attack(slime); // over kill
        }
        slime.attack(demoHero);
        assertEquals(defaultHeroHp, demoHero.getHitPoint());
    }
}
