
public class ExamArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j, q;
		String[] name = new String[] {"king", "queen"};
		int[][] salary = new int[][]{{300, 200, 500, 800},
									 {1000, 2000, 3000, 4000}};
		int[][][] age = new int[][][] {{{63, 84, 14, 100},
										{22, 209, 251, 312}},
										{{59, 80, 8, 110},
										{19, 59, 92, 77}}};


		System.out.println("1차원");

		for(i = 0; i < name.length; i++) System.out.println(i+1 + ")이름 : " + name[i]);
		System.out.println();

		System.out.println("2차원");

		for(i = 0; i < 2; i++)
			for(j = 0; j < 4; j++)
				System.out.println(i + ", " + j + "번 째 값 : " + salary[i][j]);

		System.out.println();

		System.out.println("3차원 배열");
		for(i = 0; i < 2; i++)
			for(j = 0; j < 4; j++)
				for(q = 0; q < 4; q++)
					System.out.println(i + ", " + j + ", " + q + "번 째 값 : " + age[i][j][q]);
		System.out.println();
	}
}
