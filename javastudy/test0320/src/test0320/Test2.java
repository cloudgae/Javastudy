package test0320;

import java.util.Scanner;

/*
 시스템과 가위(1), 바위(2), 보(3)를 하기
  시스템은 1,2,3 중의 한개의 숫자를 저장하고, 
  한개의 숫자를 입력받아 가위바위보 게임하기 
  
  [결과]
  가위(1), 바위(2), 보(3) 를 숫자로 입력하세요
  1
  사용자 승리!

  가위(1), 바위(2), 보(3) 를 숫자로 입력하세요
  1
  시스템 승리!
*/

public class Test2 {

	public static void main(String[] args) {
		int num1 = (int)(Math.random()*3) + 1;
		
		System.out.println("가위(1), 바위(2), 보(3) 를 숫자로 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num2 = scan.nextInt();
		
		//1 - 가장 적은 라인
		if(num1 == 1 && num2 ==2) {
			System.out.println("시스템 : (1) 가위");
			System.out.println("사용자 : (2) 바위");
			System.out.println("사용자 승리!");
		}
		else if(num1 == 1 && num2 == 3) {
			System.out.println("시스템 : (1) 가위");
			System.out.println("사용자 : (3) 보");
			System.out.println("시스템 승리!");
		}
		else if(num1 == 2 && num2 == 1) {
			System.out.println("시스템 : (2) 바위");
			System.out.println("사용자 : (1) 가위");
			System.out.println("시스템 승리!");
		}
		else if(num1 == 2 && num2 == 3) {
			System.out.println("시스템 : (2) 바위");
			System.out.println("사용자 : (3) 보");
			System.out.println("사용자 승리!");
		}
		else if(num1 == 3 && num2 == 1) {
			System.out.println("시스템 : (3) 보");
			System.out.println("사용자 : (1) 가위");
			System.out.println("사용자 승리!");
		}
		else if(num1 == 3 && num2 == 2) {
			System.out.println("시스템 : (3) 보");
			System.out.println("사용자 : (2) 바위");
			System.out.println("시스템 승리!");
		}
		else {
			switch(num1) {
			case 1:System.out.println("시스템, 사용자 : (1) 가위");break;
			case 2:System.out.println("시스템, 사용자 : (2) 바위");break;
			case 3:System.out.println("시스템, 사용자 : (3) 보");break;
			}
			System.out.println("무승부");
		}
		
//		//2
//		if(num1 == num2) {
//			switch(num1) {
//			case 1:System.out.println("시스템, 사용자 : (1) 가위");break;
//			case 2:System.out.println("시스템, 사용자 : (2) 바위");break;
//			case 3:System.out.println("시스템, 사용자 : (3) 보");break;
//			}
//			System.out.println("무승부");
//		}
//		else if(num1 == 1) {
//			switch(num2) {
//				case 2: 
//					System.out.println("시스템 : (1) 가위");
//					System.out.println("사용자 : (2) 바위");
//					System.out.println("사용자 승리!");
//					break;
//				case 3:
//					System.out.println("시스템 : (1) 가위");
//					System.out.println("사용자 : (3) 보");
//					System.out.println("시스템 승리!");
//					break;
//			}
//		}
//		else if(num1 == 2) {
//			switch(num2) {
//			case 1: 
//				System.out.println("시스템 : (2) 바위");
//				System.out.println("사용자 : (1) 가위");
//				System.out.println("시스템 승리!");
//				break;
//			case 3:
//				System.out.println("시스템 : (2) 바위");
//				System.out.println("사용자 : (3) 보");
//				System.out.println("사용자 승리!");
//				break;
//			}
//		}
//		else if(num1 == 3) {
//			switch(num2) {
//			case 1:
//				System.out.println("시스템 : (3) 보");
//				System.out.println("사용자 : (1) 가위");
//				System.out.println("사용자 승리!");
//				break;
//			case 2:	
//				System.out.println("시스템 : (3) 보");
//				System.out.println("사용자 : (2) 바위");
//				System.out.println("시스템 승리!");
//				break;
//			}
//		}
//		

		
//		//3
//		if(num1 == 1) {
//			switch(num2) {
//				case 2: 
//					System.out.println("시스템 : (1) 가위");
//					System.out.println("사용자 : (2) 바위");
//					System.out.println("사용자 승리!");
//					break;
//				case 3:
//					System.out.println("시스템 : (1) 가위");
//					System.out.println("사용자 : (3) 보");
//					System.out.println("시스템 승리!");
//					break;
//				default:
//					System.out.println("시스템, 사용자 : (1) 가위");
//					System.out.println("무승부");
//					break;
//					
//			}
//		}
//		else if(num1 == 2) {
//			switch(num2) {
//			case 1: 
//				System.out.println("시스템 : (2) 바위");
//				System.out.println("사용자 : (1) 가위");
//				System.out.println("시스템 승리!");
//				break;
//			case 3:
//				System.out.println("시스템 : (2) 바위");
//				System.out.println("사용자 : (3) 보");
//				System.out.println("사용자 승리!");
//				break;
//			default:
//				System.out.println("시스템, 사용자 : (2) 바위");
//				System.out.println("무승부");
//				break;
//			}
//		}
//		else if(num1 == 3) {
//			switch(num2) {
//			case 1:
//				System.out.println("시스템 : (3) 보");
//				System.out.println("사용자 : (1) 가위");
//				System.out.println("사용자 승리!");
//				break;
//			case 2:	
//				System.out.println("시스템 : (3) 보");
//				System.out.println("사용자 : (2) 바위");
//				System.out.println("시스템 승리!");
//				break;
//			default:
//				System.out.println("시스템, 사용자 : (3) 보");
//				System.out.println("무승부");
//				break;
//			}
//		}

	}

}