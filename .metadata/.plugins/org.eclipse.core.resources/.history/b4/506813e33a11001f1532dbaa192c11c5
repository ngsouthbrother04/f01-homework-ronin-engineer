package com.quanlikho.GUI;
import javax.swing.GroupLayout.Alignment;

import java.util.ArrayList;
import java.util.regex.PatternSyntaxException;

import javax.swing.GroupLayout;
import javax.swing.RowFilter;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import com.quanlikho.BUS.*;
import com.quanlikho.DTO.*;
import javax.swing.JButton;
import javax.swing.JTable;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 *
 * @author MSI
 */
public class ThongKe extends javax.swing.JPanel {
	private AccountBUS accBUS = new AccountBUS();
	private SanPhamBUS spBUS = new SanPhamBUS();
	private PhieuNhapHangBUS pnBUS = new PhieuNhapHangBUS(); 
	private PhieuXuatBUS pxBUS = new PhieuXuatBUS(); 
	private NhaCungCapBUS nccBUS = new NhaCungCapBUS();

    public ThongKe() {
    	if(accBUS.getList() == null) accBUS.list();
    	if(spBUS.getList() == null) spBUS.list();
    	if(pnBUS.getList() == null) pnBUS.list();
    	if(nccBUS.getList() == null) nccBUS.list();
        initComponents();
        loadTblSanPham(spBUS.getList());
        loadtblTaiKhoan(accBUS.getList());
        loadTblPhieu(pnBUS.getList() , pxBUS.layDanhSachPhieuXuat() );
        demSoLuongSanPham();
        demSoLuongNCC();
        demSoLuongTK();
    }
 
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelSPtrongKho = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabelNCC = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabelNguoiDung = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jTextFieldTimKiemSP = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSP = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jTextFieldTimKiemPhieu = new javax.swing.JTextField();
        btnLamMoiPhieu = new javax.swing.JButton();
        btnLamMoiPhieu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		jTextFieldTimKiemPhieu.setText("");
        		   loadTblPhieu(pnBUS.getList() , pxBUS.layDanhSachPhieuXuat() );
        	}
        });
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePhieu = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        cmbTaiKhoan = new javax.swing.JComboBox<>();
        jTextFieldTimKiemTaiKhoan = new javax.swing.JTextField();
        btnLamMoiTaiKhoan = new javax.swing.JButton();
        btnLamMoiTaiKhoan.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		jTextFieldTimKiemTaiKhoan.setText("");
        		  loadtblTaiKhoan(accBUS.getList());
        	}
        });
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableTaiKhoan = new javax.swing.JTable();

    	setBounds(0,0, 1068, 693);
        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/quanlikho/Item/SanPham.png"))); // NOI18N

        jLabelSPtrongKho.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelSPtrongKho.setText("100");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Sản phẩm trong kho");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabelSPtrongKho)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelSPtrongKho)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(jLabel1))
                .addGap(22, 22, 22))
        );

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/quanlikho/Item/icons8-supplier-80.png"))); // NOI18N

        jLabelNCC.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelNCC.setText("100");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Nhà cung cấp");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelNCC)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(28, 28, 28))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelNCC)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/quanlikho/Item/icons8-account-80.png"))); // NOI18N

        jLabelNguoiDung.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelNguoiDung.setText("100");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Người dùng");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabelNguoiDung)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelNguoiDung)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4Layout.setHorizontalGroup(
        	jPanel4Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel4Layout.createSequentialGroup()
        			.addGap(29)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(117)
        			.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(32))
        );
        jPanel4Layout.setVerticalGroup(
        	jPanel4Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel4Layout.createSequentialGroup()
        			.addContainerGap(34, Short.MAX_VALUE)
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(31))
        );
        jPanel4.setLayout(jPanel4Layout);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8Layout.setHorizontalGroup(
        	jPanel8Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel8Layout.createSequentialGroup()
        			.addGap(21)
        			.addComponent(jTextFieldTimKiemSP, GroupLayout.PREFERRED_SIZE, 432, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
        	jPanel8Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel8Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jTextFieldTimKiemSP, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8.setLayout(jPanel8Layout);

        jTableSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã sảm phẩm", "Tên sản phẩm", "Số lượng nhập", "Số lượng xuất"
            }
        ));
        jScrollPane1.setViewportView(jTableSP);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5Layout.setHorizontalGroup(
        	jPanel5Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel5Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
        			.addGap(3))
        		.addGroup(jPanel5Layout.createSequentialGroup()
        			.addGap(315)
        			.addComponent(jPanel8, GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        			.addGap(178))
        );
        jPanel5Layout.setVerticalGroup(
        	jPanel5Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel5Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
        			.addGap(0))
        );
        jPanel5.setLayout(jPanel5Layout);

        jTabbedPane1.addTab("Sản phẩm", jPanel5);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));

        btnLamMoiPhieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/quanlikho/Item/icons8_reset_25px_1.png"))); // NOI18N
        btnLamMoiPhieu.setText("Làm mới");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11Layout.setHorizontalGroup(
        	jPanel11Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel11Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jTextFieldTimKiemPhieu, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
        			.addGap(67)
        			.addComponent(btnLamMoiPhieu, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
        			.addGap(36))
        );
        jPanel11Layout.setVerticalGroup(
        	jPanel11Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel11Layout.createSequentialGroup()
        			.addGap(24)
        			.addGroup(jPanel11Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnLamMoiPhieu, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextFieldTimKiemPhieu, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel11.setLayout(jPanel11Layout);

        jTablePhieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTablePhieu);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6Layout.setHorizontalGroup(
        	jPanel6Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel6Layout.createSequentialGroup()
        			.addGap(12)
        			.addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 1029, Short.MAX_VALUE)
        			.addGap(7))
        		.addGroup(Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
        			.addGap(283)
        			.addComponent(jPanel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGap(270))
        );
        jPanel6Layout.setVerticalGroup(
        	jPanel6Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel6Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
        			.addGap(1))
        );
        jPanel6.setLayout(jPanel6Layout);

        jTabbedPane1.addTab("Phiếu", jPanel6);

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));

        cmbTaiKhoan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Tên đăng nhập", "Họ và tên","Email" , "Role" }));

        btnLamMoiTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/quanlikho/Item/icons8_reset_25px_1.png"))); // NOI18N
        btnLamMoiTaiKhoan.setText("Làm mới");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12Layout.setHorizontalGroup(
        	jPanel12Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel12Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(cmbTaiKhoan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(78)
        			.addComponent(jTextFieldTimKiemTaiKhoan, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
        			.addGap(68)
        			.addComponent(btnLamMoiTaiKhoan)
        			.addGap(25))
        );
        jPanel12Layout.setVerticalGroup(
        	jPanel12Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel12Layout.createSequentialGroup()
        			.addGap(13)
        			.addGroup(jPanel12Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnLamMoiTaiKhoan)
        				.addGroup(jPanel12Layout.createSequentialGroup()
        					.addGap(12)
        					.addComponent(cmbTaiKhoan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jTextFieldTimKiemTaiKhoan, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel12.setLayout(jPanel12Layout);

        jTableTaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Họ tên", "Email", "Username", "Role"
            }
        ));
        jScrollPane3.setViewportView(jTableTaiKhoan);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7Layout.setHorizontalGroup(
        	jPanel7Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel7Layout.createSequentialGroup()
        			.addGap(14)
        			.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 1024, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(34, Short.MAX_VALUE))
        		.addGroup(jPanel7Layout.createSequentialGroup()
        			.addContainerGap(244, Short.MAX_VALUE)
        			.addComponent(jPanel12, GroupLayout.PREFERRED_SIZE, 651, GroupLayout.PREFERRED_SIZE)
        			.addGap(153))
        );
        jPanel7Layout.setVerticalGroup(
        	jPanel7Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel7Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane3, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
        			.addContainerGap())
        );
        jPanel7.setLayout(jPanel7Layout);

        jTabbedPane1.addTab("Tài khoản", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 1053, GroupLayout.PREFERRED_SIZE)
        					.addGap(1))
        				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        					.addGap(25)
        					.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 1038, GroupLayout.PREFERRED_SIZE)))
        			.addGap(5))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(15)
        			.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(35)
        			.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 465, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        this.setLayout(layout);

        jTabbedPane1.getAccessibleContext().setAccessibleName("Sản phẩm");
        jTextFieldTimKiemSP.getDocument().addDocumentListener((DocumentListener) new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
            	timKiemSP();
            }

            public void removeUpdate(DocumentEvent e) {
            	timKiemSP();
            }

			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
        });
        
        jTextFieldTimKiemTaiKhoan.getDocument().addDocumentListener((DocumentListener) new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
            	timKiemTK();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
            	timKiemTK();
            }

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
        });
        
        jTextFieldTimKiemPhieu.getDocument().addDocumentListener((DocumentListener) new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
            	timKiemPhieu();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
            	timKiemPhieu();
            }

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
        });
        
       
    
    }// </editor-fold>//GEN-END:initComponents
    
    public static void loadTblSanPham(ArrayList<SanPhamDTO> listSP) {
    	try {
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Mã sản phẩm");
            model.addColumn("Tên sản phẩm");
            model.addColumn("Số lượng");
            model.addColumn("Giá");
            model.addColumn("Mã loại");
            model.addColumn("Mã NSX");
            model.addColumn("Ghi chú");
         
            
            for(SanPhamDTO sp : listSP) {
            	Object[] row = new Object[]{sp.getMaSP(), sp.getTenSP(), sp.getSoLuong(), sp.getGia(), sp.getMaLoai(), sp.getMaNSX(), sp.getGhiChu()};
            	model.addRow(row);
            }
            
            jTableSP.setModel(model);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    public static void loadtblTaiKhoan(ArrayList<AccountDTO> listAcc) {
        try {
        	DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Tên đăng nhập");
            model.addColumn("Họ và tên");
            model.addColumn("Email");
         
            model.addColumn("Role");
            model.addColumn("Enable");
            
            for(AccountDTO acc : listAcc) {
            	Object[] row = new Object[]{acc.getTenDangNhap(), acc.getHovaTen(), acc.getEmail(), acc.getRole(), acc.getEnable()};
            	model.addRow(row);
            }
            
            jTableTaiKhoan.setModel(model);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void loadTblPhieu(ArrayList<PhieuNhapHangDTO> listpn ,ArrayList<PhieuXuatDTO> listpx ) {
    	 try {
         	DefaultTableModel model = new DefaultTableModel();
             model.addColumn("Mã phiếu");
             model.addColumn("Mã NCC");
             model.addColumn("Ngày");
             model.addColumn("Người tạo ");
             model.addColumn("Tổng tiền");
             
         
             for(PhieuNhapHangDTO pn : listpn) {
             	Object[] row = new Object[]{pn.getMaPNH() , pn.getMaNCC() , pn.getNgayNhap() , pn.getTenDangNhap() , pn.getTongTien()};
             	model.addRow(row);
             }
             for(PhieuXuatDTO px : listpx) {
              	Object[] row = new Object[]{px.getMaPhieu() , px.getNhaCungCap() , px.getThoiGianTao() , px.getNguoiTao() , px.getTongTien()};
              	model.addRow(row);
              }
             jTablePhieu.setModel(model);
             
    
         } catch (Exception e) {
             e.printStackTrace();
         }
    }
    public void demSoLuongSanPham() {
    	jLabelSPtrongKho.setText( String.valueOf( spBUS.countSoLuongSP()));
    }
    
    public void demSoLuongNCC() {
  
       
    	jLabelNCC.setText( String.valueOf( nccBUS.countNCC()));
    }
    
    public void demSoLuongTK() {
       
       
    	jLabelNguoiDung.setText( String.valueOf( accBUS.countAcc()));
    }
    
    
    private static void timKiemTK() {
        String text = jTextFieldTimKiemTaiKhoan.getText();
        int columnIndex = cmbTaiKhoan.getSelectedIndex(); 
        JTable table = jTableTaiKhoan; // Assign the correct table
        TableRowSorter<? extends TableModel> sorter = (TableRowSorter<? extends TableModel>) table.getRowSorter();

        if (sorter == null) {
            sorter = new TableRowSorter<>(table.getModel());
            table.setRowSorter(sorter);
        }

        if (text.trim().length() == 0) {
            sorter.setRowFilter(null);
        } else {
            try {
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text, columnIndex));
            } catch (PatternSyntaxException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void timKiemPhieu() {
        String text = jTextFieldTimKiemPhieu.getText();
     
        JTable table = jTablePhieu; // Assign the correct table
        TableRowSorter<? extends TableModel> sorter = (TableRowSorter<? extends TableModel>) table.getRowSorter();

        if (sorter == null) {
            sorter = new TableRowSorter<>(table.getModel());
            table.setRowSorter(sorter);
        }

        if (text.trim().length() == 0) {
            sorter.setRowFilter(null);
        } else {
            try {
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
            } catch (PatternSyntaxException ex) {
                ex.printStackTrace();
            }
        }
    }

 
    private static void timKiemSP() {
        String text = jTextFieldTimKiemSP.getText();

        // Get the RowSorter from jTableSP, create a new one if it's null
        TableRowSorter<? extends TableModel> sorter = (TableRowSorter<? extends TableModel>) jTableSP.getRowSorter();
        if (sorter == null) {
            sorter = new TableRowSorter<>(jTableSP.getModel());
            jTableSP.setRowSorter(sorter);
        }

        if (text.trim().length() == 0) {
            sorter.setRowFilter(null);
        } else {
            try {
                // Apply the filter based on the selected column index
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
            } catch (PatternSyntaxException ex) {
                ex.printStackTrace();
            }
        }
    }
    private javax.swing.JButton btnLamMoiPhieu;
    private javax.swing.JButton btnLamMoiTaiKhoan;
    private static javax.swing.JComboBox<String> cmbTaiKhoan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelSPtrongKho;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelNCC;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelNguoiDung;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private static javax.swing.JTable jTableSP;
    private static javax.swing.JTable jTablePhieu;
    private static javax.swing.JTable jTableTaiKhoan;
    private static javax.swing.JTextField jTextFieldTimKiemSP;
    private javax.swing.JTextField jTextFieldTimKiemPhieu;
    private static javax.swing.JTextField jTextFieldTimKiemTaiKhoan;
}