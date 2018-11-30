package cn.agvale.lol;

/**
 * 懒汉式单例
 * @author zhiang
 *
 */
public class Instance2 {
	private static Instance2 shareInstance;
	
	private Instance2() {}
	
	public static Instance2 getShareInstance() {
		if (shareInstance == null) {
			shareInstance = new Instance2();
		}
		return shareInstance;
	}
}
