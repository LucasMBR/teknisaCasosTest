package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.flows.MainFlows;
import com.javaseleniumtemplate.pages.TipoRetiradaPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TipoRetiradaTest extends TestBase{

    LoginFlows loginFlows;
    MainFlows mainFlows;
    TipoRetiradaPage tipoRetiradaPage;

    @Test
    public void tipoDeRetiradaTest(){

        loginFlows = new LoginFlows();
        mainFlows = new MainFlows();

        tipoRetiradaPage = new TipoRetiradaPage();

        String usuario = "lucas.leal@teknisa.com";
        String senha = "Teknisa1.";
        String descricao = "Descrição de teste automatizado.";

        loginFlows.efetuarLogin(usuario, senha);
        mainFlows.navegarParaTipoDeRetiradaPage();

        //Filtro
        tipoRetiradaPage.preencherFiltroUnidade();

        //Rotina
        tipoRetiradaPage.clicarAdicionar();
        tipoRetiradaPage.adicionarCodigo();
        tipoRetiradaPage.adicionarNome(descricao);
        tipoRetiradaPage.selecionarTpMovi();
        tipoRetiradaPage.clicarSalvar();

        Assert.assertEquals(tipoRetiradaPage.confirmacaoCadastroSucesso(),tipoRetiradaPage.numeroGerado());

    }
}
