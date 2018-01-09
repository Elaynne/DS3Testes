public class ValidaData {
	public boolean validaData(int dia, int mes, int ano){
		boolean dataOK = false;
		if(ano >= 0) {
			if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
				if(dia >= 1 && dia <= 30)
					dataOK = true;
			}else  
				if(mes == 1 || mes == 3 || mes == 5 || 
				   mes == 7 || mes == 8 || mes == 10 || mes == 12){
					if(dia >= 1 && dia <= 31)
						dataOK = true;
				}else 
					if(mes == 2){
						if(dia y>=1 ){
							if (dia <=28){
								dataOK = true;
							}else 
								if(dia == 29){

									// o ano é bissexto se for verdadeiro ((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0);
									if (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0))				
										dataOK = true;
						         }
						}
					}
		}
		
		return dataOK;			
	}
}
