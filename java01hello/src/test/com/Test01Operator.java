package test.com;

public class Test01Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;

		System.out.println(x > 3);
		System.out.println(x < 15);
		System.out.println(x >= 11);
		System.out.println(x <= 17);
		System.out.println(x == 10);
		System.out.println(x != 13);

		int y = 3;

		System.out.println((x > 10) && (y < 5));
		System.out.println((x > 10) || (y < 5));
		System.out.println(!(x > 10));

		int ap = 65;
		char ch = (char) ap;
		System.out.println(ch);
	}

}
