/* 
 Este programa simula o deslocamento de um Rover de acordo com os comandos desejados.
 
 Nome: Gabriela Panta Zorzo
 Disciplina: Fundamentos de Programação
 Professor: Diego Noble
 Turma: 158
 */

import java.util.Scanner;

public class rover{ 
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     // Declaração das variáveis de posição.
     int posiçãoInicialX = 0;
     int posiçãoInicialY = 0;
     int posiçãoFinalX;
     int posiçãoFinalY;
     
     // Teste para inserção da posição inicial de x, sendo esta um valor inteiro.
     boolean ok = false;
     do {
        System.out.print("Digite a posição inicial do Rover no eixo x: ");
         if (in.hasNextInt()) {
          posiçãoInicialX = in.nextInt();
          ok = true;
        } else {
          System.out.println("O valor deve ser um número inteiro.");
          in.next(); //Descarta o valor digitado caso seja diferente de um valor inteiro.
        } 
     } while (!ok);

     // Teste para inserção da posição inicial de y, sendo esta um valor inteiro.
     ok = false;
     do {
        System.out.print("Digite a posição inicial do Rover no eixo y: ");
        if (in.hasNextInt()) {
          posiçãoInicialY = in.nextInt();
          ok = true;
        } else {
          System.out.println("O valor deve ser um número inteiro.");
          in.next(); //Descarta o valor digitado caso seja diferente de um valor inteiro.
        } 
     } while (!ok);
   
     // Entrada dos comandos desejados para deslocamento do Rover.
     System.out.print("Digite a sequência de comandos: ");
     String comandos = in.next();
 
   
     // Definição da posição final como sendo a posição inicial, para deslocamento posterior.
     posiçãoFinalX = posiçãoInicialX;
     posiçãoFinalY = posiçãoInicialY;
    
     /* Teste condicional percorrendo os caracteres dos comandos digitados.
        Enquanto o valor da variável auxiliar índice for menor que o comprimento dos comandos inseridos,
        o programa executa o deslocamento para a direção desejada.
        Se o caracter for N ou n, o Rover move para Norte.
        Se o caracter for S ou s, o Rover move para Sul.
        Se o caracter for L ou l, o Rover move para Leste.
        Se o caracter for O ou o, o Rover move para Oeste.
        Quaisquer outros caracteres não são válidos para deslocamento do Rover.
      */
     for (int índice = 0; índice < comandos.length(); índice++) {
         char comando = comandos.charAt(índice);
         switch (comando)
         {
            case 'N': 
            case 'n': 
                     posiçãoFinalY++; 
                     System.out.println("Movendo o Rover para o Norte...");
                     break;
            case 'S':
            case 's': 
                     posiçãoFinalY--;
                     System.out.println("Movendo o Rover para o Sul...");
                     break;
            case 'L':
            case 'l': 
                     posiçãoFinalX++; 
                     System.out.println("Movendo o Rover para o Leste...");
                     break;
            case 'O':
            case 'o': 
                     posiçãoFinalX--; 
                     System.out.println("Movendo o Rover para o Oeste...");
                     break;
            default: 
                    System.out.println("O comando " + comando + " não é válido!"); 
                    break; 
           }

     }
     
     // Impressão da posição final do Rover.
     System.out.println("A posição final do Rover é (" + posiçãoFinalX + "," + posiçãoFinalY + ").");
  }
}