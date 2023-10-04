package com.stavaray.blacklist.infrastructure.dao.repository;

import com.stavaray.blacklist.infrastructure.dao.entity.BlackListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface BlackListRepositoryJPA extends JpaRepository<BlackListEntity, Integer> {

    @Query(value = "SELECT bl FROM BlackListEntity bl")
    List<BlackListEntity> findAllBlackList();

    @Query(value = "SELECT bl FROM BlackListEntity bl WHERE bl.codigo=:codigo")
    Optional<BlackListEntity> findByCodigo(@Param("codigo") Integer codigo);


}
