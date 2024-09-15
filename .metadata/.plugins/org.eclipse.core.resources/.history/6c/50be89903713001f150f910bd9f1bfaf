package com.quanlikho.GUI;

import javax.swing.GroupLayout.Alignment;

import java.util.ArrayList;
import java.util.Date;
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
import com.quanlikho.DAO.*;
import com.quanlikho.DTO.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author MSI
 */
public class ThongKe extends javax.swing.JPanel {
	private static DefaultTableModel model2;
	private static DefaultTableModel model1;
	private static DefaultTableModel model3;
	private AccountBUS accBUS = new AccountBUS();
	private SanPhamBUS spBUS = new SanPhamBUS();
	private PhieuNhapHangBUS pnBUS = new PhieuNhapHangBUS();
	private PhieuXuatBUS pxBUS = new PhieuXuatBUS();
	private NhaCungCapBUS nccBUS = new NhaCungCapBUS();
	private PhieuXuatDAO pxDAO = new PhieuXuatDAO();
	private ThongKeBUS tkBUS = new ThongKeBUS();
	private JComboBox comboBox;

	public ThongKe() {
		if (accBUS.getList() == null)
			accBUS.list();
		if (spBUS.getList() == null)
			spBUS.list();
		if (pnBUS.getList() == null)
			pnBUS.list();
		if (nccBUS.getList() == null)
			nccBUS.list();
		if (tkBUS.getList() == null)
			tkBUS.list();
		initComponents();
		loadTblSanPham(tkBUS.getList());
		loadtblTaiKhoan(accBUS.getList());
		loadTblPhieu(pnBUS.getList(), pxBUS.layDanhSachPhieuXuat());
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
		jPanel9 = new javax.swing.JPanel();
		jLabel10 = new javax.swing.JLabel();
		btnLamMoiSP = new javax.swing.JButton();
		btnLamMoiSP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLamMoiSP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThongKeBUS tkBUSupdate = new ThongKeBUS();
				if (tkBUSupdate.getList() == null)
					tkBUSupdate.list();
				jTextFieldTimKiemSP.setText("");
				LocTheoGiaTu.setText("");
				LocTheoGiaDen.setText("");
				 // Clear any row filter
		        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<>(model1);
		        jTableSP.setRowSorter(rowSorter);
		        rowSorter.setRowFilter(null);
				loadTblSanPham(tkBUSupdate.getList());
			}
		});
		jLabel11 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTableSP = new javax.swing.JTable();
		jPanel6 = new javax.swing.JPanel();
		jPanel10 = new javax.swing.JPanel();
		btnXemPhieu = new javax.swing.JButton();
		btnXemPhieu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkDateRangeAndDisplayPhieu(pxDAO.selectAll(), pnBUS.getList());
			}
		});
		jSeparator1 = new javax.swing.JSeparator();
		jLabel12 = new javax.swing.JLabel();
		ngaybatdauPhieu = new com.toedter.calendar.JDateChooser();
		jLabel13 = new javax.swing.JLabel();
		ngayketthucPhieu = new com.toedter.calendar.JDateChooser();
		jPanel11 = new javax.swing.JPanel();
		jTextFieldTimKiemPhieu = new javax.swing.JTextField();
		btnLamMoiPhieu = new javax.swing.JButton();
		btnLamMoiPhieu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PhieuNhapHangBUS pnBUSupdate = new PhieuNhapHangBUS();
				if (pnBUSupdate.getList() == null)
					pnBUSupdate.list();
				jTextFieldTimKiemPhieu.setText("");
				loadTblPhieu(pnBUSupdate.getList(), pxBUS.layDanhSachPhieuXuat());
				ngaybatdauPhieu.setDate(null);
				ngayketthucPhieu.setDate(null);
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
				AccountBUS accBUSupdate = new AccountBUS();
				if (accBUSupdate.getList() == null)
					accBUSupdate.list();
				jTextFieldTimKiemTaiKhoan.setText("");
				loadtblTaiKhoan(accBUSupdate.getList());
			}
		});
		jScrollPane3 = new javax.swing.JScrollPane();
		jTableTaiKhoan = new javax.swing.JTable();

		setBounds(0, 0, 1068, 693);
		jPanel1.setBackground(new java.awt.Color(255, 255, 0));
		jPanel1.setForeground(new java.awt.Color(255, 255, 0));

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/quanlikho/Item/SanPham.png"))); // NOI18N

		jLabelSPtrongKho.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
		jLabelSPtrongKho.setText("100");

		jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		jLabel3.setText("Sản phẩm trong kho");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(21, 21, 21).addComponent(jLabel1)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel3))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(48, 48, 48)
										.addComponent(jLabelSPtrongKho)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel1Layout.createSequentialGroup().addComponent(jLabelSPtrongKho)
												.addGap(18, 18, 18).addComponent(jLabel3))
								.addComponent(jLabel1))
						.addGap(22, 22, 22)));

		jPanel2.setBackground(new java.awt.Color(255, 102, 0));

		jLabel4.setIcon(
				new javax.swing.ImageIcon(getClass().getResource("/com/quanlikho/Item/icons8-supplier-80.png"))); // NOI18N

		jLabelNCC.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
		jLabelNCC.setText("100");

		jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		jLabel6.setText("Nhà cung cấp");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(jLabel4)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel2Layout.createSequentialGroup().addComponent(jLabelNCC).addGap(56, 56,
												56))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout
										.createSequentialGroup().addComponent(jLabel6).addGap(28, 28, 28)))));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel2Layout.createSequentialGroup().addContainerGap(14, Short.MAX_VALUE)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabelNCC)
												.addGap(18, 18, 18).addComponent(jLabel6))
										.addComponent(jLabel4))
								.addContainerGap()));

		jPanel3.setBackground(new java.awt.Color(0, 204, 204));

		jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/quanlikho/Item/icons8-account-80.png"))); // NOI18N

		jLabelNguoiDung.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
		jLabelNguoiDung.setText("100");

		jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		jLabel9.setText("Người dùng");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addGap(17, 17, 17).addComponent(jLabel7)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34,
												Short.MAX_VALUE)
										.addComponent(jLabel9).addGap(30, 30, 30))
								.addGroup(jPanel3Layout.createSequentialGroup().addGap(46, 46, 46)
										.addComponent(jLabelNguoiDung)
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel3Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel7).addGap(18, 18, 18))
				.addGroup(jPanel3Layout.createSequentialGroup().addGap(14, 14, 14).addComponent(jLabelNguoiDung)
						.addGap(18, 18, 18).addComponent(jLabel9)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout
				.createSequentialGroup().addGap(29)
				.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
				.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(117)
				.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(32)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel4Layout.createSequentialGroup().addContainerGap(34, Short.MAX_VALUE)
						.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(31)));
		jPanel4.setLayout(jPanel4Layout);

		jPanel8.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"T\u00ECm ki\u1EBFm", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
		jPanel8Layout.setHorizontalGroup(
			jPanel8Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel8Layout.createSequentialGroup()
					.addGap(21)
					.addComponent(jTextFieldTimKiemSP, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(74, Short.MAX_VALUE))
		);
		jPanel8Layout.setVerticalGroup(
			jPanel8Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel8Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jTextFieldTimKiemSP, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jPanel8.setLayout(jPanel8Layout);

		jPanel9.setBorder(
				new TitledBorder(
						new TitledBorder(
								new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255),
										new Color(160, 160, 160)),
								"", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)),
						"L\u1ECDc theo gi\u00E1", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		jLabel10.setText("Từ");

		btnLamMoiSP.setIcon(
				new javax.swing.ImageIcon(getClass().getResource("/com/quanlikho/Item/Icons8_reset_25px_1.png"))); // NOI18N
		btnLamMoiSP.setText("Làm mới");

		jLabel11.setText("Đến");

		JButton btnXemSP = new JButton();
		btnXemSP.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 XemSP();
			}
		});
		btnXemSP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXemSP.setIcon(new ImageIcon(ThongKe.class.getResource("/com/quanlikho/Item/visibility_24.png")));
		btnXemSP.setText("Xem");

		LocTheoGiaTu = new JTextField();
		LocTheoGiaTu.setColumns(10);

		LocTheoGiaDen = new JTextField();
		LocTheoGiaDen.setColumns(10);
		
		 comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Số lượng phiếu nhập", "Số lượng phiếu xuất"}));
		comboBox.addActionListener(e -> XemSP());
		javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
		jPanel9Layout.setHorizontalGroup(
			jPanel9Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
					.addComponent(comboBox, 0, 95, Short.MAX_VALUE)
					.addGap(24)
					.addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(LocTheoGiaTu, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
					.addComponent(LocTheoGiaDen, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnXemSP, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnLamMoiSP)
					.addContainerGap())
		);
		jPanel9Layout.setVerticalGroup(
			jPanel9Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel9Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel9Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, jPanel9Layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnXemSP, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
							.addComponent(LocTheoGiaDen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addComponent(LocTheoGiaTu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(jLabel10))
						.addComponent(btnLamMoiSP, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
					.addGap(20))
		);
		jPanel9.setLayout(jPanel9Layout);

		jTableSP.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "STT", "Mã sảm phẩm", "Tên sản phẩm", "Số lượng nhập", "Số lượng xuất" }));
		jScrollPane1.setViewportView(jTableSP);

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5Layout.setHorizontalGroup(
			jPanel5Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
						.addGroup(jPanel5Layout.createSequentialGroup()
							.addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jPanel9, GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)))
					.addGap(3))
		);
		jPanel5Layout.setVerticalGroup(
			jPanel5Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jPanel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jPanel9, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
					.addGap(0))
		);
		jPanel5.setLayout(jPanel5Layout);

		jTabbedPane1.addTab("Sản phẩm", jPanel5);

		jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));

		btnXemPhieu
				.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/quanlikho/Item/icons8_eye_40px.png"))); // NOI18N
		btnXemPhieu.setText("Xem");

		jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

		jLabel12.setText("Từ");

		jLabel13.setText("Đến");

		javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
		jPanel10.setLayout(jPanel10Layout);
		jPanel10Layout.setHorizontalGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel10Layout.createSequentialGroup().addContainerGap().addComponent(btnXemPhieu)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel12)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(ngaybatdauPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 166,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel13)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(ngayketthucPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 166,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel10Layout.setVerticalGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel10Layout.createSequentialGroup()
						.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 82,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
				.addGroup(jPanel10Layout.createSequentialGroup().addGroup(jPanel10Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel10Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(btnXemPhieu))
						.addGroup(jPanel10Layout.createSequentialGroup().addGap(34, 34, 34).addGroup(jPanel10Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(ngaybatdauPhieu, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel12).addComponent(jLabel13).addComponent(ngayketthucPhieu,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));

		btnLamMoiPhieu.setIcon(
				new javax.swing.ImageIcon(getClass().getResource("/com/quanlikho/Item/icons8_reset_25px_1.png"))); // NOI18N
		btnLamMoiPhieu.setText("Làm mới");

		javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
		jPanel11Layout.setHorizontalGroup(jPanel11Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel11Layout
				.createSequentialGroup().addContainerGap()
				.addComponent(jTextFieldTimKiemPhieu, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)
				.addGap(67).addComponent(btnLamMoiPhieu, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE).addGap(36)));
		jPanel11Layout.setVerticalGroup(jPanel11Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel11Layout.createSequentialGroup().addGap(24)
						.addGroup(jPanel11Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnLamMoiPhieu, GroupLayout.PREFERRED_SIZE, 34,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextFieldTimKiemPhieu, GroupLayout.PREFERRED_SIZE, 43,
										GroupLayout.PREFERRED_SIZE))
						.addContainerGap(15, Short.MAX_VALUE)));
		jPanel11.setLayout(jPanel11Layout);

		jTablePhieu.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] {

		}));
		jScrollPane2.setViewportView(jTablePhieu);

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup()
						.addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel6Layout.createSequentialGroup().addContainerGap()
										.addComponent(jPanel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(jPanel11, GroupLayout.PREFERRED_SIZE, 487, Short.MAX_VALUE))
								.addGroup(jPanel6Layout.createSequentialGroup().addGap(12).addComponent(jScrollPane2,
										GroupLayout.DEFAULT_SIZE, 1013, Short.MAX_VALUE)))
						.addGap(7)));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jPanel11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(jPanel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE).addGap(1)));
		jPanel6.setLayout(jPanel6Layout);

		jTabbedPane1.addTab("Phiếu", jPanel6);

		jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));

		cmbTaiKhoan.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Tên đăng nhập", "Họ và tên", "Email", "Role" }));

		btnLamMoiTaiKhoan.setIcon(
				new javax.swing.ImageIcon(getClass().getResource("/com/quanlikho/Item/icons8_reset_25px_1.png"))); // NOI18N
		btnLamMoiTaiKhoan.setText("Làm mới");

		javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
		jPanel12Layout.setHorizontalGroup(jPanel12Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel12Layout.createSequentialGroup().addContainerGap()
						.addComponent(cmbTaiKhoan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(78)
						.addComponent(jTextFieldTimKiemTaiKhoan, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
						.addGap(68).addComponent(btnLamMoiTaiKhoan).addGap(25)));
		jPanel12Layout.setVerticalGroup(jPanel12Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel12Layout
				.createSequentialGroup().addGap(13)
				.addGroup(jPanel12Layout.createParallelGroup(Alignment.BASELINE).addComponent(btnLamMoiTaiKhoan)
						.addGroup(jPanel12Layout.createSequentialGroup().addGap(12).addComponent(cmbTaiKhoan,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(jTextFieldTimKiemTaiKhoan, GroupLayout.PREFERRED_SIZE, 43,
								GroupLayout.PREFERRED_SIZE))
				.addContainerGap(12, Short.MAX_VALUE)));
		jPanel12.setLayout(jPanel12Layout);

		jTableTaiKhoan.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Họ tên", "Email", "Username", "Role" }));
		jScrollPane3.setViewportView(jTableTaiKhoan);

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
		jPanel7Layout
				.setHorizontalGroup(jPanel7Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel7Layout.createSequentialGroup().addGap(14)
								.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 1024,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap(34, Short.MAX_VALUE))
						.addGroup(jPanel7Layout.createSequentialGroup().addContainerGap(244, Short.MAX_VALUE)
								.addComponent(jPanel12, GroupLayout.PREFERRED_SIZE, 651, GroupLayout.PREFERRED_SIZE)
								.addGap(153)));
		jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel7Layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(jScrollPane3, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE).addContainerGap()));
		jPanel7.setLayout(jPanel7Layout);

		jTabbedPane1.addTab("Tài khoản", jPanel7);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
								.addGroup(layout.createSequentialGroup().addContainerGap()
										.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 1053,
												GroupLayout.PREFERRED_SIZE)
										.addGap(1))
								.addGroup(Alignment.LEADING,
										layout.createSequentialGroup().addGap(25).addComponent(jPanel4,
												GroupLayout.PREFERRED_SIZE, 1038, GroupLayout.PREFERRED_SIZE)))
						.addGap(5)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGap(15)
				.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(35).addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 465, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
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

	public void loadTblSanPham(ArrayList<ThongKeDTO> list  ) {
		try {
			model1 = new DefaultTableModel();
			model1.addColumn("Mã sản phẩm");
			model1.addColumn("Tên sản phẩm");
			model1.addColumn("Số lượng nhập");
			model1.addColumn("Số lượng xuất");

			for (ThongKeDTO tk : list) {
				
				Object[] row = new Object[] { tk.getMaSP() , tk .getTenSP() , tk.getSlNhap() , tk.getSlXuat()};
				model1.addRow(row);
			}

			jTableSP.setModel(model1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void loadtblTaiKhoan(ArrayList<AccountDTO> listAcc) {
		try {
			model3 = new DefaultTableModel();
			model3.addColumn("Tên đăng nhập");
			model3.addColumn("Họ và tên");
			model3.addColumn("Email");

			model3.addColumn("Role");
			model3.addColumn("Enable");

			for (AccountDTO acc : listAcc) {
				Object[] row = new Object[] { acc.getTenDangNhap(), acc.getHovaTen(), acc.getEmail(), acc.getRole(),
						acc.getEnable() };
				model3.addRow(row);
			}

			jTableTaiKhoan.setModel(model3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void loadTblPhieu(ArrayList<PhieuNhapHangDTO> listpn, ArrayList<PhieuXuatDTO> listpx) {
		try {
			model2 = new DefaultTableModel();
			model2.addColumn("Mã phiếu");
			model2.addColumn("Mã NCC");
			model2.addColumn("Ngày");
			model2.addColumn("Người tạo ");
			model2.addColumn("Tổng tiền");

			for (PhieuNhapHangDTO pn : listpn) {
				Object[] row = new Object[] { pn.getMaPNH(), pn.getMaNCC(), pn.getNgayNhap(), pn.getTenDangNhap(),
						pn.getTongTien() };
				model2.addRow(row);
			}
			for (PhieuXuatDTO px : listpx) {
				Object[] row = new Object[] { px.getMaPhieu(), px.getNhaCungCap(), px.getThoiGianTao(),
						px.getNguoiTao(), px.getTongTien() };
				model2.addRow(row);
			}
			jTablePhieu.setModel(model2);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void demSoLuongSanPham() {
		jLabelSPtrongKho.setText(String.valueOf(spBUS.countSoLuongSP()));
	}

	public void demSoLuongNCC() {

		jLabelNCC.setText(String.valueOf(nccBUS.countNCC()));
	}

	public void demSoLuongTK() {

		jLabelNguoiDung.setText(String.valueOf(accBUS.countAcc()));
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

	private void checkDateRangeAndDisplayPhieu(ArrayList<PhieuXuatDTO> listPX, ArrayList<PhieuNhapHangDTO> listPN) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    String startDateStr = "";
	    String endDateStr = "";

	    // Kiểm tra nếu các đối tượng date pickers không null
	    if (ngaybatdauPhieu.getDate() != null) {
	        startDateStr = dateFormat.format(ngaybatdauPhieu.getDate());
	    }
	    if (ngayketthucPhieu.getDate() != null) {
	        endDateStr = dateFormat.format(ngayketthucPhieu.getDate());
	    }

	    // In ra các giá trị ngày để kiểm tra
	    System.out.println("Ngày bắt đầu: " + startDateStr);
	    System.out.println("Ngày kết thúc: " + endDateStr);

	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	  

	    if (startDateStr.isEmpty() && !endDateStr.isEmpty()) {
	    	JOptionPane.showMessageDialog(this, "Ngày bắt đầu không được bỏ trống", "Thông báo", JOptionPane.DEFAULT_OPTION);
	    	 return ; 
	    } else if (!startDateStr.isEmpty() && endDateStr.isEmpty()) {
	    	JOptionPane.showMessageDialog(this, "Ngày kết thúc không được bỏ trống", "Thông báo", JOptionPane.DEFAULT_OPTION);
	    	 return ; 
	    } else {
	    	
	    	  // Kiểm tra xem các chuỗi nhập vào có đúng định dạng không
		    if (!isValidDateFormat(startDateStr) || !isValidDateFormat(endDateStr)) {
		        JOptionPane.showMessageDialog(this, "Định dạng ngày không hợp lệ. Vui lòng nhập theo định dạng yyyy-MM-dd.", "Thông báo", JOptionPane.DEFAULT_OPTION);
		       return ; 
		    }else {
		    	try {
		    		Date startDate = sdf.parse(startDateStr);
		    		Date endDate = sdf.parse(endDateStr);
		    		  // Kiểm tra nếu ngày kết thúc nhỏ hơn ngày bắt đầu
		            if (endDate.before(startDate)) {
		                JOptionPane.showMessageDialog(this, "Ngày kết thúc không được nhỏ hơn ngày bắt đầu.");
		                return;
		            }
		    		// Xóa dữ liệu cũ trong bảng
		    		model2.setRowCount(0);
		    		
		    		for (PhieuNhapHangDTO pn : listPN) {
		    			Date importDate = sdf.parse(pnBUS.PutOnNgayNhap(pn.getMaPNH()));
		    			if (importDate.compareTo(startDate) >= 0 && importDate.compareTo(endDate) <= 0) {
		    				model2.addRow(new Object[]{pn.getMaPNH(), pn.getMaNCC(), pn.getNgayNhap(), pn.getTenDangNhap(), pn.getTongTien()});
		    			}
		    		}
		    		
		    		for (PhieuXuatDTO px : listPX) {
		    			Date exportDate = sdf.parse(String.valueOf(pxDAO.getThoiGianTao(px)));
		    			if (exportDate.compareTo(startDate) >= 0 && exportDate.compareTo(endDate) <= 0) {
		    				model2.addRow(new Object[]{px.getMaPhieu(), px.getNhaCungCap(), px.getThoiGianTao(), px.getNguoiTao(), px.getTongTien()});
		    			}
		    		}
		    		
		    	} catch (ParseException ex) {
		    		ex.printStackTrace();
		    	}
		    	
		    }
	    }
	}
	
	private boolean isValidDateFormat(String dateStr) {
		// Sử dụng regular expression để kiểm tra định dạng yyyy-MM-dd
		return dateStr.matches("\\d{4}-\\d{2}-\\d{2}");
	}

	public void XemSP() {
	    String minPriceText = LocTheoGiaTu.getText();
	    String maxPriceText = LocTheoGiaDen.getText();
	    if (minPriceText.isEmpty() && !maxPriceText.isEmpty()) {
	        JOptionPane.showMessageDialog(this, "Số lượng nhỏ nhất không được bỏ trống", "Thông báo",
	                JOptionPane.DEFAULT_OPTION);
	    } else {
	        if (!minPriceText.isEmpty() && maxPriceText.isEmpty()) {
	            JOptionPane.showMessageDialog(this, "Số lượng lớn nhất không được bỏ trống", "Thông báo",
	                    JOptionPane.DEFAULT_OPTION);
	        } else {
	            try {
	                double minPrice = minPriceText.isEmpty() ? Double.NEGATIVE_INFINITY
	                        : Double.parseDouble(minPriceText);
	                double maxPrice = maxPriceText.isEmpty() ? Double.POSITIVE_INFINITY
	                        : Double.parseDouble(maxPriceText);
	                if (maxPrice < minPrice) {
	                    JOptionPane.showMessageDialog(this, "Số lượng lớn nhất không được nhỏ hơn số lượng nhỏ nhất.");
	                    return;
	                }
	                filterByPrice(minPrice ,maxPrice , comboBox.getSelectedIndex() );
	              
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(ThongKe.this, "Invalid price");
	            }
	        }
	    }
	}
	private void filterByPrice(double minPrice, double maxPrice , int loccot) {
		ArrayList<ThongKeDTO>  listTK = tkBUS.getList();
		ArrayList<ThongKeDTO> ketQuaLoc = new ArrayList<>();
		switch(loccot) {
		case 0:
			for (ThongKeDTO pnh : listTK) {
				int tongTien = pnh.getSlNhap();
				if (tongTien >= minPrice && tongTien <= maxPrice) {
					ketQuaLoc.add(pnh);
				}
			}
			break; 
		case 1:
			for (ThongKeDTO pnh : listTK) {
				int tongTien = pnh.getSlXuat();
				if (tongTien >= minPrice && tongTien <= maxPrice) {
					ketQuaLoc.add(pnh);
				}
			}
			break; 
		}
		
	
		loadTblSanPham(ketQuaLoc);
	}
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnLamMoiSP;
	private javax.swing.JButton btnXemPhieu;
	private javax.swing.JButton btnLamMoiPhieu;
	private javax.swing.JButton btnLamMoiTaiKhoan;
	private static javax.swing.JComboBox<String> cmbTaiKhoan;
	private com.toedter.calendar.JDateChooser ngaybatdauPhieu;
	private com.toedter.calendar.JDateChooser ngayketthucPhieu;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabelSPtrongKho;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabelNCC;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabelNguoiDung;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel10;
	private javax.swing.JPanel jPanel11;
	private javax.swing.JPanel jPanel12;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JPanel jPanel9;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JTabbedPane jTabbedPane1;
	private static javax.swing.JTable jTableSP;
	private static javax.swing.JTable jTablePhieu;
	private static javax.swing.JTable jTableTaiKhoan;
	private static javax.swing.JTextField jTextFieldTimKiemSP;
	private javax.swing.JTextField jTextFieldTimKiemPhieu;
	private static javax.swing.JTextField jTextFieldTimKiemTaiKhoan;
	private JTextField LocTheoGiaTu;
	private JTextField LocTheoGiaDen;
}