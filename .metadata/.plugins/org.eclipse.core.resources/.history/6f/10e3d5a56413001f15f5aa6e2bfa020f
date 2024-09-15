package com.quanlikho.BUS;

import java.util.ArrayList;

import com.quanlikho.DAO.SanPhamDAO;
import com.quanlikho.DTO.SanPhamDTO;

public class TonKhoBUS {
	private ArrayList<SanPhamDTO> dssp;

	public TonKhoBUS() {

	}

	public TonKhoBUS(int i1) {
		list();
	}

	public ArrayList<SanPhamDTO> getList() {
		return dssp;
	}

	public SanPhamDTO get(String MaSP) {
		for (SanPhamDTO sp : dssp) {
			if (sp.getMaSP().equals(MaSP)) {
				return sp;
			}
		}
		return null;
	}

	public void list() {
		SanPhamDAO spDAO = new SanPhamDAO();
		dssp = new ArrayList<>();
		dssp = spDAO.list();

	}

	public void addSP(SanPhamDTO sp) {
		dssp.add(sp);
		SanPhamDAO spDAO = new SanPhamDAO();
		spDAO.add(sp);
	}

	public void updateSP(SanPhamDTO sp) {
		for (int i = 0; i < dssp.size(); i++) {
			if (dssp.get(i).getMaSP().equals(sp.getMaSP())) {
				dssp.set(i, sp);
				SanPhamDAO spDAO = new SanPhamDAO();
				spDAO.update(sp);
			}
		}
	}

	public void delete(String MaSP) {
		for (SanPhamDTO sp : dssp) {
			if (sp.getMaSP().equals(MaSP)) {
				dssp.remove(sp);
				SanPhamDAO spDAO = new SanPhamDAO();
				spDAO.delete(MaSP);
				return;
			}
		}
	}
	public ArrayList<SanPhamDTO> timKiem(String selectedOption, String keyword) {
	    ArrayList<SanPhamDTO> res = new ArrayList<SanPhamDTO>();

	    for (SanPhamDTO tk : getList()) {
	        switch (selectedOption) {
	            case "Tất cả":
	                if (keyword.isEmpty()) {
	                    return getList();
	                } else {
	                    if (tk.getMaSP().toLowerCase().contains(keyword.toLowerCase()) ||
	                            tk.getTenSP().toLowerCase().contains(keyword.toLowerCase()) ||
	                            String.valueOf(tk.getSoLuong()).contains(keyword.toLowerCase()) ||
	                            String.valueOf(tk.getGia()).contains(keyword.toLowerCase()) ||
	                            tk.getMaLoai().toLowerCase().contains(keyword.toLowerCase()) ||
	                            tk.getMaNSX().toLowerCase().contains(keyword.toLowerCase()) ||
	                            tk.getGhiChu().toLowerCase().contains(keyword.toLowerCase())) {
	                        res.add(tk);
	                    }
	                }
	                break;
	            case "Mã sản phẩm":
	                if (tk.getMaSP().toLowerCase().contains(keyword.toLowerCase())) {
	                    res.add(tk);
	                }
	                break;
	            default:
	                if (tk.getTenSP().toLowerCase().contains(keyword.toLowerCase())) {
	                    res.add(tk);
	                }
	                break;
	        }
	    }
	    return res;
	}
}
