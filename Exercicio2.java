package Exercicio2;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {

		/*
		 * Implemente um programa que leia uma lista de números do usuário e calcule a
		 * soma. Use try-catch para garantir que apenas números válidos sejam somados e,
		 * no bloco finally, exiba a soma total.
		 */

		int soma = 0;

		int insereNumero = 0;

		int[] numeros = new int[(int) (Math.random() * 14)];

		int contador = numeros.length;

		do {

			try {

				for (int i = 0; i < numeros.length; i++) {

					insereNumero = Integer.parseInt(JOptionPane.showInputDialog(null,
							"Preencha o array adequadamente , \nNúmeros restantes : " + contador--));

					if (insereNumero <= 0) {

						JOptionPane.showMessageDialog(null, "Não é possível inserir números zeros ou negativos");

						break;

					} else {

						numeros[i] = insereNumero;

						soma += numeros[i];
					}
				}
			} catch (NullPointerException | NumberFormatException e) {

				JOptionPane.showMessageDialog(null,
						"Entrada incorreta de dados, você fechou o programa incorretamente ou não inseriu um número válido");
				break;
			}

			finally {

				System.out.print("Numeros fornecidos pelo usuario : ");
				
				System.out.println();

				for (int i = 0; i < numeros.length; i++) {

					System.out.print(numeros[i] + " ");
					
					System.out.println();

				}

				System.out.print("Resultado final  : " + soma);

				System.out.println();

				System.out.println("Fim da aplicacao");

			}

		} while (insereNumero > 0 && contador > numeros.length);

	}

}
