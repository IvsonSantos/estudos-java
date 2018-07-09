package deitel.problemas;

import java.util.Scanner;

/**
 * Uma faculdade oferece um curso que prepara os candidatos a obter licença
 * estadual para corretores de imóveis. No ano passado, dez alunos que
 * concluíram esse curso prestaram o exame. A universidade quer saber como foi o
 * desempenho dos seus alunos nesse exame. Você foi contratado para escrever um
 * programa que resuma os resultados. Para tanto, você recebeu uma lista desses
 * 10 alunos. Ao lado de cada nome é escrito 1 se o aluno passou no exame ou 2
 * se o aluno foi reprovado. Seu programa deve analisar os resultados do exame
 * assim: 1. Dê entrada a cada resultado do teste (isto é, um 1 ou um 2). Exiba
 * a mensagem “Inserir resultado” na tela toda vez que o programa solicitar o
 * resultado de outro teste. 2. Conte o número de cada tipo de resultado. 3.
 * Exiba um resumo dos resultados do teste indicando o número de alunos
 * aprovados e reprovados. 4. Se mais de oito estudantes forem aprovados no
 * exame, imprima “Bonus to instructor!”.
 *
 */
public class Analysis {

	public static void main(String[] args) {
		// cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);

		// inicializando variáveis nas declaraçõesÿ
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;

		// processa 10 alunos utilizando o loop controlado por contador
		while (studentCounter <= 10) {
			// solicita ao usuário uma entrada e obtém valor fornecido pelo usuário
			System.out.print("Enter result (1 = pass, 2 = fail): ");
			int result = input.nextInt();

			// if...else está aninhado na instrução whileÿ
			if (result == 1)
				passes = passes + 1;
			else
				failures = failures + 1;

			// incrementa studentCounter até o loop terminar
			studentCounter = studentCounter + 1;
		}

		System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

		// determina se mais de 8 alunos foram aprovadosÿ
		if (passes > 8)
			System.out.println("Bonus to instructor!");
		
		input.close();
	}
}
