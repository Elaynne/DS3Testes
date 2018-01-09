package GeradorPrimos;

public class GeradorPrimos {
	public static String gerarPrimosAte(int valorMaximo) throws Exception  {  
		if (valorMaximo >= 2){
			boolean [] candidatos = inicializaListaCandidatos(valorMaximo); //false, false, true se 2 
		    for (int valor = 2; valor <= valorMaximo; valor++) {  
		        if (candidatos[valor]) {  
		            for (int naoPrimos = 2 * valor; //4...2 n�o percorre se valor=2
		                naoPrimos <= valorMaximo; naoPrimos += valor) {  
		                candidatos[naoPrimos] = false;  
		            }   
		        }  
		    }  
		    String resultado = String.valueOf(2);  
		    for (int i = 2 + 1; i <= valorMaximo; i++) {  //de 3 at� valor...n�o percorre se valor=2
		        if (candidatos[i]) {  
		            resultado += ", " + i;  
		        }  
		    }  
		    return resultado; //dois 
		}
		else {  
	        throw new RuntimeException();  
	    }  
	}  
	
	public static boolean[] inicializaListaCandidatos(int valorMaximo) {  
		boolean [] resultado = new boolean[valorMaximo + 1];  
		resultado[0] = resultado [1] = false;  
		for (int i = 2; i < resultado.length; i++) {  
		        resultado[i] = true;  
		}  
		return resultado;
	}  
}
