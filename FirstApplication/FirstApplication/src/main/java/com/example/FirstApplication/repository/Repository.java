package com.example.FirstApplication.repository;

import com.example.FirstApplication.model.Consultant;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Consultant,Long> {

}
