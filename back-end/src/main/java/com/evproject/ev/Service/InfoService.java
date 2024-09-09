package com.evproject.ev.Service;

import com.evproject.ev.DTO.InfoDTO;
import com.evproject.ev.Entity.InfoEntity;
import com.evproject.ev.Repository.InfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class InfoService {

    private final InfoRepository infoRepository;

    public void save(InfoDTO infoDTO) {
        InfoEntity infoEntity = InfoEntity.toInfoEntity(infoDTO);
        infoRepository.save(infoEntity);
    }

    public List<InfoDTO> findAll() {
        return infoRepository.findAll().stream()
                .map(InfoDTO::toInfoDTO)
                .collect(Collectors.toList());
    }
}
