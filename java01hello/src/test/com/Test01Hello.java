package test.com;

public class Test01Hello {

	public static void main(String[] args) {
		// 한줄주석 ctrl + shift + c , ctrl + /
		// 줄복사 ctrl + alt + arrow
		// 줄이동 alt + arrow
		System.out.println("hello" + " " + " kim");
		System.out.println("hello " + 100);
		System.out.println("공자왈 \"충효\"");
		System.out.println("공자왈 '충효'");
		System.out.println();

		System.out.print("hello1" + " " + " kim\n");
		System.out.print("\thello2" + 99);
		System.out.print("hello3\n");

		System.out.printf("hello4");
		System.out.printf("hello5\n");
		int kor = 999;
		int eng = 889;
		int math = 779;
		System.out.println("kor" + kor + ",eng" + eng + ",math" + math + "");
		System.out.printf("kor" + kor + ",eng" + eng + ",math" + math + "\n");
		System.out.printf("kor%d,eng%d,math%d\n", kor, eng, math);
		double avg = 99.999;
		System.out.printf("avg%f\n", avg);
		System.out.printf("avg%.2f\n", avg);

		System.out.printf("boolean : %b\n", true);
		System.out.printf("boolean : %B\n", true);

		System.out.printf("16진수 : %x,%x,%x,%x,%x\n", 10, 11, 12, 13, 14);

		String name = "kim";
		System.out.printf("name:%s\n", name);// String
		System.out.printf("name:%10s\n", name);// String

	}// end main

}// end class
