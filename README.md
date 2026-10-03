# Discoveries Battleship Game

### Grupo: GrupoTP02_LETI-5


## Membros da Equipa
| Número | Nome | Curso | Repo |
| :---: | :--- | :---: | :---: |
| 122615 | Rodrigo Chaves | LETI |  |
| 122650 | Miguel Pancada | LETI | https://github.com/miguelpancada05 |
| 129787 | António Contente | LETI | https://github.com/antoniocontente |
| 122652 | Gonçalo Gonçalves | LETI | https://github.com/ggpsg |

> **Nota:** Os nomes das contas do github estão diferentes então foram adicionados á tabela com o conhecimento do professor.



## Frota da Batalha Naval dos Descubrimentos
| Navio Tradicional | Descobrimentos (PT) | English | Dimensão | Quantidade |
| :--- | :--- | :--- | :---: | :---: |
| Porta-aviões | Galeão | Galleon | 5 | 1 |
| Navio de 4 canhões | Fragata | Frigate | 4 | 1 |
| Navio de 3 canhões | Nau | Carrack | 3 | 2 |
| Navio de 2 canhões | Caravela | Caravel | 2 | 3 |
| Submarino | Barca | Barge | 1 | 4 |

> **Nota:** A frota total é composta por 11 navios da época dos Descobrimentos.

## Regras do Jogo (Discoveries Battleship Game)

- **Grelhas de Jogo:** Cada jogador dispõe de duas grelhas quadriculadas de dimensão 10x10 (uma representando a sua frota e outra para registo dos tiros no mar adversário).
- **Posicionamento da Frota:**
  - Os navios podem ser colocados na orientação horizontal ou vertical.
  - Os navios não se podem tocar entre si (nem na horizontal, nem na vertical, nem nas diagonais), embora possam encostar às bordas da grelha.
- **Dinâmica das Jogadas:**
  - O jogo desenrola-se por turnos.
  - Em cada turno, o jogador dispara uma **rajada de 3 tiros**, indicando as respetivas coordenadas `(linha, coluna)`.
  - O oponente reporta o resultado dessa rajada, informando quais os tiros na água, quais os navios atingidos e de que tipo, ou se algum navio foi totalmente afundado.
- **Condição de Vitória:** O primeiro jogador a afundar todos os 11 navios da frota adversária vence a partida.


## Contexto Histórico das Embarcações

Durante a Era dos Descobrimentos, Portugal desenvolveu e aperfeiçoou vários tipos de embarcações adaptadas à navegação oceânica e à defesa militar:

- **[Galeão](https://pt.wikipedia.org/wiki/Gale%C3%A3o):** Navio de grande porte fortemente armado com peças de artilharia, utilizado para proteção de rotas comerciais e combate militar.
- **[Fragata](https://pt.wikipedia.org/wiki/Fragata):** Embarcação rápida e manobrável, com grande poder de fogo.
- **[Nau](https://pt.wikipedia.org/wiki/Nau):** Embarcação de grande tonelagem com castelos à proa e à popa, ideal para longas viagens de exploração e transporte de carga.
- **[Caravela](https://pt.wikipedia.org/wiki/Caravela):** Navio rápido com velas latinas (triangulares) que permitia bolinar (navegar contra o vento), fundamental na exploração da costa africana.
- **[Barca](https://pt.wikipedia.org/wiki/Barca):** Embarcação costeira menor de fundo chato e mastreação simples, utilizada em viagens preliminares e apoio.


## Resposta à alínea C. da parte 2 - Comparação Crítica 

### Quais as diferenças entre trabalhar via web e via IDE?
* **Ambiente e Execução:** O IDE opera localmente com compilador (JDK), ferramentas de construção e debugger, permitindo executar e testar código; a interface web é um editor remoto que não compila nem executa testes locais.
* **Ferramentas de Desenvolvimento:** O IDE fornece autocompletação inteligente, refatoração de código, deteção de erros de sintaxe em tempo real e geração de documentação (Javadoc); a web oferece apenas realce de sintaxe básico.
* **Controlo de Versões (Git):** O IDE permite gerir detalhadamente o repositório local (staging area, histórico local, resolução visual de conflitos e trabalho offline); a web regista commits diretamente no repositório remoto sem ciclo de preparação local.

### Em que situações é preferível cada abordagem?
* **Preferível via Web:** Na edição rápida de documentação simples (como ficheiros README.md em Markdown), pequenas correções pontuais de texto, gestão de requisitos (Issues e Scrum Backlog) e revisão ou aprovação de Pull Requests.
* **Preferível via IDE:** Na escrita e desenvolvimento de código, criação de novas funcionalidades, testes unitários, depuração de erros (debugging) e resolução de conflitos complexos de integração (merge conflicts).


## Modelos de Branching: Git Flow vs. GitHub Flow

* **GitHub Flow:**
  * **Estrutura:** Centrado num único ramo principal permanente (`main`).
  * **Ciclo:** Para qualquer tarefa, cria-se um ramo descritivo a partir do `main`, realizam-se commits regulares, abre-se um Pull Request para revisão e, após aprovação, o ramo é fundido com o `main`.
  * **Aplicação:** Ideal para equipas ágeis e fluxos de integração contínua (CI/CD), sendo o modelo adotado nesta ficha laboratorial.

* **Git Flow:**
  * **Estrutura:** Utiliza dois ramos permanentes de longa duração (`main` para versões de produção e `develop` para integração) e ramos auxiliares temporários (`feature/*`, `release/*` e `hotfix/*`).
  * **Ciclo:** Novas funcionalidades partem do `develop`; para lançar uma versão, cria-se um ramo `release` para validação e testes finais; o merge é feito em simultâneo no `main` (onde se cria a tag) e no `develop`.
  * **Aplicação:** Adequado para projetos com versões periódicas e necessidade de suporte formal a múltiplos lançamentos em paralelo.