package com.nomg.nomg_backenddev.api.Medicine.controller;


import com.nomg.nomg_backenddev.api.Medicine.dto.MedicineAddRequest;
import com.nomg.nomg_backenddev.api.Medicine.dto.MedicineEntity;
import com.nomg.nomg_backenddev.api.Medicine.services.MedicineServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("nomgindia/api/v1/medicine/")
public class MedicineController {


    @Autowired
    MedicineServices medicineServices;

    @GetMapping("getAllMedicine/")
    public List<MedicineEntity> getAllMedicine(long adminId){
        return medicineServices.getAllMedicine(adminId);
    }


    @PostMapping("addMedicine/{adminId}")
    public String addMedicine(@PathVariable("adminId") long adminId,
                              @RequestBody MedicineAddRequest medicine){
        return medicineServices.addMedicine(adminId,medicine);
    }

    @DeleteMapping("deleteMedicine/{adminId}/{medicineId}")
    public String deleteMedicine(@PathVariable("adminId") long adminId,
                                 @PathVariable("medicineId") long medicineId){
        return medicineServices.deleteMedicine(adminId,medicineId);
    }

    @PutMapping("updateMedicine/{adminId}/{/medicineId}")
    public String updateMedicine(@PathVariable("adminId") long adminId,
                                 @PathVariable("medicineId") long medicineId,
                                 @RequestBody MedicineAddRequest medicineAddRequest){
        return medicineServices.updateMedicine(adminId,medicineId,medicineAddRequest);
    }

}
