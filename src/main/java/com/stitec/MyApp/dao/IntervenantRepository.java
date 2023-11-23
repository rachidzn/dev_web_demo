package com.stitec.MyApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stitec.MyApp.entity.Intervenant;

public interface IntervenantRepository extends JpaRepository<Intervenant, Integer> {

}
