package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class RelatorioPosicaoEstoquePage extends PageBase {

    //By campoRelatorio = By.xpath("//div/span[text() = 'Posição de Estoque']");
    //By campoUnidade = By.xpath();
    //By campoDataPosicao = By.xpath();
    By campoAlmoxarifado = By.xpath("//div[@name='DSALMOXARIFE']/input");
    //By opcaoAlmoxarifado = By.xpath("//span[text() = 'FABRICA PRODUCAO']");
    //By campoTipoDeCusto = By.xpath();
    By campoNivelTotalizacao = By.xpath("//*[@data-zh-id='66119073720788263272879']/../../div[1]/div/div[2]");
    By opcaoNivelTotalizacao = By.xpath("//*[@class='list zh-new-select-list']/../../../../div[1]/div[1]/div[2]//li[text() = '1']");
    //By campoOrdenarPorNome = By.xpath();
    By campoProdutoInicial = By.xpath("//*[@id='NMPRODUTOINI']//input");
    //By opcaoCampoProdutoInicial = By.xpath("//span[text() = 'Mercadoria para revenda']");
    By campoProdutoFinal = By.xpath("//*[@id='NMPRODUTOFIN']//input");
    //By opcaoCampoProdutoFinal = By.xpath("//span[text() = 'SERVIÇOS DE TERCEIROS, DESPESAS E REEMBOLSOS']");

    By btnEmGrid = By.xpath("//span[text()='Em Grid']/../div[1]");

    By loadingWait = By.xpath("//*[@class='zh-background-loading ng-scope']//span[@class='zh-loading-icon']");

    public void preencherAlmoxarifado(String almoxarifado) {
        //waitForInvisibilityOfElementLocated(loadingWait);
        click(campoAlmoxarifado);
        sendKeys(campoAlmoxarifado,almoxarifado);
    }

    public void preencherNivelTotalizacao(String nivel) {
        waitForInvisibilityOfElementLocated(loadingWait);
        click(campoNivelTotalizacao);
        //clickWithoutClickable(opcaoNivelTotalizacao);
        clickWithText(opcaoNivelTotalizacao,nivel); //tentando pegar o xpath certo //*[@class='list zh-new-select-list']/../../../../div[1]
    }

    public void preencherProdutoInicial(String prodInicial) {
        //waitForInvisibilityOfElementLocated(loadingWait);
        click(campoProdutoInicial);
        sendKeys(campoProdutoInicial, prodInicial);
    }

    public void preencherProdutoFinal(String prodFinal) {
        //waitForInvisibilityOfElementLocated(loadingWait);
        click(campoProdutoFinal);
        sendKeys(campoProdutoFinal,prodFinal);
    }

    public void clicarGerarRelatorioGrid() {
        waitForInvisibilityOfElementLocated(loadingWait);
        click(btnEmGrid);
    }


}
