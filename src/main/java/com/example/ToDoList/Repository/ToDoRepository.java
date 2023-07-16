package com.example.ToDoList.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.ToDoList.Model.ToDo;
import java.util.List;


@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Long>{
	
	List<ToDo> findByTieuDe(String tieuDe);
	
	@Query(value = "Select * from todo where ID = ?1", nativeQuery = true)
	ToDo getToDoById(Long id);
}
