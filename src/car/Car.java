package car;

public class Car extends Moto {

	private String type = "�µ�";// �������ۡ��µ�

	public Car(String MotoNo) {
		super(MotoNo);
	}

	@Override
	public double rentFee(int day) {
		// need day & type
		if (type.equals("����")) {
			setFee(500);
		} else if (type.equals("����")) {
			setFee(600);
		} else {
			setFee(400);
		}
		return super.rentFee(day);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
