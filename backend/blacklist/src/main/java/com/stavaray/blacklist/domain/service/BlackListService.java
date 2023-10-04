package com.stavaray.blacklist.domain.service;

import com.stavaray.blacklist.domain.model.BlackList;

import java.util.List;
import java.util.Optional;

public interface BlackListService {

    List<BlackList> findAllBlackList()throws Exception;

    Optional<BlackList> findByCodigo(Integer codigo)throws Exception;

    Optional<BlackList> saveBlackList(BlackList blackList)throws Exception;

    Optional<BlackList> updateBlackList(BlackList blackList)throws Exception;

    Optional<BlackList> deleteBlackList(Integer codigo)throws Exception;
}
