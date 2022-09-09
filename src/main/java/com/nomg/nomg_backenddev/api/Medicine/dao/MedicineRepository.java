package com.nomg.nomg_backenddev.api.Medicine.dao;


import com.nomg.nomg_backenddev.api.Medicine.dto.MedicineEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineRepository extends JpaRepository<MedicineEntity,Long> {

    MedicineEntity findOneById(long medicineId);

}
