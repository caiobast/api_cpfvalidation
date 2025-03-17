# CPF Validation API

## Descrição
Esta API fornece um serviço simples para validação de números de CPF, garantindo que estejam formatados corretamente e sigam as regras do algoritmo de verificação.

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot**
- **Spring Web**
- **Spring Boot Starter Validation**
- **Lombok**
- **JUnit 5**

## Como Executar o Projeto

### Pré-requisitos
- Java 17 ou superior
- Maven 3+

### Passos para execução
1. Clone o repositório:
   ```sh
   git clone https://github.com/seu-usuario/cpf-validation-api.git
   cd cpf-validation-api
   ```
2. Compile o projeto e instale as dependências:
   ```sh
   mvn clean install
   ```
3. Execute a aplicação:
   ```sh
   mvn spring-boot:run
   ```

## Endpoints Disponíveis

### **Validação de CPF**
`POST /api/v1/validate-cpf`

#### Request Body
```json
{
  "cpf": "12345678909"
}
```

#### Response
```json
{
  "cpf": "12345678909",
  "valid": true
}
```

## Testes
Para rodar os testes unitários, execute:
```sh
mvn test
```

## Autor
- [Caioba](https://github.com/seu-usuario)

## Licença
Este projeto está licenciado sob a MIT License - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

