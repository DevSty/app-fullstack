package com.stavaray.blacklist.infrastructure.repository;

import com.stavaray.blacklist.domain.model.BlackList;
import com.stavaray.blacklist.domain.repository.BlackListRepository;
import com.stavaray.blacklist.infrastructure.dao.entity.BlackListEntity;
import com.stavaray.blacklist.infrastructure.dao.repository.BlackListRepositoryJPA;
import com.stavaray.blacklist.infrastructure.mapper.BlackListMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class BlackListRepositoryImpl implements BlackListRepository {

    private final BlackListRepositoryJPA blackListRepositoryJPA;


    @Override
    public List<BlackList> findAllBlackList() throws Exception {
        List<BlackListEntity> blackListEntityList = blackListRepositoryJPA.findAllBlackList();
        return blackListEntityList.stream().map(BlackListMapper.INSTANCE::map).collect(Collectors.toList());
    }

    @Override
    public Optional<BlackList> findByCodigo(Integer codigo) throws Exception {
        Optional<BlackListEntity> blackListEntity = blackListRepositoryJPA.findByCodigo(codigo);
        if (blackListEntity.isPresent())
            return BlackListMapper.INSTANCE.map(blackListEntity);
        return Optional.empty();
    }

    @Override
    public Optional<BlackList> saveBlackList(BlackList blackList) throws Exception {
        Optional<BlackListEntity> blackListEntity = Optional.of(blackListRepositoryJPA
                .save(BlackListMapper.INSTANCE.map(blackList)));
        if (blackListEntity.isPresent())
            return BlackListMapper.INSTANCE.map(blackListEntity);
        return Optional.empty();
    }
}
