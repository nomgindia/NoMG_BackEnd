package com.nomg.nomg_backenddev.api.Medicine.dto;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class MedicineEntity extends AbstractPersistable<Long> {
   private String medicineName;
   private String course;
   private String dailyDoses;
   private String time;
}
