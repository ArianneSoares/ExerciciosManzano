//d) Apresentar todos os valores numéricos inteiros ímpares situados na faixa de 0 a 20. Para verificar se o número

//é ímpar, efetuar dentro da malha a verificação lógica desta condição com a instrução se, perguntando se o número é ímpar;

//sendo, mostre-o; não sendo, passe para o próximo passo.

package manzano;

public class Manzano1d {

	public static void main(String[] args) {

		int valor = 0;

		while (valor < 20) {

			valor++;

			if (valor % 2 == 1) {

				System.out.println(valor);

			}

		}

	}

}