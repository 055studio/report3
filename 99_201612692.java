import java.util.Scanner;

public class 99_201612692 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;

		num = sc.nextInt();
		for(int i = 1;  i <= 9; i++)
		{
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}

}
