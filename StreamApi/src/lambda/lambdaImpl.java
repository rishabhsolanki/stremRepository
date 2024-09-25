package lambda;

public class lambdaImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		System.out.println("imbda implimentation on functional interface ");
		lambdaInter var =(int a ,int b) ->{
			return(a+b);};
		lambdaInter l1 =(a,b)->a+b;
		var.twosum(3, 5);
		
		lambdainter2 l2 = new lambdainter2() {
			@Override
			public int method2(String s) {
				// TODO Auto-generated method stub
				
				return s.length();
			}	
			
		};
		System.out.println(l2.method2("Divya Do"));
		lambdaInter l3 = (int a, int b) -> {
			
			return a+b;
		};
		System.out.println(l3.twosum(34, 66));
	}

}
