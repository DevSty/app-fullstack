package com.stavaray.blacklist.application.service.impl;

import com.stavaray.blacklist.application.dto.request.BlackListSaveRequest;
import com.stavaray.blacklist.application.dto.request.BlackListUpdateRequest;
import com.stavaray.blacklist.application.dto.response.BlackListResponse;
import com.stavaray.blacklist.application.service.BlackListExternalService;
import com.stavaray.blacklist.application.service.BlackListExternalServiceCustom;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BlackListExternalServiceCustomImpl implements BlackListExternalServiceCustom {

    private final BlackListExternalService  blackListExternalService;

    @Override
    @SneakyThrows
    public ResponseEntity<Object> customFindAllBlackList() {
        List<BlackListResponse> blackListResponseList = blackListExternalService.findAllBlackList();
        if(!blackListResponseList.isEmpty())
            return ResponseEntity.ok(blackListResponseList);
        return ResponseEntity.notFound().build();
    }

    @Override
    @SneakyThrows
    public ResponseEntity<Object> customFindByCodigo(Integer codigo) {
        Optional<BlackListResponse> blackListResponse = blackListExternalService.findByCodigo(codigo);
        if(blackListResponse.isPresent())
            return ResponseEntity.ok(blackListResponse);
        return ResponseEntity.notFound().build();
    }

    @Override
    @SneakyThrows
    public ResponseEntity<Object> customSaveBlackList(BlackListSaveRequest blackListSaveRequest) {
        Optional<BlackListResponse> blackListResponse = blackListExternalService.saveBlackList(blackListSaveRequest);
        if(blackListResponse.isPresent())
            return ResponseEntity.ok(blackListResponse);
        return ResponseEntity.badRequest().build();
    }

    @Override
    @SneakyThrows
    public ResponseEntity<Object> customUpdateBlackList(BlackListUpdateRequest blackListUpdateRequest) {
        Optional<BlackListResponse> blackListResponse = blackListExternalService.updateBlackList(blackListUpdateRequest);
        if(blackListResponse.isPresent())
            return ResponseEntity.ok(blackListResponse);
        return ResponseEntity.badRequest().build();
    }

    @Override
    @SneakyThrows
    public ResponseEntity<Object> customDeleteByCodigo(Integer codigo) {
        Optional<BlackListResponse> blackListResponse = blackListExternalService.deleteByCodigo(codigo);
        if(blackListResponse.isPresent())
            return new ResponseEntity<>(HttpStatus.OK);
        return ResponseEntity.notFound().build();
    }
}
