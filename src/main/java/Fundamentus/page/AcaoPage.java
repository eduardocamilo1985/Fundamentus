package Fundamentus.page;

import Fundamentus.Estrutura.Basic;
import static Fundamentus.Estrutura.Parametros.acao;

import org.openqa.selenium.By;

public class AcaoPage extends Basic {

	public void acessarURL(int id) {
		acessarURL("https://www.fundamentus.com.br/detalhes.php?papel=" + acao[id]);
	}
	
	public void finalizarNavegacao() {
		fecharNavegador();
	}

	public String papel() {
		return getTexto(By.xpath("//table[1]//tr[1]/td[2]"));
	}

	public String empresa() {
		return getTexto(By.xpath("//table[1]//tr[3]/td[2]"));
	}
	public String setor() {
		return getTexto(By.xpath("//table[1]//tr[4]/td[2]"));
	}
	public String cotacao() {
		return getTexto(By.xpath("//table[1]//tr[1]/td[4]"));
	}
	
	public String dataCotacao() {
		return getTexto(By.xpath("//table[1]//tr[2]/td[4]"));
	}
			
	public String mim() {
		return getTexto(By.xpath("//table[1]//tr[3]/td[4]"));
	}
	
	public String max() {
		return getTexto(By.xpath("//table[1]//tr[4]/td[4]"));
	}
	
	public String trintaDias() {
		return getTexto(By.xpath("//table[3]//tr[4]/td[2]"));
	}
	
	public String dozeMeses() {
		return getTexto(By.xpath("//table[3]//tr[5]/td[2]"));
	}
	public String nesseAno() {
		return getTexto(By.xpath("//table[3]//tr[6]/td[2]"));
	}
	
	public String vinte() {
		return getTexto(By.xpath("//table[3]//tr[7]/td[2]"));
	}
	
	public String dezenove() {
		return getTexto(By.xpath("//table[3]//tr[8]/td[2]"));
	}
	
	public String pvp() {
		return getTexto(By.xpath("//table[3]//tr[3]/td[4]"));
	}
	
	public String vpa() {
		return getTexto(By.xpath("//table[3]//tr[3]/td[6]"));
	}
	
	public String liqCorrent() {
		return getTexto(By.xpath("//table[3]//tr[10]/td[6]"));
	}
	
	public String margBruta() {
		return getTexto(By.xpath("//table[3]//tr[4]/td[6]"));
	}
	public String margLiqui() {
		return getTexto(By.xpath("//table[3]//tr[6]/td[6]"));
	}
	public String margEbit() {
		return getTexto(By.xpath("//table[3]//tr[5]/td[6]"));
	}
	public String roe() {
		return getTexto(By.xpath("//table[3]//tr[9]/td[6]"));
	}
	public String lucroLiqui() {
		return getTexto(By.xpath("//table[5]//tr[5]/td[4]"));
	}	
	public String divYield() {
		return getTexto(By.xpath("//table[3]//tr[9]/td[4]"));
	}	
	
}
	