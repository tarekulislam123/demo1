package lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	Sheet sh;
	
	public ExcelReader (String filename, String sheetname) throws IOException {
	FileInputStream fis = new FileInputStream(filename);
	Workbook wb = new XSSFWorkbook(fis);
	sh = wb.getSheet(sheetname);
	
}

     public Object [][] excelToArray(){
    	 int rows = sh.getPhysicalNumberOfRows();
    	 int cells = sh.getRow(0).getPhysicalNumberOfCells();
    	 Object[][]x;
    	 x =new Object[rows-1][cells];
    	 
    	 for (int r =1; r< rows; r=r+1) {
    		 for (int c =0; c < cells; c= c+1) {
    			 x[r-1][c]= getCellData(r,c);
    		 }
    	 }
    	 return x;
     }
    	  public String getCellData(int r, int cell) {
    	    	 Cell c = sh.getRow(r).getCell(cell);
    	    	 String cellValue;
    	    	 if (c.getCellType()== Cell.CELL_TYPE_STRING ) {
    	    		 
    				 cellValue = c.getStringCellValue();
    	    	 
    			 }else {
    				 if (c.getNumericCellValue()%1 == 0) {
    					 cellValue = ""+ (int) c.getNumericCellValue();
    					 
    				 }else {
    					 cellValue = "" + c.getNumericCellValue();
    			 }
    			 
    		 }
    			 return cellValue;
    			 
    			 }
    			 }
    	 
    	 
    	 
    	
    	 
    	 
    	 
     
   
     
