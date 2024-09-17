public class Calculadora {    
	public static double somar(double x,double y){
		return x + y;
	}
	public static double dividir(double x,double y){
		return x / y;
	}
	public static double multiplicar(double x,double y){
		return x * y;
	}
	public static double subtrair(double x,double y){
		return x - y;
	}
	public static double maior(double x,double y){
		if (x > y) {
			return x;                 
		} else{
			return y;
		}
	}
	public static double menor(double x,double y){
		if (x < y) {
			return x;                 
		} else{
			return y;
		}
	}
	public static double raiz(double x){
		return Math.sqrt(x);
	}
}