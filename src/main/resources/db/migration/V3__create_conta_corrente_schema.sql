CREATE TABLE `contas_correntes` (
    `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
    `agencia` VARCHAR(255) NOT NULL,
    `conta` VARCHAR(255) NOT NULL,
    `bank_id` BIGINT NOT NULL,
    CONSTRAINT fk_conta_corrente_bank FOREIGN KEY (bank_id) REFERENCES bank(id) ON DELETE CASCADE
);