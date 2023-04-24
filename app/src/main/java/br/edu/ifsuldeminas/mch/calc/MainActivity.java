package br.edu.ifsuldeminas.mch.calc;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import de.congrace.exp4j.Calculable;
import de.congrace.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "ifsuldeminas.mch.calc";
    private Button buttonIgual;
    private TextView textViewResultado; //recebe a resposta final
    private TextView textViewUltimaExpressao; //tem a expressão final

    private Button buttonUmID, buttonDoisID, buttonTresID, buttonQuatroID, buttonCincoID,
            buttonSeisID, buttonSeteID, buttonOitoID, buttonNoveID, buttonZeroID, buttonVirgulaID, buttonSomaID, buttonSubtracaoID,
            buttonPorcentoID, buttonMultiplicacaoID, buttonDivisaoID, buttonResetID, buttonDeleteID;

    private String calculo = "";
    private Double resultado;
    private boolean operacaoComposta = false;
    private boolean operacaoSimples = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        textViewResultado = findViewById(R.id.textViewResultadoID);
        textViewUltimaExpressao = findViewById(R.id.textViewUltimaExpressaoID);
        buttonIgual = findViewById(R.id.buttonIgualID);
        buttonZeroID = findViewById(R.id.buttonZeroID);
        buttonUmID = findViewById(R.id.buttonUmID);
        buttonDoisID = findViewById(R.id.buttonDoisID);
        buttonTresID = findViewById(R.id.buttonTresID);
        buttonQuatroID = findViewById(R.id.buttonQuatroID);
        buttonCincoID = findViewById(R.id.buttonCincoID);
        buttonSeisID = findViewById(R.id.buttonSeisID);
        buttonSeteID = findViewById(R.id.buttonSeteID);
        buttonOitoID = findViewById(R.id.buttonOitoID);
        buttonNoveID = findViewById(R.id.buttonNoveID);
        buttonVirgulaID = findViewById(R.id.buttonVirgulaID);
        buttonSomaID = findViewById(R.id.buttonSomaID);
        buttonSubtracaoID = findViewById(R.id.buttonSubtracaoID);
        buttonPorcentoID = findViewById(R.id.buttonPorcentoID);
        buttonMultiplicacaoID = findViewById(R.id.buttonMultiplicacaoID);
        buttonDivisaoID = findViewById(R.id.buttonDivisaoID);
        buttonResetID = findViewById(R.id.buttonResetID);
        buttonDeleteID = findViewById(R.id.buttonDeleteID);

        buttonIgual.setOnClickListener(this);

        buttonUmID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ultimaExpressao = textViewResultado.getText().toString();
                
                if (operacaoComposta==false){
                    textViewResultado.append("1");
                }

                if (ultimaExpressao.endsWith("/") || ultimaExpressao.endsWith("+") || ultimaExpressao.endsWith("*") || ultimaExpressao.endsWith("-")) {
                    operacaoComposta = false;
                }

                if (operacaoComposta == true) {
                    operacaoComposta = false;
                    textViewResultado.setText("");
                    textViewResultado.append("1");
                }
            }
        });

        buttonDoisID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ultimaExpressao = textViewResultado.getText().toString();
                
                if (operacaoComposta==false){
                    textViewResultado.append("2");
                }

                if (ultimaExpressao.endsWith("/") || ultimaExpressao.endsWith("+") || ultimaExpressao.endsWith("*") || ultimaExpressao.endsWith("-")) {
                    operacaoComposta = false;
                }

                if (operacaoComposta == true) {
                    operacaoComposta = false;
                    textViewResultado.setText("");
                    textViewResultado.append("2");
                }
            }
        });

        buttonTresID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ultimaExpressao = textViewResultado.getText().toString();
                
                if (operacaoComposta==false){
                    textViewResultado.append("3");
                }

                if (ultimaExpressao.endsWith("/") || ultimaExpressao.endsWith("+") || ultimaExpressao.endsWith("*") || ultimaExpressao.endsWith("-")) {
                    operacaoComposta = false;
                }

                if (operacaoComposta == true) {
                    operacaoComposta = false;
                    textViewResultado.setText("");
                    textViewResultado.append("3");
                }
            }
        });

        buttonQuatroID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ultimaExpressao = textViewResultado.getText().toString();
                
                if (operacaoComposta==false){
                    textViewResultado.append("4");
                }

                if (ultimaExpressao.endsWith("/") || ultimaExpressao.endsWith("+") || ultimaExpressao.endsWith("*") || ultimaExpressao.endsWith("-")) {
                    operacaoComposta = false;
                }

                if (operacaoComposta == true) {
                    operacaoComposta = false;
                    textViewResultado.setText("");
                    textViewResultado.append("4");
                }
            }
        });

        buttonCincoID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ultimaExpressao = textViewResultado.getText().toString();
                
                if (operacaoComposta==false){
                    textViewResultado.append("5");
                }

                if (ultimaExpressao.endsWith("/") || ultimaExpressao.endsWith("+") || ultimaExpressao.endsWith("*") || ultimaExpressao.endsWith("-")) {
                    operacaoComposta = false;
                }

                if (operacaoComposta == true) {
                    operacaoComposta = false;
                    textViewResultado.setText("");
                    textViewResultado.append("5");
                }
            }
        });

        buttonSeisID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ultimaExpressao = textViewResultado.getText().toString();
                
                if (operacaoComposta==false){
                    textViewResultado.append("6");
                }

                if (ultimaExpressao.endsWith("/") || ultimaExpressao.endsWith("+") || ultimaExpressao.endsWith("*") || ultimaExpressao.endsWith("-")) {
                    operacaoComposta = false;
                }

                if (operacaoComposta == true) {
                    operacaoComposta = false;
                    textViewResultado.setText("");
                    textViewResultado.append("6");
                }
            }
        });

        buttonSeteID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ultimaExpressao = textViewResultado.getText().toString();
                
                if (operacaoComposta==false){
                    textViewResultado.append("7");
                }

                if (ultimaExpressao.endsWith("/") || ultimaExpressao.endsWith("+") || ultimaExpressao.endsWith("*") || ultimaExpressao.endsWith("-")) {
                    operacaoComposta = false;
                }

                if (operacaoComposta == true) {
                    operacaoComposta = false;
                    textViewResultado.setText("");
                    textViewResultado.append("7");
                }
            }
        });

        buttonOitoID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ultimaExpressao = textViewResultado.getText().toString();

                if (operacaoComposta==false){
                    textViewResultado.append("8");
                 }

                if (ultimaExpressao.endsWith("/") || ultimaExpressao.endsWith("+") || ultimaExpressao.endsWith("*") || ultimaExpressao.endsWith("-")) {
                    operacaoComposta = false;
                }

                if (operacaoComposta == true) {
                    operacaoComposta = false;
                    textViewResultado.setText("");
                    textViewResultado.append("8");
                }
            }
        });

        buttonNoveID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ultimaExpressao = textViewResultado.getText().toString();

                if (operacaoComposta==false){
                    textViewResultado.append("9");
                }

                if (ultimaExpressao.endsWith("/") || ultimaExpressao.endsWith("+") || ultimaExpressao.endsWith("*") || ultimaExpressao.endsWith("-")) {
                    operacaoComposta = false;
                }

                if(operacaoComposta == true) {
                    operacaoComposta = false;
                    textViewResultado.setText("");
                    textViewResultado.append("9");
                }
            }
        });

        buttonZeroID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if  (operacaoComposta==false){
                    textViewResultado.append("0");
                }

                if(operacaoComposta == true) {
                    operacaoComposta = false;
                    textViewResultado.setText("");
                    textViewResultado.append("0");
                }
            }


        });

        buttonVirgulaID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtem a última expressão do textViewUltimaExpressao
                String ultimaExpressao = textViewResultado.getText().toString();

                // Verifica se a última caracter é um "."
                if (!ultimaExpressao.endsWith(",")) {
                    // Se não for um ".", adiciona um novo "." ao final da expressão
                    textViewResultado.append(",");
                }
            }
        });

        buttonSomaID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtem a última expressão do textViewUltimaExpressao
                String ultimaExpressao = textViewResultado.getText().toString();

                // Verifica se a última caracter é um "+"
                if (!ultimaExpressao.endsWith("/") && !ultimaExpressao.endsWith("+") && !ultimaExpressao.endsWith("*") && !ultimaExpressao.endsWith("-")) {
                    // Se não for um "+", adiciona um novo "+" ao final da expressão
                    textViewResultado.append("+");
                }
            }
        });

        buttonSubtracaoID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtem a última expressão do textViewUltimaExpressao
                String ultimaExpressao = textViewResultado.getText().toString();

                // Verifica se a última caracter é um "-"
                if (!ultimaExpressao.endsWith("/") && !ultimaExpressao.endsWith("+") && !ultimaExpressao.endsWith("*") && !ultimaExpressao.endsWith("-")) {
                    // Se não for um "+", adiciona um novo "-" ao final da expressão
                    textViewResultado.append("-");
                }
            }
        });

        buttonMultiplicacaoID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtem a última expressão do textViewUltimaExpressao
                String ultimaExpressao = textViewResultado.getText().toString();

                // Verifica se a última caracter é um "+"
                if (!ultimaExpressao.endsWith("/") && !ultimaExpressao.endsWith("+") && !ultimaExpressao.endsWith("*") && !ultimaExpressao.endsWith("-")) {
                    // Se não for um "+", adiciona um novo "+" ao final da expressão
                    textViewResultado.append("*");
                }
            }
        });

        buttonDivisaoID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtem a última expressão do textViewUltimaExpressao
                String ultimaExpressao = textViewResultado.getText().toString();

                // Verifica se a última caracter é um "/"
                if (!ultimaExpressao.endsWith("/") && !ultimaExpressao.endsWith("+") && !ultimaExpressao.endsWith("*") && !ultimaExpressao.endsWith("-")) {
                    // Se não for um "/", adiciona um novo "/" ao final da expressão
                    textViewResultado.append("/");
                }
            }
        });

        buttonPorcentoID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewResultado.append("%");
            }
        });

        buttonResetID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewUltimaExpressao.setText("");
                textViewResultado.setText("");
            }
        });

        buttonDeleteID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resultado = textViewResultado.getText().toString();
                int var1 = resultado.length();

                if (var1 > 0) {
                    resultado = resultado.substring(0, var1 - 1);
                    textViewResultado.setText(resultado);
                }
            }
        });
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.buttonIgualID) {
            String calculo = textViewResultado.getText().toString();
            try {
                Calculable calc = new ExpressionBuilder(calculo).build();
                resultado = calc.calculate();
                textViewResultado.setText(resultado.toString());
                operacaoComposta = true;
                textViewUltimaExpressao.setText(resultado.toString()
                );

            } catch (Exception e) {
                Log.e(TAG, "Erro ao avaliar a expressão: " + calculo, e);
                textViewResultado.setText("Erro");
            }
        }
    }
}
