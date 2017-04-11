class Transportasi{

	public void melaju(){
		System.out.println("Transportasi melaju cepat");
	}
}

class Udara extends Transportasi{

	public void melaju(){
		System.out.println("Transportasi udara melaju cepat");
		super.melaju();
	}
}

 class MainUdara{
	 
	public static void main(String[] args){
		Transportasi Udara  = new Transportasi();
		Udara pesawat = new Udara();
		Udara.melaju();
		pesawat.melaju();
	}
}