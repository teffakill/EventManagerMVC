// mejora 3
package view;

import javax.swing.*;

public class EventoView {
    public JFrame frame;
    public JTextField txtNombre, txtFecha, txtInvitado;
    public JButton btnAgregarEvento, btnEliminarEvento, btnAgregarInvitado;
    public DefaultListModel<String> modeloEventos;
    public JList<String> listaEventos;

    public DefaultListModel<String> modeloInvitados;
    public JList<String> listaInvitados;

    public EventoView() {
        // cambio REAL para que Git lo detecte
        frame = new JFrame("Gestión de Eventos v2");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lblNombre = new JLabel("Evento:");
        lblNombre.setBounds(20, 20, 100, 25);
        frame.add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(120, 20, 200, 25);
        frame.add(txtNombre);

        JLabel lblFecha = new JLabel("Fecha:");
        lblFecha.setBounds(20, 60, 100, 25);
        frame.add(lblFecha);

        txtFecha = new JTextField();
        txtFecha.setBounds(120, 60, 200, 25);
        frame.add(txtFecha);

        btnAgregarEvento = new JButton("Agregar Evento ✔");
        btnAgregarEvento.setBounds(20, 100, 150, 30);
        frame.add(btnAgregarEvento);

        btnEliminarEvento = new JButton("Eliminar Evento");
        btnEliminarEvento.setBounds(180, 100, 150, 30);
        frame.add(btnEliminarEvento);

        modeloEventos = new DefaultListModel<>();
        listaEventos = new JList<>(modeloEventos);
        JScrollPane scrollEventos = new JScrollPane(listaEventos);
        scrollEventos.setBounds(20, 150, 200, 150);
        frame.add(scrollEventos);

        // Invitados
        JLabel lblInvitado = new JLabel("Invitado:");
        lblInvitado.setBounds(250, 20, 100, 25);
        frame.add(lblInvitado);

        txtInvitado = new JTextField();
        txtInvitado.setBounds(320, 20, 150, 25);
        frame.add(txtInvitado);

        btnAgregarInvitado = new JButton("Agregar Invitado");
        btnAgregarInvitado.setBounds(250, 60, 200, 30);
        frame.add(btnAgregarInvitado);

        modeloInvitados = new DefaultListModel<>();
        listaInvitados = new JList<>(modeloInvitados);
        JScrollPane scrollInvitados = new JScrollPane(listaInvitados);
        scrollInvitados.setBounds(250, 150, 200, 150);
        frame.add(scrollInvitados);

        frame.setVisible(true);
    }
}