import java.util.Scanner;

public class calculador_curso {
	
	public static void main(String[] args) {
		


	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite o primeiro n�mero: ");
	        double num1 = input.nextDouble();

	        System.out.print("Digite o segundo n�mero: ");
	        double num2 = input.nextDouble();

	        System.out.print("Escolha a opera��o (1 - para Soma, 2 -  para Subtra��o, 3 -  para Multiplica��o, 4 - 1para Divis�o): ");
	        int operacao = input.nextInt();

	        double resultado = calcular(num1, num2, operacao);
	        System.out.println("O resultado da opera��o �: " + resultado);

	        input.close();
	    }

	    public static double calcular(double num1, double num2, int operacao) {
	        double resultado = 0;

	        switch (operacao) {
	            case 1:
	                resultado = num1 + num2;
	                break;
	            case 2:
	                resultado = num1 - num2;
	                break;
	            case 3:
	                resultado = num1 * num2;
	                break;
	            case 4:
	                if (num2 != 0) {
	                    resultado = num1 / num2;
	                } else {
	                    System.out.println("N�o � poss�vel dividir por zero!");
	                }
	                break;
	            default:
	                System.out.println("Opera��o inv�lida!");
	                break;
	        }

	        return resultado;
	    }
	}


