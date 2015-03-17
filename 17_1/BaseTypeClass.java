class BaseTypeClass
{
	public static void main(String[] args) {
		Integer i = new Integer(3);
		Integer i2 = 3;
		Integer i3 = new Integer("123");
		SOP(i.compareTo(i2));
		Integer a = 128;
		Integer b = 128;
		SOP(a==b);

	}
	public static void SOP(Object o)
	{
		System.out.println(o);
	}
}