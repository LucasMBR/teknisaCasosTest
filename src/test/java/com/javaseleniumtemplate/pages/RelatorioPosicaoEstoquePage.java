package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class RelatorioPosicaoEstoquePage extends PageBase {

    By campoRelatorio = By.xpath("//div/span[text() = 'Posição de Estoque']");
    By campoUnidade = By.xpath();
    By campoDataPosicao = By.xpath();
    By campoAlmoxarifado = By.xpath();
    By campoTipoDeCusto = By.xpath();
    By campoNivelTotalizacao = By.xpath();
    By campoOrdenarPorNome = By.xpath();
    By campoProdutoInicial = By.xpath();
    By campoProdutoFinal = By.xpath();

    By btnEmGrid = By.xpath();

    public void preencherRelatorio(){

    }


}
