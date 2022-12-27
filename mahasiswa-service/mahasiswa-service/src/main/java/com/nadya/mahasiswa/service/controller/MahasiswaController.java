/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nadya.mahasiswa.service.controller;

import com.nadya.mahasiswa.service.entity.Mahasiswa;
import com.nadya.mahasiswa.service.userservice.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author win 11
 */
@RestController
@RequestMapping("/mahasiswa")
public class MahasiswaController {
 @Autowired
    private MahasiswaService mahasiswaService;
    
    @PostMapping("/")
    public Mahasiswa saveMahasiswa(@RequestBody Mahasiswa mahasiswa){
        return mahasiswaService.saveMahasiswa(mahasiswa);
    }
    @GetMapping("/{id}")
    public Mahasiswa findMahasiswaByNIM(@PathVariable("id") Long mahasiswaNIM){
        return mahasiswaService.findMahasiswaByNIM(mahasiswaNIM);
    }
}