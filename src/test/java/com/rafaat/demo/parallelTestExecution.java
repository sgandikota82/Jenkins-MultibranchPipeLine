package com.rafaat.demo;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class parallelTestExecution {

    org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(parallelTestExecution.class);

    @Test
    public void path_exist() throws IOException {


       InputStream is= parallelTestExecution.class.getClassLoader().getResourceAsStream("test-suites" + "/" + "TestExcel2.xlsx");

//        File file = new File("/Users/sgandikota/Local Documents/WorkSpace/Jenkins-MultibranchPipeLine/src/test/resources/test-suites/TestExcel2.xlsx");
//        FileInputStream fis =new FileInputStream(file);

        XSSFWorkbook excel= new XSSFWorkbook(is);
        XSSFSheet sheet= excel.getSheetAt(0);

        Iterator<Row> rowIt = sheet.rowIterator();

        while(rowIt.hasNext()){

            Row row = rowIt.next();
            Iterator<Cell> cellIt =row.cellIterator();

          while(cellIt.hasNext()){
              System.out.println("cell values is:" + cellIt.next());
          }

        }



    }


    @Test
    public void readExcelFromScanner() throws IOException {

        File file = new File("/Users/sgandikota/Local Documents/WorkSpace/Jenkins-MultibranchPipeLine/src/test/resources/test-suites/TestExcel2.xlsx");
        FileInputStream fis =new FileInputStream(file);

        //Display Excel content using Scanner
        Scanner scan = new Scanner(fis);
            while(scan.hasNext()){
                String data = scan.next();
                System.out.println("File Data is :" + data);

            }

        //Display Excel content using Files nio
        Path path = Paths.get("/Users/sgandikota/Local Documents/WorkSpace/Jenkins-MultibranchPipeLine/src/test/resources/test-suites/TestExcel2.xlsx");
            String fileData=new String(Files.readAllBytes(path),StandardCharsets.UTF_8);
        System.out.println("File Data from Files nio is :" + System.lineSeparator() + fileData);

    }



}
