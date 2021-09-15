package com.example.tao3branch.repository;

import com.example.tao3branch.models.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Students, Long> {
}
