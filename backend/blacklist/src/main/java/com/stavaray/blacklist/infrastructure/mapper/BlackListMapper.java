package com.stavaray.blacklist.infrastructure.mapper;

import com.stavaray.blacklist.domain.model.BlackList;
import com.stavaray.blacklist.infrastructure.dao.entity.BlackListEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Optional;

@Mapper
public interface BlackListMapper {

    BlackListMapper INSTANCE = Mappers.getMapper(BlackListMapper.class);

    default BlackList map(BlackListEntity blackListEntity){
        return BlackList.builder()
                .codigo(blackListEntity.getCodigo())
                .nombre(blackListEntity.getNombre())
                .apellidos(blackListEntity.getApellidos())
                .dni(blackListEntity.getDni())
                .direccion(blackListEntity.getDireccion())
                .referencia(blackListEntity.getReferencia())
                .estado(blackListEntity.getEstado())
                .createdBy(blackListEntity.getCreatedBy())
                .createdDate(blackListEntity.getCreatedDate())
                .modifiedBy(blackListEntity.getModifiedBy())
                .modifiedDate(blackListEntity.getModifiedDate())
                .build();
    }

    default BlackListEntity map(BlackList blackList){
        return BlackListEntity.builder()
                .codigo(blackList.getCodigo())
                .nombre(blackList.getNombre())
                .apellidos(blackList.getApellidos())
                .dni(blackList.getDni())
                .direccion(blackList.getDireccion())
                .referencia(blackList.getReferencia())
                .estado(blackList.getEstado())
                .createdBy(blackList.getCreatedBy())
                .createdDate(blackList.getCreatedDate())
                .modifiedBy(blackList.getModifiedBy())
                .modifiedDate(blackList.getModifiedDate())
                .build();
    }

    default Optional<BlackList> map(Optional<BlackListEntity> blackList){
        return Optional.of(BlackList.builder()
                .codigo(blackList.get().getCodigo())
                .nombre(blackList.get().getNombre())
                .apellidos(blackList.get().getApellidos())
                .dni(blackList.get().getDni())
                .direccion(blackList.get().getDireccion())
                .referencia(blackList.get().getReferencia())
                .estado(blackList.get().getEstado())
                .createdBy(blackList.get().getCreatedBy())
                .createdDate(blackList.get().getCreatedDate())
                .modifiedBy(blackList.get().getModifiedBy())
                .modifiedDate(blackList.get().getModifiedDate())
                .build());
    }
}
