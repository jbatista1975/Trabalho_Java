package Paque;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale.Category;

import Enums.Categoria;

public class Evento {
	 private int id;
	    private String nome;
	    private String endereco;
	    private Categoria categoria;
	    private LocalDateTime horario;
	    private String descricao;
	    private String sistema;

	    public Evento(int id, String nome, String endereco, Categoria festa, LocalDateTime horario, String descricao) {
	        this.id = id;
	        this.nome = nome;
	        this.endereco = endereco;
	        this.categoria = festa;
	        this.horario = horario;
	        this.descricao = descricao;
	        this.sistema = sistema;
	    }

	    public Evento(int id2, String nome2, String endereco2, Categoria festa, LocalDateTime plusHours,
				String descricao2) {
			// TODO Auto-generated constructor stub
		}

		// Getters e Setters
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getEndereco() {
	        return endereco;
	    }

	    public void setEndereco(String endereco) {
	        this.endereco = endereco;
	    }

	    public Category getCategoria() {
	        return categoria;
	    }

	    public void setCategoria(Category categoria) {
	        this.categoria = categoria;
	    }

	    public LocalDateTime getHorario() {
	        return horario;
	    }

	    public void setHorario(LocalDateTime horario) {
	        this.horario = horario;
	    }

	    public String getDescricao() {
	        return descricao;
	    }

	    public void setDescricao(String descricao) {
	        this.descricao = descricao;
	    }
 
	    public String toString() {
	        return "Evento{" +
	                "id=" + id +
	                ", nome='" + nome + '\'' +
	                ", endereco='" + endereco + '\'' +
	                ", categoria=" + categoria +
	                ", horario=" + horario.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) +
	                ", descricao='" + descricao + '\'' +
	                '}';
	     }
}

