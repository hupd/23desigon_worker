package 工厂模式;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
			  Car car= (Car)Class.forName("作业题第一题_汽车.IA").newInstance();
			  car.driver();
			
	}
}
