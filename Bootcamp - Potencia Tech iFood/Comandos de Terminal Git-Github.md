## COMANDOS DE TERMINAL
| Windows | Output | Linux | Observações |
| :----:  | :----:  | :----:  | :----:  |
| dir | lista diretório | ls | flag para ver páginas ocultas = -a |
| cd | muda diretório | cd | |
| cls | limpa tela | clear | |
| mkdir | cria pasta | mkdir | |
| echo | joga na tela o que escrever | echo | |
| del | exclui arquivos de uma pasta | rm -rf | |
| rmdir | exclui a pasta e seus arquivos | rm -rf | |
| cat | visualiza dados de um arquivo | cat | |
| pwd | mostra o caminho completo da pasta atual | pwd | |
| mv [nome arquivo] [caminho destino] | move o arquivo citado para o destino designado | | |

Utilizando echo junto com o sinal > e inserindo um nome de arquivo com extensão, o sistema cria um arquivo com aquilo q foi dado echo

RMDIR - Utiliza-se os comandos /S /Q para fazer a exclusão

Qnd se usa terminal, sempre usa primeiro o nome do app que está sendo usado e logo depois o comando específico do programa

## COMANDOS DE GIT
| Comando | Output | Observações |
| :----:  | :----:  | :----:  |
| git init | inicia um repositório | |
|git add | mover arquivos e versionamento | |
| git commit | Confirma a mudança | parâmetro -m = enviar mensagem entre aspas |
| git config | configura o primeiro uso, para fornecer o autor com nome e e-mail. | flag --global = configura a configuração para todas as pastas |
| git remote add [apelido para o endereço destino, por convenção é origin] [endereço do repositório criado no github] | envia o repositório local, da máquina, para o repositório remoto, no github | |
| git push [apelido do local remoto] master/main | empurra o diretório local para o repositório remoto | |
| git pull [apelido do local remoto] master/main | puxa o diretório remoto para o local | |
| git clone [url do repositório] | clonar um repositório no github | |
