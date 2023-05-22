package j0522;

public class Data {
	
	Data(){ // 매개변수가 없는 생성자
		//같은 클래스 내 다른 생성자를 호출 this()
		this(1,1); // defalut num1, num2 모두 1로 받는 것 
	} 
	
	Data(int num1, int num2){ // 매개변수가 있는 생성자
		//this는 클래스 내 인스턴스 변수를 가리킴 (매우 중요!!!!!)
		this.num1 = num1;
		this.num2 = num2;
		data1 = num1+num2;
		data2 = num1-num2;
		data3 = num1*num2;
		data4 = num1/num2;
		
	}
	
	int num1;	// 입력받을 1번째 숫자
	int num2;	// 입력받을 2번쩨 숫자
	int data1;	// 두수 더하기
	int data2;	// 두수 빼기
	int data3;	// 두수 곱하기
	int data4;	// 두수 나누기

}
