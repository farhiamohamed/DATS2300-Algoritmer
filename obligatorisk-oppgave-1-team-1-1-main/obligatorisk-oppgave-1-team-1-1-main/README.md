[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/_b0jMdNx)
# Obligatorisk Oppgave 1 i DATS2300 - Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastrukturer.
Oppgaven er levert av følgende studenter:
* Farhia Mohamed Hussein, s364591, s364591@oslomet.no
* Mhd Alaa Al dalati, mhald6025, mhald6025@oslomet.no
* Eida Iman Wared, eiwar6383, eiwar6383@oslomet.no

## Arbeidsfordeling
I oppgaven har vi hatt følgende arbeidsfordeling:
* Farhia Mohamed Hussein har hatt hovedansvar for oppgave 4, 6, og 8.
* Eida Iman har hatt hovedansvar for oppgave 2, 5, og 10.
* Mhd Alaa Al dalati har hatt hovedansvar for oppgave 3,7 og 9.
* Vi gjorde oppgave 1 felles.

## Oppgavebeskrivelser
  
### Oppgave 1
jeg har løst oppgaven ved å først sjekke om tabellen er tom og kaste en NoSuchElementException med passende tekst hvis den er det.
Deretter sammenligner jeg hvert par av påfølgende elementer, bytter plass på dem hvis de er i feil rekkefølge, og gjentar prosessen for hvert elementpar. 
Til slutt ligger den største verdien bakerst i arrayen, og jeg returnerer den største verdien ved å hente det siste elementet.

### oppgave 1 a,b,c
a) antall sammenligninger vil være (n - 1).
b) det skjer når tabellen sortert i stigende rekkegfølge.
c) det skjer når tabeller IKKE sortert i stigende rekkefølge.
d) Det vil avhenge av lengden på arrayen og av hvordan elementene er ordnet i arrayen og hvilken algoritme som brukes. I denne bubble sort-algoritmen, vil det gjennomsnittlige antallet ombyttinger avhenge av egenskapene til inndataene og hvor mange inversjoner som er tilstede i arrayen. 

### Oppgave 2
Setter telleren til 1 fordi vi vet at det minst vil være ett unikt tall i arrayen hvis den ikke er tom. Videre, sjekker vi for å håndtere tilfellet der arrayen `a` er tom. Så  bruker vi en løkke for å iterere gjennom elementene, unntatt det siste elementet. Vi bruker `a.length - 1` som grense fordi vi sammenligner hvert element med det neste elementet. Deretter, gjør vi en rask sjekk for å se om arrayen er sortert i stigende rekkefølge, hvis den ikke er det, kaster vi feilmelding. Til slutt, sjekker vi om indeksene i og i + 1 ikke er like,
Fordi det betyr at vi har funnet et unikt tall,


### Oppgave 3
jeg løste  denne oppgave første med å finne antall unike elementer i en usortert liste. 
Jeg brukte en for-løkke til å iterere gjennom hvert element i listen. 
For hvert element sammenlignet jeg det med alle de påfølgende elementene for å telle antall like elementer. 
Til slutt trakk jeg antallet like elementer fra totalt antall elementer for å finne antall unike elementer i listen.

### Oppgave 4
Oppgaven ble løst ved å lage fem hjelpemetoder. Den første er Kvikksortering-metoden som kaller på
metoden kvikksorteringStigende for å ha muligheten til å bruke "fra" og "til" som parametere.
Kvikksortering stigene finner midverdien og bruker sParterStigende metoden til å partisjonere arrayet 
med midverdien som skilleverdi. Deretter bruker den parterStigene metoden til å sortere vediene i stigende følge
etter at de har blitt flyttet til den riktige siden ved bruk av Bytt-metoden. Delsortering metoden sorterer verdiene
i tabellen til venstre eller høyre side ved å finne ut om de er partall eller oddetall.

### Oppgave 5
Først lager vi en løkke for å iterere gjennom elementene, utenom det siste elementet. Hvis a[i] er like det siste elementet betyr det at vi har funnet et element som er lik det siste element. Videre, lager vi en temp variabel for å kopiere verden til a[i], for å kunne bytte plass p[ elementene. Så bytter vi verdien til a[i] med verdien til første elementet. Så kan vi kopiere verdien fra tempen til første elementet i arrayet. Utenfor if forsetter vi rotasjonen og bytter alltid verdien til første element med det neste. 

### Oppgave 6
I denne oppgaven er det bruk av Euklids algoritmen for å finne største felles divisor. For å finne s (syklusen) så må du 
finne største felles divisor mellom n (antall rotasjoner) og d (antall plasser). Det er bruk av en for-løkke der
så lenge k er mindre enn s, så legges char verdi til tabellen c. Deretter har vi en for-løkke for å forskyve verdiene i arrayet.


### Oppgave 7a
I oppgaven løste jeg problemet med å flette sammen en liste med strenger ved å først finne den lengste strengen. 
Jeg brukte deretter en for-løkke for å iterere gjennom karakterposisjonene i alle strengene. 
For hver posisjon hentet jeg den første bokstaven fra hver streng, 
og flettet dem sammen for å danne en ny streng som inneholdt den første bokstaven fra hvert ord i de opprinnelige strengene.

### Oppgave 7b

Denne metoden tar en liste med strenger som input. 
Den finner den lengste strengen i listen og bruker deretter en for-løkke som kjører så lenge karakterposisjonen er mindre enn lengden til den lengste strengen. 
I løkken henter den den første bokstaven fra hver streng etter karakterposisjon og fletter dem sammen for å produsere 
en ny streng som inneholder den første bokstaven fra hvert ord i inputstrengene.

### Oppgave 8
Til begynne med, skjekkes det om tabellen er tom. En array av indekser ble laget for a beskrive en sortering av a.
En for-loop lages for a loope gjennom arrayet, der minIndex er lik i. j er indeks posisjonen etter i og minIndex far samme verdi
som j hvis verdien pa posisjon j er mindre enn verdien pa posisjon i. int tmp holder indeks verdien til i som oppdaterer seg 
til minIndex verdi. Indeks tabellen blir da returnert.

### Oppgave 9
For å løse denne oppgaven  starter jeg med å initialisere en hjelpe-array med de tre første elementene fra a-arrayen. 
Deretter sorterer jeg  indeksene til disse elementene ved hjelp av en indekssorteringsmetode fra oppgave 8. 
Til slutt itererer du gjennom resten av a-arrayen for å finne de tre minste elementene og deres indekser ved å sammenligne og oppdatere verdiene mens vi  går gjennom arrayen.3


### Oppgave 10
I denne oppgaven brukte jeg hintet som ble oppgitt i oppgaveteksten og lagde to tabeller med 126 verdier som representerer antall verdier i ASCII tabellen.
Dette gjorde oppgaven enklere fordi jeg kunne gjøre om bokstavene til en verdi i ASCII tabellen og bruke indeksene for å representere de ulike bokstavene. 
Videre telte jeg antall bokstaver i string a og b ved å bruke en for loop for hver string. 
Jeg brukte charAt(i) for å hente bokstaven ut før jeg la den til i tabellen ved å gjøre den om til int
og legge den inn på den plassen. F.eks hvis A sin verdi i ASCII tabellen er 65 så blir antall forekomster av A telt på indeksen.
