package Fundamentus.Estrutura;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static Fundamentus.Estrutura.Parametros.ArquivoExcel;
import static Fundamentus.Estrutura.Parametros.acao;
import static Fundamentus.Fundamentus.ColetarFundamentus.*;

public class Excel {
	int rownum = 0;
	int cellnum = 0;
	Cell cell;
	Row row;

	public void gerarExcel() {

		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("Fundamentos");

		// CRIA AS COLUNAS NA PLANILHA
		row = sheet.createRow(rownum++);

		cell = row.createCell(cellnum++);
		cell.setCellValue("Empresa");

		cell = row.createCell(cellnum++);
		cell.setCellValue("Papel");

		cell = row.createCell(cellnum++);
		cell.setCellValue("Cotação");

		cell = row.createCell(cellnum++);
		cell.setCellValue("Data da Cotação");

		cell = row.createCell(cellnum++);
		cell.setCellValue("Mim 52 Semanas");

		cell = row.createCell(cellnum++);
		cell.setCellValue("Max 52 Semanas");

		cell = row.createCell(cellnum++);
		cell.setCellValue("30 dias");

		cell = row.createCell(cellnum++);
		cell.setCellValue("Ultimos 12 meses");

		cell = row.createCell(cellnum++);
		cell.setCellValue("Em 2022");

		cell = row.createCell(cellnum++);
		cell.setCellValue("Em 2021");

		cell = row.createCell(cellnum++);
		cell.setCellValue("Em 2020");

		cell = row.createCell(cellnum++);
		cell.setCellValue("Em 2019");

		cell = row.createCell(cellnum++);
		cell.setCellValue("P/VP");

		cell = row.createCell(cellnum++);
		cell.setCellValue("VPA");
		
		cell = row.createCell(cellnum++);
		cell.setCellValue("Div. Yield");

		cell = row.createCell(cellnum++);
		cell.setCellValue("Liq Corrente");

		cell = row.createCell(cellnum++);
		cell.setCellValue("Margem Bruta");

		cell = row.createCell(cellnum++);
		cell.setCellValue("Margem Liquida");

		cell = row.createCell(cellnum++);
		cell.setCellValue("Margem Ebit");

		cell = row.createCell(cellnum++);
		cell.setCellValue("Roe");

		cell = row.createCell(cellnum++);
		cell.setCellValue("Lucro Liquido");

		cell = row.createCell(cellnum++);
		cell.setCellValue("Setor");

		// ADICIONA OS DADOS NA PLANILHA
		for (int i = 0; i < acao.length; i++) {
			row = sheet.createRow(rownum++);
			cellnum = 0;

			cell = row.createCell(cellnum++);
			cell.setCellValue(empresa[i]);

			cell = row.createCell(cellnum++);
			cell.setCellValue(papel[i]);

			cell = row.createCell(cellnum++);
			cell.setCellValue(cotacao[i]);

			cell = row.createCell(cellnum++);
			cell.setCellValue(dataCotacao[i]);

			cell = row.createCell(cellnum++);
			cell.setCellValue(mim[i]);

			cell = row.createCell(cellnum++);
			cell.setCellValue(max[i]);

			cell = row.createCell(cellnum++);
			cell.setCellValue(trintaDias[i]);

			cell = row.createCell(cellnum++);
			cell.setCellValue(dozeMeses[i]);

			cell = row.createCell(cellnum++);
			cell.setCellValue(nesseAno[i]);

			cell = row.createCell(cellnum++);
			cell.setCellValue(vinteUm[i]);

			cell = row.createCell(cellnum++);
			cell.setCellValue(vinte[i]);

			cell = row.createCell(cellnum++);
			cell.setCellValue(dezenove[i]);

			cell = row.createCell(cellnum++);
			cell.setCellValue(pvp[i]);

			cell = row.createCell(cellnum++);
			cell.setCellValue(vpa[i]);

			cell = row.createCell(cellnum++);
			cell.setCellValue(dividendos[i]);
			
			cell = row.createCell(cellnum++);
			cell.setCellValue(liqCorrent[i]);

			cell = row.createCell(cellnum++);
			cell.setCellValue(margBruta[i]);

			cell = row.createCell(cellnum++);
			cell.setCellValue(margLiqui[i]);

			cell = row.createCell(cellnum++);
			cell.setCellValue(margEbit[i]);

			cell = row.createCell(cellnum++);
			cell.setCellValue(roe[i]);

			cell = row.createCell(cellnum++);
			cell.setCellValue(lucroLiqui[i]);

			cell = row.createCell(cellnum++);
			cell.setCellValue(setor[i]);

		}

		try {

			// GRAVA OS DADOS NO ARQUIVO
			FileOutputStream Arquivo = new FileOutputStream(
					new File(ArquivoExcel));

			workbook.write(Arquivo);

			Arquivo.close();
			System.out.println("Arquivo gerado com Sucesso. O arquivo foi salvo em " + ArquivoExcel);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
