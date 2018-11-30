package cn.agvale.lol;
/**
 * 饿汉式单例
 * @author zhiang
 *
 */
public class Instance1 {
	private static Instance1 shareInstance = new Instance1();
	
	private Instance1() {}
	
	public static Instance1 getInstance() {
		return shareInstance;
	}
}
