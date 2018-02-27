package com.avs.restspreadsheet.domain;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
public class Column {

    private List<String> columns = new ArrayList<>();

    public Column() {
    }

    public Column(List<String> columns) {
        this.columns = columns;
    }


    public void addColumn(String name) {

        this.columns.add(name);

    }

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }
}
