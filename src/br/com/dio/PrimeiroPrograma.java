package br.com.dio;

import br.com.dio.model.Gato;

import java.util.Objects;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        //ctrl+alt+o add ou rem imports
        //ctrl+y deleta linha
        //refatorar shift+f6
        //shift+f12 foco no cód
        //ctrl+alt+l organiza o código
        //ctrl+d duplica linha
        //ctrl+shift+seta muda de lugar
        // mais atalhos http://www.basef.com.br/index.php/Intellij_Idea
        Livro livro1 = new Livro("o teste", 500);

    }
}

class Livro{
    private String nome;
    private int numeroPagina;

    public Livro(String nome, int numeroPagina) {
        this.nome = nome;
        this.numeroPagina = numeroPagina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public void setNumeroPagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(numeroPagina, livro.numeroPagina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numeroPagina);
    }
}
