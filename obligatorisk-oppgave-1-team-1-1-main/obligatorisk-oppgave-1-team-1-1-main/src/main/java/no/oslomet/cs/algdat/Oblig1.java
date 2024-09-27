package no.oslomet.cs.algdat;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oblig1 {

    private Oblig1() {}
    public static int maks(int[] a) {
        //sjekke om tabellen er tom og kaste en NoSuchElementException med passende tekst
        if(a.length <1)
            throw new NoSuchElementException("Tabellen a er tom!");

        //sammenligner jeg hvert par av påfølgende elementer, bytter plass på dem hvis de er i feil rekkefølge.
        int tmp=1;
        for(int i=0; i<a.length-1; i++){
            if(a[i]>a[i+1]){
                tmp=a[i];
                a[i]=a[i+1];
                a[i+1]=tmp;
            }
        }

        return a[a.length-1];
    }

    public static int ombyttinger(int[] a) {
        int antall_byttinger=0;
        int tmp=1;
        for(int i=0; i<a.length-1; i++){
            if(a[i]>a[i+1]){
                tmp=a[i];
                a[i]=a[i+1];
                a[i+1]=tmp;
                antall_byttinger++;
            }
        }

        return antall_byttinger;
    }

    // Oppgave 2
    public static int antallUlikeSortert(int[] a) {
        int antforskjell=1;

        if(a.length==0){
            return 0;
        }
        for(int i=0; i < a.length-1; i++){
            if(a[i]>a[i+1]){
                throw new IllegalStateException("tallen er ikke  sortert stigende!");
            }
            if(a[i]!=a[i+1]){
                antforskjell++;
            }
        }
        return antforskjell;

    }

    // Oppgave 3
    public static int antallUlikeUsortert(int[] a) {
            int ulike = 0;   // Variabel for å holde antall unike elementer
            int antalllike = 0; // Variabel for å holde antall like elementer

            if (a.length == 0) {
                return 0;  // Hvis listen er tom, er antall unike elementer også 0
            }

            for (int i = 0; i < a.length; i++) {  // Går gjennom hvert element i listen
                int tmp = a[i];  // Lagrer det gjeldende elementet i en midlertidig variabel
                for (int j = i + 1; j < a.length; j++) {  // Sammenligner med alle påfølgende elementer
                    if (tmp == a[j]) {
                        antalllike++;  // Hvis det er en match, øk antalllike
                        break;
                    }
                }
                ulike = a.length - antalllike; // Beregner antall unike ved å trekke fra antall like fra totalt antall elementer
            }

            return ulike;  // Returnerer antall unike elementer
        }


    // Oppgave 4

    private static void kvikksortering(int[] a, int fra, int til) {
        kvikksorteringStigende(a, fra, til);
    }

    private static void kvikksorteringStigende(int[] a, int fra, int til) {
        //Hvis tabellen er tom, returnerer den bare tabellen
        if (fra >= til) {
            return;
        }

        //finner midtverdien
        int midtverdi = sParterStigende(a, fra, til, (fra + til)/2);

        //sorterer verdier på venstre side
        kvikksorteringStigende(a, fra, midtverdi - 1);
        //sorterer verdier på høyre side
        kvikksorteringStigende(a, midtverdi + 1, til);
    }
    private static int sParterStigende(int[] a, int fra, int til, int skilleIndeks) {
        //verdiene til skilleIndeks flyttes bak
        bytt(a, skilleIndeks, til);
        //partisjonerer verdier[fra:til-1]
        int posisjon = parterStigende(a, fra, til - 1, a[til]);
        //bytter for å få verdier[skilleIndeks] på rett plass
        bytt(a, posisjon, til);
        //returnerer posisjonen til skilleverdien
        return posisjon;
    }
    private static int parterStigende(int[] a, int fra, int til, int skilleverdi) {
        //stopper når fra > til
        while (true) {
            //til er stoppverdi for fra
            while (fra <= til && a[fra] < skilleverdi) {
                fra++;
            }
            //fra er stoppverdi for til
            while (fra <= til && a[til] >= skilleverdi) {
                til--;
            }
            //bytter om a[fra] og a[til]
            if (fra < til) {
                bytt(a, fra++, til--);
            }
            //a[fra] er første verdi som ikke er mindre enn skilleverdi
            else  return fra;
        }
    }

    //Metode for å bytte indeks posisjoner for verdier
    public static void bytt(int[] a, int i, int j){

        a[i] = (int) ((a[i] + a[j]) - (a[j] = a[i]));
    }
    public static void delsortering(int[] a) {


        int fra = 0;
        int til = a.length - 1;
        int i = 0;

        //sorterer et array med oddetall på venste side og partall på høyre side
        while (i < a.length) {
           //Så lenge til er større eller lik fra, og at fra er ikke et partall, økes fra-siden
            while (til >= fra && a[fra]%2!=0) {

                fra++;
            }
            //Så lenge til er større eller lik fra, og at til er et partall, økes til-siden
            while (til >= fra && a[til]%2==0) {

                til--;
            }
            //Hvis verdien for fra er mindre en til, så bytter de plass
            if (fra < til) {
                bytt(a,fra++,til--); }
            i++;
        }

        //Bruk av kvikksortering-metode for å sortere partall og oddetall
        kvikksortering(a, 0, til);
        kvikksortering(a,fra, a.length - 1);
    }




    // Oppgave 5
    public static void rotasjon(char[] a) {

        for (char i = 0; i < a.length - 1; i++) {

            if (a[i] == a[a.length - 1]) {
                char temp = a[i];
                a[i] = a[0];
                a[0] = temp;
            }
            char temp = a[0];
            a[0] = a[i + 1];
            a[i + 1] = temp;
        }
    }


    //Oppgave 6

    //Bruk av Euklids algoritme for å finne gcd
        public static int gcd(int a, int b)
    {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void rotasjon(char[] c, int d)
    {
        // Hvis tabellen har mindre enn 2 verdier blir det ingen rotasjon
        int n = c.length;  if (n < 2) return;
        if ((d %= n) < 0) d += n;

        // Bruk av gcd-metode for å finne største felles divisor
        int s = gcd(n, d);

        // antall sykler
        for (int k = 0; k < s; k++)
        {
            // hjelpevariabel
            char verdi = c[k];

            //Løkke for forskyving av verdier i arrayet
            for (int i = k - d, j = k; i != k; i -= d)
            {
                // sjekker fortegnet til i
                if (i < 0) i += n;
                // kopierer og oppdaterer j
                c[j] = c[i]; j = i;
            }

            // legger tilbake verdien
            c[k + d] = verdi;
        }
    }

    // Oppgave 7
    public static String flett(String s, String t) {
        // Deler strengene s og t inn i lister med enkeltbokstaver
        String[] slist = s.split("");
        String[] tlist = t.split("");

        // Oppretter en tom streng for å lagre det flettede resultatet
        String string = "";

        // Beregner lengden på den lengste av de to strengene
        int storste;
        if (s.length() >= t.length()) {
            storste = s.length();
        } else {
            storste = t.length();
        }

        // Itererer gjennom begge strengene og fletter dem sammen
        for (int i = 0; i < storste; i++) {
            // Legger til bokstaven fra s hvis indeksen i er mulig
            if (i < slist.length) {
                string += slist[i];
            }
            // Legger til bokstaven fra t hvis indeksen i er mulig
            if (i < tlist.length) {
                string += tlist[i];
            }
        }

        // Returnerer den flettede strengen
        return string;
    }

    public static String flett(String... s) {
        int storstesenting = 0; // Variabel for å holde lengden til den lengste strengen

        // Loop for å finne den lengste strengen blant alle inputstrengene
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() > storstesenting) {
                storstesenting = s[i].length();
            }
        }

        String result = ""; // Variabel for å lagre den flettede strengen

        // Ytre løkke som går gjennom karakterposisjonene fra 0 til den lengste strengen
        for (int i = 0; i < storstesenting; i++) {
            // Indre løkke som itererer gjennom alle inputstrengene
            for (String str : s) {
                if (i < str.length()) { // Sjekker om karakterposisjonen er innenfor lengden til den gjeldende strengen.
                    result += str.charAt(i); // Legger til karakteren på posisjon 'i' til resultatstrengen
                }
            }
        }

        return result; // Returnerer den flettede strengen
    }

    //Oppgave 8
    public static int[] indekssortering(int[] a){

            //Sjekker om tabellen er tom
            if(a.length<0){
            return new int[]{};
        }
            //Lage en indeks array
        int[] indextabell=new int[a.length];
            //Fyller arrayet med indeks verdier med samme lengde som array a
        for(int i=0; i<a.length; i++){
            indextabell[i]=i;
        }
            //
        for(int i=0; i<a.length-1;i++){
            //Minste verdi far verdi i
            int minIndex=i;
            //Hvis verdien i indeks j som er indeks posisjonen etter i er mindre enn
            // vedrien i indeks minIndex, sa oppdateres minIndex posijonen til en verdi j
            for(int j=i+1; j<a.length; j++){
                if(a[indextabell[j]]<a[indextabell[minIndex]]){
                    minIndex=j;
                }
            }
            //int tmp holder indeksen til i
            int tmp=indextabell[i];
            //Indeks posijon i oppdateres til minIndex posisjon
            indextabell[i]=indextabell[minIndex];
            //Oppdaterer indeks j til i
            indextabell[minIndex]=tmp;

        }

        return indextabell;
    }



    // Oppgave 9
    public static int[] tredjeMin(int[] a) {
            int n = a.length;
            // kaster et unntak hvis det array er mindre enn 3.
            if (n < 3) {
                throw new NoSuchElementException("a.length(" + n + ") < 3!");
            }

            //oppreter "array" med de tre første elementene fra a.
            int [] array=new int[3];
            for(int i=0; i<3; i++){
                array[i]=a[i];
            }
            // Sorterer indeksene  ved hjelp av en indekssorteringsmetode fra oppgave 8
            int[] b=indekssortering(array);


            int index = b[0];
            int index2 = b[1];
            int index3 = b[2];

            int m = a[index];
            int nm = a[index2];
            int tm = a[index3];

            //// Itererer gjennom resten av "a" fra indeks 3 for å finne de tre minste elementene og deres indekser.
            for (int i = 3; i < a.length; i++) {
                if (a[i] < m) {
                    tm = nm;
                    index3 = index2;
                    nm = m;
                    index2 = index;
                    m = a[i];
                    index = i;

                } else if (a[i] < nm) {
                    tm = nm;
                    index3 = index2;
                    nm = a[i];
                    index2 = i;

                } else if (a[i] < tm) {
                    tm = a[i];
                    index3 = i;
                }
            }
            // Returnerer  de minste tre  elementene i "a."
            return new int[] { index, index2, index3 };
        }


    // Oppgave 10
    public static boolean inneholdt(String a, String b) {

        // for aa legge inn ant forekomster av hver bokstav i stringen
        int[] antallA = new int[256];
        int[] antallB = new int[256];

        // teller bokstaver i string a
        for (int i = 0; i < a.length(); i++) {
            char bokstav = a.charAt(i);
            antallA[(int) bokstav]++;
        }

        // teller bokstaver i string b
        for (int i = 0; i < b.length(); i++) {
            char bokstav = b.charAt(i);
            antallB[(int) bokstav]++;
        }

        // hvis a <= b
        for (int i = 0; i < 256; i++) {
            if (antallA[i] > antallB[i]) {
                return false;
            }
        }

        // hvis alle bokstavene i a kan dannes med like mange bokstaver som i b
        return true;



        }
}
