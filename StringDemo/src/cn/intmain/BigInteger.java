package cn.intmain;

public class BigInteger {
	public static void main(String[] args) {
		System.out.println(bigIntPlus("9999", "99999"));
	}

	/**
	 * 私有函数，用于计算＂对齐＂之后的大数的和．
	 * 
	 * @param sb1
	 *            第一个大数
	 * @param sb2
	 *            　第二个大数
	 * @param sb3
	 *            　用于存放结果的StringBuilder
	 */
	private static void strPlusInt(StringBuilder sb1, StringBuilder sb2,
			StringBuilder sb3) {
		for (int x = 0; x < sb1.length(); x++) {
			// 循环遍历
			int a = Integer.parseInt(sb1.substring(x, x + 1))
					+ Integer.parseInt(sb2.substring(x, x + 1));
			// ａ用于存放相加的结果．
			if (sb3.length() > x) {
				a = a + (Integer.parseInt(sb3.substring(x, x + 1)));
				sb3.deleteCharAt(x);
			}
			// 如果前面有进位的话．先相加再删除当前进位
			sb3.append(a % 10);// 把ａ的值存放到相应位置上．
			if (a > 9)
				sb3.append((a % 100) / 10);
			// 这是有进位的情况，存放十位数
		}
		// 刚才是反转之后相加的，所以返回的结果需要先反转回来．
		sb3.reverse();

	}

	/**
	 * 这是对外提供方法的接口，可实现大数相加
	 * 
	 * @param num1
	 *            　第一个大数
	 * @param num2
	 *            　第二个大数
	 * @return　返回相加的结果值
	 */
	public static String bigIntPlus(String num1, String num2) {
		StringBuilder sb1 = new StringBuilder(num1).reverse();
		StringBuilder sb2 = new StringBuilder(num2).reverse();
		// 先反转sb1跟sb2.方便后面的数值相加
		StringBuilder sb3 = new StringBuilder();
		// 建立一个空的StringBuilder用于存放结果
		// 对齐字符串
		if (sb1.length() > sb2.length()) {
			int count = sb1.length() - sb2.length();
			while (count-- > 0) {
				sb2.append("0");
			}
		} else {
			int count = sb2.length() - sb1.length();
			while (count-- > 0) {
				sb1.append("0");
			}

		}
		// 计算
		strPlusInt(sb1, sb2, sb3);
		return sb3.toString();
	}
}
