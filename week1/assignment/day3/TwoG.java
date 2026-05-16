package week1.assignment.day3;

public class TwoG implements Network{
	@Override
	public void showSpeed() {
		System.out.println("========== 2G Network ==========");
		System.out.println("Internet Speed  : Slow");
		System.out.println("Usage           : Basic Calling & SMS");
		System.out.println("Streaming       : Not Supported");
		System.out.println("Network Quality : Low Bandwidth");
		System.out.println("================================");
	}
}
