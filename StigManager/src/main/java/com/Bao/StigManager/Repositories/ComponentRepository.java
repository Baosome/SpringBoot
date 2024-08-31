package com.Bao.StigManager.Repositories;

import com.Bao.StigManager.Component.ComponentEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComponentRepository extends JpaRepository<ComponentEntity, Integer>{

    List<ComponentEntity> findByeMassId(int eMassID);

    List<ComponentEntity> findByeMassIdAndComponentType(int eMassID, String componentType);

}
