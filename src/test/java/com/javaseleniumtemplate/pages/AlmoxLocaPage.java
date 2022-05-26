package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

import java.util.Random;

public class AlmoxLocaPage extends PageBase {

    //Trecho de código para gerar um número aleatório nos cadastros.
    //Posteriormente colocar em uma classe distinta para reuso.
    Random random = new Random();
    int numero = random.nextInt(100);

    //Localizadores do filtro
    By filtroUnidade = By.xpath("//*[@id='NMFILIAL']//input");
    By filtroUnidadeAux = By.xpath("//*[@id=\"NMFILIAL\"]/span[1]");
    By selecionandoUnidade = By.xpath("//*[@id=\"grid-9000\"]/div[2]/div/div[1]/div[2]/span");
    By filtroAplicarFiltro = By.xpath("//span[text() = 'Aplicar filtro'][1]");
    By filialFiltrada = By.xpath("//*[@class='stripe-value-NMFILIAL']");

    //Localizador tela fantasma. Importante observar para trechos de código que não acatarem dados.
    By loadingWait = By.xpath("//*[@class='zh-background-loading ng-scope']//span[@class='zh-loading-icon']");

    //Localizadores rotinas.
    By btnAdicionar = By.xpath("//*[@class='zh-test-box']");
    By campoCodigo = By.xpath("//input[@id='CDALMOXARIFE']");
    By campoDescricaoAlmoxarifado = By.xpath("//input[@id='DSALMOXARIFE']");
    By btnSalvar = By.xpath("//*[@id='footer']/div[3]");

    //Localizador para garantir que cadastro foi realizado utilizando o mesmo numero aleatório gerado para a tela.
    By confirmacaoCadastro = By.xpath("//span[text() = '" + numero + "']");

    public void preencherFiltroUnidade(String unidade) {//Verificar possibilidade de redução para aplicar filtro.
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
        waitForInvisibilityOfElementLocated(loadingWait); //verificar possibilidade de colocar método no testbase.
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

