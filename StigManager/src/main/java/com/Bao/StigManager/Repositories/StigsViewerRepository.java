package com.Bao.StigManager.Repositories;

import com.Bao.StigManager.STIG.StigViewerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StigsViewerRepository extends JpaRepository<StigViewerEntity, Integer>{
    public List<StigViewerEntity> findById(int id);

    List<StigViewerEntity> findByNameContaining(String name);

    @Query("SELECT s FROM StigViewerEntity s WHERE LOWER(s.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<StigViewerEntity> searchByNameIgnoreCase(@Param("name") String name);
}
