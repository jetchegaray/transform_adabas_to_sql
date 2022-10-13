/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JPanelInit.java
 *
 * Created on 02-nov-2010, 17:30:08
 */

package views;

import controllers.HandleViewTablesInFile;
import controllers.HandleComments;
import controllers.HandlePrefixesOracle;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import controllers.ParserXML;
import model.Group;
import model.TableAttunity;
import model.TableOracle;
import controllers.Transform;
import javax.swing.JFrame;
import model.ListForeignKeys;
import model.TableComments;

/**
 *
 * @author javimetal
 */
public class JPanelInit extends javax.swing.JPanel {

    private File pathXmlInputFile;
    private File pathSqlInputFile;

    /** Creates new form JPanelInit */
    public JPanelInit() {
        this.pathXmlInputFile = null;
        this.pathSqlInputFile = null;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldXml = new javax.swing.JTextField();
        jButtonExamineXml = new javax.swing.JButton();
        jButtonXml2Oracle = new javax.swing.JButton();
        jButtonXmlToAttunity = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSql = new javax.swing.JTextField();
        jButtonExamineSQL = new javax.swing.JButton();
        jButtonSql = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel1.setText("Seleccione fichero XML para la aplicación");

        jButtonExamineXml.setText("Examinar ...");
        jButtonExamineXml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExamineXmlActionPerformed(evt);
            }
        });

        jButtonXml2Oracle.setText("Transformación XML - ORACLE");
        jButtonXml2Oracle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXml2OracleActionPerformed(evt);
            }
        });

        jButtonXmlToAttunity.setText("Transformación XML - Attunity");
        jButtonXmlToAttunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXmlToAttunityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldXml, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExamineXml)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonXmlToAttunity, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonXml2Oracle, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldXml, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExamineXml, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonXml2Oracle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonXmlToAttunity, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel2.setText("Seleccione fichero SQL para la aplicación");

        jButtonExamineSQL.setText("Examinar ...");
        jButtonExamineSQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExamineSQLActionPerformed(evt);
            }
        });

        jButtonSql.setText("Transformación SQL");
        jButtonSql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSqlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextFieldSql, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonExamineSQL)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonSql, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSql, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExamineSQL, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addComponent(jButtonSql, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExamineXmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExamineXmlActionPerformed
        
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Archivos xml", "xml");
        JFileChooser fileChooser = new JFileChooser();

        fileChooser.setFileFilter(extensionFilter);
        fileChooser.setDialogTitle("Abrir archivo ...");

        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION){
            this.pathXmlInputFile = fileChooser.getSelectedFile();
            this.jTextFieldXml.setText(String.valueOf(this.pathXmlInputFile));
        }
    }//GEN-LAST:event_jButtonExamineXmlActionPerformed


    private void jButtonExamineSQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExamineSQLActionPerformed
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Archivos sql", "sql");
        JFileChooser fileChooser = new JFileChooser();

        fileChooser.setFileFilter(extensionFilter);
        fileChooser.setDialogTitle("Abrir archivo ...");

        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION){
            this.pathSqlInputFile = fileChooser.getSelectedFile();
            this.jTextFieldSql.setText(String.valueOf(this.pathSqlInputFile));
        }
    }//GEN-LAST:event_jButtonExamineSQLActionPerformed

    private void jButtonSqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSqlActionPerformed

   /*     JPanelEditTable panelEditTable = new JPanelEditTable(this.pathSqlInputFile);
        JFrame jFrameEditTable = new JFrame();
        jFrameEditTable.setTitle("Editor de Tablas");
        jFrameEditTable.getContentPane().add(panelEditTable);
   
        jFrameEditTable.pack();
        jFrameEditTable.setVisible(true);*/

        firePanelTables(null);
    }//GEN-LAST:event_jButtonSqlActionPerformed

    private void jButtonXmlToAttunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXmlToAttunityActionPerformed

        String path = this.pathXmlInputFile.getAbsolutePath().replace(".xml", "_Adabas.sql");
        String scriptDLL="";
        TableAttunity tableAttunity;
        List groups;
        Transform transform = new Transform();
        boolean isXmlFileToLoad = true;

        ParserXML parser = new ParserXML();
        parser.build(this.readFile(isXmlFileToLoad));

        tableAttunity = parser.getTable();
        groups = parser.getGroups();

        HandleComments hc = new HandleComments(tableAttunity,groups, this.pathXmlInputFile);
        HandlePrefixesOracle handlePrefix = new HandlePrefixesOracle(this.pathXmlInputFile);

        TableComments tableComments = hc.getTableComment();

        ListForeignKeys foreignKey = new ListForeignKeys(handlePrefix);
        foreignKey.LoadForeignKey(tableAttunity);

       //transformo la tabla atunitty
        tableAttunity =  (TableAttunity) transform.tableAttunity2Attunity(tableAttunity);
        tableAttunity.defineUniquePrimaryKeyAndFieldCompoused();
        //transformo los grupos
        groups =  transform.groupsAttunity2Attunity(groups,tableAttunity);
              
        tableComments = transform.commentsToAttunity(tableComments);

        Iterator itGroup = groups.iterator();
        while (itGroup.hasNext()){
            Group group = (Group)itGroup.next();
    //         if (!group.getName().contains("_AU_CNTL_USU")){
            group.setNameApp(tableAttunity.getNameApp());
            group.setToChoosePrimaryKey(tableAttunity.getPrimaryKey(),tableAttunity.getPrimaryKeyField());
            scriptDLL += group.saveSQL();
      //      }
        }

        foreignKey = transform.ListForeignKeyToAttunity(foreignKey,tableAttunity.getNameApp());
        foreignKey.setReferencesFieldsForAllFK(groups);

        //agrego la conversion del sql
        scriptDLL += tableAttunity.saveSQL();
        scriptDLL += foreignKey.saveSQL();

        scriptDLL += tableComments.saveSQL();

        Iterator itGroupsComments = hc.getGroupsComment().iterator();
        while (itGroupsComments.hasNext()){
            scriptDLL += ((TableComments)itGroupsComments.next()).saveSQL();
        }

        writeFile(scriptDLL,"_Adabas");

        DialogOnlyAccept dialog = new DialogOnlyAccept(null, true,"Transformación XML terminada satisfactoriamente");
        dialog.setVisible(true);
        dialog.dispose();
        this.pathSqlInputFile = new File(path);
        firePanelTables("attunity");
    }//GEN-LAST:event_jButtonXmlToAttunityActionPerformed

    private void jButtonXml2OracleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXml2OracleActionPerformed

        String scriptDLL="";
        TableAttunity tableAttunity;
        TableOracle tableOracle;
        List groups;
        Transform transform = new Transform();
        boolean isXmlFileToLoad = true;

        ParserXML parser = new ParserXML();
        parser.build(this.readFile(isXmlFileToLoad));

        tableAttunity = parser.getTable();
        groups = parser.getGroups();

        HandleComments hc = new HandleComments(tableAttunity,groups, this.pathXmlInputFile);
        HandlePrefixesOracle handlePrefix = new HandlePrefixesOracle(this.pathXmlInputFile);

        TableComments tableComments = hc.getTableComment();

        ListForeignKeys foreignKey = new ListForeignKeys(handlePrefix);
        foreignKey.LoadForeignKey(tableAttunity);

        //      transformo la tabla atunitty
        tableOracle =  (TableOracle) transform.tableAttunity2Oracle(tableAttunity,handlePrefix);
        tableOracle.defineUniquePrimaryKeyAndFieldCompoused();

        //transformo los grupos
        groups = transform.groupsAttunity2Oracle(groups,tableOracle);
        tableComments = transform.commentsToAttunity(tableComments);
        //se le pasa el prefijo de una porque no tengo manra de conseguirlo sino.


        Iterator itGroup = groups.iterator();
        while (itGroup.hasNext()){
            Group group = (Group)itGroup.next();
            //ignoro éste sufijo porque puede ser una tabla de loggin
            //       if (!group.getName().contains("_AU_CNTL_USU") || !group.isGroupEntry()){
            group.setNameApp(tableOracle.getNameApp());
            group.setToChoosePrimaryKey(tableOracle.getPrimaryKey(),tableOracle.getPrimaryKeyField());
            scriptDLL += group.saveSQL();
            //         }
        }

        //se terminan de setear las foreign despues de tosdas las trnasformaciones
        foreignKey = transform.ListForeignKeyToAttunity(foreignKey,handlePrefix.getPrefixTableOracle(tableAttunity.getNameApp()));
        foreignKey.setReferencesFieldsForAllFK(groups);

        //agrego la conversion del sql
        scriptDLL += tableOracle.saveSQL();
        scriptDLL += foreignKey.saveSQL();

        //comentarios tabla principal
        scriptDLL += tableComments.saveSQL();

        Iterator itGroupsComments = hc.getGroupsComment().iterator();
        while (itGroupsComments.hasNext()){
            scriptDLL += ((TableComments)itGroupsComments.next()).saveSQL();
        }

        writeFile(scriptDLL,"_Oracle");

        DialogOnlyAccept dialog = new DialogOnlyAccept(null, true,"Transformación XML terminada satisfactoriamente");
        dialog.setVisible(true);
        dialog.dispose();
        // lo levanto a mano por eso inicalizo el file sql
        this.pathSqlInputFile = new File(this.pathXmlInputFile.getAbsolutePath().replace(".xml", "_Oracle.sql"));
        firePanelTables("oracle");
}//GEN-LAST:event_jButtonXml2OracleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExamineSQL;
    private javax.swing.JButton jButtonExamineXml;
    private javax.swing.JButton jButtonSql;
    private javax.swing.JButton jButtonXml2Oracle;
    private javax.swing.JButton jButtonXmlToAttunity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldSql;
    private javax.swing.JTextField jTextFieldXml;
    // End of variables declaration//GEN-END:variables

   //depende del boolean lee xml o sql.
    public BufferedReader readFile(Boolean isReadXml){

        BufferedReader  buffReader = null;
        File loadFile = (isReadXml) ? this.pathXmlInputFile : this.pathSqlInputFile;

        try {
            buffReader = new BufferedReader(new FileReader(loadFile));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JPanelInit.class.getName()).log(Level.SEVERE, null, ex);
        }
        return buffReader;
    }


    
    public void writeFile(String scriptDDL,String concat){

        BufferedOutputStream SQLbufferStream = null;

        try {
            String path = this.pathXmlInputFile.getAbsolutePath().replace(".xml",concat+".sql");
            SQLbufferStream= new BufferedOutputStream(new FileOutputStream(path));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JPanelInit.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            SQLbufferStream.write(scriptDDL.getBytes());
            SQLbufferStream.flush();
            SQLbufferStream.close();
        } catch (IOException ex) {
            Logger.getLogger(JPanelInit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void firePanelTables(String type){
        HandleViewTablesInFile loadViewTables = new HandleViewTablesInFile(this.pathSqlInputFile);
        HandlePrefixesOracle handlePrefix = new HandlePrefixesOracle(this.pathSqlInputFile);

      /*if (type == null && this.pathSqlInputFile.getAbsolutePath().contains("oracle")){
            type = "oracle";
        }else if (type == null ){
            type = "attunity";
        }
        */
        JPanelTables  panelTables = new JPanelTables(null,loadViewTables,handlePrefix,"oracle");
        panelTables.setTitle("Editor de Tablas");
        panelTables.setLocation(120, 120);
        panelTables.setVisible(true);
        panelTables.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    
}
