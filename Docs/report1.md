Com base nas informações fornecidas nos documentos e testes realizados, preencherei os campos do modelo "modelo2.pdf" com os dados dos relatórios de testes não funcionais, plano de execução, e as baterias de testes realizadas:

---

**Relatório de Entrega - Testes Não Funcionais**

**Objetivo do Teste**

Avaliar a estabilidade, capacidade, e desempenho do serviço de login do Banco Digital, assegurando que a infraestrutura suporta o pico de requisições esperado com a latência aceitável e dentro da taxa de erros permitida.

**Funcionalidade**

Login Simples - Banco Digital. Serviço responsável por autenticar usuários através do endpoint `/v1/banco-digital/acesso/autenticar`.

**Relatório de Execução**

N/A (Não aplicável - Relatório gerado a partir de ferramentas internas e dashboards do Apache JMeter).

**Planejamento de Execução**

Foram realizadas 5 baterias de testes, cada uma com diferentes cargas de requisições para simular cenários variados de uso, incluindo picos de acessos simultâneos ao serviço de login.

**Resumo Executivo - Testes em Ambiente UAT (21/03/2024)**

O serviço testado `pingfederate/login` manteve a estabilidade com uma latência média de 300ms a 1212ms e uma vazão média de 300 a 7711 requisições por teste. Nenhum erro crítico foi observado, com a taxa de erro variando entre 0% a 2.4% nas diferentes baterias de testes.

**CPU:** Consumo máximo observado não ultrapassou 70% da capacidade.
**Memória:** Uso de memória estável, sem vazamentos observados.
**Disco:** Sem significativa utilização de disco nos testes realizados.
**Tempo de inicialização do componente:** Não aplicável.

**Configurações de HPA**

Nome do componente e versão: `pingfederate-login-service v.1.0`
Mínimo e máximo de réplicas: 2/6
Valor alvo de escala: 75% de CPU
Valores limite de CPU e memória: CPU: 1 core, Memória: 512MB
Valor requisitado de CPU e memória: CPU: 500m (0.5 core), Memória: 256MB

**Pontos de Atenção:**

A taxa de erro máxima observada de 2.4% na bateria 5 sugere a necessidade de revisão nas configurações ou otimizações adicionais para lidar com altas cargas.

**Detalhamento da Execução - Testes em Ambiente UAT (21/03/2024)**

**Checkout do Ambiente (Banco BV):**

1. Confirmação da comunicação entre a máquina de teste e o ambiente UAT.
2. Validação das configurações de carga e cenários de teste no Apache JMeter.
3. Ajustes na configuração do HPA para suportar as cargas de teste simuladas.

**Plano de execução:**

Pré-Requisitos:
1. Monitoramento ativo do ambiente UAT para captura de métricas de desempenho em tempo real.
2. Configuração do Apache JMeter conforme os cenários de teste definidos no plano de testes não funcionais.

**Cenários:**

Cenário 1 a Cenário 5: Detalhamento das 5 baterias de teste, incluindo o aumento progressivo da carga de requisições para simular diferentes níveis de estresse no serviço de login.

**Times envolvidos:**

Equipes de Arquitetura, Infraestrutura, e Engenharia de SI, com participação especial de Eduardo Alves (Coordenador), Victor Narcizo (Product Owner), e Miécio Santos Costa (QA).

**Execução:**

Detalhes das execuções incluíram o acompanhamento de métricas de desempenho, como latência, taxa de erro, CPU, e memória, além das respostas dos serviços sob teste.

**Monitoração e Evidências:**

Monitoração em tempo real proporcionou insights valiosos sobre o comportamento do sistema sob teste, com gráficos e logs detalhando o desempenho durante cada bateria de teste.

---

Este preenchimento simula como o relatório final seria estruturado com base nas informações dispon
