package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

import java.util.Random;

public class AlmoxLocaPage extends PageBase {

    Random random = new Random();
    String numero = String.valueOf(random.nextInt(100));

    By filtroUnidade = By.xpath("//*[@id='NMFILIAL']//input");
    By filtroUnidadeAux = By.xpath("//*[@id=\"NMFILIAL\"]/span[1]");
    By selecionandoUnidade = By.xpath("//*[@id=\"grid-9000\"]/div[2]/div/div[1]/div[2]/span");
    By filtroAplicarFiltro = By.xpath("//*[@id=\"footer\"]/div[3]/ul/li/a/span");
    By filialFiltrada = By.xpath("//*[@class='stripe-value-NMFILIAL']");

    By btnAdicionar = By.xpath("//*[@class='zh-test-box']");
    By campoCodigo = By.id("//*[@id='CDALMOXARIFE']");
    By campoDescricaoAlmoxarifado = By.id("//*[@id='DSALMOXARIFE']");
    By btnSalvar = By.id("//*[@id='footer']/div[3]");


    public void preencherFiltroUnidade(String unidade){
        clickWithoutClickable(filtroUnidade);
        click(filtroUnidadeAux);
        click(selecionandoUnidade);
    }
    public void clicarAplicarFiltro(){
        waitForVisibilityOfElementLocated(filtroUnidade);
        click(filtroAplicarFiltro);
    }
    public void clicarAdicionar(){
        waitForVisibilityOfElementLocated(btnAdicionar);
        click(btnAdicionar);
    }

    public void adicionarCodigo(){
        //waitForElement(campoCodigo);
        SendKeysJavaScript(campoCodigo,this.numero);
    }

    public String retornarFilialFiltrada(){
        waitForVisibilityOfElementLocated(filialFiltrada);
        return getText(filialFiltrada);
    }

}

