// mejora del sistema
public class EventoController {

import model.Evento;
import model.Invitado;
import view.EventoView;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class EventoController {
    private EventoView view;
    private List<Evento> eventos;

    public EventoController(EventoView view) {
        this.view = view;
        this.eventos = new ArrayList<>();

        view.btnAgregarEvento.addActionListener(e -> agregarEvento());
        view.btnEliminarEvento.addActionListener(e -> eliminarEvento());
        view.btnAgregarInvitado.addActionListener(e -> agregarInvitado());

        view.listaEventos.addListSelectionListener(e -> mostrarInvitados());
    }

    private void agregarEvento() {
        String nombre = view.txtNombre.getText();
        String fecha = view.txtFecha.getText();

        if (nombre.isEmpty() || fecha.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete los campos");
            return;
        }

        Evento evento = new Evento(nombre, fecha);
        eventos.add(evento);
        view.modeloEventos.addElement(evento.toString());

        view.txtNombre.setText("");
        view.txtFecha.setText("");
    }

    private void eliminarEvento() {
        int index = view.listaEventos.getSelectedIndex();

        if (index >= 0) {
            eventos.remove(index);
            view.modeloEventos.remove(index);
            view.modeloInvitados.clear();
        }
    }

    private void agregarInvitado() {
        int index = view.listaEventos.getSelectedIndex();

        if (index < 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un evento");
            return;
        }

        String nombreInvitado = view.txtInvitado.getText();

        if (nombreInvitado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese nombre del invitado");
            return;
        }

        Invitado invitado = new Invitado(nombreInvitado);
        eventos.get(index).agregarInvitado(invitado);

        view.modeloInvitados.addElement(invitado.toString());
        view.txtInvitado.setText("");
    }

    private void mostrarInvitados() {
        int index = view.listaEventos.getSelectedIndex();

        if (index >= 0) {
            view.modeloInvitados.clear();
            for (Invitado inv : eventos.get(index).getInvitados()) {
                view.modeloInvitados.addElement(inv.toString());
            }
        }
    }
}