package getvalueFromeexcle;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class MavenReadexcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Single vale get from excel with workbook//
		File loc = new File("");
		FileInputstream stream = new FileIputstream(loc);
		Workbook w = new XSSFworkbook(stream);
		Sheet s = w.getsheet("sheet1");
		Row r = s.getRow(1);
		Cell c = r.getcell(0);
		System.out.println(c);

		// To get the entire value form workbook into sheet//

		for (int i = 0; i < s.getphysicalnumberofRow(); i++)
			;
		{
			Row r = s.getRow(i);
			for (int j = 0; j < r.getphysicalnumberofcells(); J++)
				;
			{
				Cell C = r.getcell(j);
				System.out.println(c);

			}
		}
	}
}