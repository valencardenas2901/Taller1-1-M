package calculadora;

 /* Valentina Cardenas Mercado*/

public class interfazGrafica extends javax.swing.JFrame {

    public interfazGrafica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        respuesta = new javax.swing.JTextField();
        num1 = new javax.swing.JTextField();
        num2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        suma = new javax.swing.JButton();
        multiplicacion = new javax.swing.JButton();
        division = new javax.swing.JButton();
        potencia = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        IVA = new javax.swing.JButton();
        raiz = new javax.swing.JButton();
        seno = new javax.swing.JButton();
        coseno = new javax.swing.JButton();
        tangente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        operacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 102, 255));

        jLabel1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CALCULADORA");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Por Valentina Cardenas");

        respuesta.setBackground(new java.awt.Color(204, 204, 255));
        respuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuestaActionPerformed(evt);
            }
        });

        num1.setBackground(new java.awt.Color(204, 204, 255));
        num1.setForeground(new java.awt.Color(51, 0, 204));
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        num2.setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(153, 0, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 51)));

        suma.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        suma.setText("+");
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });

        multiplicacion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        multiplicacion.setText("x");
        multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacionActionPerformed(evt);
            }
        });

        division.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        division.setText("<html><strong>&#247;</strong></html>");
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });

        potencia.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        potencia.setText("a^b");
        potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potenciaActionPerformed(evt);
            }
        });

        resta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        resta.setText("-");
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });

        IVA.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        IVA.setText("IVA");
        IVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IVAActionPerformed(evt);
            }
        });

        raiz.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        raiz.setText("<html><strong>&#8730;</strong></html>");
        raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizActionPerformed(evt);
            }
        });

        seno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        seno.setText("sin");
        seno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senoActionPerformed(evt);
            }
        });

        coseno.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        coseno.setText("cos");
        coseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosenoActionPerformed(evt);
            }
        });

        tangente.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        tangente.setText("tan");
        tangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tangenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(suma, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resta, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seno, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coseno, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tangente, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IVA, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(suma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addComponent(potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IVA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(raiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coseno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tangente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("=");

        operacion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        operacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        operacion.setText("+");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(166, 166, 166))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(operacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9)
                        .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11)
                        .addComponent(respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(operacion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void respuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respuestaActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
          operacion.setText("+");
    try{
    String x0= num1.getText();
    String y0= num2.getText();
    float x = Float.valueOf(x0);
    float y = Float.valueOf(y0);
    double suma=x+y;
    System.out.println(x+"+"+y+"="+suma);
    suma=Math.round(suma*100.0)/100.0;
    String s=Double.toString(suma);
    respuesta.setText(s);
        }
catch(Exception erroresprod){
    System.out.println("Se ha producido un error al entrar los datos: "+erroresprod);
    System.out.println("Vuelva a ingresar los datos");
}
     
    }//GEN-LAST:event_sumaActionPerformed

    private void multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacionActionPerformed
        operacion.setText("x");
    try{
    String x0= num1.getText();
    String y0= num2.getText();
    float x = Float.valueOf(x0);
    float y = Float.valueOf(y0);
    double multiplicacion=x*y;
    System.out.println(x+"*"+y+"="+multiplicacion);
    multiplicacion=Math.round(multiplicacion*100.0)/100.0;
    String s=Double.toString(multiplicacion);
    respuesta.setText(s);
        }
catch(Exception erroresprod){
    System.out.println("Se ha producido un error al entrar los datos: "+erroresprod);
    System.out.println("Vuelva a ingresar los datos");
}

    }//GEN-LAST:event_multiplicacionActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
    operacion.setText("<html><strong>&#247;</strong></html>");
    try{
    String x0= num1.getText();
    String y0= num2.getText();
    float x = Float.valueOf(x0);
    float y = Float.valueOf(y0);
    double division=x/y;
    System.out.println(x+"+"+y+"="+division);
    division=Math.round(division*100.0)/100.0;
    String s=Double.toString(division);
    respuesta.setText(s);
        }
catch(Exception erroresprod){
    System.out.println("Se ha producido un error al entrar los datos: "+erroresprod);
    System.out.println("Vuelva a ingresar los datos");
}

    }//GEN-LAST:event_divisionActionPerformed

    private void potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potenciaActionPerformed
    operacion.setText("a^b");
    try{
    String x0= num1.getText();
    String y0= num2.getText();
    float x = Float.valueOf(x0);
    float y = Float.valueOf(y0);
    double potencia=Math.pow(x,y);
    System.out.println(x+"+"+y+"="+potencia);
    potencia=Math.round(potencia*100.0)/100.0;
    String s=Double.toString(potencia);
    respuesta.setText(s);
        }
catch(Exception erroresprod){
    System.out.println("Se ha producido un error al entrar los datos: "+erroresprod);
    System.out.println("Vuelva a ingresar los datos");
}

    }//GEN-LAST:event_potenciaActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        operacion.setText("-");
    try{
    String x0= num1.getText();
    String y0= num2.getText();
    float x = Float.valueOf(x0);
    float y = Float.valueOf(y0);
    double resta=x-y;
    System.out.println(x+"+"+y+"="+resta);
    resta=Math.round(resta*100.0)/100.0;
    String s=Double.toString(resta);
    respuesta.setText(s);
        }
catch(Exception erroresprod){
    System.out.println("Se ha producido un error al entrar los datos: "+erroresprod);
    System.out.println("Vuelva a ingresar los datos");
}

    }//GEN-LAST:event_restaActionPerformed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num1ActionPerformed

    private void IVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IVAActionPerformed
        operacion.setText("IVA");
    try{
    String x0= num1.getText();
    String y0= num2.getText();
    float x = Float.valueOf(x0);
    float y = Float.valueOf(y0);
    double IVA=(x*y)/2;
    System.out.println(x+"+"+y+"="+IVA);
    IVA=Math.round(IVA*100.0)/100.0;
    String s=Double.toString(IVA);
    respuesta.setText(s);
        }
catch(Exception erroresprod){
    System.out.println("Se ha producido un error al entrar los datos: "+erroresprod);
    System.out.println("Vuelva a ingresar los datos");
}

    }//GEN-LAST:event_IVAActionPerformed

    private void raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizActionPerformed
    operacion.setText("<html><strong>&#8730;</strong></html>");
    try{
    String x0= num1.getText();
    String y0= num2.getText();
    float x = Float.valueOf(x0);
    float y = Float.valueOf(y0);
    double raiz=Math.pow(x,1.0/y);
    System.out.println(x+"+"+y+"="+raiz);
    String s=Double.toString(raiz);
    respuesta.setText(s);
        }
catch(Exception erroresprod){
    System.out.println("Se ha producido un error al entrar los datos: "+erroresprod);
    System.out.println("Vuelva a ingresar los datos");
}
    }//GEN-LAST:event_raizActionPerformed

    private void senoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senoActionPerformed
        operacion.setText("sin");
    try{
    String x0= num1.getText();
    String y0= num2.getText();
    float x = Float.valueOf(x0);
    float y = Float.valueOf(y0);
    double seno=Math.sin(x);
    System.out.println(x+"+"+y+"="+seno);
    seno=Math.round(seno*100.0)/100.0;
    String s=Double.toString(seno);
    respuesta.setText(s);
        }
catch(Exception erroresprod){
    System.out.println("Se ha producido un error al entrar los datos: "+erroresprod);
    System.out.println("Vuelva a ingresar los datos");
}
    }//GEN-LAST:event_senoActionPerformed

    private void cosenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosenoActionPerformed
    operacion.setText("cos");
    try{
    String x0= num1.getText();
    String y0= num2.getText();
    float x = Float.valueOf(x0);
    float y = Float.valueOf(y0);
    double coseno=Math.cos(x);
    System.out.println(x+"+"+y+"="+coseno);
    coseno=Math.round(coseno*100.0)/100.0;
    String s=Double.toString(coseno);
    respuesta.setText(s);
        }
catch(Exception erroresprod){
    System.out.println("Se ha producido un error al entrar los datos: "+erroresprod);
    System.out.println("Vuelva a ingresar los datos");
}
    }//GEN-LAST:event_cosenoActionPerformed

    private void tangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tangenteActionPerformed
    operacion.setText("tan");
    try{
    String x0= num1.getText();
    String y0= num2.getText();
    float x = Float.valueOf(x0);
    float y = Float.valueOf(y0);
    double tangente=Math.tan(x);
    System.out.println(x+"+"+y+"="+tangente);
    tangente=Math.round(tangente*100.0)/100.0;
    String s=Double.toString(tangente);
    respuesta.setText(s);
        }
catch(Exception erroresprod){
    System.out.println("Se ha producido un error al entrar los datos: "+erroresprod);
    System.out.println("Vuelva a ingresar los datos");
}
    }//GEN-LAST:event_tangenteActionPerformed

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
            java.util.logging.Logger.getLogger(interfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IVA;
    private javax.swing.JButton coseno;
    private javax.swing.JButton division;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton multiplicacion;
    private javax.swing.JTextField num1;
    private javax.swing.JTextField num2;
    private javax.swing.JLabel operacion;
    private javax.swing.JButton potencia;
    private javax.swing.JButton raiz;
    private javax.swing.JTextField respuesta;
    private javax.swing.JButton resta;
    private javax.swing.JButton seno;
    private javax.swing.JButton suma;
    private javax.swing.JButton tangente;
    // End of variables declaration//GEN-END:variables
}
