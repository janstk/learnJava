class DecoratorDemo//呆可瑞特二
{
	public static void main(String[] args) {
		Person p = new Person();
		p.chifan();
		SuperPerson sp = new  SuperPerson(p);
		sp.superChifan();
	}	
}
class Person
{
	public void chifan() {
		System.out.println("吃饭");
	}
}
class SuperPerson
{
	private Person p;
	SuperPerson(Person p)
	{
		this.p = p;
	}
	public void superChifan()  {
		System.out.println("喝酒");
		System.out.println("吃饭");
	}
}