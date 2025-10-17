package com.Placement.placementmanagement.Service;

import com.Placement.placementmanagement.Entity.AdminEntity;
import com.Placement.placementmanagement.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Indicates that this is a Service component
public class AdminService {

    @Autowired // Inject the AdminRepository dependency
    private AdminRepository adminRepository;

    // 1. Create/Update Admin
    public AdminEntity createOrUpdateAdmin(AdminEntity admin) {
        return adminRepository.save(admin);
    }

    // 2. Get All Admins
    public List<AdminEntity> getAllAdmins() {
        return adminRepository.findAll();
    }

    // 3. Get Admin by ID
    public Optional<AdminEntity> getAdminById(Long id) {
        return adminRepository.findById(id);
    }

    // 4. Delete Admin by ID
    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }
}