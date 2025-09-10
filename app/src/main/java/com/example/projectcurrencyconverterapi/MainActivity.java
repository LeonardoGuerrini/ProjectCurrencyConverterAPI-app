package com.example.projectcurrencyconverterapi;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;
import java.util.Map;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

// Importando as classes do projeto
import com.example.projectcurrencyconverterapi.RetrofitClient;
import com.example.projectcurrencyconverterapi.ExchangeRateService;

public class MainActivity extends AppCompatActivity{
    // Componentes de interface
    private Spinner spinnerMoedaOrigem, spinnerMoedaDestino;
    private EditText etValor;
    private Button btnConverter;
    private TextView tvResultado;

    // Lista de moedas suportadas
    private List<String> moedas = List.of("USD", "BRL", "EUR", "GBP", "JPY");

    // Mapa para armazenar as taxas de câmbio obtidas da API
    private Map<String, Double> taxasDeCambio;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Define o layout da atividade

        // Inicializa os componentes da interface

        spinnerMoedaOrigem = findViewById(R.id.spinnerMoedaOrigem);
        spinnerMoedaDestino = findViewById(R.id.spinnerMoedaDestino);
        etValor = findViewById(R.id.etValor);
        btnConverter = findViewById(R.id.btnConverter);
        tvResultado = findViewById(R.id.tvResultado);

        // Configurar os Spinners com a lista de moedas

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, moedas);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMoedaOrigem.setAdapter(adapter);
        spinnerMoedaDestino.setAdapter(adapter);

        // Carregas as taxas de câmbio da API
        carregarTaxasDeCambio();

        // Configura o botão de conversão
        btnConverter.setOnClickListener(view -> converterMoeda());
    }
    // Método para configurar taxas de câmbio da API
    private void carregarTaxasDeCambio(){

    }

    // Método para converter o valor de uma moeda para outra
    private void converterMoeda(){
        ExchangeRateService service = RetrofitClient.getInstance(); // Obtém a instância do
        Call<ExchangeRatesResponse> call = service.getExchangeRates("8765ebd25884cd53ab7b6ece", "USD"); // Faz a chamada da API

        // Executa a chamada de forma assíncrona
        call.enqueue(new Callback<ExchangeRatesResponse>() {
            @Override
            public void onResponse(Call<ExchangeRatesResponse> call, Response<ExchangeRatesResponse> response) {
                if(response.isSuccessful() && response.body() != null){
                    taxasDeCambio = response.body().getConversionRates(); // Armazena as taxas de câmbio
                } else{ // Exibe mensagem de erro
                    tvResultado.setText("Erro ao carregar taxas de câmbio");
                }
            }

            @Override
            public void onFailure(Call<ExchangeRatesResponse> call, Throwable t){

            }
        });
    }

}
