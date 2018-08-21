package testeSW.Aula21_8;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class ReaderTest {
	
	Reader r = new Reader();
	String path = "/home/alunoic/eclipse-workspace/Aula21-8/src/main/java/testeSW/Aula21_8/teste.txt";
	String exit = "kk eae mens";
	
	@Test
	void constructorTest(){
		assertNotNull(r, "r esta nulo");
	}

	@Test
	void testReadAll() {
		assertAll(
				//() -> { assertThrows(FileNotFoundException.class, () -> { r.readAll(""); }  , "FileInputStream não lançado"); },
				//() -> { assertThrows(IOException.class, () -> { r.readAll(""); }  , "IOException não lançado"); },
				//() -> { assertThrows(NullPointerException.class, () -> { r.readAll(null); }  , "NullPointerException não lançado"); },
				() -> { assertEquals(exit, r.readAll(path), "As Strings estão diferentes"); },
				() -> { assertNotEquals(null, r.readAll(path), "As Strings estão diferentes"); },
				() -> { assertEquals(null, r.readAll(""), "Nulo nao foi retornado"); }
				);
	}

}
