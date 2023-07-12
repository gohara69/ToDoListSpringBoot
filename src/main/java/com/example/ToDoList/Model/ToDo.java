package com.example.ToDoList.Model;

import lombok.Data;

@Data
public class ToDo {
	public String tieuDe;
	public String noiDung;
	
	public ToDo(String tieuDe, String noiDung) {
		this.tieuDe = tieuDe;
		this.noiDung = noiDung;
	}
	
	public ToDo() {}

	public String getTieuDe() {
		return tieuDe;
	}

	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
	
	
}
