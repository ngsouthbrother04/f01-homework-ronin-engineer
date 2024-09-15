package com.quanlikho.BUS;

import java.util.ArrayList;

import com.quanlikho.DAO.*;
import com.quanlikho.DTO.*;

public class ThongKeBUS {
	private ArrayList<ThongKeDTO> ds;

	public ThongKeBUS() {

	}

	public ThongKeBUS(int i1) {
		list();
	}

	public ArrayList<ThongKeDTO> getList() {
		return ds;
	}

	public ThongKeDTO get(String masp) {
		for (ThongKeDTO tk : ds) {
			if (tk.getMaSP().equals(masp) ) {
				return tk;
			}
		}
		return null;
	}

	public void list() {
		ThongKeDAO tkDAO = new ThongKeDAO();
		ds = new ArrayList<>();
		ds = tkDAO.list();

	}

	

}
