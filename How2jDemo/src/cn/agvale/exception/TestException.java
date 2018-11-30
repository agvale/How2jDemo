package cn.agvale.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestException {
	public static void main(String[] args) {
		File f = new File("d:/LOL.exe");
		try {
			new FileInputStream(f);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date d = sdf.parse("2018-11-29");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
