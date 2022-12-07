/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gate;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import org.w3c.dom.events.MouseEvent;

/**
 *
 * @author murad
 */
public class And extends javax.swing.JFrame implements MouseListener {

    double w1 = 0.3;
    double w2 = -0.1;
    DefaultTableModel model;

    public And() {
        initComponents();
        jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jTable1.getTableHeader().setOpaque(true);
        jTable1.getTableHeader().setBackground(new Color(227, 202, 165));
        jTable1.getTableHeader().setForeground(Color.BLACK);
        model = (DefaultTableModel) jTable1.getModel();

        jLabel3.add(jLabel2);
        jLabel3.add(jLabel4);
        jLabel3.add(jLabel5);
        jLabel3.add(jLabel6);
        jLabel3.add(jLabel7);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(173, 139, 115));

        jPanel2.setBackground(new java.awt.Color(255, 251, 233));

        jPanel3.setBackground(new java.awt.Color(255, 251, 233));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 139, 115)));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("AND");
        jLabel1.setToolTipText("");

        jPanel6.setBackground(new java.awt.Color(173, 139, 115));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 251, 233));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 139, 115)));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("OR");
        jLabel8.setToolTipText("");

        jPanel7.setBackground(new java.awt.Color(173, 139, 115));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(100, 47, 37));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "epcho", "X1", "X2", "Yd", "W1", "W2", "Ya", "Error", "W1", "W2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setSelectionBackground(new java.awt.Color(227, 202, 165));
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gate/Picture2.png"))); // NOI18N
        jLabel3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel3ComponentShown(evt);
            }
        });
        jLabel3.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jLabel3ComponentAdded(evt);
            }
        });
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 200));

        jLabel2.setText(" ");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 30, 40));

        jLabel4.setText(" ");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 30, 30));

        jLabel5.setText(" ");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 40, 30));

        jLabel6.setText(" ");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 50, 30));

        jLabel7.setText(" ");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 30, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 80, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        setcolor(jPanel3, new Color(191, 168, 151));
         setcolor(jPanel6, new Color(255,251,233));
        
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        resetcolor(jPanel3, new Color(255, 251, 233));
        setcolor(jPanel6, new Color(173, 139, 115));
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
remov();
        and();


    }//GEN-LAST:event_jPanel3MousePressed

    private void jLabel3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel3ComponentShown

    }//GEN-LAST:event_jLabel3ComponentShown

    private void jLabel3ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel3ComponentAdded

    }//GEN-LAST:event_jLabel3ComponentAdded

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
      setcolor(jPanel5, new Color(191, 168, 151));
       setcolor(jPanel7, new Color(255,251,233));
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        resetcolor(jPanel5, new Color(255, 251, 233));
         setcolor(jPanel7, new Color(173, 139, 115));
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        
        remov();
       try{
           o.start();
       }
       catch(Exception e){
           o=new or();
           o.start();
       }
        
    }//GEN-LAST:event_jPanel5MousePressed

   void remov(){
       int s=model.getRowCount();
      for (int i=0;i<s;i++){
          model.removeRow(0);
      }
   }
    
    boolean done = false;
    ArrayList<ArrayList> print = new ArrayList<>();

    public void and() {
       try{
           t.start();
       }
       catch(Exception e){
           System.out.println("");
           t=new test();
           t.start();
       }

    }

    boolean wait;

    test t = new test();

    class test extends Thread {

        @Override
        public void run() {

            int ya[] = new int[4];
            int epoch = 1;
            double alpha = 0.1;
            double theta = 0.2;
            double input;
            double wnew;
            double daltaw;
            int e;
            int x1[] = {0, 0, 1, 1};
            int x2[] = {0, 1, 0, 1};
            int yd[] = {0, 0, 0, 1};
            BigDecimal w11[] = new BigDecimal[2];
            double w[] = {w1, w2};
            ArrayList t;
            jLabel2.setText("" + x1[0]);
            jLabel4.setText("" + x2[0]);
            jLabel5.setText("" + w[0]);
            jLabel6.setText("" + w[1]);
            while (epoch < 6) {
                System.out.println("   X1   X2   Yd   W1   W2   Ya   E   w1   w2");

                for (int i = 0; i < x1.length; i++) {

                    input = (x1[i] * w[0] + x2[i] * w[1]) - theta;
                    ya[i] = step(input);
                    e = error(yd[i], ya[i]);
                    if (e != 0) {
                        w[0] = newweight(x1[i], e, alpha, w[0]);
                        w[1] = newweight(x2[i], e, alpha, w[1]);

                    }
                    t = new ArrayList<>();
                    t.add(w[0]);
                    t.add(w[1]);
                    t.add(ya[i]);
//                    print.add(t);
//                done = true;
                    Object[] o = {epoch, x1[i], x2[i], yd[i], w[0], w[1], ya[i], e, w[0], w[1]};
                    model.insertRow(model.getRowCount(), o);

                    try {
                        jLabel2.setText("" + x1[i]);
                        jLabel4.setText("" + x2[i]);
                        jLabel5.setText("" + w[0]);
                        jLabel6.setText("" + w[1]);
                        jLabel7.setText("" + ya[i]);
                        Thread.sleep(1000);

                    } catch (InterruptedException ex) {
                        Logger.getLogger(And.class.getName()).log(Level.SEVERE, null, ex);
                    }
//                repaint();
//      print.clear();
                    System.out.println(epoch + "  " + x1[i] + "   " + x2[i] + "   " + yd[i] + "   " + w[0] + "   " + w[1] + "   " + ya[i] + "   " + e + "   " + w[0] + "  " + w[1]);
                }

                System.out.println("---------------------------------------------------");

                epoch++;
            }

        }
    }
or o=new or();
    
    class or extends Thread {

        @Override
        public void run() {

            int ya[] = new int[4];
            int epoch = 1;
            double alpha = 0.1;
            double theta = 0.2;
            double input;
            double wnew;
            double daltaw;
            int e;
            int x1[] = {0, 0, 1, 1};
            int x2[] = {0, 1, 0, 1};
            int yd[] = {0, 1, 1, 1};
            BigDecimal w11[] = new BigDecimal[2];
            double w[] = {w1, w2};
            ArrayList t;
            jLabel2.setText("" + x1[0]);
            jLabel4.setText("" + x2[0]);
            jLabel5.setText("" + w[0]);
            jLabel6.setText("" + w[1]);
            while (epoch < 6) {
                System.out.println("   X1   X2   Yd   W1   W2   Ya   E   w1   w2");

                for (int i = 0; i < x1.length; i++) {

                    input = (x1[i] * w[0] + x2[i] * w[1]) - theta;
                    ya[i] = step(input);
                    e = error(yd[i], ya[i]);
                    if (e != 0) {
                        w[0] = newweight(x1[i], e, alpha, w[0]);
                        w[1] = newweight(x2[i], e, alpha, w[1]);

                    }
                    t = new ArrayList<>();
                    t.add(w[0]);
                    t.add(w[1]);
                    t.add(ya[i]);
//                    print.add(t);
//                done = true;
                    Object[] o = {epoch, x1[i], x2[i], yd[i], w[0], w[1], ya[i], e, w[0], w[1]};
                    model.insertRow(model.getRowCount(), o);
                   

                    try {
                        jLabel2.setText("" + x1[i]);
                        jLabel4.setText("" + x2[i]);
                        jLabel5.setText("" + w[0]);
                        jLabel6.setText("" + w[1]);
                        jLabel7.setText("" + ya[i]);
                        Thread.sleep(1000);

                    } catch (InterruptedException ex) {
                        Logger.getLogger(And.class.getName()).log(Level.SEVERE, null, ex);
                    }
//                repaint();
//      print.clear();
                    System.out.println(epoch + "  " + x1[i] + "   " + x2[i] + "   " + yd[i] + "   " + w[0] + "   " + w[1] + "   " + ya[i] + "   " + e + "   " + w[0] + "  " + w[1]);
                }

                System.out.println("---------------------------------------------------");

                epoch++;
            }

        }
    }
    
    
    
    
    
    
    class input {

        double w;
        int x[];

        public input(double w, int x[]) {
            this.w = w;
            this.x = x;
        }

        public double getW() {
            return w;
        }

        public void setW(double w) {
            this.w = w;
        }

    }

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
            java.util.logging.Logger.getLogger(And.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(And.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(And.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(And.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new And().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void setcolor(JPanel jPanel3, Color color) {
        jPanel3.setBackground(color);
    }

    private void resetcolor(JPanel jPanel3, Color color) {
        jPanel3.setBackground(color);
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent me) {

    }
    ArrayList<ArrayList<Integer>> arr = new ArrayList();

    @Override
    public void mousePressed(java.awt.event.MouseEvent me) {
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent me) {
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent me) {
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent me) {
    }

    private static int step(double input) {

        if (input >= 0) {
            return 1;
        }
        return 0;

    }

    private static int error(int yd, int ya) {
        return yd - ya;
    }

    private static double newweight(int x1, int e, double alpha, double w) {
        BigDecimal w11[] = new BigDecimal[1];
        double result;
        double dalta = alpha * x1 * e;
        result = w + dalta;
        w11[0] = new BigDecimal(result, new MathContext(1,
                RoundingMode.HALF_UP));

        return result = new Double("" + w11[0]);
    }

}
