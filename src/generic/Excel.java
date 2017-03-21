package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	 public static int getRowCount(String path, String sheet) throws EncryptedDocumentException, InvalidFormatException, IOException{
		int rc =0;
		try{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb= WorkbookFactory.create(fis);
		   rc= wb.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e){}
		   return rc;
		 }

 
	 public static String getCellValue(String path,String sheet,int r,int c) throws EncryptedDocumentException, InvalidFormatException, IOException{
		 String v ="";
		 try{
		 FileInputStream fis = new FileInputStream(path);
		 Workbook wb= WorkbookFactory.create(fis);
		v= wb.getSheet(sheet).getRow(r).getCell(c).toString();
		 }
		 catch(Exception e){}
		 return v;
	 }
}
