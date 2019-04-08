public class MergeSort{
	public static void main(String [] args){
		String [] vetStr = {"Betania", "Londres", "Amora", "Dante", "Zoologico"};
		String [] vetAux = new String[vetStr.length];
		sortmerge(vetStr, vetAux, 0, vetStr.length-1 );

		for(int i = 0; i < vetStr.length ; i++)
			System.out.println(vetStr[i]);
	}

	public static void sortmerge(String [] a, String [] aux, int start, int end){
		if(start<end){
			int meio = (start + end) / 2;
			sortmerge(a, aux, start, meio);
			sortmerge(a, aux, meio + 1, end);
			merge(a, aux, start, meio, end);
		}
	}

	public static void merge(String [] a, String [] aux, int start, int meio, int end){
		for(int k = 0; k <= end; k++){
			aux[k] = a[k];
		}

		int i = start;
		int j = meio + 1;

		for(int k = start; k<= end; k++){
			if(i>meio){
				a[k] = aux[j++];
			}
			else if(j>end){
				a[k] = aux[i++];
			}
			else if(aux[i].length()>aux[j].length()){
				a[k] = aux[j++];
			}
			else{
				a[k] = aux[i++];
			}
		}
	}
}