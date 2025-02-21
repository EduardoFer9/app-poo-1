import model.Curso;
import model.Especialidad;

public class Main {

    public static void main(String[] args) {

        //creando un objeto desde un constructor vacio
        Curso objcurso = new Curso();
        objcurso.setIdcurso(1);
        System.out.println(objcurso.getIdcurso());

        //creando un objeto desde un constructor con parametros
        Curso objCurso2 = new Curso(2);
        System.out.println(objCurso2.getIdcurso());



        Especialidad objEspecialidad = new Especialidad();
        objEspecialidad.setIdEspe(1);
        System.out.println(objEspecialidad.getIdEspe());





    }
}
