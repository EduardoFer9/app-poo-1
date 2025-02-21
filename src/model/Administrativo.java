package model;

public class Administrativo extends Persona{


    @Override
    public boolean registrarAsistencia(String codIdentificador, String fechaAsistencia, String HoraAsistencia, String valorAsistencia) {
        System.out.println("Aplicar logica" +
                "para la asistencia" +
                "administrativo");
        return true;

    }
}
