package com.nomg.nomg_backenddev.api.Medicine.services;


import com.nomg.nomg_backenddev.api.Medicine.dao.MedicineRepository;
import com.nomg.nomg_backenddev.api.Medicine.dto.MedicineAddRequest;
import com.nomg.nomg_backenddev.api.Medicine.dto.MedicineEntity;
import com.nomg.nomg_backenddev.api.Medicine.exception.MedicineException;
import com.nomg.nomg_backenddev.api.admin.dao.AdminRepository;
import com.nomg.nomg_backenddev.api.admin.dto.AdminEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineServices {

    @Autowired
    MedicineRepository medicineRepository;
    @Autowired
    AdminRepository adminRepository;


    public List<MedicineEntity> getAllMedicine(long adminId) {
        AdminEntity admin = adminRepository.findOneById(adminId);
        if(admin==null){
            throw new MedicineException("Invalid");
        }
           return medicineRepository.findAll();
    }

    public String addMedicine(long adminId, MedicineAddRequest medicine) {
        AdminEntity admin = adminRepository.findOneById(adminId);
        if(admin==null){
            throw new MedicineException("Invalid");
        }
        MedicineEntity medicineEntity = new MedicineEntity();
        medicineEntity.setMedicineName(medicine.getMedicineName());
        medicineEntity.setCourse(medicine.getCourse());
        medicineEntity.setDailyDoses(medicine.getDailyDoses());
        medicineEntity.setTime(medicine.getTime());
        medicineRepository.save(medicineEntity);
        return "Success";
    }

    public String deleteMedicine(long adminId, long medicineId) {
        AdminEntity admin = adminRepository.findOneById(adminId);
        if(admin==null){
            throw new MedicineException("Invalid");
        }
         medicineRepository.deleteById(medicineId);
        return "Success";
    }

    public String updateMedicine(long adminId, long medicineId, MedicineAddRequest medicineAddRequest) {
        AdminEntity admin = adminRepository.findOneById(adminId);
        if(admin==null){
            throw new MedicineException("Invalid");
        }
        MedicineEntity medicine = medicineRepository.findOneById(medicineId);
        if(medicine==null) {
            throw new MedicineException("Invalid");

        }
        medicine.setMedicineName(medicineAddRequest.getMedicineName());
        medicine.setCourse(medicineAddRequest.getCourse());
        medicine.setDailyDoses(medicineAddRequest.getDailyDoses());
        medicine.setTime(medicineAddRequest.getTime());
        medicineRepository.save(medicine);
        return "Success";

    }
}
