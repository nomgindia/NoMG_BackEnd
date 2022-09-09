package com.nomg.nomg_backenddev.api.admin.dao;


import com.nomg.nomg_backenddev.api.admin.dto.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity,Long> {
    AdminEntity findOneById(long adminId);
}
