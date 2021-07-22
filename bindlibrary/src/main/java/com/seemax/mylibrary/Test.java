package com.seemax.mylibrary;

import com.junniba.mylibrary.Tool.JExcelTool;

import java.io.IOException;

/**
 * @author JUN
 * @createTime 2021/7/20
 */
public class Test {

    void call() throws IOException {
        JExcelTool.writeExcel("", "浓度情况", null);
    }
}
