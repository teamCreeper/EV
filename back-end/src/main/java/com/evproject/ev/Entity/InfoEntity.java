package com.evproject.ev.Entity;

import com.evproject.ev.DTO.InfoDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "electric_vehicles")
public class InfoEntity {
    @Id
    @Column(name = "car_num", unique = true, nullable = false)
    private String carNum;

    @Column(name = "brand")
    private String brand;

    @Column(name = "name")
    private String name;

    public static InfoEntity toInfoEntity(InfoDTO infoDTO) {
        InfoEntity infoEntity = new InfoEntity();
        infoEntity.setCarNum(infoDTO.getCarNum());
        infoEntity.setBrand(infoDTO.getBrand());
        infoEntity.setName(infoDTO.getName());
        return infoEntity;
    }
}
