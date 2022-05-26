package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.flows.MainFlows;
import com.javaseleniumtemplate.pages.AlmoxLocaPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlmoxLocaTests extends TestBase {

    LoginFlows loginFlows;
    MainFlows mainFlows;
    AlmoxLocaPage almoxaLocaPage;

    @Test
    public void almoxarifadoLocalizacaoTest() {

        loginFlows = new LoginFlows();
        mainFlows = new MainFlows();

        almoxaLocaPage = new AlmoxLocaPage();

        String usuario = "lucas.leal@teknisa.com";
        String senha = "Teknisa1.";
        String unidade = "HELA INGREDIENTES BRASIL";
        String descricao = "Descrição de teste automatizado.";

        loginFlows.efetuarLogin(usuario, senha);
        mainFlows.navegarParaAlmoxarifadoLocalizacao();

        //Preenchendo e aplicando Filtro
        almoxaLocaPage.preencherFiltroUnidade(unidade);
        almoxaLocaPage.clicarAplicarFiltro();

        //Realizando rotina
        almoxaLocaPage.clicarAdicionar();
        almoxaLocaPage.adicionarCodigo();
        almoxaLocaPage.adicionarDescricao(descricao);
        almoxaLocaPage.clicarSalvar();

        //Assegurando que o teste finalizou com sucesso.
        Assert.assertTrue(almoxaLocaPage.retornarFilialFiltrada().endsWith(unidade));
        Assert.assertEquals(almoxaLocaPage.confirmacaoCadastroSucesso(), almoxaLocaPage.numeroGerado());
    }
}

