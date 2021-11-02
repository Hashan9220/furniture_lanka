package com.furniture_lanka.service;

import com.furniture_lanka.dto.BedDTO;
import com.furniture_lanka.entity.Bed;
import com.furniture_lanka.repository.BedRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Hashan Saminda <hashansaminda21@gmail.com> (Rdxhashan.tk/)
 */
@Service
@Transactional
public class BedService {

    @Autowired
    private BedRepo bedRepo;

    public boolean saveBed(BedDTO bedDTO) {
        bedRepo.save(new Bed(bedDTO.getName(), bedDTO.getQty(), bedDTO.getPrice(), bedDTO.getDescription(),bedDTO.getImage()));

        return true;

    }
}
