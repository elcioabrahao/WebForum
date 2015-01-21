


CREATE TABLE forum_mensagem (
      id bigint AUTO_INCREMENT NOT NULL,
      id_cliente bigint,
      nome_cliente varchar(255),
      data varchar(255),
      mensagem varchar(255),
PRIMARY KEY(id),
INDEX forum_mensagem_id_INDEX (id));