CREATE TABLE despesas (
    id SERIAL PRIMARY KEY,
    valor NUMERIC(10, 2) NOT NULL,
    descricao VARCHAR(255) NOT NULL,
    categoria VARCHAR(50) NOT NULL,
    vencimento VARCHAR(255) NOT NULL,
    data_de_insercao VARCHAR(255) NOT NULL
);