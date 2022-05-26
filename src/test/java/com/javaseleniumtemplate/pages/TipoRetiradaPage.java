package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

import java.util.Random;

public class TipoRetiradaPage extends PageBase {

    Random random = new Random();
    int numero = random.nextInt(100);

    By filtroAplicarFiltro = By.xpath("/html/body/span/section/section/div[2]/section[4]/span/section/div/div/div[3]/ul/li/a/span");

    By btnAdicionar = By.xpath("//*[@class='zh-test-box']");
    By campoCodigo = By.xpath("//input[@id='CDTIPORETI']");
    By campoNome = By.xpath("//input[@id='NMTIPORETI']");
    By campoTpMovi = By.xpath("/html/body/span/section/section/div[2]/section[3]/div/div[4]/section/section/div/section/div/form/section/div/div[3]/div[2]/div/div[2]");
    By valorCampoTpMovi = By.xpath("//*[@class='list zh-new-select-list']/li["+1+"]");

    By btnSalvar = By.xpath("//*[@id='footer']/div[3]");

    By confirmacaoCadastro = By.xpath("//span[text() = '" + numero + "']");

}
