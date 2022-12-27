/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.nadya.mahasiswa.service.repository;

import com.nadya.mahasiswa.service.entity.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author win 11
 */
public interface MahasiswaRepository extends JpaRepository<Mahasiswa, Long>{
    public Mahasiswa findByMahasiswaNIM(Long mahasiswaNIM);
}
