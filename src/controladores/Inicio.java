package controladores;

import excepciones.SaldoInsuficienteException;
import excepciones.ErrorDeTransferenciaException;
import servicios.TransferenciaServicio;

public class Inicio {
	//He pasados las Excepciones en el throw
    public static void main(String[] args) throws SaldoInsuficienteException,ErrorDeTransferenciaException,Exception {
        TransferenciaServicio servicio = new TransferenciaServicio();

        try {
            servicio.procesarTransferencia(1000, 2000);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Fondos insuficientes: " + e.getMessage());
        } catch (ErrorDeTransferenciaException e) {
            System.out.println("Error en la transferencia: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            System.out.println("Operación de transferencia finalizada.");
        }
    }
}


