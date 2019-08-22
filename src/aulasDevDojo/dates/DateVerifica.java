package aulasDevDojo.dates;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateVerifica {
    private String[] historicoDate = new String[5];
    private int numeroDeConsultas;

    public void retornaConsultas() {
        for (String consulta : historicoDate) {
            System.out.println(consulta);
        }
    }

    public void setHistoricoDate() {
        Calendar c = Calendar.getInstance();
        DateFormat format = DateFormat.getDateInstance(DateFormat.FULL);

        String horas = c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND);
        String data = format.format(c.getTime());

        String dataHora = "Horário realizado: " + horas + " Data: " + data;

        System.out.println("HISTORICO DE CONSULTAS");
        for (int i = 0; i <= historicoDate.length - 1; i++) {
            if(historicoDate[i] == null){
                historicoDate[i] = dataHora;
                break;
            }
        }
    }

    public int getNumeroDeConsultas() {
        return numeroDeConsultas;
    }

    public void setNumeroDeConsultas(int numeroDeConsultas) {
        this.numeroDeConsultas = +numeroDeConsultas;
    }
}
