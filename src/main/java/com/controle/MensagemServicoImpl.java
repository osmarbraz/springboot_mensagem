package com.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Objeto com a implementação dos serviços.
 *
 * @author osmar
 */
@Controller
public class MensagemServicoImpl implements MensagemServico {

    private String mensagem;

    @GetMapping("/getMensagem")  
    @Override
    public String getMensagem() {
        System.out.println("Executando serviço getMensagem.");
        return "Mensagem: " + mensagem;
    }

    @PostMapping("/setMensagem") 
    @Override
    public String setMensagem(String mensagem) {
        System.out.println("Executando serviço setMensagem(string) :" + mensagem);
        this.mensagem = mensagem;
        return getMensagem();
    }
}
