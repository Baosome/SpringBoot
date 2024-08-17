package com.Bao.StigManager.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bao.StigManager.System.SystemEntity;

public interface SystemRepository extends JpaRepository<SystemEntity, Integer>{

    public List<SystemEntity> findByUsername(String Username);
}
