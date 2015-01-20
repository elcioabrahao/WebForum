# SQL command to create the table: 
# Remember to correct VARCHAR column lengths to proper values 
# and add additional indexes for your own extensions.

# If you had prepaired CREATE TABLE SQL-statement before, 
# make sure that this automatically generated code is 
# compatible with your own code. If SQL code is incompatible,
# it is not possible to use these generated sources successfully.
# (Changing VARCHAR column lenghts will not break code.)

CREATE TABLE forum_cliente (
      id bigint AUTO_INCREMENT NOT NULL,
      nome varchar(255),
      cpf varchar(255),
      telefone varchar(255),
      email varchar(255),
PRIMARY KEY(id),
INDEX forum_cliente_id_INDEX (id));

CREATE TABLE forum_mensagem (
      id bigint AUTO_INCREMENT NOT NULL,
      id_cliente bigint,
      data varchar(255),
      mensagem varchar(255),
PRIMARY KEY(id),
INDEX forum_mensagem_id_INDEX (id));
