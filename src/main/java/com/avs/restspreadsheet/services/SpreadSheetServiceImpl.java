package com.avs.restspreadsheet.services;


import com.avs.restspreadsheet.domain.Column;
import com.avs.restspreadsheet.repositories.ColumsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpreadSheetServiceImpl implements SpreadSheetService {

    private ColumsRepository columsRepository;

    public SpreadSheetServiceImpl(ColumsRepository columsRepository) {
        this.columsRepository = columsRepository;
    }

    @Override
    public List<String> getColumns() {
        return columsRepository.getColumns();
    }
}
