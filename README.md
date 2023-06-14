# Formação Desenvolvedor Moderno
## Módulo: Programação Moderna
### Capítulo: Programação funcional, expressões lambda

# DESAFIO: Análise de vendas
### Desenvolvimento do projeto:

<p>Você deve ler um arquivo .csv contendo uma base de dados de registros
de venda, e instanciar na memória uma lista de objetos do tipo Sale,
conforme projeto ao lado (Atenção: não use tipos primitivos int e double
nos atributos e métodos! Use os tipos wrapper Integer e Double,
conforme mostrado no projeto).</p>

<img src="https://github.com/vivianezzt/DesafioAnaliseDeVendas_1/blob/main/img/vendas.png">

<p>Depois de ler os dados, seu programa deverá mostrar as seguintes análises (implemente o método toString
da classe Sale para facilitar):</p>

<ul>
  <li>Cinco primeiras vendas de 2016 de maior preço médio, ordenadas decrescentemente por preço médio</li>
  <li>Valor total vendido pelo vendedor Logan nos meses 1 e 7 de qualquer ano</li>
</ul>

<p>Atenção: use métodos Stream + lambda para extrair os resultados a partir da lista original.</p>

<p>Atenção: caso ocorra alguma falha na leitura do arquivo, a exceção deve ser tratada, e mostrada uma
mensagem conforme exemplo.</p>

### Exemplo 1
<img src="https://github.com/vivianezzt/DesafioAnaliseDeVendas_1/blob/main/img/exemplo_1.png">

### Exemplo 2
<img src="https://github.com/vivianezzt/DesafioAnaliseDeVendas_1/blob/main/img/exemplo_2.png">

### CRITÉRIOS DE AVALIAÇÃO (TODOS DEVEM ESTAR CORRETOS):
<ol>
  <li>Leitura correta do arquivo.</li>
  <li>Uso das funções Stream + lambda de maneira coerente.</li>
  <li>Tratamento de exceção correto.</li>
  <li>Resultado da primeira análise correto.</li>
  <li>Resultado da segunda análise correto.</li>
</ol>  


<h3> CRÉDITOS &copy;</h3>
<h4> Este desafio foi proposto pelo Prof. <a href="https://www.instagram.com/devsuperior.ig/">Nélio Alves</a> no Módulo - Programação Moderna (JAVA)
</h4><a href="https://devsuperior.com.br/evento-sds">DEVSUPERIOR - Faça parte você támbem</a>
