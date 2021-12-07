package jp.ac.uryukyu.ie.e215742;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class WarriorTest {
	@Test
	void attackWithWeponSkillTest(){
		int defaultHeroHp = 100;
        Warrior demoWarrior = new Warrior();
        demoWarrior.setName("デモ戦士");
        demoWarrior.setHitPoint(100);
        demoWarrior.setAttack(10);
        demoWarrior.setDead(false);
        Enemy slime = new Enemy();
        slime.setName("スライム");
        slime.setHitPoint(6);
        slime.setAttack(3);
        slime.setDead(false);
        for(int count=0; count<3; count++){
            demoWarrior.attackWithWeponSkill(slime); // over kill
        }
		slime.attack(demoWarrior);
        assertEquals(defaultHeroHp, demoWarrior.getHitPoint());
    }
}
