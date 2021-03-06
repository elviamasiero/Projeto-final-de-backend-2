function listaNumArray() {
    let numerosArray = []
    for (let i = 0; i < 5; i++) {
        numerosArray.push(parseInt(prompt('Digite o número: ')))
    }
    retornaMaior(numerosArray)
    retornaMenor(numerosArray)
    retornaImparPar(numerosArray)
    retornaRepetido(numerosArray)
}

function retornaMaior (numerosArray) {
    numeroMaior = Math.max(...numerosArray)
    document.write(`<p>O número maior é: ${numeroMaior}</p>`)
}

function retornaMenor (numerosArray) {
    numeroMenor = Math.min(...numerosArray)
    document.write(`<p>O número menor é: ${numeroMenor}</p>`)
}

function retornaImparPar(numerosArray) {
    for (let i = 0; i < numerosArray.length; i++) {
        numero = numerosArray[i]
        if ((numero % 2) == 0) {
            document.write(`<p>O número ${numero} é PAR.</p>`)
        } else {
            document.write(`<p>O número ${numero} é ÍMPAR.</p>`)
        }
    }
}

function retornaRepetido(numerosArray) {
    var map = numerosArray.reduce(function(prev, cur) {
      prev[cur] = (prev[cur] || 0) + 1;
      return prev;
    }, {});
    
    for (i in map) {
        document.write(`<p>O número ${i} foi repetido ${map[i]}</p>`)
      }
}

listaNumArray()