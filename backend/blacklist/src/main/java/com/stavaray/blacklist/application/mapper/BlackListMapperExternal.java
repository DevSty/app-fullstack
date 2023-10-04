package com.stavaray.blacklist.application.mapper;

import com.stavaray.blacklist.application.dto.request.BlackListSaveRequest;
import com.stavaray.blacklist.application.dto.request.BlackListUpdateRequest;
import com.stavaray.blacklist.application.dto.response.BlackListResponse;
import com.stavaray.blacklist.domain.model.BlackList;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Optional;

@Mapper
public interface BlackListMapperExternal {

    BlackListMapperExternal INSTANCE = Mappers.getMapper(BlackListMapperExternal.class);

    default BlackList map(BlackListSaveRequest blackListSaveRequest) {
        return BlackList.builder()
                .nombre(blackListSaveRequest.getNombre())
                .apellidos(blackListSaveRequest.getApellidos())
                .dni(blackListSaveRequest.getDni())
                .direccion(blackListSaveRequest.getDireccion())
                .referencia(blackListSaveRequest.getReferencia())
                .createdBy(blackListSaveRequest.getCreatedBy())
                .build();
    }

    default BlackList map(BlackListUpdateRequest blackListUpdateRequest) {
        return BlackList.builder()
                .codigo(blackListUpdateRequest.getCodigo())
                .nombre(blackListUpdateRequest.getNombre())
                .apellidos(blackListUpdateRequest.getApellidos())
                .dni(blackListUpdateRequest.getDni())
                .direccion(blackListUpdateRequest.getDireccion())
                .referencia(blackListUpdateRequest.getReferencia())
                .modifiedBy(blackListUpdateRequest.getModifiedBy())
                .build();
    }

    default Optional<BlackListResponse> map(Optional<BlackList> blackListOptional) {
        return Optional.of(BlackListResponse.builder()
                .nombre(blackListOptional.get().getNombre())
                .apellidos(blackListOptional.get().getApellidos())
                .dni(blackListOptional.get().getDni())
                .direccion(blackListOptional.get().getDireccion())
                .referencia(blackListOptional.get().getReferencia())
                .estado(blackListOptional.get().getEstado())
                .build());
    }

    default BlackListResponse map(BlackList blackList) {
        return BlackListResponse.builder()
                .nombre(blackList.getNombre())
                .apellidos(blackList.getApellidos())
                .dni(blackList.getDni())
                .direccion(blackList.getDireccion())
                .referencia(blackList.getReferencia())
                .estado(blackList.getEstado())
                .build();
    }

}
