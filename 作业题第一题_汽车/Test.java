package ��ҵ���һ��_����;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//			  Car car= (Car)Class.forName("��ҵ���һ��_����.IA").newInstance();
//			  car.driver();
			Provider provider = (Provider)Class.forName("��ҵ���һ��_����.ICFactory").newInstance();
			provider.produce().driver();
	}
}
