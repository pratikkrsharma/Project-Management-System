import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author ASHOK KUMAR YADAV
 */
public class IntroPage extends javax.swing.JFrame {

    /**
     * Creates new form IntroPage
     */
    public IntroPage() {
        initComponents();
         Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
         GregorianCalendar cal =new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        
        date.setText(+day+"/"+(month+1)+"/"+year);
        int hour=cal.get(Calendar.AM_PM);
        int minute=cal.get(Calendar.MINUTE);
        int second=cal.get(Calendar.SECOND);
        time.setText(+hour+":"+minute+":"+second);
        }
    
    public void close()
    {
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        intropannel = new javax.swing.JPanel();
        project = new javax.swing.JLabel();
        management = new javax.swing.JLabel();
        system = new javax.swing.JLabel();
        PRASHANT = new javax.swing.JLabel();
        USN72 = new javax.swing.JLabel();
        PRATIK = new javax.swing.JLabel();
        USN2 = new javax.swing.JLabel();
        GUIDE = new javax.swing.JLabel();
        FAC1 = new javax.swing.JLabel();
        DESG1 = new javax.swing.JLabel();
        FAC2 = new javax.swing.JLabel();
        DESG2 = new javax.swing.JLabel();
        HOME = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        date_time = new javax.swing.JMenuBar();
        date = new javax.swing.JMenu();
        time = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(930, 540));

        intropannel.setMinimumSize(new java.awt.Dimension(940, 560));
        intropannel.setPreferredSize(new java.awt.Dimension(955, 580));
        intropannel.setLayout(null);

        project.setBackground(new java.awt.Color(255, 255, 255));
        project.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        project.setForeground(new java.awt.Color(255, 255, 255));
        project.setText("PROJECT");
        intropannel.add(project);
        project.setBounds(380, 120, 210, 64);

        management.setBackground(new java.awt.Color(255, 255, 255));
        management.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        management.setForeground(new java.awt.Color(255, 255, 255));
        management.setText("MANAGMENT");
        intropannel.add(management);
        management.setBounds(320, 170, 348, 64);

        system.setBackground(new java.awt.Color(255, 255, 255));
        system.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        system.setForeground(new java.awt.Color(255, 255, 255));
        system.setText("SYSTEM");
        intropannel.add(system);
        system.setBounds(390, 220, 219, 64);

        PRASHANT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PRASHANT.setForeground(new java.awt.Color(240, 240, 240));
        PRASHANT.setText("PRASHANT YADAV");
        PRASHANT.setMaximumSize(new java.awt.Dimension(100, 24));
        intropannel.add(PRASHANT);
        PRASHANT.setBounds(80, 400, 170, 15);

        USN72.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        USN72.setForeground(new java.awt.Color(240, 240, 240));
        USN72.setText("1SG15CS072");
        USN72.setMaximumSize(new java.awt.Dimension(100, 24));
        intropannel.add(USN72);
        USN72.setBounds(80, 420, 150, 15);

        PRATIK.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PRATIK.setForeground(new java.awt.Color(240, 240, 240));
        PRATIK.setText("PRATIK KUMAR SHARMA");
        PRATIK.setMaximumSize(new java.awt.Dimension(100, 24));
        intropannel.add(PRATIK);
        PRATIK.setBounds(80, 440, 200, 15);

        USN2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        USN2.setForeground(new java.awt.Color(240, 240, 240));
        USN2.setText("1SG15CS073");
        intropannel.add(USN2);
        USN2.setBounds(80, 460, 150, 15);

        GUIDE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GUIDE.setForeground(new java.awt.Color(240, 240, 240));
        GUIDE.setText("UNDER THE GUIDANCE OF :-");
        GUIDE.setMaximumSize(new java.awt.Dimension(100, 24));
        intropannel.add(GUIDE);
        GUIDE.setBounds(680, 370, 170, 15);

        FAC1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FAC1.setForeground(new java.awt.Color(255, 255, 255));
        FAC1.setText("Ms. VEENA K R");
        FAC1.setMaximumSize(new java.awt.Dimension(100, 24));
        intropannel.add(FAC1);
        FAC1.setBounds(680, 390, 170, 15);

        DESG1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DESG1.setForeground(new java.awt.Color(240, 240, 240));
        DESG1.setText("ASSISTANT PROFESSOR");
        DESG1.setMaximumSize(new java.awt.Dimension(100, 24));
        intropannel.add(DESG1);
        DESG1.setBounds(680, 410, 150, 15);

        FAC2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FAC2.setForeground(new java.awt.Color(240, 240, 240));
        FAC2.setText("Ms. SHILPA M");
        FAC2.setMaximumSize(new java.awt.Dimension(100, 24));
        intropannel.add(FAC2);
        FAC2.setBounds(680, 430, 200, 15);

        DESG2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DESG2.setForeground(new java.awt.Color(240, 240, 240));
        DESG2.setText("ASSISTANT PROFESSOR");
        intropannel.add(DESG2);
        DESG2.setBounds(680, 450, 150, 15);

        HOME.setBackground(new java.awt.Color(51, 51, 51));
        HOME.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        HOME.setForeground(new java.awt.Color(255, 255, 255));
        HOME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/home.png"))); // NOI18N
        HOME.setText("HOME");
        HOME.setToolTipText("");
        HOME.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        HOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOMEActionPerformed(evt);
            }
        });
        intropannel.add(HOME);
        HOME.setBounds(345, 450, 102, 25);

        EXIT.setBackground(new java.awt.Color(51, 51, 51));
        EXIT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EXIT.setForeground(new java.awt.Color(255, 255, 255));
        EXIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/stand-by (1).png"))); // NOI18N
        EXIT.setText("EXIT");
        EXIT.setPreferredSize(null);
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });
        intropannel.add(EXIT);
        EXIT.setBounds(506, 450, 99, 25);

        background.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/6815730-warframe-lotus-wallpaper.png"))); // NOI18N
        background.setText("jLabel1");
        background.setMaximumSize(new java.awt.Dimension(32767, 32767));
        background.setMinimumSize(new java.awt.Dimension(980, 580));
        background.setPreferredSize(new java.awt.Dimension(955, 540));
        intropannel.add(background);
        background.setBounds(0, 0, 1020, 540);

        date.setText("Date");
        date_time.add(date);

        time.setText("Time");
        date_time.add(time);

        setJMenuBar(date_time);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(intropannel, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(intropannel, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOMEActionPerformed
     close();
        new Home().setVisible(true);
    }//GEN-LAST:event_HOMEActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        System.exit(0);
    }//GEN-LAST:event_EXITActionPerformed

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
            java.util.logging.Logger.getLogger(IntroPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntroPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntroPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntroPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntroPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DESG1;
    private javax.swing.JLabel DESG2;
    private javax.swing.JButton EXIT;
    private javax.swing.JLabel FAC1;
    private javax.swing.JLabel FAC2;
    private javax.swing.JLabel GUIDE;
    private javax.swing.JButton HOME;
    private javax.swing.JLabel PRASHANT;
    private javax.swing.JLabel PRATIK;
    private javax.swing.JLabel USN2;
    private javax.swing.JLabel USN72;
    private javax.swing.JLabel background;
    private javax.swing.JMenu date;
    private javax.swing.JMenuBar date_time;
    private javax.swing.JPanel intropannel;
    private javax.swing.JLabel management;
    private javax.swing.JLabel project;
    private javax.swing.JLabel system;
    private javax.swing.JMenu time;
    // End of variables declaration//GEN-END:variables
}
