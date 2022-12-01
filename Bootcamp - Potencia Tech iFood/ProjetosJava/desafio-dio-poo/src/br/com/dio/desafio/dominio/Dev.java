package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
    private Set<String> bootcampsInscrito = new LinkedHashSet<>();


    public Set<String> getBootcampsInscrito() {
        return bootcampsInscrito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        this.bootcampsInscrito.add(bootcamp.getNome());
        bootcamp.getDevs().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudoCompleto = this.conteudosInscritos.stream().findAny();
        if (conteudoCompleto.isPresent()) {
            this.conteudosConcluidos.add(conteudoCompleto.get());
            this.conteudosInscritos.remove(conteudoCompleto.get());
        } else {
            System.out.println("Você não possui conteúdos para concluir!");
        }
    }

    public double calcularTotalXp() {
        return this.conteudosConcluidos.stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    @Override
    public String toString() {
        return "Dev " + nome + "\n" +
                "Conteudos à concluir: \n" + conteudosInscritos + "\n" +
                "Conteúdos concluídos: \n" + conteudosConcluidos;
    }
}
