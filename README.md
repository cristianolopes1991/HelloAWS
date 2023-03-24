# HelloAWS

Projeto Realizado para estudo de caso realizando a criação de um projeto java Lambda aws que recebe chamadas via gateway.

Os passos seguidos para realização do estudo foram;

Para criação do pacote foi utilizado o comando maven.
 - mvn clean package
 
 A implantação do projeto na conta AWS, foi realizado atraves do aws CLI, pelo seguinte comando:
 - aws lambda create-function --function-name funcao01 --zip-file fileb://target/LambdaApiGatewayP01-1.0.jar --handler service.lambda.Function01::handlerRequest --runtime java8 --role arn:aws:iam::xxxxxxxxxxx:role/lambda-hello
 
 A invocação da função lambda na conta da aws também foi realizado pelo aws CLI, e o comando utilizado foi o seguinte;
 - aws lambda invoke --function-name funcao01 --invocation-type RequestResponse /tmp/resposta.txt

Para vizualizar o arquivo criado em uma pasta temporária contendo a mensagem retornada pela função lambda pode-se utilizar o comando;
- cat /tmp/resposta.txt
