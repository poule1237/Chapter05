package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args) throws IOException {

		// 주스트림
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\bufferedimg.jpg");

		// 보조스트림
		BufferedInputStream bin = new BufferedInputStream(in);
		BufferedOutputStream bout = new BufferedOutputStream(out);

		System.out.println("스트림 준비완료");

		System.out.println("복사 시작");
		while (true) {
			// int data = in.read(); 바보짓

			int data = bin.read();

			// -1이면 끝

			if (data == -1) {
				System.out.println("복사끝");
				break;
			}
			bout.write(data);
		}


		// 스트림종료
		bout.close();  //주스트림도 <lose해준다
		bin.close();   //주스트림도 <lose해준다
		
		
		System.out.println("프로그램 종료");

	}

}
