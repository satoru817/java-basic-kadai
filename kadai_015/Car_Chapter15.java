package kadai_015;

public class Car_Chapter15 {
	
	private int gear = 1;
	private int speed = 10;
	
	public Car_Chapter15() {

	}
	
	public void gearChange(int afterGear) {
		int beforeGear = this.gear;
		this.gear = afterGear;
		if(this.gear > 5 || this.gear<1) {
			this.speed = 10;
		}else {
			this.speed = 10*this.gear;
		}
		System.out.println("ギア" + beforeGear + "から" + this.gear +"に切り替えました");
	}
	
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです" );
		
	}

}
