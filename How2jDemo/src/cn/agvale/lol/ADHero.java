package cn.agvale.lol;

public class ADHero	extends Hero {

	public void attack() {
		System.out.println(getName() + " 进行了一次攻击 ，但是不确定打中谁了");
	}
	public void attack(Hero h1) {
		System.out.println(getName() + "对" + h1.getName() + "进行了一次攻击 ");
	}
	public void attack(Hero... heros) {
		for (int i=0; i<heros.length; i++) {
			System.out.println(getName()+"攻击了"+heros[i].getName());
		}
	}
	public static void main(String[] args) {
		ADHero bh = new ADHero("赏金猎人", 800, 5, 240);
		Hero h1 = new Hero("盖伦", 1000, 9, 200);
		Hero h2 = new Hero("提莫", 500, 3, 230);
		bh.attack(h1);
		bh.attack(h1, h2);
	}
	
}
