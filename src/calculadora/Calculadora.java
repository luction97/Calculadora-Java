package calculadora;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Toolkit;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;

//Autor: Lucas Siano.

public class Calculadora extends javax.swing.JFrame {

    
    
    
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");

    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/icono.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        botonModoOscuro = new javax.swing.JButton();
        botonMinimizar = new javax.swing.JLabel();
        botonCerrar1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botonPorcentaje = new javax.swing.JButton();
        botonNueve = new javax.swing.JButton();
        botonResultado = new javax.swing.JButton();
        botonMasYMenos = new javax.swing.JButton();
        botonDivision = new javax.swing.JButton();
        botonMultiplicacion = new javax.swing.JButton();
        botonMenos = new javax.swing.JButton();
        botonSiete = new javax.swing.JButton();
        botonOcho = new javax.swing.JButton();
        botonSeis = new javax.swing.JButton();
        botonCinco = new javax.swing.JButton();
        botonCuatro = new javax.swing.JButton();
        botonTres = new javax.swing.JButton();
        botonDos = new javax.swing.JButton();
        botonPunto = new javax.swing.JButton();
        botonUno = new javax.swing.JButton();
        botonCero = new javax.swing.JButton();
        botonMas = new javax.swing.JButton();
        botonC1 = new javax.swing.JButton();
        lucasSiano = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(231, 253, 251));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(55, 62, 71));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 230, 30));

        txtResultado.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(55, 62, 71));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 230, 50));

        botonModoOscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonDia.png"))); // NOI18N
        botonModoOscuro.setBorderPainted(false);
        botonModoOscuro.setContentAreaFilled(false);
        botonModoOscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModoOscuroActionPerformed(evt);
            }
        });
        jPanel1.add(botonModoOscuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 30, 17));

        botonMinimizar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonMinimizar.setForeground(new java.awt.Color(102, 204, 0));
        botonMinimizar.setText("  •");
        botonMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(botonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 30, 30));

        botonCerrar1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonCerrar1.setForeground(new java.awt.Color(255, 0, 51));
        botonCerrar1.setText("  •");
        botonCerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCerrar1MouseClicked(evt);
            }
        });
        jPanel1.add(botonCerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 130));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonPorcentaje.setBackground(new java.awt.Color(255, 255, 255));
        botonPorcentaje.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonPorcentaje.setForeground(new java.awt.Color(102, 102, 102));
        botonPorcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        botonPorcentaje.setText("%");
        botonPorcentaje.setBorder(null);
        botonPorcentaje.setBorderPainted(false);
        botonPorcentaje.setContentAreaFilled(false);
        botonPorcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonPorcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonPorcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPorcentajeActionPerformed(evt);
            }
        });
        jPanel2.add(botonPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 60, 60));

        botonNueve.setBackground(new java.awt.Color(255, 255, 255));
        botonNueve.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonNueve.setForeground(new java.awt.Color(102, 102, 102));
        botonNueve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        botonNueve.setText("9");
        botonNueve.setBorder(null);
        botonNueve.setBorderPainted(false);
        botonNueve.setContentAreaFilled(false);
        botonNueve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonNueve.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonNueve.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNueveActionPerformed(evt);
            }
        });
        jPanel2.add(botonNueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 60, 60));

        botonResultado.setBackground(new java.awt.Color(255, 255, 255));
        botonResultado.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonResultado.setForeground(new java.awt.Color(102, 102, 102));
        botonResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton3-igual.png"))); // NOI18N
        botonResultado.setText("=");
        botonResultado.setBorder(null);
        botonResultado.setBorderPainted(false);
        botonResultado.setContentAreaFilled(false);
        botonResultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonResultado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonResultado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonResultadoActionPerformed(evt);
            }
        });
        jPanel2.add(botonResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 60, 60));

        botonMasYMenos.setBackground(new java.awt.Color(255, 255, 255));
        botonMasYMenos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonMasYMenos.setForeground(new java.awt.Color(102, 102, 102));
        botonMasYMenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        botonMasYMenos.setText("<-");
        botonMasYMenos.setBorder(null);
        botonMasYMenos.setBorderPainted(false);
        botonMasYMenos.setContentAreaFilled(false);
        botonMasYMenos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonMasYMenos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonMasYMenos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonMasYMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMasYMenosActionPerformed(evt);
            }
        });
        jPanel2.add(botonMasYMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 60, 60));

        botonDivision.setBackground(new java.awt.Color(255, 255, 255));
        botonDivision.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonDivision.setForeground(new java.awt.Color(102, 102, 102));
        botonDivision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        botonDivision.setText("÷");
        botonDivision.setBorder(null);
        botonDivision.setBorderPainted(false);
        botonDivision.setContentAreaFilled(false);
        botonDivision.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonDivision.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonDivision.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDivisionActionPerformed(evt);
            }
        });
        jPanel2.add(botonDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 60, 60));

        botonMultiplicacion.setBackground(new java.awt.Color(255, 255, 255));
        botonMultiplicacion.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonMultiplicacion.setForeground(new java.awt.Color(102, 102, 102));
        botonMultiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        botonMultiplicacion.setText("x");
        botonMultiplicacion.setBorder(null);
        botonMultiplicacion.setBorderPainted(false);
        botonMultiplicacion.setContentAreaFilled(false);
        botonMultiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonMultiplicacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonMultiplicacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultiplicacionActionPerformed(evt);
            }
        });
        jPanel2.add(botonMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 60, 60));

        botonMenos.setBackground(new java.awt.Color(255, 255, 255));
        botonMenos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonMenos.setForeground(new java.awt.Color(102, 102, 102));
        botonMenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        botonMenos.setText("-");
        botonMenos.setBorder(null);
        botonMenos.setBorderPainted(false);
        botonMenos.setContentAreaFilled(false);
        botonMenos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonMenos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonMenos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenosActionPerformed(evt);
            }
        });
        jPanel2.add(botonMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 60, 60));

        botonSiete.setBackground(new java.awt.Color(255, 255, 255));
        botonSiete.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonSiete.setForeground(new java.awt.Color(102, 102, 102));
        botonSiete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        botonSiete.setText("7");
        botonSiete.setBorder(null);
        botonSiete.setBorderPainted(false);
        botonSiete.setContentAreaFilled(false);
        botonSiete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonSiete.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonSiete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSieteActionPerformed(evt);
            }
        });
        jPanel2.add(botonSiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 60, 60));

        botonOcho.setBackground(new java.awt.Color(255, 255, 255));
        botonOcho.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonOcho.setForeground(new java.awt.Color(102, 102, 102));
        botonOcho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        botonOcho.setText("8");
        botonOcho.setBorder(null);
        botonOcho.setBorderPainted(false);
        botonOcho.setContentAreaFilled(false);
        botonOcho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonOcho.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonOcho.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOchoActionPerformed(evt);
            }
        });
        jPanel2.add(botonOcho, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 60, 60));

        botonSeis.setBackground(new java.awt.Color(255, 255, 255));
        botonSeis.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonSeis.setForeground(new java.awt.Color(102, 102, 102));
        botonSeis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        botonSeis.setText("6");
        botonSeis.setBorder(null);
        botonSeis.setBorderPainted(false);
        botonSeis.setContentAreaFilled(false);
        botonSeis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonSeis.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonSeis.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeisActionPerformed(evt);
            }
        });
        jPanel2.add(botonSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 60, 60));

        botonCinco.setBackground(new java.awt.Color(255, 255, 255));
        botonCinco.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonCinco.setForeground(new java.awt.Color(102, 102, 102));
        botonCinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        botonCinco.setText("5");
        botonCinco.setBorder(null);
        botonCinco.setBorderPainted(false);
        botonCinco.setContentAreaFilled(false);
        botonCinco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCinco.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonCinco.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCincoActionPerformed(evt);
            }
        });
        jPanel2.add(botonCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 60, 60));

        botonCuatro.setBackground(new java.awt.Color(255, 255, 255));
        botonCuatro.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonCuatro.setForeground(new java.awt.Color(102, 102, 102));
        botonCuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        botonCuatro.setText("4");
        botonCuatro.setBorder(null);
        botonCuatro.setBorderPainted(false);
        botonCuatro.setContentAreaFilled(false);
        botonCuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCuatro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonCuatro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCuatroActionPerformed(evt);
            }
        });
        jPanel2.add(botonCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 60, 60));

        botonTres.setBackground(new java.awt.Color(255, 255, 255));
        botonTres.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonTres.setForeground(new java.awt.Color(102, 102, 102));
        botonTres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        botonTres.setText("3");
        botonTres.setBorder(null);
        botonTres.setBorderPainted(false);
        botonTres.setContentAreaFilled(false);
        botonTres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonTres.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonTres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTresActionPerformed(evt);
            }
        });
        jPanel2.add(botonTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 60, 60));

        botonDos.setBackground(new java.awt.Color(255, 255, 255));
        botonDos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonDos.setForeground(new java.awt.Color(102, 102, 102));
        botonDos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        botonDos.setText("2");
        botonDos.setBorder(null);
        botonDos.setBorderPainted(false);
        botonDos.setContentAreaFilled(false);
        botonDos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonDos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonDos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDosActionPerformed(evt);
            }
        });
        jPanel2.add(botonDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 60, 60));

        botonPunto.setBackground(new java.awt.Color(255, 255, 255));
        botonPunto.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        botonPunto.setForeground(new java.awt.Color(102, 102, 102));
        botonPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        botonPunto.setText("·");
        botonPunto.setBorder(null);
        botonPunto.setBorderPainted(false);
        botonPunto.setContentAreaFilled(false);
        botonPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonPunto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonPunto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });
        jPanel2.add(botonPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 60, 60));

        botonUno.setBackground(new java.awt.Color(255, 255, 255));
        botonUno.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonUno.setForeground(new java.awt.Color(102, 102, 102));
        botonUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        botonUno.setText("1");
        botonUno.setBorder(null);
        botonUno.setBorderPainted(false);
        botonUno.setContentAreaFilled(false);
        botonUno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonUno.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonUno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUnoActionPerformed(evt);
            }
        });
        jPanel2.add(botonUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 60, 60));

        botonCero.setBackground(new java.awt.Color(255, 255, 255));
        botonCero.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonCero.setForeground(new java.awt.Color(102, 102, 102));
        botonCero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        botonCero.setText("0");
        botonCero.setBorder(null);
        botonCero.setBorderPainted(false);
        botonCero.setContentAreaFilled(false);
        botonCero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCero.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonCero.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCeroActionPerformed(evt);
            }
        });
        jPanel2.add(botonCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 60, 60));

        botonMas.setBackground(new java.awt.Color(255, 255, 255));
        botonMas.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonMas.setForeground(new java.awt.Color(102, 102, 102));
        botonMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        botonMas.setText("+");
        botonMas.setBorder(null);
        botonMas.setBorderPainted(false);
        botonMas.setContentAreaFilled(false);
        botonMas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonMas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonMas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMasActionPerformed(evt);
            }
        });
        jPanel2.add(botonMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 60, 60));

        botonC1.setBackground(new java.awt.Color(255, 255, 255));
        botonC1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonC1.setForeground(new java.awt.Color(102, 102, 102));
        botonC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        botonC1.setText("C");
        botonC1.setBorder(null);
        botonC1.setBorderPainted(false);
        botonC1.setContentAreaFilled(false);
        botonC1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonC1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonC1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1 presionado.png"))); // NOI18N
        botonC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonC1ActionPerformed(evt);
            }
        });
        jPanel2.add(botonC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 60));

        lucasSiano.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lucasSiano.setText("Lucas Siano");
        jPanel2.add(lucasSiano, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 70, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 125, 290, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDivisionActionPerformed
        addNumber("÷");

    }//GEN-LAST:event_botonDivisionActionPerformed

    private void botonMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMultiplicacionActionPerformed
        addNumber("*");

    }//GEN-LAST:event_botonMultiplicacionActionPerformed

    private void botonSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSieteActionPerformed
        addNumber("7");
//        botonResultado.doClick();
    }//GEN-LAST:event_botonSieteActionPerformed

    private void botonUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUnoActionPerformed
        addNumber("1");
//        botonResultado.doClick();
    }//GEN-LAST:event_botonUnoActionPerformed

    private void botonDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDosActionPerformed
        addNumber("2");
//        botonResultado.doClick();
    }//GEN-LAST:event_botonDosActionPerformed

    private void botonTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTresActionPerformed
        addNumber("3");
//        botonResultado.doClick();
    }//GEN-LAST:event_botonTresActionPerformed

    private void botonCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCuatroActionPerformed
        addNumber("4");
//        botonResultado.doClick();
    }//GEN-LAST:event_botonCuatroActionPerformed

    private void botonCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCincoActionPerformed
        addNumber("5");
//        botonResultado.doClick();
    }//GEN-LAST:event_botonCincoActionPerformed

    private void botonSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeisActionPerformed
        addNumber("6");
//        botonResultado.doClick();
    }//GEN-LAST:event_botonSeisActionPerformed

    private void botonOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOchoActionPerformed
        addNumber("8");
//        botonResultado.doClick();
    }//GEN-LAST:event_botonOchoActionPerformed

    private void botonNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNueveActionPerformed
        addNumber("9");
//        botonResultado.doClick();
    }//GEN-LAST:event_botonNueveActionPerformed

    private void botonMasYMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMasYMenosActionPerformed
        String texto = txtOperacion.getText().substring(0, txtOperacion.getText().length() - 1);
        txtOperacion.setText(texto);
//        botonResultado.doClick();
    }//GEN-LAST:event_botonMasYMenosActionPerformed

    private void botonPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPorcentajeActionPerformed
        addNumber("%");

    }//GEN-LAST:event_botonPorcentajeActionPerformed

    private void botonMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenosActionPerformed
        addNumber("-");

    }//GEN-LAST:event_botonMenosActionPerformed

    private void botonMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMasActionPerformed
        addNumber("+");

    }//GEN-LAST:event_botonMasActionPerformed

    private void botonResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonResultadoActionPerformed

        try {
            String resultado = se.eval(txtOperacion.getText()).toString();
            txtResultado.setText(resultado);
        } catch (Exception e) {

//            botonResultado.doClick();

        }


    }//GEN-LAST:event_botonResultadoActionPerformed

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
        addNumber(".");

    }//GEN-LAST:event_botonPuntoActionPerformed

    private void botonCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCeroActionPerformed
        addNumber("0");

    }//GEN-LAST:event_botonCeroActionPerformed

    boolean modoOscuro = false;
    private void botonC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonC1ActionPerformed
      txtOperacion.setText("");
      txtResultado.setText("");
    }//GEN-LAST:event_botonC1ActionPerformed

    private void botonMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMinimizarMouseClicked
       this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_botonMinimizarMouseClicked

    private void botonCerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrar1MouseClicked
        this.dispose();
    }//GEN-LAST:event_botonCerrar1MouseClicked

    private void botonModoOscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModoOscuroActionPerformed

        if(!modoOscuro){
            jPanel1.setBackground(Color.decode("#212b41"));
            jPanel2.setBackground(Color.decode("#2e3951"));
            txtOperacion.setForeground(Color.decode("#18d4a3"));
            txtResultado.setForeground(Color.decode("#0db387"));

            cambiarColorBoton1(botonMultiplicacion);
            cambiarColorBoton1(botonC1);
            cambiarColorBoton1(botonMas);
            cambiarColorBoton1(botonMenos);
            cambiarColorBoton1(botonMas);
            cambiarColorBoton1(botonDivision);
            cambiarColorBoton1(botonPorcentaje);
            cambiarColorBoton1(botonMasYMenos);

            cambiarColorBoton2(botonCero);
            cambiarColorBoton2(botonUno);
            cambiarColorBoton2(botonDos);
            cambiarColorBoton2(botonTres);
            cambiarColorBoton2(botonCuatro);
            cambiarColorBoton2(botonCinco);
            cambiarColorBoton2(botonSeis);
            cambiarColorBoton2(botonSiete);
            cambiarColorBoton2(botonOcho);
            cambiarColorBoton2(botonNueve);
            cambiarColorBoton2(botonPunto);

            
//            Boton modo oscuro
            botonModoOscuro.setIcon(new ImageIcon(getClass().getResource("/imagenes/botonNoche.png")));
            //        Boton de igual
            botonResultado.setIcon(new ImageIcon(getClass().getResource("/imagenes/boton3-igual-oscuro.png")));
            botonResultado.setForeground(Color.decode("#212b41"));
            botonResultado.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/boton1-nocturno-presionado.png")));
            botonResultado.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/boton1-nocturno.png")));

            modoOscuro = true;
        } else{

            Calculadora frame = new Calculadora();
            this.dispose();
            frame.setVisible(true);
        }

    }//GEN-LAST:event_botonModoOscuroActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    public void cambiarColorBoton1(JButton boton) {
        boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/boton1-nocturno-presionado.png")));
        boton.setForeground(Color.decode("#0db387"));
        boton.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/boton1-nocturno-presionado.png")));
        boton.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/boton1-nocturno.png")));

    }

    public void cambiarColorBoton2(JButton boton) {

        boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/boton1-nocturno.png")));
        boton.setForeground(Color.decode("#96a8a0"));
        boton.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/boton1-nocturno-presionado.png")));
        boton.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/boton1-nocturno-presionado.png")));

    }

    public void addNumber(String digito) {

        txtOperacion.setText(txtOperacion.getText() + digito);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonC1;
    private javax.swing.JButton botonCero;
    private javax.swing.JLabel botonCerrar1;
    private javax.swing.JButton botonCinco;
    private javax.swing.JButton botonCuatro;
    private javax.swing.JButton botonDivision;
    private javax.swing.JButton botonDos;
    private javax.swing.JButton botonMas;
    private javax.swing.JButton botonMasYMenos;
    private javax.swing.JButton botonMenos;
    private javax.swing.JLabel botonMinimizar;
    private javax.swing.JButton botonModoOscuro;
    private javax.swing.JButton botonMultiplicacion;
    private javax.swing.JButton botonNueve;
    private javax.swing.JButton botonOcho;
    private javax.swing.JButton botonPorcentaje;
    private javax.swing.JButton botonPunto;
    private javax.swing.JButton botonResultado;
    private javax.swing.JButton botonSeis;
    private javax.swing.JButton botonSiete;
    private javax.swing.JButton botonTres;
    private javax.swing.JButton botonUno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lucasSiano;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
