package com.stavaray.blacklist.application.service;

import com.stavaray.blacklist.application.dto.request.BlackListSaveRequest;
import com.stavaray.blacklist.application.dto.request.BlackListUpdateRequest;
import com.stavaray.blacklist.application.dto.response.BlackListResponse;

import java.util.List;
import java.util.Optional;

public interface BlackListExternalService {

    List<BlackListResponse> findAllBlackList() throws Exception;

    Optional<BlackListResponse> findByCodigo(Integer codigo)throws Exception;

    Optional<BlackListResponse> saveBlackList(BlackListSaveRequest blackListSaveRequest)throws Exception;

    Optional<BlackListResponse> updateBlackList(BlackListUpdateRequest blackListUpdateRequest)throws Exception;

    Optional<BlackListResponse> deleteByCodigo(Integer codigo)throws Exception;
}
