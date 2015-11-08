package testes;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*; 
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteElementsCollection {

	@Before
	public void abreAPaginaParaTeste() {
		open("http://localhost:8080/aprendendo-selenide/elementsCollection.html");
	}

	@Test
	public void testeTabelaGastosMensais() {

		$$("#tblGastosMensais tr").shouldHave(size(3));
		assertEquals(true, $$("#tblGastosMensais tr td").findBy(text("R$500")).exists());
		assertEquals(false, $$("#tblGastosMensais tr td").filterBy(text("Janeiro")).isEmpty());
		assertEquals(false, $$("#tblGastosMensais tr td").excludeWith(text("Fevereiro")).isEmpty());

	}

}
