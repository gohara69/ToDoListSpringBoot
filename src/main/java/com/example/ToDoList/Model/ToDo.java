package com.example.ToDoList.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "todo")
public class ToDo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	@Column(name = "TITLE")
	private String tieuDe;
	
	@Column(name = "NOIDUNG")
	private String noiDung;
	
	public ToDo(String tieuDe, String noiDung) {
		this.setTieuDe(tieuDe);
		this.setNoiDung(noiDung);
	}
}
