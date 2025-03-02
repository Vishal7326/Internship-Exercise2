package Excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
    public static void main(String[] args) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Data");

        // Write sample data to the Excel sheet
        Row row = sheet.createRow(1);
        Cell cell = row.createCell(7);
        cell.setCellValue("Sample Data");

        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\Vishal\\Desktop\\ExcelData.xlsx")) {
            workbook.write(fos);
            System.out.println("Excel file written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
