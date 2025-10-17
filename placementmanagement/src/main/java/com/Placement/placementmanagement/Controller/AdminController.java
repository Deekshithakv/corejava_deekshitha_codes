package com.Placement.placementmanagement.Controller;

import com.Placement.placementmanagement.Entity.AdminEntity;
import com.Placement.placementmanagement.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // Indicates that this is a REST Controller
@RequestMapping("/api/admins") // Base path for all endpoints in this controller
public class AdminController {

    @Autowired // Inject the AdminService dependency
    private AdminService adminService;

    // POST: Create a new Admin
    // Endpoint: POST /api/admins
    @PostMapping
    public ResponseEntity<AdminEntity> createAdmin(@RequestBody AdminEntity admin) {
        AdminEntity newAdmin = adminService.createOrUpdateAdmin(admin);
        return new ResponseEntity<>(newAdmin, HttpStatus.CREATED);
    }

    // GET: Get all Admins
    // Endpoint: GET /api/admins
    @GetMapping
    public ResponseEntity<List<AdminEntity>> getAllAdmins() {
        List<AdminEntity> admins = adminService.getAllAdmins();
        return new ResponseEntity<>(admins, HttpStatus.OK);
    }

    // GET: Get Admin by ID
    // Endpoint: GET /api/admins/{id}
    @GetMapping("/{id}")
    public ResponseEntity<AdminEntity> getAdminById(@PathVariable Long id) {
        Optional<AdminEntity> admin = adminService.getAdminById(id);
        return admin.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // PUT: Update an existing Admin
    // Endpoint: PUT /api/admins/{id}
    @PutMapping("/{id}")
    public ResponseEntity<AdminEntity> updateAdmin(@PathVariable Long id, @RequestBody AdminEntity adminDetails) {
        // Simple update logic: ensure ID is set for update and record exists
        return adminService.getAdminById(id)
                .map(existingAdmin -> {
                    adminDetails.setId(id); // Ensure the correct ID is used
                    AdminEntity updatedAdmin = adminService.createOrUpdateAdmin(adminDetails);
                    return new ResponseEntity<>(updatedAdmin, HttpStatus.OK);
                })
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // DELETE: Delete an Admin
    // Endpoint: DELETE /api/admins/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAdmin(@PathVariable Long id) {
        if (adminService.getAdminById(id).isPresent()) {
            adminService.deleteAdmin(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT); // 204 No Content
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404 Not Found
        }
    }
}