
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class readExcel {

    ArrayList<chessData> dataList = new ArrayList<chessData>();

    public List<chessData> data() {
        try {

            //read
            File excelFile = new File("C:\\Users\\User-PC\\Desktop\\KerjohananData.xlsx");
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(excelFile);
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }

            //create XSSF Workbook
            XSSFWorkbook workbook = null;
            try {
                workbook = new XSSFWorkbook(fis);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            //get 1st sheet
            XSSFSheet sheet = workbook.getSheetAt(0);

            //iterate on rows
            for (Row row : sheet) {

                Cell c1 = row.getCell(0);//get c1 data (no.)
                String num = String.valueOf(c1);

                // column1 is blank so we skip it

                Cell c2 = row.getCell(2);//get c2 data (name)
                String name = String.valueOf(c2);

                Cell c3 = row.getCell(3);//get c3 data (Fide)
                String fide = String.valueOf(c3);

                Cell c4 = row.getCell(4);//get c4 data (FED)
                String fed = String.valueOf(c4);

                Cell c5 = row.getCell(5);//get c5 data (RTG)
                String rtg = String.valueOf(c5);

                Cell c6 = row.getCell(6);//get c6 data (CLUB/CITY)
                String club = String.valueOf(c6);

                dataList.add(new chessData(num, name, fide, fed, rtg, club));

                
                System.out.printf("%4s%40s%10s%4s%10s%25s", num, name, fide, fed, rtg, club);
                System.out.println("");
            }
            workbook.close();
            fis.close();
            return dataList;
        } catch (Exception e) {
            return null;
        }
    }
}
