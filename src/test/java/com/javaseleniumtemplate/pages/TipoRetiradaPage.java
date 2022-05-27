package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

import java.util.Random;

public class TipoRetiradaPage extends PageBase {

    Random random = new Random();
    int numero = random.nextInt(100);

    By filtroAplicarFiltro = By.xpath("//section/div/div/div[3]/ul/li/a//span[text() = 'Aplicar filtro'][1]");

    By btnAdicionar = By.xpath("//*[@class='zh-test-box']");
    By campoCodigo = By.xpath("//input[@id='CDTIPORETI']");
    By campoNome = By.xpath("//input[@id='NMTIPORETI']");
    By campoTpMovi = By.xpath("//div[3]/div[2]/div/div[2]//span[text() = 'Ambos']");
    By valorCampoTpMovi = By.xpath("//*[@class='list zh-new-select-list']/li["+1+"]");

    By btnSalvar = By.xpath("//*[@id='footer']/div[3]");

    By confirmacaoCadastroSucesso = By.xpath("//span[text() = '" + numero + "']");

    By loadingWait = By.xpath("//*[@class='zh-background-loading ng-scope']//span[@class='zh-loading-icon']");

    public void preencherFiltroUnidade(){
        click(filtroAplicarFiltro);
    }

    public void clicarAdicionar(){
        waitForVisibilityOfElementLocated(btnAdicionar);
        click(btnAdicionar);
    }

    public void adicionarCodigo(){
        waitForInvisibilityOfElementLocated(loadingWait); //verificar possibilidade de colocar método no testbase.
        click(campoCodigo);
        sendKeys(campoCodigo, String.valueOf(numero));
    }

    public void adicionarNome(String descricao){
        waitForInvisibilityOfElementLocated(loadingWait);
        click(campoNome);
        sendKeys(campoNome, descricao);
    }

    public void selecionarTpMovi(){
        waitForInvisibilityOfElementLocated(loadingWait);
        click(campoTpMovi);
        waitForVisibilityOfElementLocated(valorCampoTpMovi);
        click(valorCampoTpMovi);
    }

    public void clicarSalvar(){
        waitForInvisibilityOfElementLocated(loadingWait);
        click(btnSalvar);
    }

    public int confirmacaoCadastroSucesso() {
        ScrollToElementJavaScript(confirmacaoCadastroSucesso);
        waitForVisibilityOfElementLocated(confirmacaoCadastroSucesso);
        String text = getText(confirmacaoCadastroSucesso);
        return Integer.parseInt(text);
    }

    public int numeroGerado() {
        return numero;
    }
}
