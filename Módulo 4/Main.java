package com;
import java.util.Date;

import Model.Autor;
import Model.Artigo;
import Model.Emprestimo;
import Model.Livro;
import Model.Usuario;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Jessica Felix", "Brasileira", false);
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia", true);
        Usuario usuario = new Usuario("Lucas Rafael", 25);
        Date dataAtual = new Date();
        Emprestimo emprestimo = new Emprestimo(dataAtual, dataAtual, livro, usuario);
        
        livro.validarDisponibilidade(); 
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Genero: " + livro.getGenero());
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolucao: " + emprestimo.getDataDevolucao());

    Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);
        
        System.out.println("Artigo: " + artigo.getTitulo());
        System.out.println("Autor do Artigo: " + artigo.getAutor().getNome());
        System.out.println("Artigo está publicado? " + artigo.isPublicado());
    }
}