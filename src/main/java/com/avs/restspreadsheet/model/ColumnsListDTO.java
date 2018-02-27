package com.avs.restspreadsheet.model;

import com.avs.restspreadsheet.domain.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ColumnsListDTO {

    List<Column> columns;
}