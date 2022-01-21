package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

/**
 * Hello world!
 * FileOutputStream을 이용하여 엑셀 파일을 생성하는 예제
 *
 * https://dailylifecoding.tistory.com/entry/apache-POI-%EA%B0%84%EB%8B%A8-%EC%82%AC%EC%9A%A9%EB%B2%95-1 참고
 */
public class App {

    public static String filePath = "D:\\Workspace";                //저장경로
    public static String fileNm = "poi_making_file_test.xlsx";      //저장할 파일명

    public static void main( String[] args ) throws IOException {

        // 빈 Workbook 생성
        XSSFWorkbook workbook = new XSSFWorkbook();

        // 빈 Sheet 를 생성
        XSSFSheet sheet = workbook.createSheet("member data");

        // Sheet 를 채우기 위한 데이터들을 Map 에 저장해둠
        Map<String, Object[]> data = new HashMap<>();
        data.put("1", new Object[]{"No", "NAME", "PHONE"});
        data.put("2", new Object[]{"SS001", "조골퍼", "01012345678"});
        data.put("3", new Object[]{"SS002", "김골퍼", "01087654321"});
        data.put("4", new Object[]{"SS003", "최골퍼", "01098765432"});

        /* data 에서 keySet 를 가져온다. 이 Set 값들을 조회하면서 데이터들을 Sheet 에 입력한다. */
        Set<String> keySet = data.keySet();

        /* data 의 row 갯수만큼 반복해서 처리 */
        int rowNum = 0;
        for(String key : keySet) {
            Row row = sheet.createRow(rowNum++);        //row 생성
            Object[] objArr = data.get(key);

            /* data row의 column 수만큼 반복해서 처리 */
            int cellNum = 0;
            for(Object obj : objArr) {
                Cell cell = row.createCell(cellNum++);  //cell 생성

                /* 셀값의 타입에 따라 value 값 넣기 */
                if(obj instanceof String) {
                    cell.setCellValue((String)obj);
                } else if(obj instanceof Integer) {
                    cell.setCellValue((Integer)obj);
                }
            }
        }

        FileOutputStream out = null;

        try {
            out = new FileOutputStream(new File(filePath, fileNm)); //file 생성
            workbook.write(out);                                    //excel 저장
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) out.close();                           //file resource 반환
            workbook.close();                                       //excel resource 반환
        }

    }
}
