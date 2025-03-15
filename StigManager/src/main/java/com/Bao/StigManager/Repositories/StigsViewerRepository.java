package com.Bao.StigManager.Repositories;

import com.Bao.StigManager.STIG.StigEntity;
import com.Bao.StigManager.STIG.StigViewerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StigsViewerRepository extends JpaRepository<StigViewerEntity, Integer>{
    public List<StigViewerEntity> findById(int id);

    public List<StigViewerEntity> searchByName(String username);
}
