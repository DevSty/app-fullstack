package com.stavaray.blacklist.application.service;

import com.stavaray.blacklist.application.dto.request.BlackListSaveRequest;
import com.stavaray.blacklist.application.dto.request.BlackListUpdateRequest;
import org.springframework.http.ResponseEntity;

public interface BlackListExternalServiceCustom {

    ResponseEntity<Object> customFindAllBlackList();

    ResponseEntity<Object> customFindByCodigo(Integer codigo);

    ResponseEntity<Object> customSaveBlackList(BlackListSaveRequest blackListSaveRequest);

    ResponseEntity<Object> customUpdateBlackList(BlackListUpdateRequest blackListUpdateRequest);

    ResponseEntity<Object> customDeleteByCodigo(Integer codigo);
}
