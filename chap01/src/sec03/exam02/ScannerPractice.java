package sec03.exam02;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) throws Exception {
		// Scanner 연습
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		String inputData1 = scanner.nextLine();
		System.out.print("2. 주민번호 앞 6자리: ");
		String inputData2 = scanner.nextLine();
		System.out.print("3. 전화번호: ");
		String inputData3 = scanner.nextLine();
		
		System.out.println("\n[입력한 내용]");
		System.out.println(inputData1);
		System.out.println(inputData2);
		System.out.println(inputData3);
	}

}
