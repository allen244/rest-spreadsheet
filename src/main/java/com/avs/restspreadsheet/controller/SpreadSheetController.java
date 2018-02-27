package com.avs.restspreadsheet.controller;

import com.avs.restspreadsheet.model.ColumnsListDTO;
import com.avs.restspreadsheet.services.SpreadSheetService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/columns")
public class SpreadSheetController {

    private final SpreadSheetService spreadSheetService;

    public SpreadSheetController(SpreadSheetService spreadSheetService) {
        this.spreadSheetService = spreadSheetService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ColumnsListDTO getAllColumns() {
        return new ColumnsListDTO(spreadSheetService.getColumns());
    }
}
