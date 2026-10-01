Set-Content COMANDOS_CLI.md @"
# D. Comandos Fundamentais do Git em CLI

## D.1 Conceitos Fundamentais
- **Working Area (Área de Trabalho):** Diretoria local com os ficheiros no estado atual de edição.
- **Staging Area (Index):** Zona de preparação onde os ficheiros alterados são colocados via \`git add\` antes do commit.
- **Local Repository (Repositório Local):** Base de dados interna (\`.git\`) que guarda os commits e o histórico na máquina local.
- **Remote Repository (Repositório Remoto):** Versão central partilhada alojada no GitHub (\`origin\`).

## D.2 Comandos Praticados
- \`git init\`: Inicializa um repositório local.
- \`git clone\`: Descarrega o repositório remoto para a máquina local.
- \`git add\`: Adiciona ficheiros da working area para a staging area.
- \`git commit\`: Regista alterações da staging area no histórico local.
- \`git push\`: Envia os commits locais para o servidor remoto.
- \`git pull\`: Transfere e integra alterações do remoto para a cópia local.
  "@