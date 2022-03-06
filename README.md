# Projeto para a Academia Técnica Capgemini 2022

Este repositório é destinado para os desafios de programação #02 da academia técnica Capgemini.

## Tecnologias Utilizadas 

- Java
- IDE Eclipse/Intellij
- JUnite
- Git

## Desafios de Programação

- ### Questão 01

A mediana de uma lista de números é basicamente o elemento que se encontra no meio da lista após a ordenação. Dada uma lista de números com um número ímpar de elementos, desenvolva um algoritmo que encontre a mediana.

Exemplo:

Entrada:

arr = [9, 2, 1, 4, 6]


Saída:

4



- ### Questão 02

        Dado um vetor de inteiros n e um inteiro qualquer x. Construa um algoritmo que determine o número de elementos pares do vetor que tem uma diferença igual ao valor de x.

Exemplo:

Entrada:

n = [1, 5, 3, 4, 2]


Saída:

3


Explicação:

Existem 3 pares de inteiros no vetor com uma diferença de 2: [5, 3], [4, 2] e [3, 1].

- ### Questão 03

Um texto precisa ser encriptado usando o seguinte esquema. Primeiro, os espaços são removidos do texto. Então, os caracteres são escritos em um grid, no qual as linhas e colunas tem as seguintes regras:

<=linha<=coluna<=

Considere T, como o tamanho do texto.
Se certifique de que linhas x colunas >= .
Se múltiplos grids satisfazem as condições, escolha aquele com a menor área.
Escreva um algoritmo que ao receber uma string s, mostre a mensagem encriptada de acordo com as regras descritas.

Exemplos:


Exemplo 1)

Entrada: 

s = tenha um bom dia

Saída:

taoa eum nmd hbi


Explicação:

Depois de remover os espaços, a string tem 13 caracteres.  está entre 3 e 4, então a string é rescrita na forma de um grid com 4 linhas e 4 colunas:

tenh
aumb
omdi
a

        O resultado é obtido ao mostrar os caracteres de cada coluna, com um espaço entre as colunas de texto. A mensagem encriptada é obtida ao mostrar os caracteres de cada linha com um espaço entre as colunas.


Exemplo 2)

Entrada:

s = ola mundo


Saída:

omd luo an


Explicação:

        Depois de remover os espaços a string tem 8 caracteres.  está entre 2 e 3, então a string é reescrita na forma de um grid com 3 linhas e 3 colunas:

ola

mun

do

# Explicando a resolução dos desafios

## Desafio 01

Foi adicionado uma lista com 5 números e junto ao recurso **sort** foram ordenados em ordem crescente. O **size** é utilizado para determinar o total de números na lista.

Usando a condição **if** quando o conjunto de números for ímpar o número central será a mediana, mas quando o conjunto de números for par, será somado os dois valores centrais e divido por dois.


## Desafio 02
Após iniciar um arrays com 5 números, foi feito dois laços de repetição **FOR** que percorrer os contadores x e y (contx, conty), que quando subtraidos um pelo outro, e for iguais ao valor de x, teremos as saídas desejadas.

## Desafio 03

1. Primeiramente foi utilizado o medoto raplace para substituir a frase e retirar seus espaços.
1. Após isso é utilizado a classe math 2x, o math.sqrt para fazer a raiz quadrada e o math.ceil para arredondamento
1. Um laço for foi adicionado para percorrer a posição e vai separar a string em 4 partes, pois o **TAMANHO** é 4 e a cada 4 letras percorridas é dada um quebra de linha.
1. No segundo laço for de forma semelhante vai haver uma quebra de linha a cada 3 **PARTES** onde vai estar pegando cada letra da posição desejada.
Foi adicionado um if para evitar um erro, onde normamente o laço percorreria 3 partes, se houver um números inferior de números na palavra(2 por exemplo), é feito um break.

Obv: a String utilizadas são iguais dos exemplos: 
Entrada: s= tenha um bom dia
saída: taoa eum nmd hbi

Ex2, Entrada: s= ola mundo
saída: omd luo an


# Instruções para rodar o código
- **1º Modo**

1. No repositório vá em *code* copie o URL
1. Abra o Git bash
1. Digite git clone git@github.com:HugoStorM/DesafiosCapgemini.git
1. importe/abra o arquivo que foi baixado
1. Abra o projeto e na pasta srs, procure e execute os arquivos java

- **2º Modo** 

1. Acesse o repositório e aperte em **Code** e faça o download ZIP 
1. extraia a pasta baixada
1. Abra uma IDE 
1. Importe o arquivo que foi baixado
1. Abra o projeto, entre na pasta src e execute os arquivos **java** 



