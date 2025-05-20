# GymExercises

GymExercises è un'API RESTful che consente di gestire un insieme di esercizi da palestra tramite operazioni CRUD (Create, Read, Update, Delete).

## Requisiti

- [Postman](https://www.postman.com/) o qualsiasi altro strumento per testare API REST
- [XAMPP](https://www.apachefriends.org/it/index.html) per la gestione del database locale
- Java + Maven
- Eclipse (o un IDE compatibile)

## Setup del progetto

1. **Collegamento al Database:**
   - Avvia XAMPP.
   - Crea un database chiamato `trainer`.
   - Importa il file `.sql` presente nella repository `trainer.sql` all'interno del database `trainer`.

2. **Avvio di Apache e MySQL:**
   - Dal pannello di controllo di XAMPP, avvia **Apache** e **MySQL**.

3. **Esecuzione del progetto in Eclipse:**
   - Apri il progetto in Eclipse.
   - Vai su `Run As` → `Maven Build...`.
   - Inserisci nel campo *Goals*: `jetty:run`.
   - Clicca su `Run`.

4. **Test dell'API:**
   - Una volta avviato Jetty, puoi testare gli endpoint tramite Postman o strumenti simili.

## Autenticazione

- L'endpoint `POST /api/exercises` è **protetto** da autenticazione tramite **Token**.
- Per accedere a questo endpoint:
  - ottieni un token  valido  tramite `POST login /api/login` .
  - Inserisci il token nell'header `Authorization` della richiesta:
    ```
    Authorization: Bearer <token>
    ```

## Endpoints disponibili

| Metodo | Endpoint                  | Descrizione                                |
|--------|---------------------------|--------------------------------------------|
| GET    | `/api/exercises`          | Restituisce la lista di tutti gli esercizi |
| GET    | `/api/exercises/{id}`     | Restituisce i dettagli di un esercizio     |
| POST   | `/api/exercises`          | Crea un nuovo esercizio                    |
| PUT    | `/api/exercises/{id}`     | Aggiorna un esercizio esistente            |
| DELETE | `/api/exercises/{id}`     | Elimina un esercizio tramite ID            |
| LOGIN  | `/api/exercises/login`    | Accedi ad un Trainer                       |
| SIGN-IN| `/api/exercises/signin`   | Crea un nuovo Trainer                      |

## Contenuti della Repository

- Codice sorgente Java del progetto
- File `trainer.sql` per la creazione del database
- File `README.md`
- Documentazione

## Note
- Assicurati che il xamp sia avviato prima di avviare il server.
- Tutte le chiamate devono essere fatte su `http://localhost:{porta}/api/exercises` (sostituisci `{porta}` con la porta 8080).
- L'endpoint protetto (POST) restituirà **401 Unauthorized** se non viene fornito un token valido.

