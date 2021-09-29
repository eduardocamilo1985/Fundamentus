# 🤖 📊 Coletor de dados de empresas - site Fundamentus

<!--ts-->
* [Introdução](#introducao)
* [Objetivo](#objetivo)
* [Tecnologias utilizadas](#tecnologia)
* [Utilização/estrutura](#utilizacao)
* [Links para consulta](#link)
<!--te-->

# <a name="introducao"></a>Introdução

O Site [Fundamentus](https://www.fundamentus.com.br/) disponibiliza dados financeiros de diversas empresas listadas na Bolsa de valores.
Além da situação financeira das empresas o mesmo site disponibiliza dados sobre o valor das cotações das ações
(no caso a cotação do dia anterior, bem como máximas e mínimas das últimas 52 semanas).

# <a name="objetivo"></a>Objetivo

O objetivo desse mini projeto é coletar dados financeiros de empresas que estão disponíveis no site [Fundamentus](https://www.fundamentus.com.br/)
reunindo-os em uma planilha Excel. A planilha Excel será gerada na pasta Meus documentos (isso pode ser alterado 
na classe Parâmetros). 

Os dados coletados são:
- Empresa
- Papel (código na B3)
- Cotação
- Data da Cotação
- Mim 52 Semanas
- Max 52 Semanas
- Oscilação 30 dias
- Oscilação Em 2021
- Oscilação Em 2020
- Oscilação Em 2019
- P/VP
- VPA
- Div.Yield
- Liq Corrente
- Margem Bruta
- Margem Liquida
- Margem Ebit
- Roe
- Lucro Liquido
- Setor

## <a name="tecnologia"></a>Tecnologias utilizadas
![java](icon/java.png)
![Maven](icon/Maven.png)
![Selenium](icon/SeleniumWebDriver.png)
![IntelliJ](icon/IntelliJ.png)

## <a name="utilizacao"></a>Utilização/estrutura

Realizar o download do projeto (via git clone ou arquivo zip).

Importar o projeto na sua IDE de desenvolvimento favorita

**Estrutura do projeto**

A estrutura principal do projeto está localizada no diretório srd/main/java/Fundamentus. Existem três packages:
* Fundamentus — Contém a classe principal (método main)
* Estrutura — Contém as classes estruturais do projeto (base para outras classes).
* Page — Contém o mapeamento dos elementos das páginas.

O projeto utiliza o Selenium WebDriver para interagir com o navegador e conceitos de DSL e Page Object.

**Explicando algumas classes**

A classe **Basic** contém a parte Selenium utilizada. Digo quase toda, porque o
ideal seria ter uma única classe que representasse a parte selenium. Não fiz dessa forma,
por achar mais simples que a própria Page insira o localizador do elemento.

A classe **Excel** é responsável por criar o arquivo xls (arquivo Word) que irá reunir os dados sobre as empresas.

A classe **Parâmetros** contém o caminho do arquivo que será gerado e os códigos das ações listadas na bolsa, 
que serve como parâmetro para localização da empresa no site Fundamentus. 

A **package Page** contém o mapeamento de elementos do site. 

## <a name="link"></a>Links para consulta

[https://www.fundamentus.com.br/](https://www.fundamentus.com.br/)

[https://www.selenium.dev/documentation/webdriver/](https://www.selenium.dev/documentation/webdriver/)

[https://poi.apache.org/components/spreadsheet/quick-guide.html](https://poi.apache.org/components/spreadsheet/quick-guide.html)
