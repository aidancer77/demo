package com.example.demo.repo;

import com.example.demo.domain.Main;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainRepo extends JpaRepository<Main, Long> {
}
