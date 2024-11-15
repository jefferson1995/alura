package com.introducao;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcaoBotao implements ActionListener {

    private JTextField primeiro;
    private JTextField segundo;
    private JLabel resultado;

    public AcaoBotao(JTextField primeiro, JTextField segundo, JLabel resultado) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.resultado = resultado;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Runnable tarefa = new TarefaMultiplicacao(primeiro, segundo, resultado);
        Thread threadCalculo = new Thread(tarefa, "Thread calculador");
        threadCalculo.start();

    }

}
