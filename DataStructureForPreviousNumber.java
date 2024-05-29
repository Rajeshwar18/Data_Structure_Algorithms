public class DataStructureForPreviousNumber{
	public static void main(String[] args) {
		DS ds1 = new DS();
		DS ds2 = new DS(10,ds1);
		DS ds3 = new DS(20,ds2);
		DS ds4 = new DS(30,ds3);
		DS ds5 = new DS(40,ds4);
		DS ds6 = new DS(50,ds5);
		ds6.print();
	}
}
class DS{
	int a;
	DS prev;
	public DS(){
		a=0;
	}
	public DS(int a,DS prev){
		this.a=a;
		this.prev=prev;
	}
	public void print(){
		if(prev!=null)
			System.out.println("ds1 = "+prev.prev.prev.prev.prev.a+
					   "\nds2 = "+prev.prev.prev.prev.a+
					   "\nds3 = "+prev.prev.prev.a+
					   "\nds4 = "+prev.prev.a+
					   "\nds5 = "+prev.a+
					   "\nds6 = "+a);
	}
}
