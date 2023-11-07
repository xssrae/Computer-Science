let fii_user = [];
let fii_table = [];


async function carregarDadosUser(url){
    await fetch(url)
            .then(resp => resp.json())
            .then(json => fii_user = json);
    carregarDadosFundos();
}

async function carregarDadosFundos(){
    
    for (let fii of fii_user){
        let json = await fetch(`https://api-simple-flask.herokuapp.com/api/${fii.nome}`)
                        .then(resp => resp.json());
        fii_table.push(json);
        console.log(fii_table);
        console.log(fii_user);

        let preco_medio = (fii.total_gasto/fii.qtde).toFixed(2)
        let provento = json.proximoRendimento.rendimento
        let cota_base = json.proximoRendimento.cotaBase
        let data_base = json.proximoRendimento.dataBase
        let data_pag = json.proximoRendimento.dataPag
    
        if(provento = "-") {
                provento = dados_fii.proxRendimento.rendimento;
        }
        if(cota_base = "-") {
            cota_base = json.ultimoRendimento.cotaBase;
        }
        if (data_base = "-"){
            data_base = json.ultimoRendimento.dataBase;
        }
        if (data_pag = "-"){
            data_pag = json.ultimoRendimento.dataPag;
        }


        total_proventos += provento * fii.qtde;
        total_investido += fii.totalGasto;
        total_cotas += fii.qtde;      
        percentual = (provento*100 / dados_fii.valorAtual).toFixed(2);

        if (rendimento >= 0.6) {
            tabela.innerHTML += 
            `<tr class="cabeçalho">
            <td>${json.fundo}</td>
            <td>${json.setor}</td>
            <td>${data_base}</td>
            <td>${data_pagamento}</td>
            <td>R$:${provento}</td>
            <td>R$:${fii.valor_medio}</td>
            <td>R$:${cota_base}}</td>
            <td>${rendimento}%</td>
            <td>:${fii.qtde}</td>
            <td>R$:${fii.total_gasto}</td>
            <td>${json.dividendYield}%</td>
            <td>R$ ${(json.rendimentoMedio24M).toFixed(2)}</td>
            </tr>`  
        } else {
            tabela.innerHTML += `<tr class="negativo">
            <td>${json.fundo}</td>
            <td>${json.setor}</td>
            <td>${json.proximoRendimento.dataBase}</td>
            <td>${json.proximoRendimento.dataPag}</td>
            <td>R$ ${json.proximoRendimento.rendimento}</td>
            <td>R$ ${json.proximoRendimento.cotaBase}</td>
            <td>${fii.qtde}</td>
            <td>R$ ${fii.total_gasto}</td>
            <td>R$ ${preco_medio}</td>
            <td>${rendimento}%</td>
            <td>${json.dividendYield}%</td>
            <td>R$ ${(json.rendimentoMedio24M).toFixed(2)}</td>
            </tr>`
        }

        let gasto_total = 0;
        for (tot of fii_user){
            gasto_total += tot.totalgasto
        }
    
        let cotas_total = 0;
        for (tot of fii_user){
            cotas_total += tot.qtde
        }
    
        preco_medio = gasto_total/cotas_total;
    
        exibirTabela(valor_medio, cotas_total, gasto_total, preco_medio);
    }

    carregarDadosUser("json/fii.json");

    function exibirTabela() {
        document.querySelector("table")
        .innerHTML += `<tr class='fundo_total'>
        <td colspan='4'>Total Geral</td>
        <td>-</td>
        <td>${total_cotas}</td>
        <td>R$ ${total_investido.toFixed(2)} </td>
        <td>-</td><td>-</td><td>-</td>
        <td>-</td></tr>`;
        document.querySelector("#loading").style.display = "none";
    }
}
