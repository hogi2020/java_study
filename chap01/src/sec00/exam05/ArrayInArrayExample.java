package sec00.exam05;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		// 배열 속의 배열
		
		int[][] mathScores = new int[2][3];
		for (int i=0; i < mathScores.length; i++) {
			for (int k=0; k < mathScores[i].length; k++) {
				System.out.println("mathScores["+i+"]["+k+"]=" + mathScores[i][k]);
			}
		}
		System.out.println();
	}

}
