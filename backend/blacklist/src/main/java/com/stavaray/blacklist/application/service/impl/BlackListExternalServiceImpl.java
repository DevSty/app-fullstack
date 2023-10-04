package com.stavaray.blacklist.application.service.impl;

import com.stavaray.blacklist.application.dto.request.BlackListSaveRequest;
import com.stavaray.blacklist.application.dto.request.BlackListUpdateRequest;
import com.stavaray.blacklist.application.dto.response.BlackListResponse;
import com.stavaray.blacklist.application.mapper.BlackListMapperExternal;
import com.stavaray.blacklist.application.service.BlackListExternalService;
import com.stavaray.blacklist.domain.model.BlackList;
import com.stavaray.blacklist.domain.service.BlackListService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class BlackListExternalServiceImpl implements BlackListExternalService {

    private final BlackListService blackListService;

    public BlackListExternalServiceImpl(BlackListService blackListService) {
        this.blackListService = blackListService;
    }

    @Override
    public List<BlackListResponse> findAllBlackList() throws Exception {

        List<BlackList> blackLists = blackListService.findAllBlackList();
        return blackLists.stream().map(BlackListMapperExternal.INSTANCE::map).collect(Collectors.toList());
    }

    @Override
    public Optional<BlackListResponse> findByCodigo(Integer codigo) throws Exception {
        Optional<BlackList> blackListOptional = blackListService.findByCodigo(codigo);
        if (blackListOptional.isPresent())
            return BlackListMapperExternal.INSTANCE.map(blackListOptional);
        return Optional.empty();
    }

    @Override
    public Optional<BlackListResponse> saveBlackList(BlackListSaveRequest blackListSaveRequest) throws Exception {

        Optional<BlackList> blackListOptional = blackListService
                .saveBlackList(BlackListMapperExternal.INSTANCE.map(blackListSaveRequest));
        if(blackListOptional.isPresent())
            return BlackListMapperExternal.INSTANCE.map(blackListOptional);
        return Optional.empty();
    }

    @Override
    public Optional<BlackListResponse> updateBlackList(BlackListUpdateRequest blackListUpdateRequest) throws Exception {
        Optional<BlackList> blackListOptional = blackListService
                .updateBlackList(BlackListMapperExternal.INSTANCE.map(blackListUpdateRequest));
        if(blackListOptional.isPresent())
            return BlackListMapperExternal.INSTANCE.map(blackListOptional);
        return Optional.empty();
    }

    @Override
    public Optional<BlackListResponse> deleteByCodigo(Integer codigo) throws Exception {
        Optional<BlackList> blackListOptional = blackListService.deleteBlackList(codigo);
        if (blackListOptional.isPresent())
            return BlackListMapperExternal.INSTANCE.map(blackListOptional);
        return Optional.empty();
    }
}
