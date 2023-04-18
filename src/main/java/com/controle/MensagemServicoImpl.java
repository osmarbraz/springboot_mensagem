package com.controle;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Objeto com a implementação dos serviços.
 *
 * @author osmar
 */
@RestController
public class MensagemServicoImpl implements MensagemServico {

    private String mensagem;

    @RequestMapping("/getMensagem")   
    @Override
    public String getMensagem() {
        System.out.println("Executando serviço getMensagem.");
        //Formata a saída do método getMensagem
        String paginaResultado = "<html>"
                + "<head>"
                + "<title>Mensagem</title>"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />"
                + "</head>"
                + "<body>"
                + "<h1>Resultado getMensagem</h1>"
                + "getMensagem: " + mensagem
                + "</body>" + "</html>";
        return paginaResultado;
    }

    @RequestMapping("/setMensagem")   
    @Override
    public String setMensagem(String mensagem) {
        System.out.println("Executando serviço setMensagem(string) :" + mensagem);
        this.mensagem = mensagem;
     
        //Formata a saída do método setMensagem
        String paginaResultado = "<html>"
                + "<head>"
                + "<title>Mensagem</title>"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />"
                + "</head>"
                + "<body>"
                + "<h1>Resultado setMensagem</h1>"
                + "setMensagem: " + mensagem
                + "</body>" + "</html>";

        return paginaResultado;
    }
}

