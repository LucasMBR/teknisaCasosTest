package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.flows.MainFlows;
import com.javaseleniumtemplate.pages.RelatorioPosicaoEstoquePage;
import org.testng.annotations.Test;

public class RelatorioPosicaoEstoqueTest extends TestBase {
    LoginFlows loginFlows;
    MainFlows mainFlows;
    RelatorioPosicaoEstoquePage relatorioPosicaoEstoquePage;

    @Test
    public void posicaoDeEstoqueTest() {

        loginFlows = new LoginFlows();
        mainFlows = new MainFlows();

        relatorioPosicaoEstoquePage = new RelatorioPosicaoEstoquePage();
        String usuario = "lucas.leal@teknisa.com";
        String senha = "Teknisa1.";
        String almoxarifado = "FABRICA PRODUCAO";
        String prodInicial = "Mercadoria para revenda";
        String prodFinal= "SERVIÇOS DE TERCEIROS, DESPESAS E REEMBOLSOS";
        String nivel = "1";
        loginFlows.efetuarLogin(usuario, senha);
        mainFlows.navegarParaPosicaoEstoque();

        relatorioPosicaoEstoquePage.preencherAlmoxarifado(almoxarifado);
        relatorioPosicaoEstoquePage.preencherNivelTotalizacao(nivel);
        relatorioPosicaoEstoquePage.preencherProdutoInicial(prodInicial);
        relatorioPosicaoEstoquePage.preencherProdutoFinal(prodFinal);
        relatorioPosicaoEstoquePage.clicarGerarRelatorioGrid();

    }
}
