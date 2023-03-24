package service.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Funcao01 implements RequestStreamHandler {

    @Override
    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {

        JsonObject resposta = new JsonObject();
        JsonObject mensagem = new JsonObject();

        mensagem.addProperty("mensagem", "Hello World from Lambda & API Gateway AWS !!!");

        resposta.addProperty("body", mensagem.toString());

        OutputStreamWriter writer = new OutputStreamWriter(outputStream, "UTF-8");
        writer.write(resposta.toString());
        writer.close();
    }
}
