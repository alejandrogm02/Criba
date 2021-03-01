import java.util.Scanner;

public class Criba {

	public static boolean esPrimo(int num) {
			if(num == 1 || num == 2) {
				return true;
			}
			if(num !=2 && num % 2 == 0){
				return false;
			}else {
				for(int i = 3; i < (num / 2);i = i + 2) {
					if(num % i == 0) {
					return false;
					}
				}
				return true;
			}
		}
	public static String Primos(int max) {
		String primos = "";
		for(int i=1;i<max;i++) {
			if(esPrimo(i)) {
				primos+= i + "  ";
			}
		}
		return primos;
	}
	public static void main(String[] args) {
		int max;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el numero máximo");
		max = teclado.nextInt();
			
		System.out.println("Los numeros entre 1 y " + max + " que son primos són: " + Primos(max));
		
		teclado.close();
	
		}
	}
