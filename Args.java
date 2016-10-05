public class Args {
	public static void main(String[] args){
		System.out.println("O programa foi executado com os parametros:");

		float num1 = Float.parseFloat(args[0]);
		float num2 = Float.parseFloat(args[1]);

		
		System.out.println(num1);
		System.out.println(num2);
		
	}
}