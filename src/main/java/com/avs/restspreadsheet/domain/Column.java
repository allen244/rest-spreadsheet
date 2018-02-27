package com.avs.restspreadsheet.domain;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Component
public class Column {

    String columName;


    public Column(String columName) {
        this.columName = columName;
    }

    public Column() {
    }
}
