import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// the first task
		int[] arrInt = new int[3];
		arrInt[0] = 1;
		arrInt[1] = 2;
		arrInt[2] = 3;

		double[] arrDouble = {1.57, 7.654, 9.986};

		int[] arrIntTwo = {8,12,10,15,8,9,3,1,0,7};

		// the second task

		for (int i = 0; i < arrInt.length - 1; i++) {
			System.out.print(arrInt[i] + ", ");
		}
		System.out.println(arrInt[arrInt.length - 1]);

		for (int i = 0; i < arrDouble.length - 1; i++) {
			System.out.print(arrDouble[i] + ", ");
		}
		System.out.println(arrDouble[arrDouble.length - 1]);

		for (int i = 0; i < arrIntTwo.length - 1; i++) {
			System.out.print(arrIntTwo[i] + ", ");
		}
		System.out.println(arrIntTwo[arrIntTwo.length - 1]);

		// the third task

		for (int i = arrInt.length - 1; i > 0; i--) {
			System.out.print(arrInt[i] + ", ");
		}
		System.out.println(arrInt[0]);

		for (int i = arrDouble.length - 1; i > 0; i--) {
			System.out.print(arrDouble[i] + ", ");
		}
		System.out.println(arrDouble[0]);

		for (int i = arrIntTwo.length - 1; i > 0; i--) {
			System.out.print(arrIntTwo[i] + ", ");
		}
		System.out.println(arrIntTwo[0]);


		// the fourth task

		for (int i = 0; i < arrInt.length; i++) {
			if (arrInt[i] % 2 != 0) {
				arrInt[i]++;
			}
		}
		System.out.println(Arrays.toString(arrInt));

	}

}
