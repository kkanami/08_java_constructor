package person2;

public class Test {

	public static void main(String[] args){

		//コンストラクタ①を使ったインスタンス化
		Person taro=new Person();
		taro.name="taro";
		taro.age=15;
		System.out.println(taro.name);
		System.out.println(taro.age);

		//コンストラクタ②を使ったインスタンス化
		Person jiro=new Person("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);

		//コンストラクタ③を使った…
		Person saburo=new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);

		//コンストラクタ④…
		Person noname=new Person(25);
		System.out.println(noname.name);
		System.out.println(noname.age);

		//コンストラクタ⑤を使ったインスタンス化
		Person hanako=new Person(17,"hanako");
		System.out.println(hanako.name);
		System.out.println(hanako.age);
	}
}
