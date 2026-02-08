package com.alura.conversor;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi {

    public double obtenerTasa(String url) {

        try {
            // Cliente HTTP
            HttpClient client = HttpClient.newHttpClient();

            // Solicitud
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            // Respuesta
            HttpResponse<String> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString()
            );

            // Validar respuesta
            if (response.statusCode() != 200) {
                throw new RuntimeException("Error en la solicitud: " + response.statusCode());
            }

            // Parseo del JSON
            JsonElement elemento = JsonParser.parseString(response.body());
            JsonObject jsonObject = elemento.getAsJsonObject();

            // Extracción del dato clave
            return jsonObject.get("conversion_rate").getAsDouble();

        } catch (Exception e) {
            throw new RuntimeException("Error al procesar la respuesta JSON", e);
        }
    }
}
