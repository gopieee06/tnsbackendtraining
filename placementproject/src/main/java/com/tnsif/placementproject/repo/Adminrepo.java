package com.tnsif.placementproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.placementproject.entity.AdminTable;

public interface Adminrepo extends JpaRepository<AdminTable,Long> {

}
