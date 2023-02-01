package Aula1;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneIdTest {
    public static void main(String[] args) {
        Set<String> avaialableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(avaialableZoneIds);

        LocalDateTime agora = LocalDateTime.now();

        ZoneId zonaAc = ZoneId.of("Brazil/Acre");
        ZonedDateTime dataTimeAc = ZonedDateTime.of(agora, zonaAc);
        LocalDateTime agoraEmAc = LocalDateTime.now(zonaAc);
        System.out.println(dataTimeAc);
        System.out.println(zonaAc);
        System.out.println(agoraEmAc);

    }
}
