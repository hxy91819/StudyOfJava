package PackageStudy26;
import StaticAndFinal.StaticBlock;

public class PackageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StaticBlock.main(null);
		
		People p = new People();
		
		People m = new Man();
		System.out.println(p instanceof People);
		
		System.out.println(m instanceof Man);
	}

}

class People{
	
}

class Man extends People{
	
}