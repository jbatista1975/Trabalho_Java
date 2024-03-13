package Real;

import java.util.ArrayList;
import java.util.List;

import Paque.Evento;

public class Usuario {
	 private int id;
	    private String nome;
	    private String email;
	    private List<Evento> eventosConfirmados;

	    public Usuario(int id, String nome, String email) {
	        this.id = id;
	        this.nome = nome;
	        this.email = email;
	        this.eventosConfirmados = new ArrayList<>();
	    }

	    public void cadastrar() {
	        // Implementação do cadastro do usuário
	        System.out.println("Usuário cadastrado com sucesso:");
	        System.out.println("ID: " + id);
	        System.out.println("Nome: " + nome);
	        System.out.println("Email: " + email);
	    }

	    public List<Evento> consultarEventosCadastrados() {
	        return eventosConfirmados;
	    }

	    public void confirmarPresenca(Evento evento) {
	        eventosConfirmados.add(evento);
	        System.out.println("Presença confirmada para o evento: " + evento.getNome());
	    }

	    public void cancelarPresenca(Evento evento) {
	        eventosConfirmados.remove(evento);
	        System.out.println("Presença cancelada para o evento: " + evento.getNome());
	    }

}
