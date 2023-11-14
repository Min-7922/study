package exception;

import java.io.File;	// 파일 혹은 디렉토리(폴더)를 활용하기 위한 클래스
import java.io.FileWriter;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) throws IOException, InterruptedException {
		File f1 = new File("a.txt");			// 현재폴더에서의 a.txt
		File f2 = new File("C:\\windows");		// 절대경로를 이용한 디렉토리
		File f3 = new File(f2, "notepad.exe");	// 다른 디렉토리 내부에 있는 notepad.exe
		
		System.out.println("f1이 실제로 존재하는가 : " + f1.exists());
		System.out.println("f2이 실제로 존재하는가 : " + f2.exists());
		System.out.println("f3이 실제로 존재하는가 : " + f3.exists());
		System.out.println();	// File클래스로 객체를 생성하는 것은 실제 파일 존재와는 상관이 없다
		
		System.out.println("f1이 파일인가 : " + f1.isFile());	// 없는 요소에 대해서는 판단할 수 없다 (=false)
		System.out.println("f2이 파일인가 : " + f2.isFile());	// 실제 존재하지만 파일이 아님
		System.out.println("f3이 파일인가 : " + f3.isFile());	// 실제 존재하며 파일이다
		System.out.println();	// 텍스트 혹은 실행파일 등을 말한다
		
		System.out.println("f1이 디렉토리인가 : " + f1.isDirectory());	// 없는 요소에 대해서는 판단할 수 없다 (=false)
		System.out.println("f2이 디렉토리인가 : " + f2.isDirectory());	// 실제 존재하며 디렉토리이다
		System.out.println("f3이 디렉토리인가 : " + f3.isDirectory());	// 실제 존재하지만 디렉토리가 아니다
		System.out.println();	// 폴더를 말한다
		
		if(f1.exists() == false) {
			f1.createNewFile();	// 파일을 만드는 명령어 -> 예외처리를 강제하고 있음
		}
		
		FileWriter fw = new FileWriter(f1);
		fw.append("Hello");
		fw.append("world\n");
		fw.flush();
		fw.close();
		
		Runtime rt = Runtime.getRuntime();
		Process pro = rt.exec("notepad " + f1.getName());
		Thread.sleep(2000);
		pro.destroy();
		
		if(f1.exists()) {
			f1.delete();	// file삭제 명령어
		}
	}

}
