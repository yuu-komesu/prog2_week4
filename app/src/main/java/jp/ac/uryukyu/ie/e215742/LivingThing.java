package jp.ac.uryukyu.ie.e215742;

public class LivingThing {
	String name;
	int hitPoint;
	int attack;
	boolean dead;

	public String getName(){
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

	public boolean isDead(){
		return this.dead;
	}

	public void setDead (boolean dead) {
        this.dead = dead;
    }

	public void attack(LivingThing opponent){
		if (dead == false){
			int damage = (int)(Math.random() * attack);
			System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
			opponent.wounded(damage);
		}else{
            int damage = 0;
            System.out.printf("%s自身が死亡している状態では攻撃できない\n", name);
            opponent.wounded(damage);
        }
    }

	public void wounded(int damage){
		hitPoint -= damage;
		if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
	}
}
