package ����ģʽ;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
			  Car car= (Car)Class.forName("��ҵ���һ��_����.IA").newInstance();
			  car.driver();
			
	}
}
