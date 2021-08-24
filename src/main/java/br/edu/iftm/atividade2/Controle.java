package br.edu.iftm.atividade2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controle {
    
    @RequestMapping("/verproduto")
    public String exibirProduto (Model modelo) {
        Produto produto = new Produto("Notebook", 5000.99);
        modelo.addAttribute("prod", produto);
        return "exibeproduto";
    }
}
