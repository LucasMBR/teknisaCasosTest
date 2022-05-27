package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class MainPage extends PageBase {
    //Mapping
    By usernameLoginInfoTextArea = By.xpath("//div[@class='zh-header-info']");
    By reportIssueLink = By.xpath("//a[@href='/bug_report_page.php']");

    By menuPrincipal = By.xpath("//div[@class='bars']");
    //By menuPrincipal = By.id("splash");
    By displayPagamentosVencidos = By.xpath("//span[text() = 'Pagamentos - Vencidos']");
    By menuDocumentosFiscais = By.xpath("//span[text() = 'Documentos Fiscais']");
    By menuParametrizacao = By.xpath("//span[text() = 'Parametrização']");
    By menuDocumentosFiscais_Saidas = By.xpath("//span[text() = 'Saídas']");
    By menuDocumentosFiscais_Saidas_Lancamentos = By.xpath("//span[text() = 'Lançamentos']");
    By menuDocumentosFiscais_Saidas_Lancamentos_LancamentoDeSaida = By.xpath("//span[text() = 'Lançamento de Saída']");
    By menuAlmoxarifadoLocalizacao = By.xpath("//span[text() = 'Almoxarifado/Localização']");
    By menuTipoRetirada = By.xpath("//span[text() = 'Tipo de Retirada']");
    By menuEstoque = By.xpath("//li[8]//span[text() = 'Estoque'] ");

    By loadingWait = By.xpath("//*[@class='zh-background-loading ng-scope']//span[@class='zh-loading-icon']");

    //Actions
    public String retornaUsernameDasInformacoesDeLogin() {
        return getText(usernameLoginInfoTextArea);
    }

    public void clicarEmReportIssue() {
        click(reportIssueLink);
    }

    public void clicarEmMenuPrincipal() {
        waitForElement(displayPagamentosVencidos);
        waitForElement(usernameLoginInfoTextArea);
        click(menuPrincipal);
    }

    public void clicarEmDocumentosFiscais() {
        click(menuDocumentosFiscais);
    }

    public void clicarEmDocumentosFiscaisSaidas() {
        click(menuDocumentosFiscais_Saidas);
    }

    public void clicarEmDocumentosFiscaisSaidasLancamentos() {
        click(menuDocumentosFiscais_Saidas_Lancamentos);
    }

    public void clicarEmDocumentosFiscaisSaidasLancamentosLancamentoDeSaida() {
        click(menuDocumentosFiscais_Saidas_Lancamentos_LancamentoDeSaida);
    }

    public void clicarEmMenuAlmoxarifadoLocalizacao() {
        click(menuAlmoxarifadoLocalizacao);
    }

    public void clicarEmMenuTipoRetirada() {
        click(menuTipoRetirada);
    }

    public void clicarEmParametrizacao() {
        click(menuParametrizacao);
    }

    public void clicarEmEstoque() {
        ScrollToElementJavaScript(menuEstoque);
        click(menuEstoque);
    }
}
