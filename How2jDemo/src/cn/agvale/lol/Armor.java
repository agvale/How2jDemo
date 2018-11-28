package cn.agvale.lol;
/**
 * 护甲类
 * @author zhiang
 *
 */
public class Armor extends Item {
	private int ac;	//	护甲等级

	public int getAc() {
		return ac;
	}

	public void setAc(int ac) {
		this.ac = ac;
	}

	public Armor(String name, int price, int ac) {
		super(name, price);
		this.ac = ac;
	}
	public static void main(String[] args) {
		Armor a1 = new Armor("布甲", 300, 15);
		Armor a2 = new Armor("锁子甲", 500, 40);
	}
}
