/*PROVA FINAL: 
6.1: Variáveis é uma ação que pode ser executa por indeterminado. Como por exemplo:

var idade = prompt('Digite sua idade:');
alert('Minha idade é: ' + idade); 

Constante é diferente, pois a ação já é executada por alguém em específico. Como por exemplo:

const nota1 = 22.5
const nota2 = 60.0
const media = nota1 + nota2 

console.log(media);

6.2:Comandos de decisão são uma estrutura para fazer testes. Se a condição for etendida é executada em um determinado bloco de código.
Se não, faz outro teste. São  if e else, exemplo:

if(idade < 18){
    document.write('Menor de idade');
} else{
    document.write('Maior de idade');
}

6.3: Loops são laços de repetições. Como por exemplo: for, for in, for of e while.
Sintaxe de for:

    for( [interação i]; [condição]; [expressão final]){
        bloco de código
    }

Sintaxe de while:

        while(condição){
            bloco de código
        }

 6.4:Funções são blocos de códigos para executar uma tarefa especifica. 
Sintaxe:

function nome(condição){
    bloco de código
}

Exemplo: 
function texto(){
    return texto()
}
console.log('Teste final');

6.5:Escopos são dados para ser acessados em determido código.
Existem dois tipos de escopos, local e global. Local é declarado dentro de uma função. Global é declarado fora da função, ela fica acessível a qualquer parta da aplicação.
exemplo:
Global:

var nome = 'elvia'
function nome(){
    return nome()
}
console.log(nome);

Local:

function nome(){
    var nome = 'Elvia'
    return nome();
}
console.log(nome);

6.6:Imputs é a entrada de dados. Exemplo: prompt()
Outputs é a saída de dados. Exemplo: alert(), console.log(), document.write().

6.7: Array serve para guardar propriedades. Lenght é a propriedade do array.
exemplo:
var listaMercado = ['Macarrão', 'Feijão', 'arroz']

6.8:Objetos são coleções de dados. Exemplo:
var pessoa{
    nome: 'Elvia',
    idade: 23,
    namorando: true,
    habilidades: ['estudiosa', 'amiga', 'dedicada']
};

6.9:
camelCase:coloca minuscula a primeira palavra e a segunda em maiúsculo e sem espaço. utilizada em Js. nomeSobrenome
PascalCase:coloca maiúsucula em todas as palavras e sem espaço. NomeSobrenome
Kibab-case: combina as palavras substituindo os espaços por '-'. nome-sobrenome
snake_case: combina as palavras substituindo os espaços por '_'. nome-sobrenome

6.10: Caminho relativo é a pasta que está no momento e o caminho absoluto é o caminho que você ta partindo do diretório raiz.

6.11: && : Algas as condições têm que ser verdade;
|| :Apenas uma condição precisa ser verdade;
== : condição igual;
!=: simbolo de diferença.

6.12: EPER: Entender, Planejar, Executar e Revisar.
Serve para organizar o código antes da montagem dele, é para auxiliar você para endenter o problema primeir, planejar como vai ser montado, depois executar e logo revisar para fazer as devidas mudanças caso seja necessário.

6.13: Pilha é o primeiro que entra e o ultimo a sair.
Fila é o primeiro que entra e o primeiro que sai. 

6.14: html é uma linguagem estática, que não se altera, que mostra os dados, é uma estrutura.
Css é a parte do programa que da cor, é estético.
javaScript é uma linguagem interpretada que da a vida a uma aplicação. 
*/