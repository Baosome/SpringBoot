package com.Bao.StigManager.Repositories;

import com.Bao.StigManager.STIG.StigEntity;
import com.Bao.StigManager.System.SystemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StigsRepository extends JpaRepository<StigEntity, Integer>{
    public List<StigEntity> findByEMassId(int id);
}
