# Trabalho-Estrutura-Dados-P2

Este é o trabalho 2 da matéria de Estrutura de Dados.

O trabalho foi realizado por Eduardo Faria e Brendon Augusto.

O programa inicia criando uma Arvore Genérica onde cadastra-se partes de uma Bicicleta.

A bicicleta é o nível 1. Para os outros níveis, são adicionados em nós filhos as subpartes da bicicleta, como roda, guidão, chassi e outros.

Os dados são pegos dentro de um for e atribuidos em três ArrayLists, cada um designado para o nome do produto, o valor unitário e a quantidade desse produto.

Internamente, dentro da classe Arvore, é feita verificações e se o o nó não possui filhos, ele é adicionado a um ArrayList que mostrará ao usuário que é uma folha. Caso tenha, ele recursivamente entra no filho.

No fim, ele mostra o valor total da bicicleta e as folhas da árvore.
