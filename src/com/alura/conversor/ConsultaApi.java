package com.alura.conversor;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi {

    public String obtenerDatos(String url) {

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

            // Devolver JSON
            return response.body();

        } catch (Exception e) {
            throw new RuntimeException("No se pudo obtener la respuesta de la API", e);
        }
    }
}
