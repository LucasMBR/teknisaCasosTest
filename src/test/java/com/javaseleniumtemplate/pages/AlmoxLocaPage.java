package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

import java.util.Random;

public class AlmoxLocaPage extends PageBase {

    Random random = new Random();
    int numero = random.nextInt(100);

    By filtroUnidade = By.xpath("//*[@id='NMFILIAL']//input");
    By filtroUnidadeAux = By.xpath("//*[@id=\"NMFILIAL\"]/span[1]");
    By selecionandoUnidade = By.xpath("//*[@id=\"grid-9000\"]/div[2]/div/div[1]/div[2]/span");
    By filtroAplicarFiltro = By.xpath("//span[text() = 'Aplicar filtro'][1]");
    By filialFiltrada = By.xpath("//*[@class='stripe-value-NMFILIAL']");

    By loadingWait = By.xpath("//*[@class='zh-background-loading ng-scope']//span[@class='zh-loading-icon']");
    By btnAdicionar = By.xpath("//*[@class='zh-test-box']");
    By campoCodigo = By.xpath("//input[@id='CDALMOXARIFE']");
    By campoDescricaoAlmoxarifado = By.xpath("//input[@id='DSALMOXARIFE']");
    By btnSalvar = By.xpath("//*[@id='footer']/div[3]");

    By confirmacaoCadastro = By.xpath("//span[text() = '" + numero + "']");

    public void preencherFiltroUnidade(String unidade) {
        clickWithoutClickable(filtroUnidade);
        click(filtroUnidadeAux);
        click(selecionandoUnidade);
    }

    public void clicarAplicarFiltro() {
        waitForVisibilityOfElementLocated(filtroUnidade);
        click(filtroAplicarFiltro);
    }

    public void clicarAdicionar() {
        waitForVisibilityOfElementLocated(btnAdicionar);
        click(btnAdicionar);
    }

    public void adicionarCodigo() {
        waitForInvisibilityOfElementLocated(loadingWait);
        click(campoCodigo);
        sendKeys(campoCodigo, String.valueOf(numero));
    }

    public void adicionarDescricao(String descricao) {
        waitForInvisibilityOfElementLocated(loadingWait);
        click(campoDescricaoAlmoxarifado);
        sendKeys(campoDescricaoAlmoxarifado, descricao);
    }

    public void clicarSalvar() {
        waitForInvisibilityOfElementLocated(loadingWait);
        click(btnSalvar);
    }

    public String retornarFilialFiltrada() {
        waitForVisibilityOfElementLocated(filialFiltrada);
        return getText(filialFiltrada);
    }

    public int confirmacaoCadastroSucesso() {
        waitForVisibilityOfElementLocated(confirmacaoCadastro);
        String text = getText(confirmacaoCadastro);
        return Integer.parseInt(text);
    }

    public int numeroGerado() {
        return numero;
    }

}

