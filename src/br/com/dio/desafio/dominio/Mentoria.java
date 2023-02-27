package br.com.dio.desafio.dominio;

import java.time.LocalDate;

//Exemplo de herança
public class Mentoria extends Conteudo {
    private LocalDate data;

    public Mentoria() {
    }

    @Override
    public double calcularXp() {
        return xpPadrao + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + getData() +
                '}';
    }
}
