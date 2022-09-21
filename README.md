# estudo-servlet
Estudando Java Servlet com curso da Alura, projeto simulando um banco de dados

A intenção foi criar um projeto simples de uma página web.
O ambiente de desenvolvimento foi o Eclipse, utilizando TomCat.
Utilizei também a biblioteca JSTL.

A página apresenta um formulário para que o usuário cadastre uma empresa, preenchendo os campos "nome" e "data de abertura".
É possível listar todas os dados das empresas cadastradas e, também, remover uma empresa ou editar seus dados (completando o CRUD).
Se o usuário seleciona a opção "editar", ele é direcionado a um formulário.

Classes:
- Empresa: guarda as informações da empresa (nome, data de abertura e ID - esse id simulará uma chave primária)
- Banco: simula um banco de dados. Aqui, criamos dois objetos empresa e adicionamos em uma lista, o que simula um banco de dados. E também
métodos como adiciona, remove e para buscar a empresa pelo ID.

Servlets:
- OiMundoServlet: apenas fins didáticos - começando a aprender a manipular um servlet
- NovaEmpresaServlet: servlet que recebe os dados primeiros do navegador inseridos pelo usuário na pagina jsp /formNovaEmpresaCriada.jsp e salva no objeto "Banco"
- ListaEmpresasServlet: servlet que recebe e envia os dados para serem listados para o usuário na pg jsp /listaEmpresas.jsp
- MostraEmpresaServlet: servlet que busca qual objeto empresa o usuário quer editar (através do método buscaEmpresaPelaID da classe Banco), e chama o jsp /formAlteraEmpresa.jsp
- RemoveEmpresaServlet: servlet que remove o objeto Empresa selecionado pelo usuário do objeto Banco, em seguida chama o jsp atualizado /listaEmpresas.jsp

JSP:
- formNovaEmpresa: formulário onde o usuárui consegue cadastrar uma nova empresa
- novaEmpresaCriada: mostra mensagem de sucesso quando a empresa é cadastrada ou msg de erro, caso o campo "nome" esteja vazio
- listaEmpresas: lista todas as empresas criadas, junto com botão de "edita" e "remove"
- formAlteraEmpresa: é o formulário que serve para editar os dados da empresa
