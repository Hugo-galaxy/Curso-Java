public class exercicio23 {
    public static void main (String[] args){
        double habitantesA,habitantesB,cont;
        habitantesA = 80000;
        habitantesB=200000;
        cont=0;
        while (habitantesA<habitantesB){
            habitantesA=habitantesA+(habitantesA*3)/100;
            habitantesB=habitantesB+(habitantesB*1.5)/100;
            cont++;
        }

        System.out.printf("habitantes A: %.2f",habitantesA);
        System.out.printf("habitantes B: %.2f",habitantesB);
        System.out.printf("anos: %.2f",cont);

    }
}
