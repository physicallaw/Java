package calander;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�޷� ����� ���� �� ���� �Է��ϼ��� >>> ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		
		Date date = new Date();
		System.out.printf("\n	%d.%02d\n", year, month);
		System.out.println("SUN MON TUE WED THU FRI SAT");
		for (int i = 0; i <date.getWeekday(year, month, 1); ++i)
			System.out.print("    ");
		for (int i = 1; i <= date.getMonthLastDay(year, month); ++i)
		{
			System.out.printf("%2d  ", i);
			if ((i + date.getWeekday(year, month, 1)) % 7 == 0)
				System.out.println();
		}
		
		sc.close();
	}
}