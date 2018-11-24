package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pom.LoginPage;

public class TrelloStep {
    @Dado("^que esteja logado no trello$")
    public void queEstejaLogadoNoTrello() {
       // System.out.println("que esteja logado no trello");

    }

    @E("^acesse o board$")
    public void acesseOBoard() {
        System.out.println("acesseOBoard");
    }

    @Quando("^crio um card com nome \"([^\"]*)\"$")
    public void crioUmCardComNome(String arg0) {
        System.out.println("crio um card com nome");
    }

    @E("^comento \"([^\"]*)\"$")
    public void comento(String arg0) {
        System.out.println("comento");
    }

    @Entao("^o card deve estar na lista$")
    public void oCardDeveEstarNaLista() {
        System.out.println("o card deve estar na lista");
    }

    @Quando("^excluo o card$")
    public void excluoOCard() {
        System.out.println("excluo o card");

    }

    @Entao("^o card nao existe mais$")
    public void oCardNaoExisteMais() {
        System.out.println("Card nao existe");
    }
}