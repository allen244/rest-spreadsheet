package com.avs.restspreadsheet.repositories;

import com.avs.restspreadsheet.domain.Column;
import com.avs.restspreadsheet.utils.ReadSpreadSheetHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ColumsRepository {

    @Autowired
    ReadSpreadSheetHelper readSpreadSheetHelper;

    public List<String> getColumns() {
        return readSpreadSheetHelper.readColumNames();
    }
}
