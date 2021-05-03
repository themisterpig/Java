import java.util.Scanner;

/**
 * 
 */

/**
 * @author 41479
 *
 */
public class Teste {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chave chave = new Chave();
		Scanner scan = new Scanner(System.in);
		String palavra;
		
		System.out.println();
		System.out.println(" 1-Adicionar palavra \n 2-Pesquisar palavra \n 3-Remover palavra \n 0-Sair \n");
		int x= scan.nextInt();
		
		while(x!=0) {
			
			if(x==1) {
				System.out.println("Qual a palavra a adicionar?");
				palavra = scan.next();
				if(palavra.length()>=2) {
					chave.insere(palavra);
				}else {
					System.out.println("A palavra é demasiado pequena");
				}
				
			}
			if(x==2) {
					System.out.println("Qual a palavra a pesquisar?\n");
					palavra = scan.next();
					
					if(palavra.length()>=2) {
						if(chave.existe(palavra)!=-1) {//verifica se a palavra existe
							System.out.println("Existe na posição: "+chave.existe(palavra));
						}else {
							System.out.println("Não existe");
						}
					}
					else {
						System.out.println("A palavra é demasiado pequena");
					}
			}
			if(x==3) {
				
					System.out.println("Qual a palavra a eliminar?\n");
					palavra = scan.next();
					if(palavra.length()>=2) {
						if(chave.existe(palavra)!=-1) { //verifica se a palavra existe
							chave.remove(palavra);
						}else {
							System.out.println("Palavra procurada não existe");
						}
					}
					else {
						System.out.println("A palavra é demasiado pequena");
					}
			}
			System.out.println(" 1-Adicionar palavra \n 2-Pesquisar palavra \n 3-Remover palavra \n 0-Sair \n");
			x= scan.nextInt();
		}
		
			
	
			}
}
	


