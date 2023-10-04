package com.stavaray.blacklist.domain.repository;



import com.stavaray.blacklist.domain.model.BlackList;

import java.util.List;
import java.util.Optional;

public interface BlackListRepository {

    List<BlackList> findAllBlackList()throws Exception;

    Optional<BlackList> findByCodigo(Integer codigo)throws Exception;

    Optional<BlackList> saveBlackList(BlackList blackList)throws Exception;

}
