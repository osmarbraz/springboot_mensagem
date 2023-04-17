package com.servico;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return "Mensagem: " + mensagem;
    }

    @RequestMapping("/setMensagem")
    @Override
    public String setMensagem(String mensagem) {
        System.out.println("Executando serviço setMensagem(string) :" + mensagem);
        this.mensagem = mensagem;
        return getMensagem();
    }
}
