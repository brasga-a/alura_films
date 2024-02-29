import br.com.skelware.alurafilms.modelos.Filme;
import br.com.skelware.alurafilms.modelos.Serie;
import br.com.skelware.alurafilms.calculos.CalculadoraDeTempo;

public class App {

    public static void main(String[] args){
        Filme backsroomsFilme = new Filme();
        backsroomsFilme.setNome("The Backrooms");
        backsroomsFilme.setAnoDeLancamento(2025);
        backsroomsFilme.setDuracaoEmMinutos(150);

        backsroomsFilme.exibirFichaTecnica();
        backsroomsFilme.avaliar(7);
        backsroomsFilme.avaliar(9.5);
        backsroomsFilme.avaliar(8);
        backsroomsFilme.avaliar(10);
        System.out.println("Total de avaliações: " + backsroomsFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações: " + backsroomsFilme.calcularMedia());

        System.out.println("");

        Filme outroFilme = new Filme();
        outroFilme.setNome("Silent Hill");
        outroFilme.setAnoDeLancamento(2013);
        outroFilme.setDuracaoEmMinutos(120);

        //série
        Serie bleach = new Serie();
        bleach.setNome("Bleach");
        bleach.setAnoDeLancamento(2004);
        bleach.exibirFichaTecnica();
        bleach.setTemporadas(7);
        bleach.setEpisodiosPorTemporada(20);
        bleach.setMinutosPorEpisodio(20);
        System.out.println("Duração da série: " + bleach.getDuracaoEmMinutos() + " minutos");

        System.out.println("");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(backsroomsFilme);
        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());

        System.out.println("");
        System.out.println("Fim do programa!");

    }
}
