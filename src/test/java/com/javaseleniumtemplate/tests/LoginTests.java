package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.dbsteps.UsuariosDBSteps;
import com.javaseleniumtemplate.pages.LoginPage;
import com.javaseleniumtemplate.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    //Objects
    LoginPage loginPage;
    MainPage mainPage;

    //Tests
    @Test
    public void efetuarLoginComSucesso(){
        //Objects instances
        loginPage = new LoginPage();
        mainPage = new MainPage();

        //Parameteres
        String usuario = "lucas.leal@teknisa.com";
        String senha = "Teknisa1.";
        String mensagemMainPage = "0002 - FABRICA HELA";

        //Test
        loginPage.preenhcerUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();
        loginPage.aceitarMensagemAlerta();
        //loginPage.aceitarMensagemAlerta2();

        Assert.assertTrue(mainPage.retornaUsernameDasInformacoesDeLogin().contains(mensagemMainPage));
    }
}
