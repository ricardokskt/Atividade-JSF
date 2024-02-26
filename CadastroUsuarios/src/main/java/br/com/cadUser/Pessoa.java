package br.com.cadUser;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome;
    private List<String> nomesCadastrados = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarNome() {
        nomesCadastrados.add(nome);
        System.out.println(nome);
        nome = null;
    }

    public List<String> getNomesCadastrados() {
    	return nomesCadastrados;
    }
}
