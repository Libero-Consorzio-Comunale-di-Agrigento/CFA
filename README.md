# CFA

Contabilità Finanziaria Armonizzata
 
## Descrizione
Il modulo contabile Bilancio gestisce la contabilità finanziaria, economica e patrimoniale in modo automatico ed integrato. 

La contabilità finanziaria viene gestita attraverso le movimentazioni di entrata e spesa, la stesura del bilancio di previsione, le variazioni di bilancio con gli assestamenti e la rendicontazione contabile, rappresentata dal rendiconto finanziario. 

Il sistema è stato ideato con una logica di massima integrazione tra le singole aree, per una gestione completa del ciclo di vita delle attività contabili legate al Bilancio. 

La piattaforma applicativa proposta nasce da un unico, complessivo disegno dati. Anche se logicamente suddiviso in moduli, il sistema insiste su un'unica base dati relazionale in cui tutte le componenti sono strettamente integrate, coordinate tra loro e cooperanti. 
Nell'ambito di questo disegno l'univocità e la non ridondanza del dato è garantita. Allo stesso modo sono garantiti la visibilità e l'utilizzo del dato da parte di moduli applicativi diversi da quelli in cui esso è stato generato. 

L'accesso al dato è regolato da un sistema di competenze, non solo legato a ruoli amministrativi, che può arrivare ad un elevato livello di dettaglio.

L'applicazione contabile permette, tramite lo strumento del piano dei conti di assegnare Capitoli/Articoli a una o più unità organizzative e ad uno o più responsabili in coerenza con la struttura organizzativa dell'ente. 

L'associazione dei Capitoli/Articoli alle Unità Organizzative permette la gestione del bilancio tramite il decentramento contabile. 

Gli uffici decentrati possono visualizzare i dati di bilancio in consultazione sull'esercizio di gestione, su tutti gli esercizi pluriennali ed anche su esercizi archiviati che sono sempre mantenuti in linea. 

Il sistema prevede la presenza degli esploratori contabili, molteplici stampe ed estrazioni dati sia per la Ragioneria che per gli uffici decentrati con possibilità anche di personalizzazione. 

Il sistema contabile presenta una sezione dedicata alle estrazioni dati. La funzione è presente sia nel verticale in uso alla ragioneria che in quello in uso al decentramento contabile. 

Le estrazioni dati sono raggruppate in un Albero per categoria facilmente navigabile. L'esploratore contabile rappresenta un fiore all'occhiello del nostro sistema. 
È una rappresentazione ad albero del dato contabile, navigabile con drill up e drill down. Ad ogni livello dell'albero su cui si posiziona il cursore è possibile attivare la scheda informativa dove sono consultabili di dati contabili. 

L'esploratore quindi aggrega il dato contabile secondo differenti punti di vista. Questa funzione può essere definita la finestra per gli utenti e dirigenti su tutti i dati finanziari. 
Qui l'utente può attivare una ricerca per capitolo, per impegno/accertamento, per descrizione di capitolo e visualizzare la scheda informativa contabile, con tutte le informazioni relative allo stanziato iniziale, stanziato attuale, FPV, impegnato, residui e pagato. 

L'esploratore contabile è presente anche nel verticale dedicato al decentramento contabile, con la possibilità di visualizzare i dati solo per i capitoli di propria competenza. 

## Struttura del Repository

Il repository è suddiviso nelle seguente cartelle:
- __source__ contiene il codice sorgente e le risorse statiche incluse nella webapp.
- __scriptDB__ contiene gli script PL/SQL per la creazione della struttura dello schema database.
- __diagrammiER__ contiene i diagrammi Entità-Relazione in formato Portable Document Format e Rich Text Format

## Prerequisiti e dipendenze

### Prerequisiti
- AD4: Amministrazione Database di Finmatica S.p.A. 
- SO4: Struttura Amministrativa di Finmatica S.p.A.  
- Java JDK versione 7 o superiore
- Apache Tomcat versione 7 o superiore
- Database Oracle versione 10 o superiore 

### Dipendenze
- Apache ANT versione 1.6 o superiore per la compilazione dei sorgenti
- Libreria _ijlib.jar_ del software commerciale "Instant Developer" di Progamma
- Libreria _ojdbc.jar_ driver oracle per Java di Oracle


## Istruzioni per l’installazione:
- Lanciare gli script della cartella _scriptDB_ per generate lo schema
- Lanciare il comando _ant_ dalla cartella sorgenti per generare la webapp e copiare i file nel contesto di tomcat.

 procedura di installazione di requisiti e dipendenze;
 build system (se previsto dal progetto);
 comandi per la compilazione o il deployment, possibilmente automatizzati da uno script/Makefile (se previsto dal progetto);

## Stato del progetto 
Stabile

## Amministrazione committente
Libero Consorzio Comunale di Agrigento

## Incaricati del mantenimento del progetto open source
Finmatica S.p.A. 
Via della Liberazione, 15
40128 Bologna

## Indirizzo e-mail a cui inviare segnalazioni di sicurezza 
sicurezza@ads.it

