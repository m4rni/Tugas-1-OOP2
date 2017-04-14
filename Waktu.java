public class Waktu{   
	 private int jam;
	 private int menit;
	 private int detik;

	 public void setWaktu(int h, int m, int s){

	 	if ( (h>=0 && h < 24) &&( m >= 0 && m<60) && (s>=0 && s < 60)) {

	 		jam = h;
	 		menit = m;
	 		detik = s;

	 		
	 	}
	 	else
	 		throw new IllegalArgumentException(" jam menit dan detik diluar rentang yang valid");
	 }	
	 public String toUniversalString(){
	 	return String.format("%02d:%02d:%02d, jam, menit, detik");
	 }
	 public String toString(){
	 	return String.format ("%d:%02d:%02d %s",
	 		( ( jam == 0|| jam == 12) ? 12 : jam % 12), menit, detik, ( jam < 12 ? "AM" : "PM"));
	 }
}	