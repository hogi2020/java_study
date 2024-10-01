package sec03.exam02;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		// 키보드에서 입력된 내용을 문자열로 얻기
		Scanner scanner = new Scanner(System.in);	// 시스템의 입력 장치로부터 읽는 scanner 생성
		
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();			// Enter키 이전까지 입력된 문자열을 읽음
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			if (inputData.equals("q")) {			// equals는 문자열이 동일한지 확인
				break;
			}
		}
		
		System.out.println("종료");

	}

}
