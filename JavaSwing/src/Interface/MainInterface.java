
package Interface;

import bigproject.Directory;
import bigproject.WordGroup;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MainInterface extends javax.swing.JFrame {

  
    public MainInterface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tabPane = new javax.swing.JTabbedPane();
        traTu = new javax.swing.JPanel();
        chooseDictionary = new javax.swing.JComboBox<>();
        searchText = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        hocTu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tBrowseWordGroup = new javax.swing.JTable();
        listLabel = new javax.swing.JLabel();
        addGroup = new javax.swing.JButton();
        editGroup = new javax.swing.JButton();
        deleteGroup = new javax.swing.JButton();
        startLearn = new javax.swing.JButton();
        bMerge = new javax.swing.JButton();
        bRefresh = new javax.swing.JButton();
        bRename = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        switchUser = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        guide = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ELREVIS");
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(240, 240));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/2017-09-30 08.07.jpg"))); // NOI18N

        tabPane.setForeground(new java.awt.Color(0, 102, 102));
        tabPane.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        tabPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabPaneStateChanged(evt);
            }
        });

        chooseDictionary.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Từ điển có sẵn", "Từ điển trong Bộ Từ" }));

        searchText.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        searchText.setText("Nhập Từ Tìm Kiếm");
        searchText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTextMouseClicked(evt);
            }
        });
        searchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextKeyReleased(evt);
            }
        });

        search.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Untitled.png"))); // NOI18N
        search.setText("Tìm kiếm");
        search.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        image.setForeground(new java.awt.Color(204, 204, 204));
        image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        image.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jLabel4.setText("Nghĩa");

        javax.swing.GroupLayout traTuLayout = new javax.swing.GroupLayout(traTu);
        traTu.setLayout(traTuLayout);
        traTuLayout.setHorizontalGroup(
            traTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(traTuLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(traTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(traTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(traTuLayout.createSequentialGroup()
                        .addComponent(chooseDictionary, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(traTuLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75))
        );
        traTuLayout.setVerticalGroup(
            traTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(traTuLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(traTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseDictionary, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(traTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(traTuLayout.createSequentialGroup()
                        .addGroup(traTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        tabPane.addTab("Tra Từ Vựng             ", traTu);

        tBrowseWordGroup.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Tên Bộ Từ", "Số Từ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tBrowseWordGroup);
        if (tBrowseWordGroup.getColumnModel().getColumnCount() > 0) {
            tBrowseWordGroup.getColumnModel().getColumn(0).setHeaderValue("Tên Bộ Từ");
            tBrowseWordGroup.getColumnModel().getColumn(1).setHeaderValue("Số Từ");
        }

        listLabel.setText("Các Bộ Từ Vựng (Chủ đề) của Bạn");

        addGroup.setText("Thêm Bộ Từ Vựng");
        addGroup.setToolTipText("Tạo ra một bộ từ trống");
        addGroup.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGroupActionPerformed(evt);
            }
        });

        editGroup.setText("Sửa Bộ Từ Vựng");
        editGroup.setToolTipText("Hãy chọn 1 bộ từ để sửa");
        editGroup.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editGroupActionPerformed(evt);
            }
        });

        deleteGroup.setText("Xóa 1 Bộ Từ Vựng");
        deleteGroup.setToolTipText("Chọn 1 bộ từ để xóa");
        deleteGroup.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteGroup.setBorderPainted(false);
        deleteGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteGroupActionPerformed(evt);
            }
        });

        startLearn.setText("Bắt Đầu Học");
        startLearn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        startLearn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startLearnActionPerformed(evt);
            }
        });

        bMerge.setText("Ghép 2 Bộ Từ Vựng");
        bMerge.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bMerge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMergeActionPerformed(evt);
            }
        });

        bRefresh.setText("Làm mới");
        bRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRefreshActionPerformed(evt);
            }
        });

        bRename.setText("Đổi tên");
        bRename.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bRename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRenameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hocTuLayout = new javax.swing.GroupLayout(hocTu);
        hocTu.setLayout(hocTuLayout);
        hocTuLayout.setHorizontalGroup(
            hocTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hocTuLayout.createSequentialGroup()
                .addGroup(hocTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hocTuLayout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(listLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hocTuLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(hocTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(hocTuLayout.createSequentialGroup()
                                .addComponent(startLearn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(bRefresh))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(hocTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bRename, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bMerge))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        hocTuLayout.setVerticalGroup(
            hocTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hocTuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(listLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(hocTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hocTuLayout.createSequentialGroup()
                        .addComponent(addGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(bRename, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bMerge, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(85, Short.MAX_VALUE))
                    .addGroup(hocTuLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(hocTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bRefresh)
                            .addComponent(startLearn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))))
        );

        tabPane.addTab("Học Từ Vựng                   ", hocTu);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        switchUser.setMnemonic('o');
        switchUser.setText("Switch User");
        switchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchUserActionPerformed(evt);
            }
        });
        fileMenu.add(switchUser);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        guide.setMnemonic('c');
        guide.setText("Guide");
        helpMenu.add(guide);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabPane)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void switchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchUserActionPerformed
        SwitchUser user= new SwitchUser();
        user.setVisible(true);
        user.setLocationRelativeTo(null);
        this.add(user);
    }//GEN-LAST:event_switchUserActionPerformed

    private void startLearnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startLearnActionPerformed
        LearnWord learn = new LearnWord();
        learn.setVisible(true);
        learn.setLocationRelativeTo(null);
        hocTu.add(learn);
    }//GEN-LAST:event_startLearnActionPerformed

    private void editGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editGroupActionPerformed
        EditGroup edit = new EditGroup(tBrowseWordGroup.getValueAt(tBrowseWordGroup.getSelectedRow(), 0).toString());
        edit.setVisible(true);
        edit.setLocationRelativeTo(null);
        hocTu.add(edit);
    }//GEN-LAST:event_editGroupActionPerformed

    private void deleteGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteGroupActionPerformed
        DefaultTableModel model = (DefaultTableModel) tBrowseWordGroup.getModel();
        
        int confirm = JOptionPane.showConfirmDialog(rootPane, "Bạn chắc muốn xóa không?");
        
        if(confirm == 0) {
            WordGroup.delete(new WordGroup(tBrowseWordGroup.getValueAt(tBrowseWordGroup.getSelectedRow(), 0).toString()));
            
            model.removeRow(tBrowseWordGroup.getSelectedRow());
            //model.fireTableDataChanged();
        }
        refreshTBrowseWordGroup();
    }//GEN-LAST:event_deleteGroupActionPerformed

    private void searchTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTextMouseClicked
        searchText.setText("");
    }//GEN-LAST:event_searchTextMouseClicked

    private void searchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextKeyReleased
        
    }//GEN-LAST:event_searchTextKeyReleased

    private void addGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGroupActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) tBrowseWordGroup.getModel();
        
        String wordGroupName = JOptionPane.showInputDialog(null, "Nhập tên cho Bộ Từ vựng mới", "Tên Bộ Từ",JOptionPane.QUESTION_MESSAGE);
        //System.out.println(wordGroupName);
        if(wordGroupName == null || wordGroupName.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Hãy nhập vào tên bộ từ!");
        }
        else if(WordGroup.isExists(wordGroupName)) {
            JOptionPane.showMessageDialog(rootPane, "Bộ từ đã tồn tại!");
        }
        else {
//            try {
                WordGroup.create(wordGroupName);
                WordGroup wg = new WordGroup(wordGroupName);
                Object[] detailOfWordGroup = new Object[2];
                detailOfWordGroup[0] = wg.name;
                detailOfWordGroup[1] = wg.sotu;
                model.addRow(detailOfWordGroup);
//            } catch (IOException ex) {
//                Logger.getLogger(MainInterface.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
        //WordGroup[] Test = Directory.dir();
        refreshTBrowseWordGroup();
    }//GEN-LAST:event_addGroupActionPerformed

    private void bRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRefreshActionPerformed
        DefaultTableModel model = (DefaultTableModel) tBrowseWordGroup.getModel();
        
        int initialRow = model.getRowCount();
        for(int i = initialRow - 1 ; i >= 0 ; i--) {
            model.removeRow(i);
        }
            WordGroup[] list = Directory.dir();
            for(int i=0;i<list.length;i++) {
                Object[] detail = new Object[2];
                detail[0] = list[i].name;
                detail[1] = list[i].getSoTu();
                model.addRow(detail);
            }
    }//GEN-LAST:event_bRefreshActionPerformed

    int stateOfMergeButton = 1;
    WordGroup sourceMergeWordGroup = null;
    private void bMergeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMergeActionPerformed
        DefaultTableModel model = (DefaultTableModel) tBrowseWordGroup.getModel();
        
        if(stateOfMergeButton == 1) {
            
            if(tBrowseWordGroup.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn 1 bộ từ trước");
            } else {
                sourceMergeWordGroup = new WordGroup(model.getValueAt(tBrowseWordGroup.getSelectedRow(), 0).toString());
                tBrowseWordGroup.setValueAt(sourceMergeWordGroup.name + " (gốc)", tBrowseWordGroup.getSelectedRow(), 0);
                stateOfMergeButton = 2;
                JOptionPane.showMessageDialog(rootPane, "Chọn 1 bộ từ khác và ấn 'Ghép 2 bộ từ' để ghép vào bộ gốc\nChọn lại chính bộ từ gốc và ấn 'Ghép 2 bộ từ' để hủy.");
            }
            
        } else if(stateOfMergeButton == 2) {
            
            if(tBrowseWordGroup.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn 1 bộ từ trước");
            } else {
                WordGroup combineWordGroup = new WordGroup(model.getValueAt(tBrowseWordGroup.getSelectedRow(), 0).toString());
                
                if(sourceMergeWordGroup.equals(combineWordGroup)) {
                    stateOfMergeButton = 1;
                    sourceMergeWordGroup = null;
                    combineWordGroup = null;
                } else {
                    sourceMergeWordGroup.merge(combineWordGroup);
                    stateOfMergeButton = 1;
                    sourceMergeWordGroup = null;
                    combineWordGroup = null;
                    refreshTBrowseWordGroup();
                }
            }
            
        }
    }//GEN-LAST:event_bMergeActionPerformed

    private void tabPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabPaneStateChanged
        refreshTBrowseWordGroup();
    }//GEN-LAST:event_tabPaneStateChanged

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        if(stateOfMergeButton != 2)
            refreshTBrowseWordGroup();
    }//GEN-LAST:event_formWindowGainedFocus

    private void bRenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRenameActionPerformed
        DefaultTableModel model = (DefaultTableModel) tBrowseWordGroup.getModel();
        
        if(tBrowseWordGroup.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 bộ từ để đổi tên");
        } else {
            WordGroup renameWordGroup = new WordGroup(model.getValueAt(tBrowseWordGroup.getSelectedRow(), 0).toString());
            
            String newName = JOptionPane.showInputDialog(null, "Nhập tên mới cho bộ từ", "Tên mới", JOptionPane.QUESTION_MESSAGE);
            
            if(newName.equals(null) || newName.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Tên bộ từ không nên để trống");
            } else {
                renameWordGroup.renameTo(newName);
            }
            
            refreshTBrowseWordGroup();
        }
    }//GEN-LAST:event_bRenameActionPerformed

    public void refreshTBrowseWordGroup() {
        DefaultTableModel model = (DefaultTableModel) tBrowseWordGroup.getModel();
        
        int initialRow = model.getRowCount();
        for(int i = initialRow - 1 ; i >= 0 ; i--) {
            model.removeRow(i);
        }
            WordGroup[] list = Directory.dir();
            for(int i=0;i<list.length;i++) {
                Object[] detail = new Object[2];
                detail[0] = list[i].name;
                detail[1] = list[i].getSoTu();
                model.addRow(detail);
            }
    }
    
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainInterface().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton addGroup;
    private javax.swing.JButton bMerge;
    private javax.swing.JButton bRefresh;
    private javax.swing.JButton bRename;
    private javax.swing.JComboBox<String> chooseDictionary;
    private javax.swing.JButton deleteGroup;
    private javax.swing.JButton editGroup;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem guide;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JPanel hocTu;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel listLabel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchText;
    private javax.swing.JButton startLearn;
    private javax.swing.JMenuItem switchUser;
    private javax.swing.JTable tBrowseWordGroup;
    private javax.swing.JTabbedPane tabPane;
    private javax.swing.JPanel traTu;
    // End of variables declaration//GEN-END:variables

}
