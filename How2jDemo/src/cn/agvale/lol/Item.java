package cn.agvale.lol;

/**
 * 物品类
 * @author zhiang
 *
 */
public class Item {
	private String name;	//名称
	private int price;	//价格
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
}
