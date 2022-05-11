package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class AlmoxLocaPage extends PageBase {

    By filtroUnidade = By.xpath("//*[@id='NMFILIAL']//input");
    By filtroUnidadeAux = By.id("NMFILIAL");
    By filtroAplicarFiltro = By.xpath("//*[@id=\"footer\"]/div[3]/ul/li/a/span");
    By filialFiltrada = By.xpath("//*[@class='stripe-value-NMFILIAL']");
    By btnAdicionar = By.xpath("//*[@class='zh-test-box']");

    public void preencherFiltroUnidade(String unidade){
        //clickWithoutClickable(filtroUnidade);
        click(filtroUnidadeAux);
        sendKeys(filtroUnidade, unidade);
    }
    public void clicarAplicarFiltro(){
        click(filtroAplicarFiltro);
    }
    public void clicarAdicionar(){
        click(btnAdicionar);
    }

    public String retornarFilialFiltrada(){
        return getText(filialFiltrada);
    }

}

