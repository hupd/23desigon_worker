package 作业题第一题_汽车;

public class IBFactory implements Provider{

	@Override
	public Car produce() {
		// TODO Auto-generated method stub
		return new IB();
	}

}
