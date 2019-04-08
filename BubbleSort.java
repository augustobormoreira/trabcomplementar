public class BubbleSort{
	public static void main(String [] args){
		String [] vetStr = {"Avon", "Limousine", "Horario", "Arvore"};
		sortBubble(vetStr);
		for(int i = 0; i < vetStr.length ; i++)
			System.out.println(vetStr[i]);
	}

	public static void sortBubble(String [] a){
		String coringa;
		for(int i = 0; i < a.length ; i++){
			for(int j = 0; j < a.length - 1 ; j++){
				if(a[j].length()>a[j+1].length()){
					coringa = a[j+1];
					a[j+1] = a[j];
					a[j] = coringa;
				}
			}
		}
	}
}