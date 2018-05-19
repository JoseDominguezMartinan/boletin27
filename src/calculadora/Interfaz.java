/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import Metodos.MetodosBotones;
import Metodos.MetodosCalculos;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author jose
 */
public class Interfaz extends javax.swing.JFrame {

    MetodosCalculos obxMetodosCalculos = new MetodosCalculos(); // obxeto metodos calculos para chamar aos metodos desta clase 
    MetodosBotones obxBotones = new MetodosBotones(); // obxeto metodosBotones para chamar aos metodos desta clase 
    private float numPrincipal = 0; //  numero almacenado en memoria para realizar las operaciones con lo que insertamos en pantalla 
    private float numDos = 0; // numero almacenado en pantalla para realizar las operaciones cuando tenemos un signo que predomina a otro en operaciones largas 
    private String operacion = ""; // variable que indica al boton igual que operacion tiene que realizar 
    private String operacionDos = ""; // variable que indica al boton igual que operacion tiene que realizar en primer lugar en caso de que haya operaciones que predominen a otras, como multiplicar o dividir 
    public static boolean imprimir = false; // variable que si es true marca que se imprima el numero de cero y si es false que se añada el numero al que ya esta en pantalla 
    public static boolean operaciones = false; // variable que si es true indica que hay operaciones por hacer y si es false que no 

    /**
     * Creates new form Intefaz
     */
    public Interfaz() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        pantalla.addKeyListener(new PresionarTecla()); // escuchador en la pantalla que es donde se encuentra el foco para poder meter los numeros, la pantalla no es editable para evitar la entrada de caracteres que no sen numericos 

    }

    /**
     * InnerClass para que ponga los numeros que se introducen por teclado , ya
     * que la pantalla esta en editable nno para que no se puedan meter letras
     * tecla 7
     */
    public class PresionarTecla extends KeyAdapter {

        /**
         * marcamos que al pulsar cada tecla que queramos llame al evento del
         * boton que se corresponderia en la interfaz grafica
         *
         * @param e
         */
        @Override
        public void keyPressed(KeyEvent e) {
            int codigoTecla = e.getKeyCode();
            switch (codigoTecla) {
                case KeyEvent.VK_0:
                    b0MouseClicked(null);
                    break;
                case KeyEvent.VK_1:
                    b1MouseClicked(null);
                    break;
                case KeyEvent.VK_2:
                    b2MouseClicked(null);
                    break;
                case KeyEvent.VK_3:
                    b3MouseClicked(null);
                    break;
                case KeyEvent.VK_4:
                    b4MouseClicked(null);
                    break;
                case KeyEvent.VK_5:
                    b5MouseClicked(null);
                    break;
                case KeyEvent.VK_6:
                    b6MouseClicked(null);
                    break;
                case KeyEvent.VK_7:
                    b7MouseClicked(null);
                    break;
                case KeyEvent.VK_8:
                    b8MouseClicked(null);
                    break;
                case KeyEvent.VK_9:
                    b9MouseClicked(null);
                    break;

                case KeyEvent.VK_NUMPAD0:
                    b0MouseClicked(null);
                    break;
                case KeyEvent.VK_NUMPAD1:
                    b1MouseClicked(null);
                    break;
                case KeyEvent.VK_NUMPAD2:
                    b2MouseClicked(null);
                    break;
                case KeyEvent.VK_NUMPAD3:
                    b3MouseClicked(null);
                    break;
                case KeyEvent.VK_NUMPAD4:
                    b4MouseClicked(null);
                    break;
                case KeyEvent.VK_NUMPAD5:
                    b5MouseClicked(null);
                    break;
                case KeyEvent.VK_NUMPAD6:
                    b6MouseClicked(null);
                    break;
                case KeyEvent.VK_NUMPAD7:
                    b7MouseClicked(null);
                    break;
                case KeyEvent.VK_NUMPAD8:
                    b8MouseClicked(null);
                    break;
                case KeyEvent.VK_NUMPAD9:
                    b9MouseClicked(null);
                case KeyEvent.VK_ADD:
                    bMasMouseClicked(null);
                    break;
                case KeyEvent.VK_ENTER:
                    bIgualMouseClicked(null);
                    break;
                case KeyEvent.VK_SUBTRACT:
                    bMenosMouseClicked(null);
                    break;
                case KeyEvent.VK_DELETE:
                    bAcMouseClicked(null);
                    break;
                case KeyEvent.VK_MULTIPLY:
                    bxMouseClicked(null);
                    break;
                case KeyEvent.VK_DIVIDE:
                    bDividirMouseClicked(null);
                    break;

            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pantalla = new javax.swing.JTextField();
        bAc = new javax.swing.JLabel();
        bMasmenos = new javax.swing.JLabel();
        bTantoporciento = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        bx = new javax.swing.JLabel();
        b0 = new javax.swing.JLabel();
        bDividir = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        b9 = new javax.swing.JLabel();
        b8 = new javax.swing.JLabel();
        b7 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        b4 = new javax.swing.JLabel();
        b5 = new javax.swing.JLabel();
        b6 = new javax.swing.JLabel();
        bMenos = new javax.swing.JLabel();
        bMas = new javax.swing.JLabel();
        bComa = new javax.swing.JLabel();
        bIgual = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        pantalla.setEditable(false);
        pantalla.setBackground(new java.awt.Color(0, 0, 0));
        pantalla.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        pantalla.setForeground(new java.awt.Color(255, 255, 255));
        pantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pantalla.setText("0");
        pantalla.setBorder(null);
        pantalla.setCaretColor(new java.awt.Color(255, 255, 255));

        bAc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonesCalculadora/c2.PNG"))); // NOI18N
        bAc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bAcMouseClicked(evt);
            }
        });

        bMasmenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonesCalculadora/+-.PNG"))); // NOI18N
        bMasmenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMasmenosMouseClicked(evt);
            }
        });

        bTantoporciento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonesCalculadora/%.PNG"))); // NOI18N
        bTantoporciento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bTantoporcientoMouseClicked(evt);
            }
        });

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonesCalculadora/1.PNG"))); // NOI18N
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
        });

        bx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonesCalculadora/x.PNG"))); // NOI18N
        bx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bxMouseClicked(evt);
            }
        });

        b0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonesCalculadora/0.PNG"))); // NOI18N
        b0.setToolTipText("");
        b0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b0MouseClicked(evt);
            }
        });

        bDividir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonesCalculadora/dividir.PNG"))); // NOI18N
        bDividir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bDividirMouseClicked(evt);
            }
        });

        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonesCalculadora/2.PNG"))); // NOI18N
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
        });

        b9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonesCalculadora/9.PNG"))); // NOI18N
        b9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b9MouseClicked(evt);
            }
        });

        b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonesCalculadora/8.PNG"))); // NOI18N
        b8.setText(" ");
        b8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b8MouseClicked(evt);
            }
        });

        b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonesCalculadora/7.PNG"))); // NOI18N
        b7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b7MouseClicked(evt);
            }
        });

        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonesCalculadora/3.PNG"))); // NOI18N
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b3MouseClicked(evt);
            }
        });

        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonesCalculadora/4.PNG"))); // NOI18N
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b4MouseClicked(evt);
            }
        });

        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonesCalculadora/5.PNG"))); // NOI18N
        b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b5MouseClicked(evt);
            }
        });

        b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonesCalculadora/6.PNG"))); // NOI18N
        b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b6MouseClicked(evt);
            }
        });

        bMenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonesCalculadora/-.PNG"))); // NOI18N
        bMenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMenosMouseClicked(evt);
            }
        });

        bMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonesCalculadora/+.PNG"))); // NOI18N
        bMas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMasMouseClicked(evt);
            }
        });

        bComa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonesCalculadora/,.PNG"))); // NOI18N
        bComa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bComaMouseClicked(evt);
            }
        });

        bIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonesCalculadora/=.PNG"))); // NOI18N
        bIgual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bIgualMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(bAc))
                            .addComponent(b7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bMasmenos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bTantoporciento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bDividir))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(b6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(b9)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bMenos)
                                    .addComponent(bx)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bMas))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b0)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bComa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bIgual))
                            .addComponent(b4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bMasmenos)
                            .addComponent(bTantoporciento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bDividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bAc, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(b8)
                        .addComponent(b7))
                    .addComponent(bx))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bMenos)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(b5)
                        .addComponent(b4)
                        .addComponent(b6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b3)
                    .addComponent(bMas)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(b2)
                        .addComponent(b1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b0)
                    .addComponent(bComa)
                    .addComponent(bIgual))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAcMouseClicked
        // TODO add your handling code here:
        numPrincipal = 0;
        pantalla.setText("0");
    }//GEN-LAST:event_bAcMouseClicked

    private void bMasmenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMasmenosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bMasmenosMouseClicked

    private void bTantoporcientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bTantoporcientoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bTantoporcientoMouseClicked

    private void bDividirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bDividirMouseClicked
        // TODO add your handling code here:
        if (numPrincipal == 0) {
            numPrincipal = Float.parseFloat(pantalla.getText());
            operaciones = true;
            imprimir = false;
            operacion = "entre";
        } else {
            if (operacion == "") {
                numPrincipal = obxBotones.pulsarIgual(operacion, numPrincipal, Float.parseFloat(pantalla.getText()));
                operacion = "entre";
                operaciones = true;
                imprimir = false;
            } else if (operacion == "entre") {
                numPrincipal = obxMetodosCalculos.dividir(numPrincipal, Float.parseFloat(pantalla.getText()));
                operacion = "entre";
                operaciones = true;
                imprimir = false;
            } else {

                numDos = Float.parseFloat(pantalla.getText());
                operacionDos = operacion;
                operacion = "entre";
                operaciones = true;
                imprimir = false;
            }
        }
    }//GEN-LAST:event_bDividirMouseClicked

    private void b7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b7MouseClicked
        // TODO add your handling code here:
        MetodosBotones.imprimirNumero("7", imprimir);


    }//GEN-LAST:event_b7MouseClicked

    private void b8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b8MouseClicked
        // TODO add your handling code here:
        MetodosBotones.imprimirNumero("8", imprimir);
    }//GEN-LAST:event_b8MouseClicked

    private void b9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b9MouseClicked
        // TODO add your handling code here:
        MetodosBotones.imprimirNumero("9", imprimir);
    }//GEN-LAST:event_b9MouseClicked

    private void bxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bxMouseClicked
        // TODO add your handling code here:
        if (numPrincipal == 0) {
            numPrincipal = Float.parseFloat(pantalla.getText());
            operaciones = true;
            imprimir = false;
            operacion = "por";
        } else {
            if (operacion == "") {
                numPrincipal = obxBotones.pulsarIgual(operacion, numPrincipal, Float.parseFloat(pantalla.getText()));
                operacion = "por";
                operaciones = true;
                imprimir = false;
            } else if (operacion == "por") {
                numPrincipal = obxMetodosCalculos.multiplicar(numPrincipal, Float.parseFloat(pantalla.getText()));
                operacion = "por";
                operaciones = true;
                imprimir = false;
            } else {

                numDos = Float.parseFloat(pantalla.getText());
                operacionDos = operacion;
                operacion = "por";
                operaciones = true;
                imprimir = false;
            }
        }
    }//GEN-LAST:event_bxMouseClicked

    private void b4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseClicked
        // TODO add your handling code here:
        MetodosBotones.imprimirNumero("4", imprimir);
    }//GEN-LAST:event_b4MouseClicked

    private void b6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MouseClicked
        // TODO add your handling code here:
        MetodosBotones.imprimirNumero("6", imprimir);
    }//GEN-LAST:event_b6MouseClicked

    private void b5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseClicked
        // TODO add your handling code here:
        MetodosBotones.imprimirNumero("5", imprimir);
    }//GEN-LAST:event_b5MouseClicked

    private void bMenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMenosMouseClicked
        // TODO add your handling code here:
        if (operaciones == false) {
            numPrincipal = Float.parseFloat(pantalla.getText());
            operaciones = true;
            imprimir = false;
            operacion = "menos";
        } else {
            if (operacion != "") { // si hay una operacion pendiente de realziarse se hace 
                numPrincipal = obxBotones.pulsarIgual(operacion, numPrincipal, Float.parseFloat(pantalla.getText()));
                operacion = "menos"; // cargamos en la variable operacion la operacion que queremos realizar para que sea realizada en el momento de pulsar igual 
                imprimir = false; // ponemos el valor false en la variable imprimir para que que el proximo numero que pongamos sea un numero nuevo 

            } else{// despues de la operacion pendiente se hace la operacion actual 
            numPrincipal = obxMetodosCalculos.restar(numPrincipal, Float.parseFloat(pantalla.getText())); // enviamos o numero que temos almacenado para facer a operacion , en caso de que sexa o primeiro numero da operacion sera cero 
            operacion = "menos"; // cargamos en la variable operacion la operacion que queremos realizar para que sea realizada en el momento de pulsar igual 
            imprimir = false; // ponemos el valor false en la variable imprimir para que que el proximo numero que pongamos sea un numero nuevo 
            }
        }
    }//GEN-LAST:event_bMenosMouseClicked

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        // TODO add your handling code here:
        MetodosBotones.imprimirNumero("1", imprimir);
    }//GEN-LAST:event_b1MouseClicked

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked
        // TODO add your handling code here:
        MetodosBotones.imprimirNumero("2", imprimir);
    }//GEN-LAST:event_b2MouseClicked

    private void b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseClicked
        // TODO add your handling code here:
        MetodosBotones.imprimirNumero("3", imprimir);
    }//GEN-LAST:event_b3MouseClicked

    private void bMasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMasMouseClicked
        // TODO add your handling code here:
         if (operaciones == false) {
            numPrincipal = Float.parseFloat(pantalla.getText());
            operaciones = true;
            imprimir = false;
            operacion = "mas";
        } else {
            if (operacion != "") { // si hay una operacion pendiente de realziarse se hace 
                numPrincipal = obxBotones.pulsarIgual(operacion, numPrincipal, Float.parseFloat(pantalla.getText()));
                operacion = "mas"; // cargamos en la variable operacion la operacion que queremos realizar para que sea realizada en el momento de pulsar igual 
                imprimir = false; // ponemos el valor false en la variable imprimir para que que el proximo numero que pongamos sea un numero nuevo 

            } else{// despues de la operacion pendiente se hace la operacion actual 
            numPrincipal = obxMetodosCalculos.sumar(numPrincipal, Float.parseFloat(pantalla.getText())); // enviamos o numero que temos almacenado para facer a operacion , en caso de que sexa o primeiro numero da operacion sera cero 
            operacion = "mas"; // cargamos en la variable operacion la operacion que queremos realizar para que sea realizada en el momento de pulsar igual 
            imprimir = false; // ponemos el valor false en la variable imprimir para que que el proximo numero que pongamos sea un numero nuevo 
            }
        }
    }//GEN-LAST:event_bMasMouseClicked

    private void b0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b0MouseClicked
        // TODO add your handling code here:
        MetodosBotones.imprimirNumero("0", imprimir);
    }//GEN-LAST:event_b0MouseClicked

    private void bComaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bComaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bComaMouseClicked

    private void bIgualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bIgualMouseClicked
        // TODO add your handling code here:
        if (operacionDos != "") {
            float resultado = obxBotones.pulsarIgual(operacion, numDos, Float.parseFloat(pantalla.getText()));
            numPrincipal = obxBotones.pulsarIgual(operacionDos, numPrincipal, resultado);
            pantalla.setText(String.valueOf(numPrincipal));
            operacionDos = "";
            numDos = 0;
            imprimir = false;
            operaciones = false;
            operacion = "";
        } else {
            float numeroIgual = obxBotones.pulsarIgual(operacion, numPrincipal, Float.parseFloat(pantalla.getText()));
            pantalla.setText(String.valueOf(numeroIgual));
            numPrincipal = numeroIgual;
            imprimir = false;
            operaciones = false;
            operacion = "";
        }

    }//GEN-LAST:event_bIgualMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b0;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b4;
    private javax.swing.JLabel b5;
    private javax.swing.JLabel b6;
    private javax.swing.JLabel b7;
    private javax.swing.JLabel b8;
    private javax.swing.JLabel b9;
    private javax.swing.JLabel bAc;
    private javax.swing.JLabel bComa;
    private javax.swing.JLabel bDividir;
    private javax.swing.JLabel bIgual;
    private javax.swing.JLabel bMas;
    private javax.swing.JLabel bMasmenos;
    private javax.swing.JLabel bMenos;
    private javax.swing.JLabel bTantoporciento;
    private javax.swing.JLabel bx;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField pantalla;
    // End of variables declaration//GEN-END:variables
}
