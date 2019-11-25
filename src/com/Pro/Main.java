package com.Pro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    private JLabel lbl_msn, lbl_msn2, lbl_msn3, lbl_msn4, lbl_msn5, lbl_msn6, msn, msn2, msn3, msn4, msn5, msn6;
    private JTextField tf_id, tf_id2, tf_id3, tf_id4, tf_titulo, tf_director, tf_anio, tf_titulo2, tf_director2, tf_anio2;
    private JButton insertari, insertarf, eliminar, buscar, imprimiri, imprimirf, eliminari, eliminarf;
    private ArbolBinarioBusqueda arbolito = new ArbolBinarioBusqueda();

    public Main() {
        setTitle("Ventana Principal");
        setSize(950,230);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.gray);

        setLayout(new FlowLayout());

        lbl_msn = new JLabel("Insertar en el Inicio");
        tf_id = new JTextField(20);
        msn = new JLabel("Titulo");
        tf_titulo = new JTextField(20);
        msn2 = new JLabel("A�o de Estreno");
        tf_anio = new JTextField(4);


        lbl_msn2 = new JLabel("Insertar en el Final");
        tf_id2 = new JTextField(20);
        msn4 = new JLabel("Titulo");
        tf_titulo2 = new JTextField(20);
        msn5 = new JLabel("A�o de Estreno");
        tf_anio2 = new JTextField(4);
        msn6 = new JLabel("Director");
        tf_director2 = new JTextField(20);

        lbl_msn3 = new JLabel("Eliminar de la Posicion");
        tf_id3 = new JTextField(2);

        lbl_msn4 = new JLabel("Buscar el Valor");
        tf_id4 = new JTextField(2);

        lbl_msn5 = new JLabel("Imprimir Inicio-Fin");


        lbl_msn6 = new JLabel("Imprimir Fin-Inicio");


        insertari = new JButton("Insertar");
        insertari.addActionListener(this);

        insertarf = new JButton("Insertar");
        insertarf.addActionListener(this);

        eliminar = new JButton("Eliminar");
        eliminar.addActionListener(this);

        buscar = new JButton("Buscar");
        buscar.addActionListener(this);

        imprimiri = new JButton("::Imprimir::");
        imprimiri.addActionListener(this);


        add(lbl_msn);
        add(tf_id);
        add(msn);
        add(tf_titulo);
        add(msn2);
        add(tf_anio);
        add(insertari);
        add(msn4);
        add(tf_titulo2);
        add(msn6);
        add(tf_director2);
        add(msn5);
        add(tf_anio2);
        add(insertarf);
        add(lbl_msn3);
        add(tf_id3);
        add(eliminar);
        add(lbl_msn4);
        add(tf_id4);
        add(buscar);
        add(lbl_msn5);
        add(imprimiri);


        setLocationRelativeTo(null);


    }
    public static void main(String[] args) {
        Main vp = new Main();
        vp.setVisible(true);
      /*  ArbolBinarioBusqueda arbolito = new ArbolBinarioBusqueda();
        Empleado emp1 = new Empleado("joe", "jj", 18);
        Empleado emp2 = new Empleado("po", "ff", 10);
        Empleado emp3 = new Empleado("dsfa", "gtg", 27);
        Empleado emp4 = new Empleado("sd", "rr", 8);
        Empleado emp5 = new Empleado("dfg", "sdfsd", 15);
        Empleado emp6 = new Empleado("sddd", "ewwwe", 23);
        Empleado emp7 = new Empleado("dfggg", "sdd", 30);
        Empleado emp8 = new Empleado("gfth", "sdfggh", 7);
        arbolito.insertar(emp1);
        arbolito.insertar(emp2);
        arbolito.insertar(emp3);
        arbolito.insertar(emp4);
        arbolito.insertar(emp5);
        arbolito.insertar(emp6);
        arbolito.insertar(emp7);
        arbolito.insertar(emp8);

        arbolito.preOrden();
        /*System.out.println();
        arbolito.posOrden();
        System.out.println();
        arbolito.inOrden();
        System.out.println();
        System.out.println(arbolito.existe(emp1));*/
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
