package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex03 {

	public static void main(String[] args) throws IOException {

		/*
		 * //PhoneDB.txt파일을 읽는다-->출력해본다 (MS949방식으로 저장되어있음)
		 * //"이정재,010-9999-9999,02-8888-8888(주)열심히" 를","로 구분한다 -->배열
		 * 
		 * //반복 ====>리스트에 정리 [0x111] [0x333] [0x888] 0x111 name = 이효리 hp =010-2222-3333
		 * company =031-2323-4441
		 */

		InputStream in = new FileInputStream("C:\\javaStudy\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(in, "MS949");
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream out = new FileOutputStream("C:\\javaStudy\\PhoneDB.txt");
		OutputStreamWriter owt = new OutputStreamWriter(out , "MS949"); 
		BufferedWriter bw = new BufferedWriter(owt);

		Person[] pArray = new Person[10];

		
		while (true) {
			String str = br.readLine();
			if (str == null) {
				break;
			}
			String[] data = str.split(",");
			if (data.length >= 3) { // 데이터가 3개 이상이어야 유효함
				String name = data[0];
				String hp = data[1];
				String company = data[2];
				
				
				bw.write(str);
			}
	
			br.close();
			bw.close();
		}

	}
}
