package com.Placement.placementmanagement.Repository;

import com.Placement.placementmanagement.Entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Indicates that this is a Repository component
public interface AdminRepository extends JpaRepository<AdminEntity, Long> {
    // JpaRepository provides all standard CRUD methods for AdminEntity
    // <Entity_Type, Primary_Key_Type>
}