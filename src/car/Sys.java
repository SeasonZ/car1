package car;

import java.util.Scanner;

public class Sys {
	public void rentMoto() {
		double[] Money = new double[10];
		
		String[] carType = { "����", "����", "�µ�" };
		int[] busType = {10,32};
		Scanner input = new Scanner(System.in);
		System.out.println("welcome");
		
		System.out.println("�����⼸����:");
		int num = input.nextInt();
		
		for (int n = 1; n <=num; n++) {
			
		//��n�����⼸��
		System.out.println("��"+n+"������������");
		int day = input.nextInt();
		//��n��������
		System.out.println("�����ࣺ1��car or 2��bus");
		int sel = input.nextInt();
		if (sel == 1) {
			System.out.println("��Ʒ�ƣ� 1��bmw 2��audi 3��benc");
			sel = input.nextInt();
			Moto moto = new Car("³ B88888");
			Car car = (Car)moto;
			car.setType(carType[sel - 1]);
			// �������
			Money[n] = moto.rentFee(day);
			// ������
//			System.out.println("**car , * day , totalfee ***" + totalFee);
		} else {
			System.out.println("seatCount 1�� < 16 2�� > 16");
			sel = input.nextInt();
			Moto moto = new Bus("³ A88888");
			Bus bus = (Bus)moto;
			bus.setSeatCount(busType[sel - 1]);
			// �������
	        Money[n] = moto.rentFee(day);
			// ������
//			System.out.println("**car , * day , totalfee ***" + totalFee);
		}
		}
		double total = 0;
		for (int i = 1; i <=num; i++) {
			total +=Money[i];
		}
		System.out.println("�ϼ������ǣ�"+total);
	}
	public static void main(String[] args) {
		new Sys().rentMoto();
	}
}
