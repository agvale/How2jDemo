package cn.agvale.lol;

/**
 * 英雄类
 * @author zhiang
 *
 */
public class Hero {
	private String name;	//	名字
	private float hp;	//	血量
	private float armor;	//	护甲
	private int moveSpeed;	//	移动速度
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getHp() {
		return hp;
	}
	public void setHp(float hp) {
		this.hp = hp;
	}
	public float getArmor() {
		return armor;
	}
	public void setArmor(float armor) {
		this.armor = armor;
	}
	public int getMoveSpeed() {
		return moveSpeed;
	}
	public void setMoveSpeed(int moveSpeed) {
		this.moveSpeed = moveSpeed;
	}
	public Hero() {}
	public Hero(String name, float hp, float armor, int moveSpeed) {
		super();
		this.name = name;
		this.hp = hp;
		this.armor = armor;
		this.moveSpeed = moveSpeed;
	}
	
	
	
	
}
