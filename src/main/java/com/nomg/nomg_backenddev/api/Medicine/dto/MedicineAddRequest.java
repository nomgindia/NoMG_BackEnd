package com.nomg.nomg_backenddev.api.Medicine.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MedicineAddRequest {
    private String medicineName;
    private String course;
    private String dailyDoses;
    private String time;
}
