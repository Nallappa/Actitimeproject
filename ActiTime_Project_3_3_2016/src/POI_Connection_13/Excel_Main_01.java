package POI_Connection_13;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.ExcelStyleDateFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Main_01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		XSSFWorkbook ExcelWBook;
		XSSFSheet ExcelWSheet;
		XSSFCell Cell;
		XSSFRow Row;
		

					   
		String Path = "D:\\Projects\\Java Project\\ActiTime_Project\\src\\POI_Connection_13\\TestData.xlsx";
		String SheetName = "Login";
		
		
		// Open the Excel file
					FileInputStream ExcelFile = new FileInputStream(Path);

					// Access the required test data sheet
					ExcelWBook = new XSSFWorkbook(ExcelFile);
					
					ExcelWSheet = ExcelWBook.getSheet(SheetName);
					int rcount = ExcelWSheet.getLastRowNum();					
					int ccount = ExcelWSheet.getRow(0).getLastCellNum();
					System.out.println("Rows : " + rcount);
					System.out.println("Cols : " + ccount);
					String CellData =null;
					
					for(int r = 0;r<=rcount;r++)
					{
						for(int c=0;c<ccount;c++)
							try {
								Cell = ExcelWSheet.getRow(r).getCell(c);	
										
								try {
									CellData = Cell.getStringCellValue();
									
								} catch (Exception e) {
									// TODO Auto-generated catch block
									CellData = "";									
								}								
								System.out.println("Cell Data : "+CellData);

							} catch (Exception e) {
								e.printStackTrace();
							}
					}
					
					ExcelFile.close();
	}

}
