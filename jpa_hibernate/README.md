# Projeto Admin Demo

Aplicação CRUD de Clientes (Pessoa) e Produtos utilizando Hibernate + JPA com banco SQLite.

- Group ID: `com.techcamps.cadastros`
- Artifact ID: `administrativo-api`
- Java: JDK 17

## Estrutura
- `src/main/java/entities` — Entidades JPA (`Pessoa`, `Produto`)
- `src/main/java/models` — Models com operações CRUD (`PessoaModel`, `ProdutoModel`)
- `src/main/java/demo` — Classe de demonstração (`AdministrativoApp`)
- `src/main/resources/META-INF/persistence.xml` — Configuração JPA
- `database_admin.db` — Banco SQLite (gerado/atualizado ao executar)
- `sql_schema_database_admin.sql` — Cole aqui o SQL Schema exportado

## Executar
1. Abra na sua IDE (IntelliJ/Eclipse/VS Code) com JDK 17.
2. Compile o projeto Maven.
3. Execute `demo.AdministrativoApp` para criar o schema e testar CRUD.

## Observações
- Dependências principais: Hibernate 5.4.12.Final, SQLite JDBC 3.36.0.3, SQLite Dialect 0.1.2.
- `hibernate.hbm2ddl.auto=update` para criação/atualização automática de tabelas.
- Após executar, exporte o schema no SQLite Online e cole em `sql_schema_database_admin.sql`.

