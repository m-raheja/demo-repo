package firstProgram;

public class Fibbnacci_test {

	//0,1,1,2,3,5,8,13

		
		public void method(int count) {
		int a=0,b=1,c,i;
		System.out.print(a+","+b);
		for(i=2;i<count;++i) {
			
			c=a+b;
			System.out.print(","+c);
			a=b;
			b=c;
			
		}
		
		
		}
		
	
	
	
	
	
}
