package ����ģʽ;

public class CarFactory {
 public  Car show(String Car2){
	if ("IA".equals(Car2)) {
		return new IA();
	}
	if ("IB".equals(Car2)) {
		return new IB();
	}
	if ("IC".equals(Car2)) {
		return new IC();
	}
	return null;
 }
}
