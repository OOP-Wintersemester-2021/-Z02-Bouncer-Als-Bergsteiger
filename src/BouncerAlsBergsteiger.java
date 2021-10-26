import de.ur.mi.bouncer.apps.BouncerApp;
import de.ur.mi.bouncer.apps.BouncerLauncher;
import de.ur.mi.bouncer.world.fields.FieldColor;


/*
 * Bouncer steht am Fuße eines Berges und soll den Gipfel erreichen, der glücklicherweise
 * als blaues Feld markiert ist. Das Programm soll auch für andere Berge funktionieren, für
 * die die folgenden Regeln gelten:
 *
 *   - Bouncer startet immer mindestens ein Feld vor der ersten "Stufe" des Berges und blickt zu Beginn
 *     direkt auf den Berg.
 *   - Der Gipfel befindet sich auf einem beliebigen Feld der letzten "Spalte" der Karte und immer direkt
 *     über einem Teil des Berges.
 *   - Abschnitt des Berges können unterschiedlich steil sein. Stufen im Berg können unterschiedlich
 *     lang sein. Einzelne Stufen im Berg sind dabei immer mindestens genauso lang wie die darunter liegende
 *     Stufe.
 *   - Bouncer muss einen Weg direkt am Berg entlang wählen.
 */
public class BouncerAlsBergsteiger extends BouncerApp {

    @Override
    public void bounce() {
        loadMap("Mountain");
    }

    public static void main(String[] args) {
        BouncerLauncher.launch("BouncerAlsBergsteiger");
    }
}
