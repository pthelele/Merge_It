/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merge_it;

import Logic.logic.Merge_Files;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Merge_IT extends javax.swing.JFrame {
    
    ArrayList<String> filePath = new ArrayList<>();

    

    public Merge_IT(JButton btnBrowse) throws HeadlessException {
        this.btnBrowse = btnBrowse;
    }

    public Merge_IT(GraphicsConfiguration gc) {
        super(gc);
    }
    
    public Merge_IT() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBrowse = new javax.swing.JButton();
        mergeFiles = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBrowse.setText("Browse File");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        mergeFiles.setText("Merge Files");
        mergeFiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mergeFilesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(311, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBrowse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mergeFiles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnBrowse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(mergeFiles)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        Merge_Files merge = new Merge_Files();
        
        filePath.add(merge.filechooser());
        
        
        
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void mergeFilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mergeFilesActionPerformed
        
         Merge_Files merge = new Merge_Files();
        try{
            //Prepare input pdf file list as list of input stream.
            ArrayList<InputStream> inputPdfList = new ArrayList<InputStream>();
            for(int i = 0; i < filePath.size(); i++)
            {
                inputPdfList.add(new FileInputStream(filePath.get(i)));
            }


        //Prepare output stream for merged pdf file.
        JFileChooser fileLocation = new JFileChooser();
        fileLocation.showSaveDialog(this);
        String fileName;
        String saveFilePath = ".\\";
        OutputStream outputStream = new FileOutputStream(fileName = (!merge.filechooser().trim().isEmpty()) ? merge.filechooser() : ".\\MergeFile_1234.pdf");

        //call method to merge pdf files.
        merge.mergePdfFiles(inputPdfList, outputStream);  
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, "Error exception: " + e.getLocalizedMessage());
        }
    }//GEN-LAST:event_mergeFilesActionPerformed

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
            java.util.logging.Logger.getLogger(Merge_IT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Merge_IT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Merge_IT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Merge_IT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Merge_IT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton mergeFiles;
    // End of variables declaration//GEN-END:variables
}
