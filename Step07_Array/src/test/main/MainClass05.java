package test.main;

import test.mypac.Bike;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * 	1. Bike 객체를 담을 수 있는 방 3개짜리 배열객체를 생성해서
		 * 		bikes라는 지역변수에 담아보세요
		 * 	2. 배열의 각각의 방(0, 1, 2번)에 Bike객체를 생성해서 담아보세요
		 * 	3. 반복문 for를 이용해서 순서대로 배열의 각각의 방에 있는
		 * 		Bike객체의 ride() method를 호출해 보세요
		 */
		
		Bike[] bikes = new Bike[3];
		
		bikes[0] = new Bike();
		bikes[1] = new Bike();
		bikes[2] = new Bike();
		
		for(int i=0; i<bikes.length; i++) {
			Bike tmp = bikes[i];
			tmp.ride();
		//	bikes[i].ride();
		}
	}
}
