public class InsertionSort{
	public static void main(String [] args){
		String [] vetStr = {"Aranha", "Arpao", "Corrente", "Play"};

		sortinsertion(vetStr);

		for(int i = 0; i < vetStr.length ; i++)
			System.out.println(vetStr[i]);
	}

	public static void sortinsertion(String [] a){
	
		int localizacao;
		String insere;
		for(int i = 1; i < a.length; i++){
			insere = a[i];
			localizacao = i;
			while(localizacao>0 && a[ localizacao - 1 ].length() > insere.length()){
				a[localizacao] = a[localizacao - 1];
				localizacao--;
			}

			a[ localizacao ] = insere;
	}
 }
}
