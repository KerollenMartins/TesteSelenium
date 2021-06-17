package steps;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;

public class AutomobileInsuranreSteps {

	static WebDriver driver;
	WebDriverWait wait;

	@Before

	public void setup() {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kerollen\\Desktop\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test

	@Dado("que eu tenho acesso ao site")
	public void que_eu_tenho_acesso_ao_site() {
		driver.get("http://sampleapp.tricentis.com/101/app.php");

	}

	@Dado("preencho o formulario1")
	public void preencho_o_formulario1() {

		driver.findElement(By.id("make")).sendKeys("BMW");
		driver.findElement(By.id("model")).sendKeys("Scooter");
		driver.findElement(By.id("cylindercapacity")).sendKeys("250");
		driver.findElement(By.id("engineperformance")).sendKeys("1528");
		driver.findElement(By.id("dateofmanufacture")).sendKeys("03/12/1993");
		driver.findElement(By.id("numberofseats")).sendKeys("2");

		driver.findElement(By.id("numberofseatsmotorcycle")).click();

		WebElement escrever = driver.findElement(By.id("numberofseatsmotorcycle"));

		escrever.sendKeys("1");

		driver.findElement(By.id("fuel")).sendKeys("Electric Power");

		driver.findElement(By.id("payload")).sendKeys("118");
		driver.findElement(By.id("totalweight")).sendKeys("350");

		driver.findElement(By.id("listprice")).sendKeys("50000");
		driver.findElement(By.id("licenseplatenumber")).sendKeys("554");
		driver.findElement(By.id("annualmileage")).sendKeys("5562");

	}

	@Dado("clico no botao next")
	public void clico_no_botao_next() {

		driver.findElement(By.id("nextenterinsurantdata")).click();

	}

	@Então("a aba do formulario2 devera ser carregada")
	public void a_aba_do_formulario2_devera_ser_carregada() {

		assertEquals("Enter Insurant Data", driver.getTitle());

	}

	@Dado("que eu estou na aba do formulario2")
	public void que_eu_estou_na_aba_do_formulario2() {
		assertEquals("Enter Insurant Data", driver.getTitle());

	}

	@Dado("preencho todos os campos necessarios do formulario2")
	public void preencho_todos_os_campos_necessarios_do_formulario2() {

		driver.findElement(By.id("firstname")).sendKeys("Kerollen");
		driver.findElement(By.id("lastname")).sendKeys("Amancio");
		driver.findElement(By.id("birthdate")).sendKeys("02/03/1996");
		driver.findElement(By.id("streetaddress")).sendKeys("Avenida Boa Viagem");
		driver.findElement(By.id("country")).sendKeys("Canada");
		driver.findElement(By.id("zipcode")).sendKeys("90209");
		driver.findElement(By.id("city")).sendKeys("Beverly Hills");
		driver.findElement(By.id("occupation")).sendKeys("Farmer");
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span")).click();

		driver.findElement(By.id("website")).sendKeys("https://www.google.com");

	}

	@Dado("clico no botao next1")
	public void clico_no_botao_next1() {

		driver.findElement(By.id("nextenterproductdata")).click();

	}

	@Entao("a aba do formulario3 devera ser carregada")
	public void a_aba_do_formulario3_devera_ser_carregada() {

		assertEquals("Enter Product Data", driver.getTitle());

	}

	@Dado("que eu estou na aba do formulario3")
	public void que_eu_estou_na_aba_do_formulario3() {

		assertEquals("Enter Product Data", driver.getTitle());

	}

	@Dado("preencho todos os campos necessarios do formulario3")
	public void preencho_todos_os_campos_necessarios_do_formulario3() {

		driver.findElement(By.id("startdate")).sendKeys("03/15/2030");
		driver.findElement(By.id("insurancesum")).sendKeys("3.000.000,00");
		driver.findElement(By.id("meritrating")).sendKeys("Bonus 7");
		driver.findElement(By.id("damageinsurance")).sendKeys("Full Coverage");
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span")).click();
		driver.findElement(By.id("courtesycar")).click();

		WebElement escrever = driver.findElement(By.id("courtesycar"));

		escrever.sendKeys("No");

	}

	@Dado("clico no botao next2")
	public void clico_no_botao_next2() {

		driver.findElement(By.id("nextselectpriceoption")).click();

	}

	@Entao("a aba da tabela de categorias devera ser carregada")
	public void a_aba_da_tabela_de_categorias_devera_ser_carregada() {

		assertEquals("Enter Price Option", driver.getTitle());

	}

	@Dado("que eu estou na aba da tabela tabela de categorias")
	public void que_eu_estou_na_aba_da_tabela_tabela_de_categorias() {

		assertEquals("Enter Price Option", driver.getTitle());

	}

	@Dado("seleciono a opcao gold")
	public void seleciono_a_opcao_gold() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("selectgold")));
		driver.findElement(By.id("selectgold")).click();

	}

	@Dado("clico no botao next3")
	public void clico_no_botao_next3() {

		driver.findElement(By.id("nextsendquote")).click();

	}

	@Entao("a aba do formlario4 devera ser exibida")
	public void a_aba_do_formlario4_devera_ser_exibida() {

		assertEquals("Send Quote", driver.getTitle());

	}

	@Dado("que eu estou na aba do formulario4")
	public void que_eu_estou_na_aba_do_formulario4() {

		assertEquals("Send Quote", driver.getTitle());

	}

	@Dado("preencho todos os campos necessarios do formulario4")
	public void preencho_todos_os_campos_necessarios_do_formulario4() {

		driver.findElement(By.id("email")).sendKeys("kellmartins_@hotmail.com");
		driver.findElement(By.id("phone")).sendKeys("559582463");
		driver.findElement(By.id("username")).sendKeys("kerollenmartins");
		driver.findElement(By.id("password")).sendKeys("Ke123456@");
		driver.findElement(By.id("confirmpassword")).sendKeys("Ke123456@");
		driver.findElement(By.id("Comments")).sendKeys("Eu serei a próxima Quality Engineering da Accenture");

	}

	@Dado("clico no botao send")
	public void clico_no_botao_send() {

		driver.findElement(By.id("sendemail")).click();

	}

	@Entao("a mensagem de confirmacao referente ao envio de email devera ser exibida {string}")
	public void a_mensagem_de_confirmacao_referente_ao_envio_de_email_devera_ser_exibida(String string) {

		assertEquals("Sending e-mail success!", driver.getTitle());

	}

	@After

	public void fecha() {
		driver.close();
		driver.quit();

	}

}
