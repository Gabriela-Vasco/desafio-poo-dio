package br.com.dio.desafio.dominio;

//Exemplo de herança
public class Curso extends Conteudo {
    private int cargaHoraria;


    public Curso() {
    }

    @Override
    public double calcularXp() {
        return xpPadrao * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + getCargaHoraria() +
                '}';
    }
}
