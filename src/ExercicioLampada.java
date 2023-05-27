public class ExercicioLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.setModelo("A60");
        lampada.setTensao("Bivolt");
        lampada.setCor("amarela");
        lampada.setTipoLuz("amarela");

        //lampada.setTipos(new String[5]);
        //lampada.setTipos([0]="abajur");
        //lampada.tipos[0]="Abajur";
        System.out.println(lampada.getCor());

        lampada.exibirOpcao();
    }
}
