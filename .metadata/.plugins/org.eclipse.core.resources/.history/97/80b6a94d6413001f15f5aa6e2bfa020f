package com.quanlikho.GUI;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.quanlikho.BUS.*;
import com.quanlikho.DTO.SanPhamDTO;

public class TonKho extends JPanel {

	private static final long serialVersionUID = 1L;
	private SanPhamBUS spBUS = new SanPhamBUS();
	private TonKhoBUS tkBUS = new TonKhoBUS();
	
	public TonKho() {
		if (spBUS.getList() == null) {
			spBUS.list();
		}
		if (tkBUS.getList() == null) {
			tkBUS.list();
		}
		initComponents();
		
		loadTable(spBUS.getList());
	}

	/**
	 * Create the panel.
	 */
	public void initComponents() {
		setBounds(0, 0, 1068, 693);
	    jPanel1 = new javax.swing.JPanel();
        btnXuatFile = new javax.swing.JButton();
        btnXuatFile.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		xuatFile();
        	}
        });
        cmbLuaChon = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        txtTimKiem = new javax.swing.JTextField();
        btnLamMoi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));

        btnXuatFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/quanlikho/Item/icons8_spreadsheet_file_40px.png"))); // NOI18N
        btnXuatFile.setText("Xuất File");

        cmbLuaChon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Mã sản phẩm", "Tên sản phẩm" }));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/quanlikho/Item/icons8_reset_25px_1.png"))); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	loadTable(spBUS.getList());
            	txtTimKiem.setText("");
            }
        });

        txtTimKiem.getDocument().addDocumentListener((DocumentListener) new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
            	tim();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
            	tim();
            }

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
        });
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnXuatFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnLamMoi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(btnXuatFile))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLamMoi))
                                .addGap(12, 12, 12)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );

        tblSanPham.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        	}
        ));
        jScrollPane1.setViewportView(tblSanPham);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(190)
        					.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addGap(99))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(15)
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 1037, GroupLayout.PREFERRED_SIZE)))
        			.addGap(16))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        			.addGap(15))
        );
        this.setLayout(layout);
    }
    
    public void loadTable(ArrayList<SanPhamDTO> list) {
    	try {
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Mã sản phẩm");
            model.addColumn("Tên sản phẩm");
            model.addColumn("Số lượng");
            model.addColumn("Giá");
            model.addColumn("Mã loại");
            model.addColumn("Mã NSX");
            model.addColumn("Ghi chú sản phẩm");
            
            for(SanPhamDTO sp : list) {
            	if(sp.getSoLuong() > 0 ) {
            		model.addRow(new Object[] { sp.getMaSP(), sp.getTenSP(), sp.getSoLuong(), sp.getGia(), sp.getMaLoai(), sp.getMaNSX(), sp.getGhiChu()});            		
            	}
            }
            tblSanPham.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void tim() {
    	ArrayList<SanPhamDTO> res = tkBUS.timKiem(cmbLuaChon.getSelectedItem().toString(), txtTimKiem.getText());
    	loadTable(res);
    }
    
    public void xuatFile() {
    	 try {
             JFileChooser jFileChooser = new JFileChooser();
             jFileChooser.showSaveDialog(this);
             File saveFile = jFileChooser.getSelectedFile();
             if (saveFile != null) {
                 saveFile = new File(saveFile.toString() + ".xlsx");
                 Workbook wb = new XSSFWorkbook();
                 Sheet sheet = wb.createSheet("Đại Lý");

                 Row rowCol = sheet.createRow(0);
                 for (int i = 0; i < tblSanPham.getColumnCount(); i++) {
                     Cell cell = rowCol.createCell(i);
                     cell.setCellValue(tblSanPham.getColumnName(i));
                 }

                 for (int j = 0; j < tblSanPham.getRowCount(); j++) {
                     Row row = sheet.createRow(j + 1);
                     for (int k = 0; k < tblSanPham.getColumnCount(); k++) {
                         Cell cell = row.createCell(k);
                         if (tblSanPham.getValueAt(j, k) != null) {
                             cell.setCellValue(tblSanPham.getValueAt(j, k).toString());
                         }

                     }
                 }
                 FileOutputStream out = new FileOutputStream(new File(saveFile.toString()));
                 wb.write(out);
                 wb.close();
                 out.close();
                 openFile(saveFile.toString());
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
    }
    private void openFile(String file) {
        try {
            File path = new File(file);
            Desktop.getDesktop().open(path);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    private javax.swing.JButton btnXuatFile;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JComboBox<String> cmbLuaChon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTable tblSanPham;
    // End of variables declaration//GEN-END:va
	}

