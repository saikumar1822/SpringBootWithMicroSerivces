package com.example.springbootfileupload.repositroy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springbootfileupload.model.Document;

public interface DocumentRepository extends JpaRepository<Document, Long>{
	@Query("select new Document(id,name,size) from Document d ORDER BY d.uploadTime DESC")
	List<Document> findAll();

}
