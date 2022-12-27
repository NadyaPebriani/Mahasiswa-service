/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nadya.mahasiswa.service.userservice;

import com.nadya.mahasiswa.service.entity.Mahasiswa;
import com.nadya.mahasiswa.service.repository.MahasiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author win 11
 */
@Service
public class MahasiswaService {
    @Autowired
    private MahasiswaRepository mahasiswaRepository;
    
    public Mahasiswa saveMahasiswa(Mahasiswa mahasiswa){
        return mahasiswaRepository.save(mahasiswa);
    }
    
    public Mahasiswa findMahasiswaByNIM(Long mahasiswaNIM){
        return mahasiswaRepository.findByMahasiswaNIM(mahasiswaNIM);
    }
}
