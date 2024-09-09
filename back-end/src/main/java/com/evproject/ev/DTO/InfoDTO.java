package com.evproject.ev.DTO;

import com.evproject.ev.Entity.InfoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Setter
@Getter
public class InfoDTO {
    private String carNum; // ID 대신 CAR_NUM을 사용
    private String brand;
    private String name;

    public static InfoDTO toInfoDTO(InfoEntity infoEntity){
        InfoDTO infoDTO = new InfoDTO();
        infoDTO.setCarNum(infoEntity.getCarNum());
        infoDTO.setBrand(infoEntity.getBrand());
        infoDTO.setName(infoEntity.getName());
        return infoDTO;
    }
}
