package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws IOException {

		// 주스트림
		Reader fr = new FileReader("C:\\javaStudy\\Song.txt");

		// 보조스트림
		BufferedReader br = new BufferedReader(fr);

		System.out.println("스트림준비완료");

		while (true) {

			String str = br.readLine();
			if (str == null) {
				System.out.println("파일읽기 끝");
				break;
			}
			System.out.println(str);
		}

		// 스트림종료
		br.close();

		System.out.println("프로그램 종료");

	}

}
