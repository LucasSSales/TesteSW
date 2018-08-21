package testeSW.Aula21_8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Reader{
	
	public String readAll(String path) {
		String text = new String();
		try {
			FileInputStream f = new FileInputStream(path);
			int size = f.available();//metodo arriscado, estimativa do tamanho
			for(int i=0; i < size; i++) 
				text += (char)f.read();
			f.close();
			return text;
		}catch (Exception e) {
			return null;
		}
	}
}
