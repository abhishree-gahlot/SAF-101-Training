package week1.assignment.day3;

public class NetworkDemo {

	public static void main(String[] args) {
		Network twoGNetwork = new TwoG();
		Network threeGNetwork = new ThreeG();
		Network fourGNetwork = new FourG();
		Network fiveGNetwork = new FiveG();
		
		twoGNetwork.showSpeed();
		threeGNetwork.showSpeed();
		fourGNetwork.showSpeed();
		fiveGNetwork.showSpeed();
	}

}
