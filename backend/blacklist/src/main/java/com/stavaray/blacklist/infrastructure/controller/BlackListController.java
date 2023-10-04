package com.stavaray.blacklist.infrastructure.controller;

import com.stavaray.blacklist.application.dto.request.BlackListSaveRequest;
import com.stavaray.blacklist.application.dto.request.BlackListUpdateRequest;
import com.stavaray.blacklist.application.service.BlackListExternalServiceCustom;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("api/black-list")
public class BlackListController {

    private final BlackListExternalServiceCustom blackListExternalServiceCustom;

    @GetMapping
    public ResponseEntity<?> findAllBlackList(){
        return blackListExternalServiceCustom.customFindAllBlackList();
    }

    @GetMapping(value = "/{codigo}")
    public ResponseEntity<?> findByCodigo(@PathVariable("codigo")Integer codigo){
        return blackListExternalServiceCustom.customFindByCodigo(codigo);
    }

    @PostMapping
    public ResponseEntity<?> saveBlackList(@RequestBody BlackListSaveRequest blackListSaveRequest){
        return blackListExternalServiceCustom.customSaveBlackList(blackListSaveRequest);
    }

    @PutMapping
    public ResponseEntity<?> updateBlackList(@RequestBody BlackListUpdateRequest blackListUpdateRequest){
        return blackListExternalServiceCustom.customUpdateBlackList(blackListUpdateRequest);
    }

    @DeleteMapping(value = "/{codigo}")
    public ResponseEntity<?> deleteBlackList(@PathVariable("codigo") Integer codigo){
        return blackListExternalServiceCustom.customDeleteByCodigo(codigo);
    }

}
