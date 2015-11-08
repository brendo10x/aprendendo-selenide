package testes;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertEquals;
import org.junit.*; 
import org.openqa.selenium.By;

public class TesteSeletorElemento {

	@Before
	public void abreAPaginaParaTeste() {
		open("http://localhost:8080/aprendendo-selenide/seletores.html");
	}

	@Test
	public void testeSeletorElementoSelenideElement() {  

		assertEquals("<div id=\"texto\">Obter elemento com o id: texto</div>", $(By.id("texto")).toString());
		assertEquals("<input name=\"nomeInput\" type=\"text\" value=\"Obter elemento pelo atributo value\"></input>", $(By.name("nomeInput")).toString());
		assertEquals("<div id=\"texto\">Obter elemento com o id: texto</div>", $("#texto").toString());
		assertEquals("<div id=\"texto\">Obter elemento com o id: texto</div>", $(byText("Obter elemento com o id: texto")).toString());
		assertEquals("<div id=\"texto\">Obter elemento com o id: texto</div>", $(withText("Obter elemento com o id: texto")).toString());
		assertEquals("<div id=\"texto\">Obter elemento com o id: texto</div>", $(by("id", "texto")).toString());
		assertEquals("<input name=\"nomeInput\" type=\"text\" value=\"Obter elemento pelo atributo value\"></input>", $(by("value", "Obter elemento pelo atributo value")).toString());
		assertEquals("<a title=\"Meu título\">Obter elemento com o title: Meu título</a>", $(by("title", "Meu título")).toString());
		assertEquals("<a title=\"Meu título\">Obter elemento com o title: Meu título</a>", $(byTitle("Meu título")).toString());
		assertEquals("<input name=\"nomeInput\" type=\"text\" value=\"Obter elemento pelo atributo value\"></input>", $(byValue("Obter elemento pelo atributo value")).toString());
	 
	}

	@Test
	public void testeSeletorElementosElementsCollection() {
		assertEquals("[\n	<form id=\"idFormulario\"></form>\n]", $$(By.id("idFormulario")).toString());
		assertEquals("[\n	<form id=\"idFormulario\"></form>\n]", $$(by("id", "idFormulario")).toString());
	 
	}
}
