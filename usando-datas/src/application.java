import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class application {
    public static void main(String[] args) {

        // Utilizando a data local do meu computador:
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();


        // O Instant utiliza o horário de Londres, GMT:
        Instant d03 = Instant.now();


        // Inserindo uma data a partir de um texto ISO 8601:
        LocalDate d04 = LocalDate.parse("2018-01-29");
        LocalDateTime d05 = LocalDateTime.parse("2017-09-05T10:49:03");
        Instant d06 = Instant.parse("2017-09-05T10:49:03Z");
        Instant d07 = Instant.parse("2017-09-05T10:49:03-03:00");


        // Inserindo de um texto fora do padrão
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d08 = LocalDate.parse("25/07/2002", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("31/01/2002 15:49", fmt2);

            // Também pode fazer assim:
        LocalDate d00 = LocalDate.parse("25/07/2002", DateTimeFormatter.ofPattern("dd/MM/yyyy"));


        // Instanciar datas a partir de dados isolados
        LocalDate d10 = LocalDate.of(1889, 01, 23); // Ele aceita ano, mês e dia (na ordem)
        LocalDateTime d11 = LocalDateTime.of(1492, 10, 23, 12, 48); // Mesma coisa com hora

        System.out.println("No momento atual:");
        System.out.println("---------------------------------------------");
        System.out.println("LocalDate: " + d01);
        System.out.println("LocalDateTime: " + d02);
        System.out.println("Instant (GMT0): " + d03);

        System.out.println("Inserindo o horário");
        System.out.println("---------------------------------------------");
        System.out.println("LocalDate: " + d04);
        System.out.println("LocalDateTime: " + d05);
        System.out.println("Instant: " + d06);
        System.out.println("Instant especificando Time Zone diferente: " + d07);

        System.out.println("Formatando um texto diferente");
        System.out.println("---------------------------------------------");
        System.out.println("Formatado: " + d08);
        System.out.println("Formatado com horário: " + d09);

        System.out.println("Com dados isolados");
        System.out.println("---------------------------------------------");
        System.out.println("LocalDate: " + d10);
        System.out.println("LocalDateTime: " + d11);

    }
}
