import java.util.ArrayList;

public class Test {
	public static ArrayList<Integer> Hello = new ArrayList<Integer>();

	public static void main(String[] args) {
		Hello.add(1);
		Hello.add(2);
		Hello.add(3);
		Hello.add(4);
		Hello.add(0, -1);
		Hello.add(Hello.size(), 100);
		System.out.println(Hello);
		addNum(10);
		System.out.println(Hello);
		addNum(1001);
		addNum(101);
		System.out.println(Hello);
	}

	public static void addNum(Integer num) {
		int i = 0;
		while (num.compareTo(Hello.get(i)) >= 0 && i < Hello.size())
		{
			System.out.print(i + ": ");
			System.out.println(num.compareTo(Hello.get(i)));
			i++;
		}
		Hello.add(i, num);
	}
}
