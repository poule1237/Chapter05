package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) throws IOException{
		
		//리스트 만들기
		List<Person> pList = new ArrayList<Person>();
		
		//스트림 준비
		Reader fr = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		
		//반복(파일이 끝까지)
		while(true) {
			//파일에서 1줄(이효리)을 읽는다
			String str =br.readLine(); 
			
			//마지막이면 끝
			if(str == null) {
				break;
			}
			
			//읽어줄에서 이름 hp company로 분리한다  
			//"정우성,010-2222-3333,031-2323-4441" -->[이효리][010-2222-3333][031-2323-4441]
			String[] sArray = str.split(",");
			
			String name = sArray[0];
			String hp = sArray[1];
			String company = sArray[2];
			
			//Person을 메모리에 올린다
			Person p = new Person(name, hp, company );
			
			//Person(주소)를 List에 추가한다
			pList.add(p);
		}
		
		//테스트전체값 출력
		System.out.println("---테스트전체값 출력-------------");
		System.out.println(pList.toString());
		
		
		//출력
		System.out.println("---출력----------------");
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
	
		
		//이름만 출력
		System.out.println("---이름만 출력--------------------");
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).getName());
		}
		
		
		//첫번째 사람의 이름, 핸드폰
		System.out.println("---첫번째 사람의 이름, 핸드폰--------------------");
		/*
		System.out.println(pList.get(0).getName());
		System.out.println(pList.get(0).getHp());
		*/
		Person p00= pList.get(0);
		System.out.println(p00.getName());
		System.out.println(p00.getHp());
		
		br.close();
		
	}

}