import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ApachePoi {

    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("my_first_sheet");
        sheet.createRow(0);
        sheet.getRow(0).createCell(0).setCellValue("Hello World");
        sheet.getRow(0).createCell(1).setCellValue("leanring POI");

        sheet.createRow(1);
        sheet.getRow(1).createCell(0).setCellValue("World");
        sheet.getRow(1).createCell(1).setCellValue("hello");

        File file=new File("my_file_new.xlsx");

        FileOutputStream fileOutputStream=new FileOutputStream(file);
        workbook.write(fileOutputStream);

        workbook.close();


    }
}
