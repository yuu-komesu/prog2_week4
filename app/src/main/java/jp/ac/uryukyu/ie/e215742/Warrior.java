package jp.ac.uryukyu.ie.e215742;

public class Warrior extends Hero {
	public Warrior(){
		super();
	}

	public void attackWithWeponSkill(LivingThing opponent){
		if (dead == false){
			int damage = (int)(attack * 3 / 2);
			System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
			opponent.wounded(damage);
		}else{
            int damage = 0;
            System.out.printf("%s自身が死亡している状態では攻撃できない\n", name);
            opponent.wounded(damage);
        }
	}
}
