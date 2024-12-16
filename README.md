Documentação do Projeto "Conta Bancária"

Este documento explica detalhadamente as funcionalidades e a estrutura do projeto "Conta Bancária". O projeto é desenvolvido em Java e aplica conceitos de Orientação a Objetos como abstração, encapsulamento, herança e polimorfismo. Ele simula um sistema de gestão bancária com operações de contas.
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1. Estrutura do Projeto

1.1 Classes Principais

Conta (classe base):
Representa uma conta bancária genérica. Contém atributos e métodos comuns a todos os tipos de conta.

Atributos:

numero: Identificador da conta.

titular: Nome do titular da conta.

saldo: Valor atual na conta.

Métodos:

depositar(double valor): Adiciona um valor ao saldo da conta.

sacar(double valor): Subtrai um valor do saldo se houver saldo suficiente.

transferir(double valor, Conta destino): Transfere um valor para outra conta, caso haja saldo suficiente.

ContaCorrente (subclasse):
Especializa a classe Conta, podendo incluir taxas para operações específicas.

ContaPoupanca (subclasse):
Especializa a classe Conta, podendo incluir rendimento em função do saldo.

1.2 Classe Principal (Main)

A classe principal inicia o programa, cria objetos das contas e realiza testes das funcionalidades como saques, depósitos e transferências.

2. Funcionalidades

2.1 Criar Contas

As contas são instanciadas a partir das classes ContaCorrente ou ContaPoupanca, especificando os dados iniciais como o titular, o número da conta e o saldo inicial.

Exemplo:

ContaCorrente conta1 = new ContaCorrente(123, "João", 500.0);
ContaPoupanca conta2 = new ContaPoupanca(456, "Maria", 1000.0);
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
2. Funcionalidades

2.1 Criar Contas

As contas são instanciadas a partir das classes ContaCorrente ou ContaPoupanca, especificando os dados iniciais como o titular, o número da conta e o saldo inicial.

Exemplo:

conta1.depositar(200.0); // Saldo passa a ser 700.0

2.3 Saque

Permite subtrair dinheiro do saldo, verificando se o saldo é suficiente. Caso contrário, retorna uma mensagem de erro.

Exemplo:

conta1.sacar(100.0); // Saldo passa a ser 600.0

2.4 Transferência

Permite transferir dinheiro de uma conta para outra, verificando o saldo suficiente na conta de origem. Se o saldo for insuficiente, retorna uma mensagem de erro.

Exemplo:

conta1.transferir(150.0, conta2); // Saldo da conta1: 450.0, conta2: 1150.0
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
3. Detalhes de Implementação

3.1 Encapsulamento

Os atributos das classes são privados e acessados/modificados através de métodos get e set.

Exemplo:

public double getSaldo() {
    return saldo;
}


3.2 Herança

As classes ContaCorrente e ContaPoupanca herdam atributos e métodos da classe Conta, evitando duplicidade de código.

Exemplo:

public class ContaCorrente extends Conta {
    // Implementação específica
}

3.3 Polimorfismo

Permite tratar objetos de subclasses como objetos da classe pai, facilitando a gestão de vários tipos de contas.

Exemplo:

3.3 Polimorfismo

Permite tratar objetos de subclasses como objetos da classe pai, facilitando a gestão de vários tipos de contas.

Exemplo:

Conta conta = new ContaCorrente(123, "João", 500.0);
conta.depositar(100.0);
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
4. Testes e Resultados

A classe principal (Main) inclui casos de teste para validar cada funcionalidade. Os resultados são impressos no console, mostrando o saldo atualizado após cada operação.

Exemplo de Saída no Console:

Depósito de 200.0 realizado com sucesso. Saldo atual: 700.0
Saque de 100.0 realizado com sucesso. Saldo atual: 600.0
Transferência de 150.0 realizada com sucesso. Saldo atual da conta1: 450.0, conta2: 1150.0
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
5. Melhorias Futuras

Implementar interface gráfica para interação com usuários.

Adicionar persistência de dados usando um banco de dados.

Incluir operações avançadas como empréstimos e simulação de rendimentos.
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
6. Conclusão
O projeto "Conta Bancária" é uma excelente aplicação prática dos conceitos de Orientação a Objetos em Java, cobrindo funcionalidades essenciais de um sistema bancário. Ele pode ser expandido para incluir novos recursos e tecnologias, como bancos de dados e aplicações web.

Documentação elaborada por: Artur Aires



   
