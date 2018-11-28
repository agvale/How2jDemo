package cn.agvale.lol;

public class Weapon extends Item {
	private int damage;	//	攻击力

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public Weapon(String name, int price, int damage) {
		super(name, price);
		this.damage = damage;
	}
	
	public static void main(String[] args) {
		Weapon infinityEdge = new Weapon("无尽之刃", 2300, 65);
		System.out.println(infinityEdge.getName());
	}
}
