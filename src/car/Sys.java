package car;

import java.util.Scanner;

public class Sys {
	public void rentMoto() {
		String[] carType = { "����", "����", "�µ�" };
		int[] busType = {10,32};
		Scanner input = new Scanner(System.in);
		System.out.println("welcome");
		
		System.out.println("�����⼸����:");
		int num = input.nextInt();
		//�⼸��
		System.out.println("day");
		int day = input.nextInt();
		System.out.println("1��car or 2��bus");
		int sel = input.nextInt();
		if (sel == 1) {
			System.out.println("type 1��bmw 2��audi 3��benc");
			sel = input.nextInt();
			Moto moto = new Car("³ B88888");
			Car car = (Car)moto;
			car.setType(carType[sel - 1]);
			// �������
			double totalFee = moto.rentFee(day);
			// ������
			System.out.println("**car , * day , totalfee ***" + totalFee);
		} else {
			System.out.println("seatCount 1�� < 16 2�� > 16");
			sel = input.nextInt();
			Moto moto = new Bus("³ A88888");
			Bus bus = (Bus)moto;
			bus.setSeatCount(busType[sel - 1]);
			// �������
			double totalFee = moto.rentFee(day);
			// ������
			System.out.println("**car , * day , totalfee ***" + totalFee);
		}
	}
	public static void main(String[] args) {
		new Sys().rentMoto();
	}
}
