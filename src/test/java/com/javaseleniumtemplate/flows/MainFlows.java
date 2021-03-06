package com.javaseleniumtemplate.flows;

import com.javaseleniumtemplate.pages.LoginPage;
import com.javaseleniumtemplate.pages.MainPage;

public class MainFlows {

    MainPage mainPage;

    public MainFlows(){
        mainPage = new MainPage();
    }

    public void navegarParaLancamentoDeSaida(){
        mainPage.clicarEmMenuPrincipal();
        mainPage.clicarEmDocumentosFiscais();
        mainPage.clicarEmDocumentosFiscaisSaidas();
        mainPage.clicarEmDocumentosFiscaisSaidasLancamentos();
        mainPage.clicarEmDocumentosFiscaisSaidasLancamentosLancamentoDeSaida();
    }
    public void navegarParaAlmoxarifadoLocalizacao(){
        mainPage.clicarEmMenuPrincipal();
        mainPage.clicarEmParametrizacao();
        mainPage.clicarEmEstoque();
        mainPage.clicarEmMenuAlmoxarifadoLocalizacao();
    }

    public void navegarParaTipoDeRetiradaPage(){
        mainPage.clicarEmMenuPrincipal();
        mainPage.clicarEmParametrizacao();
        mainPage.clicarEmEstoque();
        mainPage.clicarEmMenuTipoRetirada();
    }

    public void navegarParaPosicaoEstoque(){
        mainPage.clicarEmMenuPrincipal();
        mainPage.clicarEmMenuEstoque();
        mainPage.clicarEmRelatorios();
        mainPage.clicarEmPosicaoEstoque();

    }

    public void navegarParaEstoqueMinimoDeProduto(){
        mainPage.clicarEmMenuPrincipal();
        mainPage.clicarEmParametrizacao();
        mainPage.clicarEmEstoque();
        mainPage.clicarEmMenuEstoqueMinimoProduto();
    }

}
