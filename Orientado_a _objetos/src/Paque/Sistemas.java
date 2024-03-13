package Paque;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Real.Usuario;

public class Sistemas {
	
	private List<Usuario> usuarios;
    private List<Evento> eventos;

    public void Sistema() {
        usuarios = new ArrayList<>();
        eventos = new ArrayList<>();
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void cadastrarEvento(Evento evento) {
        eventos.add(evento);
    }

    public List<Evento> consultarEventos() {
        return eventos;
    }

    public List<Evento> ordenarEventosPorProximidade() {
        return eventos.stream()
                .sorted(Comparator.comparingLong(evento -> Math.abs(LocalDateTime.now().until(evento.getHorario(), null))))
                .collect(Collectors.toList());
    }

    public List<Evento> informarEventosOcorrendoAgora() {
        LocalDateTime now = LocalDateTime.now();
        return eventos.stream()
                .filter(evento -> evento.getHorario().isBefore(now))
                .collect(Collectors.toList());
    }

    public List<Evento> informarEventosPassados() {
        LocalDateTime now = LocalDateTime.now();
        return eventos.stream()
                .filter(evento -> evento.getHorario().isBefore(now))
                .collect(Collectors.toList());
    }

    public void salvarEventosEmArquivo() {
        try (FileOutputStream fos = new FileOutputStream("events.data");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(eventos);
            System.out.println("Eventos salvos em arquivo 'events.data'");
        } catch (IOException e) {
            System.out.println("Erro ao salvar eventos em arquivo: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
	public void carregarEventosDoArquivo() {
        try (FileInputStream fis = new FileInputStream("events.data");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            eventos = (List<Evento>) ois.readObject();
            System.out.println("Eventos carregados do arquivo 'events.data'");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao carregar eventos do arquivo: " + e.getMessage());
        }
    }
}


