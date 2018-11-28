package cn.agvale.lol;

/**
 * 辅助英雄类
 * @author zhiang
 *
 */
public class Support extends Hero {
	public Support(String name, float hp, float armor, int moveSpeed) {
		super(name, hp, armor, moveSpeed);
		// TODO Auto-generated constructor stub
	}
	public void heal() {}
	public void heal(Hero h) {}
	public void heal(Hero h, int hp) {}
}
