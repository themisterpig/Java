/**
 * 
 */

/**
 * @author 41479
 *
 */
public class Chave {

	private String array [] = new String [1000];
	
	
	public int hash(String palavra) {
		int number1 =(int)palavra.charAt(0);
		int number2 =(int)palavra.charAt(1);
		int calculo = number1*number2;
		calculo=calculo%1000;
		
		return calculo;
	}

	
	
	public void insere(String palavra) {
		int calculo = hash(palavra);
		int maximo=calculo;
		if(array[calculo]==null) { //caso a posi��o hash(palavra) esteja vazia insere a palavra
			System.out.println("Inserido na posi��o:"+calculo);
			array[calculo]=palavra;
		}else {
			while(array[calculo]!=null) {
				if(calculo<array.length-1) {
					calculo++;
				}else {
					calculo=0;
				}
				if(calculo==maximo && array[maximo]!=null) {
					System.out.println("Array cheio");
					//acaba com o ciclo se o array estiver cheio e n�o permite que seja introduzido
					break;
				}
			}
			if(calculo!=maximo) {
				System.out.println("Inserido na posi��o:"+calculo);
				array[calculo]=palavra;
			}
			
			
		}
		
	}
	
	public int existe(String palavra) {
		int calculo = hash(palavra);
		
		if(array[calculo]!=null && array[calculo].equals(palavra)) {
			//caso na posi��o hash(palavra) tenha a palavra 
			return calculo;
		}else {
			int maximo=calculo-1;
			while(calculo!=maximo) {
				
				if(calculo<array.length-1) {
					//garante que caso chegue a posi��o 999 a pesquisa v� para a posi��o 0
					calculo++;
				}else {
					calculo=0;
				}
				
				if(array[calculo]!=null && array[calculo].equals(palavra)) {
						return calculo;
				}
				
			}
			}
		//se chegar a m�ximo (calculo=m�ximo) quer dizer que deu uma volta, ou seja, n�o existe e ir� dar return -1
		return -1;
	}
			

	public void remove(String palavra) {
		int calculo=existe(palavra);
		
		if(calculo==-1) {//verifica se a palavra existe
			System.out.println("Palabra a remover nao existe");
		}else {
			array[calculo]=null;
		}
		
	}
}
