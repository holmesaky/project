
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class Test extends javax.swing.JFrame implements MouseListener {

    /**
     * Creates new form Test
     */
    public Test() {
        initComponents();
        addMouseListener(this);
        addMouseListener(mouse);
        addMouseMotionListener(mouse1);
//        g = jPanel2.getGraphics();
//        jPanel2.paintComponents(g);

    }

    // Graphics g;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        perform = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        Clear = new javax.swing.JButton();
        perform1 = new javax.swing.JButton();
        Clear1 = new javax.swing.JButton();
        BFS = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 102));
        jTextField3.setBorder(null);

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 102));
        jTextField4.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(308, Short.MAX_VALUE)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AI");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Line");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("ovill");

        perform.setBackground(new java.awt.Color(255, 255, 255));
        perform.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        perform.setForeground(new java.awt.Color(153, 0, 0));
        perform.setText("perfom");
        perform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                performActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setLabelFor(jTextField1);
        jLabel1.setText("Number of Node ");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setLabelFor(jTextField1);
        jLabel2.setText("Goal  Node");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        Clear.setBackground(new java.awt.Color(255, 255, 255));
        Clear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Clear.setForeground(new java.awt.Color(153, 0, 0));
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        perform1.setBackground(new java.awt.Color(102, 0, 0));
        perform1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        perform1.setForeground(new java.awt.Color(153, 0, 0));
        perform1.setText("Delet");
        perform1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perform1ActionPerformed(evt);
            }
        });

        Clear1.setBackground(new java.awt.Color(255, 255, 255));
        Clear1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Clear1.setForeground(new java.awt.Color(153, 0, 0));
        Clear1.setText("Solution");
        Clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear1ActionPerformed(evt);
            }
        });

        BFS.setBackground(new java.awt.Color(255, 255, 255));
        BFS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BFS.setForeground(new java.awt.Color(153, 0, 0));
        BFS.setText("BFS");
        BFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton2)
                        .addGap(583, 583, 583))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Clear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(perform, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BFS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Clear1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(perform1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(perform)
                    .addComponent(perform1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clear)
                    .addComponent(Clear1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BFS)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    boolean done = false;

    ArrayList<Linebetween> lb = new ArrayList<>();
    private void performActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_performActionPerformed
//        int s;
//        int e;
        int goal = 1;
        temp.clear();
        sol1.clear();
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);

        Graph1 g1 = new Graph1(arr.size() + 1);
        if (!arr.isEmpty() && !liner.isEmpty()) {
            add(g1);

            goal = perform(goal);

            g1.DFS(1, goal);
            done = true;
            show1(g1, arr);
            repaint();
            if (!temp.contains(goal)) {
 jTextField4.setText(jTextField4.getText()+ "   "+" Goal not found");
            }

           

        } else {
            JOptionPane.showMessageDialog(this, "Draw Node Or Line");
        }


    }//GEN-LAST:event_performActionPerformed

    public int perform(int goal) {
        boolean go = true;
        String str;
        while (go) {
            try {
                str = jTextField2.getText();
                goal = Integer.parseInt(str);
                break;

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Enter Goal Node");
                jTextField2.setText(JOptionPane.showInputDialog(this, null));

            }
        }
        return goal;

    }

    public void add(Graph1 g) {
        int s;
        int e;
        for (int i = 0; i < linep.size(); i++) {
            s = findstart(linep.get(i), arr);
            e = findend(liner.get(i), arr);
            if (s != 0 && e != 0) {
                g.addEdge(s, e);
                g.addEdge(e, s);
                Linebetween line = new Linebetween(s, e, liner.get(i));
                lb.add(line);

            }
        }

    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
     }//GEN-LAST:event_jTextField2KeyTyped

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        arr.clear();
        linep.clear();
        liner.clear();
        lb.clear();
        temp.clear();
        count = 0;
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        done = false;
        sol = false;
        sol1.clear();
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        repaint();

    }//GEN-LAST:event_ClearActionPerformed

    private void perform1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perform1ActionPerformed
        temp.clear();
        sol1.clear();
        if (!arr.isEmpty()) {

            arr.remove(arr.size() - 1);
            count--;
            repaint();
        }
        if (!liner.isEmpty() && !linep.isEmpty()) {
            linep.remove(linep.size() - 1);
            liner.remove(liner.size() - 1);
            repaint();
        }

    }//GEN-LAST:event_perform1ActionPerformed

    private void Clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear1ActionPerformed
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        Graph1 g = new Graph1((arr.size() + 1));
        add(g);
        int x;
        sol1.clear();
int tempgoal=perform(0);
        if (!temp.isEmpty()) {
            if(!temp.contains(tempgoal)){
               JOptionPane.showMessageDialog(this, "Goal not found"); 
            }
            else{
                    int goal = temp.get(temp.size() - 1);
            x = goal;
            sol1.add(x);

            while (x != 1) {

                x = g.adj[goal].getFirst();
                goal = x;
                sol1.add(x);
                  sol = true;
        done = false;
            }
            }
        

        } else {
            JOptionPane.showMessageDialog(this, "you should perfom first");
        }
      
        repaint();


    }//GEN-LAST:event_Clear1ActionPerformed

    private void BFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFSActionPerformed

        int goal = 1;
        temp.clear();
        sol1.clear();
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);

        Graph1 g1 = new Graph1(arr.size() + 1);
        if (!arr.isEmpty() && !liner.isEmpty()) {
            add(g1);

            goal = perform(goal);
            g1.BFS(1, goal);
            done = true;
            show1(g1, arr);
            repaint();
        } else {
            JOptionPane.showMessageDialog(this, "Draw Node Or Line");
        }
    }//GEN-LAST:event_BFSActionPerformed

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        //jPanel2.setBackground(Color.white);
    }//GEN-LAST:event_jPanel2MouseExited

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        //jPanel2.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jPanel2MouseEntered
    ArrayList<Integer> temp = new ArrayList<>();
    ArrayList<Integer> sol1 = new ArrayList<>();

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
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             Test t=   new Test();
             t.setVisible(true);
            
                
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BFS;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Clear1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton perform;
    private javax.swing.JButton perform1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent me) {
        int size = 0;
        try {
            String str = jTextField1.getText();
            size = Integer.parseInt(str);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Enter Number of Node");
        }

        if (count < size) {
            Graphics g = getGraphics();

            //g.fillOval(me.getX(), me.getY(), 30, 30);
            count++;

            point p = new point(me.getX(), me.getY(), count);
            arr.add(p);
            repaint();
        } else {
            repaint();
        }
    }

    private int findstart(Line l, ArrayList<point> arr) {
        boolean f;
        for (int i = 0; i < arr.size(); i++) {
            f = FindPoint(arr.get(i).x, arr.get(i).y, arr.get(i).x + 30, arr.get(i).y + 30, l.xs, l.ys);
            if (f == true) {
                return i + 1;
            }
        }
        return 0;
    }

    private int findend(Line l, ArrayList<point> arr) {
        boolean f;
        for (int i = 0; i < arr.size(); i++) {
            f = FindPoint(arr.get(i).x, arr.get(i).y, arr.get(i).x + 30, arr.get(i).y + 30, l.xe, l.ye);
            if (f == true) {
                return i + 1;
            }
        }
        return 0;
    }

    private void show1(Graph1 g1, ArrayList<point> arr) {
        for (int i = 0; i < arr.size(); i++) {
            jTextField3.setText(jTextField3.getText() + arr.get(i).str + ": " + g1.adj[arr.get(i).str] + "  ");

        }
        jTextField4.setText(temp.toString());

    }

    class point {

        int x;
        int y;
        int str;

        public point(int x, int y, int str) {
            this.x = x;
            this.y = y;
            this.str = str;
        }

    }
    ArrayList<point> arr = new ArrayList();
    ArrayList<Line> linep = new ArrayList();
    ArrayList<Line> liner = new ArrayList();
    int count;
    int xstar = 0;
    int xend = 0;
    int ystar = 0;
    int yend = 0;
    boolean sol = false;
    public MouseListener mouse = new MouseAdapter() {

        @Override
        public void mousePressed(MouseEvent e) {
            if (jRadioButton1.isSelected()) {
                Graphics g = getGraphics();
                xstar = xend = e.getX();
                ystar = yend = e.getY();
                Line l = new Line(xstar, ystar, xend, yend);
                linep.add(l);
                // g.drawLine(xstar, ystar, xend, yend);
                repaint();
            }

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if (jRadioButton1.isSelected()) {
                Graphics g = getGraphics();

                xend = e.getX();
                yend = e.getY();
                Line l = new Line(xstar, ystar, xend, yend);
                liner.add(l);
                repaint();
                // g.drawLine(xstar, ystar, xend, yend);
            }
        }

    };

    static boolean FindPoint(int x1, int y1, int x2, int y2, int x, int y) {
        if (x >= x1 && x <= x2 && y >= y1 && y <= y2) {
            return true;
        }
        return false;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        paintNode(g);
        paintLine(g);

        if (done == true) {
            printgreennode(g);
            greenline(g);
        }
        if (sol == true) {
            paintred(g);

        }

    }

    public void paintred(Graphics g) {
        ArrayList<Integer> arr1 = ret(arr);
        for (int i = 0; i < sol1.size(); i++) {
            if (arr1.contains(sol1.get(i))) {
                int index = arr1.indexOf(sol1.get(i));
                g.setColor(Color.red);
                g.fillRect(arr.get(index).x, arr.get(index).y, 30, 30);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }

            }
        }
        for (int i = 0; i < lb.size(); i++) {
            if (sol1.contains(lb.get(i).start) && sol1.contains(lb.get(i).end)) {
                Line l = lb.get(i).L;
                g.setColor(Color.red);
                g.drawLine(l.xs, l.ys, l.xe, l.ye);

            }
        }

    }

    public void greenline(Graphics g) {

        for (int i = 0; i < lb.size(); i++) {
            if (temp.contains(lb.get(i).start) && temp.contains(lb.get(i).end)) {
                Line l = lb.get(i).L;
                g.setColor(Color.green);
                g.drawLine(l.xs, l.ys, l.xe, l.ye);

            }
        }

    }

    public void printgreennode(Graphics g) {
        ArrayList<Integer> arr1 = ret(arr);
        for (int i = 0; i < temp.size(); i++) {
            if (arr1.contains(temp.get(i))) {
                int index = arr1.indexOf(temp.get(i));
                g.setColor(Color.green);
                g.fillRect(arr.get(index).x, arr.get(index).y, 30, 30);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }

    public ArrayList<Integer> ret(ArrayList<point> l) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < l.size(); i++) {
            arr.add(l.get(i).str);
        }
        return arr;
    }

    public class Linebetween {

        int start;
        int end;
        Line L;

        public Linebetween(int start, int end, Line L) {
            this.start = start;
            this.end = end;
            this.L = L;
        }

    }

    public void paintNode(Graphics g) {

        for (int i = 0; i < arr.size(); i++) {
            int x = arr.get(i).x;
            int y = arr.get(i).y;
            g.setColor(Color.blue);
            g.fillRect(x, y, 30, 30);
            g.setColor(Color.red);
            g.drawString("" + (arr.get(i).str), x, y);
        }
        g.setColor(Color.blue);

    }

    private void paintLine(Graphics g) {
        for (int i = 0; i < linep.size(); i++) {
            g.drawLine(linep.get(i).xs, linep.get(i).ys, linep.get(i).xe, linep.get(i).ye);

        }
        for (int i = 0; i < liner.size(); i++) {

            g.drawLine(liner.get(i).xs, liner.get(i).ys, liner.get(i).xe, liner.get(i).ye);

        }
    }

    public MouseMotionListener mouse1 = new MouseMotionAdapter() {
        @Override
        public void mouseDragged(MouseEvent e) {
            if (jRadioButton1.isSelected()) {
                Graphics g = getGraphics();

                xend = e.getX();
                yend = e.getY();
                repaint();
                g.drawLine(xstar, ystar, xend, yend);
            }
        }
    };

    class Line {

        int xs;
        int xe;
        int ys;
        int ye;

        public Line(int xs, int ys, int xe, int ye) {
            this.xs = xs;
            this.xe = xe;
            this.ys = ys;
            this.ye = ye;
        }

    }

    class Graph1 {

        int V;                              //number of nodes
        Queue<Integer> queue;
        LinkedList<Integer> adj[];              //adjacency list

        public Graph1(int v) {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; ++i) {
                adj[i] = new LinkedList();
            }
            queue = new LinkedList<Integer>();
        }

        void addEdge(int v, int w) {

            adj[v].add(w);
            System.out.println(v + " : " + w);//adding an edge to the adjacency list (edges are bidirectional in this example)
        }

        public LinkedList show(int i) {
            return adj[i];
        }

        boolean DFSUtil(int vertex, boolean nodes[], int g) {
            boolean f = false;
            nodes[vertex] = true;                         //mark the node as explored
            System.out.print(vertex + " ");
            temp.add(vertex);

            int a = 0;
            if (vertex == g) {
                return true;
            }
            for (int i = 0; i < adj[vertex].size(); i++) {
                a = adj[vertex].get(i);
                if (!nodes[a]) {
                    f = DFSUtil(a, nodes, g);
                    if (f == true) {
                        return true;
                    }
                }
            }
            return f;
        }

        boolean BFS(int n, int goal) {

            boolean nodes[] = new boolean[V];
            int a = 0;
            boolean f = false;
            nodes[n] = true;
            queue.add(n);
//            temp.add(n);
            while (queue.size() != 0) {

                if (n == goal) {
                    return true;

                }
                n = queue.poll();
                temp.add(n);
                System.out.print(n + " ");

                for (int i = 0; i < adj[n].size(); i++) {
                    a = adj[n].get(i);
                    if (!nodes[a]) {
                        nodes[a] = true;
                        queue.add(a);
                    }
                }
            }
            return false;
        }

        void DFS(int v, int g) {
            boolean already[] = new boolean[V];             //initialize a new boolean array to store the details of explored nodes
            DFSUtil(v, already, g);
        }

    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
}
