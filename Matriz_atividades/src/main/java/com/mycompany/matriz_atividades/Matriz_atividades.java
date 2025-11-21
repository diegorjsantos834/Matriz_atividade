/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz_atividades;

/**
 *
 * @author Koragem
 */

import java.util.Scanner;
public class Matriz_atividades {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); //declara scanner

        //algoritmo 1, ler matriz 4x4 e mostrar soma e media dos numeros pares

        int[][] matriz = new int[4][4]; //declara matriz 4x4
        int soma = 0; //soma
        int contadorPares = 0; //contador de numeros pares
        double media; //variavel media

        //leitura da matriz
        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = input.nextInt(); //leitura do elemento
                //verifica se o numero e par
                if (matriz[i][j] % 2 == 0) {
                    soma += matriz[i][j]; //adiciona a soma
                    contadorPares++; //incrementa contador de pares
                }
            }
        }

        //calculo da media
        if (contadorPares > 0) {
            media = (double) soma / contadorPares; //calculo da media
        } else {
            media = 0; //evita divisao por zero
        }

        //exibe resultados
        System.out.println("Soma dos numeros pares: " + soma);
        System.out.println("Media dos numeros pares: " + media);
        
        //algoritmo 2, criar e exibir matrizes (a: char, b: int, c: double)
        
        System.out.println("Segundo exercicio: ");
        //Letras
        char [][] Lmatriz = new char [4][5];
        
        //leitura da matriz
        System.out.println("Digite os elementos letras da matriz 4x5:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                Lmatriz[i][j] = input.next().charAt(0); //leitura do elemento
            }
        }
        
        //exibe resultados
        System.out.println("Matriz de caracteres:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(Lmatriz[i][j] + " ");
            }
            System.out.println(); // Pula linha após cada linha da matriz
            
            
        }
        
        //inteiros
        int [][] Imatriz = new int [3][4];
        
        //leitura da matriz
        System.out.println("Digite os elementos inteiros da matriz 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                Imatriz[i][j] = input.nextInt(); //leitura do elemento
            }
        }
        
        //exibe resultados
        System.out.println("Matriz dos inteiros:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(Imatriz[i][j] + " ");
            }
            System.out.println(); // Pula linha após cada linha da matriz
            
        }
        
                
        //racional
        double [][] Dmatriz = new double [3][3];
        
        //leitura da matriz
        System.out.println("Digite os elementos racionais da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Dmatriz[i][j] = input.nextDouble(); //leitura do elemento
            }
        }
        
        //exibe resultados
        System.out.println("Matriz dos racionais:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Dmatriz[i][j] + " ");
            }
            System.out.println(); // Pula linha após cada linha da matriz
        
        }
        
        //algoritmo 3, Faça um algoritmo que preencha uma matriz 5x5 de inteiros e escreva: a soma dos números ímpares fornecidos;a soma de cada uma das 5 colunas;a soma de cada uma das 5 linhas;
        
        
        System.out.println("Terceira exercicio: ");
        
        int [][] Matriz3 = new int [5][5];
        
        // Leitura da matriz
        System.out.println("Digite os 25 elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                Matriz3[i][j] = input.nextInt();
            }
        }
        
        // Soma dos números ímpares
        int somaImpares = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (Matriz3[i][j] % 2 != 0) { // Verifica se é ímpar
                    somaImpares += Matriz3[i][j];
                }
            }
        }
        
        // Soma das 5 colunas
        System.out.println("\nSoma de cada coluna:");
        for (int j = 0; j < 5; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 5; i++) {
                somaColuna += Matriz3[i][j];
            }
            System.out.println("Coluna " + j + ": " + somaColuna);
        }
        
        // Soma das 5 linhas
        System.out.println("\nSoma de cada linha:");
        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 5; j++) {
                somaLinha += Matriz3[i][j];
            }
            System.out.println("Linha " + i + ": " + somaLinha);
        }
        
        // Exibe soma dos ímpares
        System.out.println("\nSoma dos números ímpares: " + somaImpares);
    
        //Algoritmo 4, Matriz 3x5,Informe se a matriz possui elementos repetidos, A quantidade de números pares, A quantidade de números ímpares;
        
        System.out.println("Quarto exercicio: ");
        
        int[][] matriz4 = new int[3][5];
        
        // Leitura da matriz
        System.out.println("Digite os 15 elementos da matriz 3x5:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz4[i][j] = input.nextInt();
            }
        }
        
        // a) Verifica se possui elementos repetidos
        boolean temRepetidos = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                int valorAtual = matriz4[i][j];
                // Verifica nos próximos elementos
                for (int k = i; k < 3; k++) {
                    for (int l = (k == i ? j + 1 : 0); l < 5; l++) {
                        if (matriz4[k][l] == valorAtual) {
                            temRepetidos = true;
                            break;
                        }
                    }
                    if (temRepetidos) break;
                }
                if (temRepetidos) break;
            }
            if (temRepetidos) break;
        }
        
        // b) Quantidade de números pares
        int quantidadePares = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz4[i][j] % 2 == 0) {
                    quantidadePares++;
                }
            }
        }
        
        // c) Quantidade de números ímpares
        int quantidadeImpares = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz4[i][j] % 2 != 0) {
                    quantidadeImpares++;
                }
            }
        }
        
        // Exibe resultados
        System.out.println("\nResultados:");
        System.out.println("Possui elementos repetidos? " + (temRepetidos ? "Sim" : "Não"));
        System.out.println("Quantidade de números pares: " + quantidadePares);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpares);
    
        //Algoritmo 5, matriz 4x4 de decimais, Exiba os valores da sua diagonal principal, Exiba os valores da sua diagonal secundária 
        
        System.out.println("Quinto exercicio: ");
        
        
        double[][] matriz5 = new double[4][4];
        
        // Leitura da matriz
        System.out.println("Digite os 16 elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz5[i][j] = input.nextDouble();
            }
        }
        
        // a) Exibe valores da diagonal principal
        System.out.println("\nDiagonal Principal:");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz5[i][i] + " "); // i = j na diagonal principal
        }
        System.out.println();
        
        // b) Exibe valores da diagonal secundária
        System.out.println("\nDiagonal Secundária:");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz5[i][3 - i] + " "); // i + j = 3 na diagonal secundária
        }
        System.out.println();
    
        //algoritmo 6, 
        
        System.out.println("Sexto Exercicio");
        
        // Figura: Retângulo
        System.out.println("Retângulo");
            
        
        char[][] figura6a = new char[3][4];
        
        // Preenche toda a matriz com '*'
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                figura6a[i][j] = '*';
            }
        }
        
        // Exibe a figura
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(figura6a[i][j] + " ");
            }
            System.out.println();
        }
        
        
        // Figura: Retângulo Vazado
        System.out.println(" Retângulo Vazado");
        
        
        char[][] figura6b = new char[3][4];
        
        // Preenche a matriz com espaços
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                figura6b[i][j] = ' ';
            }
        }
        
        // Preenche apenas as bordas
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                // Primeira ou última linha OU primeira ou última coluna
                if (i == 0 || i == 2 || j == 0 || j == 3) {
                    figura6b[i][j] = '*';
                }
            }
        }
        
        // Exibe a figura
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(figura6b[i][j] + " ");
            }
            System.out.println();
        }
        
        // Figura: Triângulo crescente
        System.out.println("Triângulo4");
        
        char[][] figura6c = new char[4][4];
        
        // Preenche a matriz com espaços
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                figura6c[i][j] = ' ';
            }
        }
        
        // Preenche o triângulo usando laço
        // Cada linha i tem (i+1) asteriscos
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                figura6c[i][j] = '*';
            }
        }
        
        // Exibe a figura
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(figura6c[i][j] + " ");
            }
            System.out.println();
        }
        
        input.close();
 
    }
}

