package com.example.demo.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.DemoEntityf_kojin7;

public interface DemoRepositoryf_kojin7 extends JpaRepository<DemoEntityf_kojin7, Long> {
	List<DemoEntityf_kojin7> findByKojinNo(String kojin_no);
}

