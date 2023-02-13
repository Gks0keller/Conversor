import java.util.Scanner;

public class tranformadorBinarioHexaDecimal {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int escolha=1, numero;
		
		while(escolha!=0) {
			
			System.out.print("\n 0-Sair\n 1-Binario\n 2-Decimal\n 3-Hexadecimal\n Para qual queres conveter: ");
			escolha = sc.nextInt();
			System.out.println("Insira o número: ");
			numero = sc.nextInt();
			
			if (escolha == 1) {
				
				System.out.println("Esse é o número convertido: "+tranferBinario(numero));
				
			} else if (escolha == 2) {
				
				System.out.println("Esse é o número convertido: "+tranferDecimal(numero));
				
			}else if (escolha == 3) {
				
				System.out.println("Esse é o número convertido: "+tranferHexadecimal(numero));
				
			}
		}

	}

	public static String tranferBinario(int x) {
		String numero = "", convertido = "";

		while (x > 0) {
			if (x % 2 == 1) {
				numero += "1";
			} else if (x % 2 == 0) {
				numero += "0";
			}
	
			x = x / 2;
			
		}

		int c = numero.length() - 1;
		int f = numero.length();

		while (c > -1) {

			convertido += numero.substring(c, f);
			c--;
			f--;
		}

		return convertido;
	}

	public static int tranferDecimal(int x) {
		String binario=String.valueOf(x);
		int f = binario.length();
		int convertido=0,j=0;
		
		for(int c = binario.length() - 1;c > -1;c--) {

			 if(binario.subSequence(c, f).equals("1")==true) {
				 
				 convertido+=1*(Math.pow(2, j));
				 
			 }
			 
			j++;
			f--;
		}
		
		return convertido;
	}
	public static String tranferHexadecimal(int x) {
		String[] restos= {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
		String numero="",convertido="";

		while(x>0) {
		
			for(int i=0;i<restos.length;i++) {
				
				if(x%16==i) {
					numero+=restos[i];
				}
			}
			
			x/=16;
		}
		
		int c = numero.length() - 1;
		int f = numero.length();
		
		while (c > -1) {
			
			convertido += numero.substring(c, f);
			c--;
			f--;
		}
		
		
		return convertido;
	}

}
