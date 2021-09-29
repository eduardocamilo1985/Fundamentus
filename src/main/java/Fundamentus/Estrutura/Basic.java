package Fundamentus.Estrutura;

import org.openqa.selenium.By;
import java.io.FileWriter;
import static Fundamentus.Estrutura.DriverFactory.getDriver;
import static Fundamentus.Estrutura.DriverFactory.killDriver;

public class Basic {

	public FileWriter arquivo;

	// #*#*#*#*#*#*# Browser *#*#*#*#*#*#*#*#*#*#*#*
	public void acessarURL(String url) {
		getDriver().get(url);
	}

	public void fecharNavegador(){
        killDriver();
    }

	// #*#*#*#*#*#*# OBTER TEXTO *#*#*#*#*#*#*#*#*#*#*#*

	public String getTexto(By by) {

		return getDriver().findElement(by).getText();

	}

}
