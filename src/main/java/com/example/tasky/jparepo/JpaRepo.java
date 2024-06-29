package com.example.tasky.jparepo;
import com.example.tasky.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface JpaRepo extends JpaRepository<Model,Integer>{
}
