package com.stavaray.blacklist.domain.service.impl;

import com.stavaray.blacklist.domain.model.BlackList;
import com.stavaray.blacklist.domain.repository.BlackListRepository;
import com.stavaray.blacklist.domain.service.BlackListService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BlackListServiceImpl implements BlackListService {

    private final BlackListRepository blackListRepository;

    @Override
    public List<BlackList> findAllBlackList() throws Exception {
        return blackListRepository.findAllBlackList();
    }

    @Override
    public Optional<BlackList> findByCodigo(Integer codigo) throws Exception {
        return blackListRepository.findByCodigo(codigo);
    }

    @Override
    public Optional<BlackList> saveBlackList(BlackList blackList) throws Exception {
        blackList.setEstado((short) 0);
        blackList.setCreatedDate(LocalDateTime.now());
        blackList.setModifiedBy(blackList.getCreatedBy());
        blackList.setModifiedDate(LocalDateTime.now());
        return blackListRepository.saveBlackList(blackList);
    }

    @Override
    public Optional<BlackList> updateBlackList(BlackList blackList) throws Exception {

        Optional<BlackList> blackListOptional = findByCodigo(blackList.getCodigo());
        if (blackListOptional.isPresent()) {

            BlackList blackListUpdate = blackListOptional.get();
            blackListUpdate.setNombre(blackList.getNombre());
            blackListUpdate.setApellidos(blackList.getApellidos());
            blackListUpdate.setDni(blackList.getDni());
            blackListUpdate.setDireccion(blackList.getDireccion());
            blackListUpdate.setReferencia(blackList.getReferencia());
            blackListUpdate.setModifiedBy(blackList.getModifiedBy());
            blackListUpdate.setModifiedDate(LocalDateTime.now());
            return blackListRepository.saveBlackList(blackListUpdate);

        }
        return Optional.empty();

    }

    @Override
    public Optional<BlackList> deleteBlackList(Integer codigo) throws Exception {

        Optional<BlackList> blackList = findByCodigo(codigo);
        if (blackList.isPresent()) {

            BlackList blackListUpdate = blackList.get();
            blackListUpdate.setEstado((short) 1);
            blackListUpdate.setModifiedDate(LocalDateTime.now());
            return blackListRepository.saveBlackList(blackListUpdate);

        }
        return Optional.empty();
    }
}
