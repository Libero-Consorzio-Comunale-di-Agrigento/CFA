-- ============================================================
--   Database name:  CFA e                                      
--   DBMS name:      ORACLE Version for SI4 Rev.1(NH)                               
-- ============================================================


-- ============================================================
--   Table: TIPI_INCARICO                                      
-- ============================================================
create table TIPI_INCARICO
(
    CODICE                          NUMBER(3)              not null,
    DESCRIZIONE                     VARCHAR2(60)           not null,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint TIPI_INCARICO_PK primary key (CODICE)
)
/


-- ============================================================
--   Table: FLESSIBILITA                                       
-- ============================================================
create table FLESSIBILITA
(
    CODICE                          VARCHAR2(4)            not null,
    DESCRIZIONE                     VARCHAR2(60)           not null,
    SEQUENZA                        NUMBER(4)              null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR(8)             null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint FLESSIBILITA_PK primary key (CODICE)
)
/



-- ============================================================
--   Table: STAT_IVA                                           
-- ============================================================
create table STAT_IVA
(
    CODICE                          VARCHAR2(3)            not null,
    DESCRIZIONE                     VARCHAR2(100)          not null,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint STAT_IVA_PK primary key (CODICE)
)
/

-- ============================================================
--   Table: ACC                                                
-- ============================================================
create table ACC
(
    CAPITOLO                        NUMBER(16)             not null,
    ARTICOLO                        NUMBER(2)              not null,
    ANNO_ACC                        NUMBER(4)              not null,
    NUMERO_ACC                      NUMBER(5)              not null,
    ANNO_DEL                        NUMBER(4)              null    ,
    NUMERO_DEL                      NUMBER(6)              null    ,
    SEDE_DEL                        VARCHAR2(255)          null    ,
    DATA_REG                        NUMBER(7)              null    ,
    IMPORTO                         NUMBER(14,2)           not null,
    DESCRIZIONE                     VARCHAR2(140)          not null,
    CAUSALE                         NUMBER(4)              null    ,
    ANNO_INTROD                     NUMBER(4)              null    ,
    DEBITORE                        NUMBER                 null    
        constraint ACC_DEBITORE_CC check (
            DEBITORE is null or (DEBITORE >= 1
            )),
    ESERCIZIO_SCADENZA              NUMBER(4)              null    ,
    TIPO_SERVIZIO                   NUMBER(3)              null    ,
    VOCE_ECON                       NUMBER(2)              null    ,
    TIPO_VINCOLO                    NUMBER(6)              null    ,
    CODICE_FINANZ                   NUMBER(3)              null    ,
    ANNO_PROPOSTA                   NUMBER(4)              null    ,
    UNITA_PROPONENTE                VARCHAR2(255)          null    ,
    NUMERO_PROPOSTA                 NUMBER(10)             null    ,
    VAR_AUTO                        VARCHAR2(2)            null    
        constraint ACC_VAR_AUTO_CC check (
            VAR_AUTO is null or (VAR_AUTO in ('SI'))),
    E                               VARCHAR2(1)            default 'E' not null,
    D_DATA_REG                      DATE                   default SYSDATE null    ,
    ANNO_PLUR                       NUMBER(4)              null    ,
    NUMERO_PLUR                     NUMBER(5)              null    ,
    CENTRO                          VARCHAR2(16)           null    ,
    FATTORE                         VARCHAR2(16)           null    ,
    COMPETENZA_DAL                  DATE                   null    ,
    COMPETENZA_AL                   DATE                   null    ,
    NOTE                            VARCHAR2(2000)         null    ,
    RILEVANTE_ECO                   VARCHAR2(2)            null    
        constraint ACC_RILEVANTE_ECO_CC check (
            RILEVANTE_ECO is null or (RILEVANTE_ECO in ('SI'))),
    COD_IMP_ECO                     VARCHAR2(16)           null    ,
    CONTROLLO_DISP                  VARCHAR2(2)            null    
        constraint ACC_CONTROLLO_DIS_CC check (
            CONTROLLO_DISP is null or (CONTROLLO_DISP in ('SI'))),
    PROGETTO_ID                     VARCHAR2(9)            null    ,
    FINANZIAMENTO                   NUMBER(5)              null    ,
    OPERA                           NUMBER(5)              null    ,
    OBIETTIVO                       VARCHAR2(9)            null    ,
    CODICE_GESTIONALE               NUMBER(4)              null    ,
    RESPONSABILE_RES                VARCHAR2(40)           null    ,
    COD_MONITORAGGIO                VARCHAR2(5)            null    ,
    PROGR_UNITA_ORGANIZZATIVA       NUMBER(8)              null    ,
    PROGR_UNITA_ORGANIZZATIVA_INS   NUMBER(8)              null    ,
    SCHEDA_OBIETTIVO_ID             NUMBER(10)             null    ,
    COD_LIVELLO_5                   NUMBER(10)             null    ,
    CODICE_EUROPEO                  NUMBER(1)              null    ,
    ANNO_ACC_PROVENIENZA            NUMBER(4)              null    ,
    NUMERO_ACC_PROVENIENZA          NUMBER(5)              null    ,
    DATA_REG_ECONOMICA              DATE                   null    ,
    DATA_SCADENZA                   DATE                   null    ,
    FINANZIAMENTO_LIGHT             NUMBER(5)              null    ,
    OPERA_LIGHT                     NUMBER(5)              null    ,
    PROGR_VARACC_PROVENIENZA        NUMBER(10)             null    ,
    ID_ESTERNO                      VARCHAR2(50)           null    ,
    ANNO_ACC_PREC                   NUMBER(4)              null    ,
    NUMERO_ACC_PREC                 NUMBER(5)              null    ,
    DESCRIZIONE_INIZIALE            VARCHAR2(140)          null    ,
    TIPO_AVANZO                     NUMBER(10)             null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint ACC_PK primary key (ANNO_ACC, NUMERO_ACC)
)
/


-- ============================================================
--   Index: ACC_BIL_FK                                         
-- ============================================================
create index ACC_BIL_FK on ACC (E asc, ANNO_ACC asc, CAPITOLO asc, ARTICOLO asc)
/

-- ============================================================
--   Index: ACC_DEL_FK                                         
-- ============================================================
create index ACC_DEL_FK on ACC (ANNO_DEL asc, NUMERO_DEL asc, SEDE_DEL asc)
/

-- ============================================================
--   Index: ACC_BEN_FK                                         
-- ============================================================
create index ACC_BEN_FK on ACC (DEBITORE asc)
/

-- ============================================================
--   Index: ACC_VINCOLI_FK                                     
-- ============================================================
create index ACC_VINCOLI_FK on ACC (TIPO_VINCOLO asc)
/

-- ============================================================
--   Index: ACC_CAUSALE_FK                                     
-- ============================================================
create index ACC_CAUSALE_FK on ACC (CAUSALE asc)
/

-- ============================================================
--   Index: ACC_CAP_FK                                         
-- ============================================================
create index ACC_CAP_FK on ACC (CAPITOLO asc, ARTICOLO asc)
/

-- ============================================================
--   Index: ACC_FIN_FK                                         
-- ============================================================
create index ACC_FIN_FK on ACC (FINANZIAMENTO asc)
/

-- ============================================================
--   Index: ACC_OPE_FK                                         
-- ============================================================
create index ACC_OPE_FK on ACC (OPERA asc)
/

-- ============================================================
--   Index: ACC_PROP_FK                                        
-- ============================================================
create index ACC_PROP_FK on ACC (UNITA_PROPONENTE asc, NUMERO_PROPOSTA asc, ANNO_PROPOSTA asc)
/

-- ============================================================
--   Index: IDX_ACC_DATAREG                                    
-- ============================================================
create index IDX_ACC_DATAREG on ACC (D_DATA_REG asc)
/

-- ============================================================
--   Table: PRE                                                
-- ============================================================
create table PRE
(
    CAPITOLO                        NUMBER(16)             not null,
    ARTICOLO                        NUMBER(2)              not null,
    ANNO_PRE                        NUMBER(4)              not null,
    NUMERO_PRE                      NUMBER(5)              not null,
    ANNO_ACC                        NUMBER(4)              not null,
    NUMERO_ACC                      NUMBER(5)              not null,
    DATA_REG                        NUMBER(7)              null    ,
    IMPORTO                         NUMBER(14,2)           not null
        constraint PRE_IMPORTO_CC check (
            IMPORTO >= 0),
    DESCRIZIONE                     VARCHAR2(140)          not null,
    DEBITORE                        NUMBER                 null    
        constraint PRE_DEBITORE_CC check (
            DEBITORE is null or (DEBITORE >= 1
            )),
    ANNO_DOC                        NUMBER(4)              null    ,
    NUMERO_DOC                      VARCHAR2(20)           null    ,
    CAUSALE                         NUMBER(4)              null    ,
    BOLLO                           NUMBER(2)              null    ,
    ANNO_ORD                        NUMBER(4)              not null,
    NUMERO_ORD                      NUMBER(5)              not null,
    NUMERO_INC                      VARCHAR2(10)           null    ,
    DATA_INC                        NUMBER(7)              null    ,
    IMPORTO_INC                     NUMBER(14,2)           null    
        constraint PRE_IMPORTO_INC_CC check (
            IMPORTO_INC is null or (IMPORTO_INC >= 0
            )),
    TIPO_VINCOLO                    NUMBER(6)              null    ,
    UFFICIO                         NUMBER(5)              null    ,
    DATA_ESTRATTO_CCP               NUMBER(7)              null    ,
    DATA_CCP                        NUMBER(7)              null    ,
    VOCE_ECON                       NUMBER(2)              null    ,
    CODICE_FINANZ                   NUMBER(4)              null    ,
    CODICE_PTC                      NUMBER(4)              null    ,
    NUM_QUIETANZA                   NUMBER(2)              null    ,
    E                               VARCHAR2(1)            default 'E' not null,
    FAT_ANNO_PROG                   NUMBER(4)              null    ,
    FAT_NUMERO_PROG                 NUMBER(5)              null    ,
    D_DATA_REG                      DATE                   default SYSDATE null    ,
    D_DATA_INC                      DATE                   null    ,
    D_DATA_ESTRATTO_CCP             DATE                   null    ,
    D_DATA_CCP                      DATE                   null    ,
    NUMERO_CONTABILE                VARCHAR2(10)           null    ,
    DATA_CONTABILE                  DATE                   null    ,
    PROGRESSIVO_TESO                NUMBER(5)              null    
        constraint PRE_PROGRESSIVO_T_CC check (
            PROGRESSIVO_TESO is null or (PROGRESSIVO_TESO >= 0
            )),
    FATTORE                         VARCHAR2(16)           null    ,
    CENTRO                          VARCHAR2(16)           null    ,
    COMPETENZA_DAL                  DATE                   null    ,
    COMPETENZA_AL                   DATE                   null    ,
    COD_IMP_ECO                     VARCHAR2(16)           null    ,
    PROGRESSIVO_CFA                 NUMBER(10)             null    ,
    ANNO_DISTINTA                   NUMBER(4)              null    ,
    NUMERO_DISTINTA                 NUMBER(6)              null    ,
    TIPO_DISTINTA                   VARCHAR2(1)            null    
        constraint PRE_TIPO_DISTINTA_CC check (
            TIPO_DISTINTA is null or (TIPO_DISTINTA in ('C'))),
    OPERA                           NUMBER(5)              null    ,
    SPESE                           NUMBER(1)              null    ,
    COMMISSIONI                     NUMBER(1)              null    ,
    ALLEGATI                        VARCHAR2(150)          null    ,
    INFO_TESORIERE                  VARCHAR2(200)          null    ,
    CODICE_GESTIONALE               NUMBER(4)              null    ,
    ESERCIZIO_PROVV                 NUMBER(4)              null    ,
    PROGRESSIVO_PROVV               NUMBER(10)             null    ,
    PROGRESSIVO_PROV_DETT           NUMBER(4)              null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    COD_LIVELLO_5                   NUMBER(10)             null    ,
    CODICE_EUROPEO                  NUMBER(3)              null    ,
    constraint PRE_PK primary key (ANNO_PRE, NUMERO_PRE)
)
/




-- ============================================================
--   Table: VARACC                                             
-- ============================================================
create table VARACC
(
    PROGRESSIVO                     NUMBER(10)             not null,
    COD_REC                         NUMBER(1)              not null
        constraint VARACC_COD_REC_CC check (
            COD_REC in (1,2)),
    ANNO_VAR                        NUMBER(4)              not null,
    CAPITOLO                        NUMBER(16)             not null,
    ARTICOLO                        NUMBER(2)              not null,
    ANNO_ACC                        NUMBER(4)              not null,
    NUMERO_ACC                      NUMBER(5)              not null,
    ANNO_DEL                        NUMBER(4)              null    ,
    NUMERO_DEL                      NUMBER(6)              null    ,
    SEDE_DEL                        VARCHAR2(255)          null    ,
    DATA_REG                        NUMBER(7)              null    ,
    IMPORTO                         NUMBER(14,2)           not null,
    DESCRIZIONE                     VARCHAR2(140)          not null,
    TIPO_VAR                        NUMBER(2)              not null,
    ANNO_PROPOSTA                   NUMBER(4)              null    
        constraint VARACC_ANNO_PROPOSTA_CC check (
            ANNO_PROPOSTA is null or (ANNO_PROPOSTA between 1000 and 2999
            )),
    UNITA_PROPONENTE                VARCHAR2(255)          null    ,
    NUMERO_PROPOSTA                 NUMBER(10)             null    ,
    D_DATA_REG                      DATE                   default SYSDATE null    ,
    OPERA                           NUMBER(5)              null    ,
    PROGRESSIVO_CF4                 NUMBER(10)             null    ,
    ANNO_ESIGIBILITA                NUMBER(4)              null    ,
    ACC_GENERATO                    VARCHAR2(2)            null    
        constraint VARACC_ACC_GENERATO_CC check (
            ACC_GENERATO is null or (ACC_GENERATO in ('SI'))),
    VARIAZIONE_GENERATA             VARCHAR2(2)            null    
        constraint VARACC_VARIAZIONE_GE_CC check (
            VARIAZIONE_GENERATA is null or (VARIAZIONE_GENERATA in ('SI'))),
    PROGR_VARACC_PROVENIENZA        NUMBER(10)             null    ,
    TIPO_AVANZO                     NUMBER(10)             null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint VARACC_PK primary key (PROGRESSIVO)
)
/



-- ============================================================
--   Table: VINCOLI                                            
-- ============================================================
create table VINCOLI
(
    CODICE                          NUMBER(6)              not null,
    DESCRIZIONE                     VARCHAR2(50)           not null,
    STAMPA                          VARCHAR2(2)            null    
        constraint VINCOLI_STAMPA_CC check (
            STAMPA is null or (STAMPA in ('SI'))),
    RIF_TESO_1                      VARCHAR2(2)            null    ,
    RIF_TESO_2                      VARCHAR2(2)            null    ,
    SALDO_INI_CASSA_OLD             NUMBER(14,2)           null    ,
    SALDO_INI_TESORERIA_OLD         NUMBER(14,2)           null    ,
    CONTO_CORRENTE                  VARCHAR2(20)           null    ,
    RIF_TESO_3                      VARCHAR2(4)            null    ,
    SCADENZA                        DATE                   null    ,
    TIPO_AVANZO                     NUMBER(10)             null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint VINCOLI_PK primary key (CODICE)
)
/



-- ============================================================
--   Table: FATTORI_COMODO                                     
-- ============================================================
create table FATTORI_COMODO
(
    PROGRESSIVO                     NUMBER(10)             not null,
    RISCONTI_ATTIVI                 VARCHAR2(16)           null    ,
    RISCONTI_PASSIVI                VARCHAR2(16)           null    ,
    COSTI_ESERCIZI_FUTURI           VARCHAR2(16)           null    ,
    RICAVI_ESERCIZI_FUTURI          VARCHAR2(16)           null    ,
    RATEI_ATTIVI                    VARCHAR2(16)           null    ,
    RATEI_PASSIVI                   VARCHAR2(16)           null    ,
    COSTI_DA_RICEVERE               VARCHAR2(16)           null    ,
    RICAVI_DA_EMETTERE              VARCHAR2(16)           null    ,
    TESORIERE_MANDATI               VARCHAR2(16)           null    ,
    TESORIERE_ORDINATIVI            VARCHAR2(16)           null    ,
    RATEI_INTERESSI_PASSIVI         VARCHAR2(16)           null    ,
    SOPRAVVENIENZE_PASSIVE          VARCHAR2(16)           null    ,
    SOPRAVVENIENZE_ATTIVE           VARCHAR2(16)           null    ,
    INSUSSISTENZE_PASSIVE           VARCHAR2(16)           null    ,
    INSUSSISTENZE_ATTIVE            VARCHAR2(16)           null    ,
    CC_INS_SOPR                     VARCHAR2(16)           null    ,
    CONTO_ECONOMICO                 VARCHAR2(16)           null    ,
    RISULTATO_ESERCIZIO             VARCHAR2(16)           null    ,
    BILANCIO_CHIUSURA               VARCHAR2(16)           null    ,
    BILANCIO_APERTURA               VARCHAR2(16)           null    ,
    ARROTONDAMENTO_P_DARE           VARCHAR2(16)           null    ,
    ARROTONDAMENTO_P_AVERE          VARCHAR2(16)           null    ,
    ARROTONDAMENTO_E_DARE           VARCHAR2(16)           null    ,
    ARROTONDAMENTO_E_AVERE          VARCHAR2(16)           null    ,
    CLASSE_ARROTONDAMENTO           NUMBER(2)              null    ,
    RISC_PASSIVI_CONTO_CAP          VARCHAR2(16)           null    ,
    RISC_PASSIVI_CONC_PLURI         VARCHAR2(16)           null    ,
    RICAVI_ESERC_FUTURI_CONTO_CAP   VARCHAR2(16)           null    ,
    RICAVI_ESERC_FUTURI_CONC_PLURI  VARCHAR2(16)           null    ,
    TESORIERE_MANDATI_COMM          VARCHAR2(16)           null    ,
    TESORIERE_ORDINATIVI_COMM       VARCHAR2(16)           null    ,
    SOPRAVVENIENZE_ATTIVE_COMM      VARCHAR2(16)           null    ,
    SOPRAVVENIENZE_PASSIVE_COMM     VARCHAR2(16)           null    ,
    INSUSSISTENZE_ATTIVE_COMM       VARCHAR2(16)           null    ,
    INSUSSISTENZE_PASSIVE_COMM      VARCHAR2(16)           null    ,
    ARROTONDAMENTO_P_DARE_COMM      VARCHAR2(16)           null    ,
    ARROTONDAMENTO_P_AVERE_COMM     VARCHAR2(16)           null    ,
    ARROTONDAMENTO_E_DARE_COMM      VARCHAR2(16)           null    ,
    ARROTONDAMENTO_E_AVERE_COMM     VARCHAR2(16)           null    ,
    CLASSE_ARROTONDAMENTO_COMM      VARCHAR2(16)           null    ,
    IMMOB_MATERIALI_IN_CORSO        VARCHAR2(16)           null    ,
    DEBITI_DIVERSI                  VARCHAR2(16)           null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR(8)             null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint FATTORI_COMODO_PK primary key (PROGRESSIVO)
)
/

-- ============================================================
--   Table: CENTRI                                             
-- ============================================================
create table CENTRI
(
    CENTRO                          VARCHAR2(16)           not null,
    DESCRIZIONE                     VARCHAR2(200)          null    ,
    UNITA_OUTPUT                    VARCHAR2(8)            null    ,
    DESCRIZIONE_ABB                 VARCHAR2(60)           null    ,
    TIPO_CENTRO                     VARCHAR2(3)            null    ,
    DATA_VALIDITA                   DATE                   null    ,
    AREA                            VARCHAR2(2)            null    ,
    SE_CONTABILITA                  VARCHAR2(1)            null    ,
    SE_BUONI                        VARCHAR2(1)            null    ,
    constraint CENTRI_PK primary key (CENTRO)
)
/





-- ============================================================
--   Table: FATTORI                                            
-- ============================================================
create table FATTORI
(
    FATTORE                         VARCHAR2(16)           not null,
    DESCRIZIONE                     VARCHAR2(200)          null    ,
    DESCRIZIONE_ABB                 VARCHAR2(60)           null    ,
    TIPO                            VARCHAR2(1)            null    ,
    GESTIONE                        VARCHAR2(1)            null    ,
    SE_CONTABILITA                  VARCHAR2(1)            null    ,
    DATA_VALIDITA                   DATE                   null    ,
    constraint FATTORI_PK primary key (FATTORE)
)
/


-- ============================================================
--   Table: PROGETTI                                           
-- ============================================================
create table PROGETTI
(
    CODICE                          VARCHAR2(4)            not null,
    PROGRAMMA                       VARCHAR2(4)            not null,
    DESCRIZIONE                     VARCHAR2(100)          not null,
    RESPONSABILE                    VARCHAR2(40)           null    ,
    PROGETTO_ID                     VARCHAR2(9)            not null,
    SEQUENZA                        NUMBER(6)              null    ,
    DESCRIZIONE_ESTESA              VARCHAR2(2000)         null    ,
    SETTORE_OPERATIVO               NUMBER(6)              null    ,
    SERVIZIO_OPERATIVO              NUMBER(6)              null    ,
    CENTRO_COSTO                    VARCHAR2(8)            null    ,
    FUNZIONE                        NUMBER(2)              null    ,
    SERVIZIO                        NUMBER(2)              null    ,
    DATA_INIZIO                     DATE                   null    ,
    DATA_FINE_PRESUNTA              DATE                   null    ,
    DATA_FINE_EFFETTIVA             DATE                   null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint PROGETTI_PK primary key (PROGETTO_ID)
)
/



-- ============================================================
--   Index: PROGETTI_UK                                        
-- ============================================================
create unique index PROGETTI_UK on PROGETTI (PROGRAMMA asc, CODICE asc)
/

-- ============================================================
--   Index: PRGT_PRGM_FK                                       
-- ============================================================
create index PRGT_PRGM_FK on PROGETTI (PROGRAMMA asc)
/

-- ============================================================
--   Table: PROGRAMMI                                          
-- ============================================================
create table PROGRAMMI
(
    CODICE                          VARCHAR2(4)            not null,
    DESCRIZIONE                     VARCHAR2(100)          not null,
    DESCRIZIONE_ESTESA              VARCHAR2(2000)         null    ,
    SEQUENZA                        NUMBER(6)              null    ,
    RESPONSABILE                    VARCHAR2(40)           null    ,
    FUNZIONE                        NUMBER(2)              null    ,
    SERVIZIO                        NUMBER(2)              null    ,
    SETTORE_OPERATIVO               NUMBER(6)              null    ,
    SERVIZIO_OPERATIVO              NUMBER(6)              null    ,
    CENTRO_COSTO                    VARCHAR2(16)           null    ,
    DATA_INIZIO                     DATE                   null    ,
    DATA_FINE_PRESUNTA              DATE                   null    ,
    DATA_FINE_EFFETTIVA             DATE                   null    ,
    ID_MISSIONE                     NUMBER(10)             null    ,
    ID_PROGRAMMA                    NUMBER(10)             null    ,
    COD_MISSIONE                    NUMBER(10)             null    ,
    COD_PROGRAMMA                   NUMBER(10)             null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    ASSESSORATO                     VARCHAR2(4)            null    ,
    constraint PROGRAMMI_PK primary key (CODICE)
)
/



-- ============================================================
--   Table: ORD_PROVVISORI                                     
-- ============================================================
create table ORD_PROVVISORI
(
    ESERCIZIO                       NUMBER(4)              not null
        constraint ORD_PROVVISOR_ESERCIZIO_CC check (
            ESERCIZIO between 1000 and 2999),
    PROGRESSIVO                     NUMBER(8)              not null,
    DATA                            DATE                   null    ,
    NUMERO                          VARCHAR2(10)           null    ,
    IMPORTO                         NUMBER(14,2)           not null,
    DES_BEN                         VARCHAR2(50)           null    ,
    SETTORE_OPERATIVO               NUMBER(6)              null    ,
    SERVIZIO_OPERATIVO              NUMBER(6)              null    ,
    DESCRIZIONE                     VARCHAR2(140)          null    ,
    RITORNO_CC                      VARCHAR2(2)            null    
        constraint ORD_PROVVISOR_RITORNO_CC_CC check (
            RITORNO_CC is null or (RITORNO_CC in ('SI'))),
    NUMERO_CONTO                    VARCHAR2(30)           null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    PROGR_UNITA_ORGANIZZATIVA       NUMBER(8)              null    ,
    ID_FLUSSO_BT                    VARCHAR2(500)          null    ,
    CAUSALE_PAGO_PA                 VARCHAR2(500)          null    ,
    ID_FLUSSO_DEPAG                 VARCHAR2(140)          null    ,
    IUV                             VARCHAR2(140)          null    ,
    NOTE                            VARCHAR2(400)          null    ,
    constraint ORD_PROVVISORI_PK primary key (ESERCIZIO, PROGRESSIVO)
)
/



-- ============================================================
--   Table: MAN_PROVVISORI                                     
-- ============================================================
create table MAN_PROVVISORI
(
    ESERCIZIO                       NUMBER(4)              not null
        constraint MAN_PROVVISOR_ESERCIZIO_CC check (
            ESERCIZIO between 1000 and 2999),
    PROGRESSIVO                     NUMBER(8)              not null,
    DATA                            DATE                   null    ,
    NUMERO                          VARCHAR2(10)           null    ,
    IMPORTO                         NUMBER(14,2)           not null,
    DES_BEN                         VARCHAR2(50)           null    ,
    SETTORE_OPERATIVO               NUMBER(6)              null    ,
    SERVIZIO_OPERATIVO              NUMBER(6)              null    ,
    DESCRIZIONE                     VARCHAR2(140)          null    ,
    NUMERO_CONTO                    VARCHAR2(30)           null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    ID_FLUSSO_BT                    VARCHAR2(500)          null    ,
    PROGR_UNITA_ORGANIZZATIVA       NUMBER(8)              null    ,
    EMISSIONE                       VARCHAR2(2)            null    
        constraint MAN_PROVV_EMISSIONE_CC check (
            EMISSIONE is null or (EMISSIONE in ('SI'))),
    constraint MAN_PROVVISORI_PK primary key (ESERCIZIO, PROGRESSIVO)
)
/



-- ============================================================
--   Table: CAP                                                
-- ============================================================
create table CAP
(
    ESERCIZIO                       NUMBER(4)              not null
        constraint CAP_ESERCIZIO_CC check (
            ESERCIZIO between 1000 and 2999),
    E_S                             VARCHAR2(1)            not null
        constraint CAP_E_S_CC check (
            E_S in ('E','S')),
    CAPITOLO                        NUMBER(16)             not null,
    ARTICOLO                        NUMBER(2)              not null,
    DESCRIZIONE                     VARCHAR2(140)          not null,
    TITOLO                          NUMBER(2)              null    ,
    CATEGORIA                       NUMBER(2)              null    ,
    VOCE_ECON                       NUMBER(2)              null    ,
    FUNZIONE                        NUMBER(2)              null    ,
    SERVIZIO                        NUMBER(2)              null    ,
    CENTRO_COSTO                    VARCHAR2(8)            null    ,
    COD_INTERVENTO                  NUMBER(2)              null    ,
    COD_TERZI                       NUMBER(2)              null    ,
    UNA_TANTUM                      VARCHAR2(2)            null    
        constraint CAP_UNA_TANTUM_CC check (
            UNA_TANTUM is null or (UNA_TANTUM in ('SI'))),
    TIPO_VINCOLO                    NUMBER(6)              null    ,
    IVA                             VARCHAR2(2)            null    
        constraint CAP_IVA_CC check (
            IVA is null or (IVA in ('SI'))),
    PROGETTO                        VARCHAR2(4)            null    ,
    PROGRAMMA                       VARCHAR2(4)            null    ,
    SETTORE_OPERATIVO               NUMBER(6)              null    ,
    SERVIZIO_OPERATIVO              NUMBER(6)              null    ,
    RESPONSABILE                    VARCHAR2(40)           null    ,
    CONTROLLO_BUDGET                VARCHAR2(2)            null    
        constraint CAP_CONTROLLO_BUD_CC check (
            CONTROLLO_BUDGET is null or (CONTROLLO_BUDGET in ('SI'))),
    FUNZ_DEL                        VARCHAR2(2)            null    
        constraint CAP_FUNZ_DEL_CC check (
            FUNZ_DEL is null or (FUNZ_DEL in ('SI'))),
    CONTRIB_COMU                    VARCHAR2(2)            null    
        constraint CAP_CONTRIB_COMU_CC check (
            CONTRIB_COMU is null or (CONTRIB_COMU in ('SI'))),
    PERC_CONTROLLO                  NUMBER(2)              null    ,
    RISORSA_SIGNIF                  VARCHAR2(2)            null    
        constraint CAP_RISORSA_SIGNI_CC check (
            RISORSA_SIGNIF is null or (RISORSA_SIGNIF in ('SI'))),
    COD_PTC                         NUMBER(4)              null    ,
    DESCRIZIONE_ABBREVIATA          VARCHAR2(40)           null    ,
    ANNOTAZIONI                     VARCHAR2(2000)         null    ,
    GRUPPO_CP                       NUMBER(4)              null    ,
    FATTORE                         VARCHAR2(16)           null    ,
    CENTRO                          VARCHAR2(16)           null    ,
    FLESSIBILITA                    VARCHAR2(4)            null    ,
    GRUPPO_CC                       NUMBER(4)              null    ,
    ESCLUSIONE_PATTO                VARCHAR2(2)            null    
        constraint CAP_ESCLUSIONE_PA_CC check (
            ESCLUSIONE_PATTO is null or (ESCLUSIONE_PATTO in ('SI'))),
    VOCE_PC                         NUMBER(4)              null    ,
    CDR_IMP                         VARCHAR2(8)            null    ,
    CDR_USA                         VARCHAR2(8)            null    ,
    CODICE_GESTIONALE               NUMBER(4)              null    ,
    STAMPA_DES_MAN                  VARCHAR2(2)            null    
        constraint CAP_STAMPA_DES_MA_CC check (
            STAMPA_DES_MAN is null or (STAMPA_DES_MAN in ('NO'))),
    COD_MONITORAGGIO                VARCHAR2(5)            null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    CODICE_STRUTTURA                VARCHAR2(10)           null    ,
    CODICE_EUROPEO                  NUMBER(1)              null    ,
    ENTRATA_SPESA_NON_RIC           VARCHAR2(2)            null    
        constraint CAP_ENTRATA_SPESA_CC check (
            ENTRATA_SPESA_NON_RIC is null or (ENTRATA_SPESA_NON_RIC in ('SI'))),
    ESCLUSIONE_DODICESIMI           VARCHAR2(2)            null    
        constraint CAP_ESCLUSIONE_DO_CC check (
            ESCLUSIONE_DODICESIMI is null or (ESCLUSIONE_DODICESIMI in ('SI'))),
    LIVELLO_PADRE                   NUMBER(1)              null    ,
    ESCLUSIONE_12                   VARCHAR2(2)            null    
        constraint CAP_ESCLUSIONE_12_CC check (
            ESCLUSIONE_12 is null or (ESCLUSIONE_12 in ('SI'))),
    FONDO_RIS_CASSA                 VARCHAR2(2)            null    ,
    IMPIGNORABILI                   VARCHAR2(2)            null    
        constraint CAP_IMPIGNORABILI_CC check (
            IMPIGNORABILI is null or (IMPIGNORABILI in ('SI'))),
    TIPO_AVANZO                     NUMBER(10)             null    ,
    constraint CAP_PK primary key (ESERCIZIO, E_S, CAPITOLO, ARTICOLO)
)
/





-- ============================================================
--   Table: CERTBIL                                            
-- ============================================================
create table CERTBIL
(
    CODICE                          NUMBER(4)              not null,
    DESCRIZIONE                     VARCHAR2(140)          not null,
    E_S                             VARCHAR2(1)            null    
        constraint CERTBIL_E_S_CC check (
            E_S is null or (E_S in ('E','S'))),
    TITOLO                          NUMBER(2)              null    ,
    CAT_INT                         NUMBER(2)              null    ,
    CODICE_CP                       NUMBER(5)              null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint CERTBIL_PK primary key (CODICE)
)
/


-- ============================================================
--   Index: CBIL_CATE_FK                                       
-- ============================================================
create index CBIL_CATE_FK on CERTBIL (E_S asc, TITOLO asc, CAT_INT asc)
/

-- ============================================================
--   Table: CERTCON                                            
-- ============================================================
create table CERTCON
(
    CODICE                          NUMBER(4)              not null,
    DESCRIZIONE                     VARCHAR2(140)          not null,
    TITOLO                          NUMBER(2)              null    ,
    CATEGORIA                       NUMBER(2)              null    ,
    E                               VARCHAR2(1)            default 'E' not null
        constraint CERTCON_E_CC check (
            E in ('E','S')),
    CODICE_CC                       NUMBER(5)              null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint CERTCON_PK primary key (CODICE)
)
/




-- ============================================================
--   Table: FAT                                                
-- ============================================================
create table FAT
(
    CODICE                          NUMBER(6)              not null,
    ANNO_RIF                        NUMBER(4)              not null,
    NUMERO_RIF                      VARCHAR2(20)           not null,
    ANNO_DOC                        NUMBER(4)              null    ,
    NUMERO_DOC                      VARCHAR2(20)           null    ,
    DATA_DOC                        NUMBER(7)              null    ,
    ANNO_PROG                       NUMBER(4)              not null,
    NUMERO_PROG                     NUMBER(5)              not null,
    ANNO_PROT                       NUMBER(4)              null    ,
    NUMERO_PROT                     NUMBER(7)              null    ,
    DATA_PROT                       NUMBER(7)              null    ,
    CODICE_DOC                      NUMBER(2)              null    ,
    STORNO                          NUMBER(1)              null    ,
    TIPO_PAGAMENTO                  NUMBER(2)              null    ,
    UFFICIO_INVIO                   NUMBER(8)              null    ,
    DESCRIZIONE                     VARCHAR2(60)           null    ,
    IMPORTO                         NUMBER(14,2)           not null
        constraint FAT_IMPORTO_CC check (
            IMPORTO >= 0),
    DIFFERENZA_IVA                  NUMBER(12)             null    ,
    NUM_QUIETANZA                   NUMBER(2)              null    ,
    CATEGORIA                       VARCHAR2(6)            null    ,
    ACQUISTO_CEE                    VARCHAR2(2)            null    
        constraint FAT_ACQUISTO_CEE_CC check (
            ACQUISTO_CEE is null or (ACQUISTO_CEE in ('SI'))),
    MONETA                          VARCHAR2(3)            null    ,
    ESCLUSIONE_ELE                  VARCHAR2(2)            null    
        constraint FAT_ESCLUSIONE_EL_CC check (
            ESCLUSIONE_ELE is null or (ESCLUSIONE_ELE in ('SI'))),
    SCADENZA                        NUMBER(7)              null    ,
    RIVENDITA                       VARCHAR2(2)            null    
        constraint FAT_RIVENDITA_CC check (
            RIVENDITA is null or (RIVENDITA in ('SI'))),
    VARIAZIONI                      NUMBER(14,2)           null    ,
    IMPUTATO                        NUMBER(14,2)           null    ,
    D_DATA_DOC                      DATE                   null    ,
    D_DATA_PROT                     DATE                   null    ,
    D_SCADENZA                      DATE                   null    ,
    BUONI                           NUMBER(14,2)           null    ,
    LIQ_NO_BUONI                    NUMBER(14,2)           null    ,
    LIQUIDAZIONE_DEF                NUMBER(1)              null    ,
    LIRE_EURO                       VARCHAR2(1)            null    
        constraint FAT_LIRE_EURO_CC check (
            LIRE_EURO is null or (LIRE_EURO in ('L','E'))),
    IMPORTO_EURO                    NUMBER(12,2)           null    
        constraint FAT_IMPORTO_EURO_CC check (
            IMPORTO_EURO is null or (IMPORTO_EURO >= 0
            )),
    TIPO_UTENZA                     varchar2(2)            null    ,
    CODICE_UTENZA                   varchar2(16)           null    ,
    BLOCCO_PAGAMENTO                VARCHAR2(2)            null    
        constraint FAT_BLOCCO_PAGAME_CC check (
            BLOCCO_PAGAMENTO is null or (BLOCCO_PAGAMENTO in ('SI'))),
    COD_IMP_ECO                     VARCHAR2(16)           null    ,
    ANNO_ORDINE                     NUMBER(4)              null    
        constraint FAT_ANNO_ORDINE_CC check (
            ANNO_ORDINE is null or (ANNO_ORDINE between 1000 and 2999
            )),
    NUMERO_ORDINE                   NUMBER(8)              null    ,
    FLAG_IVA_ECO                    VARCHAR2(2)            null    
        constraint FAT_FLAG_IVA_ECO_CC check (
            FLAG_IVA_ECO is null or (FLAG_IVA_ECO in ('SI'))),
    FLAG_DA_FS4                     VARCHAR2(2)            null    
        constraint FAT_FLAG_DA_FS4_CC check (
            FLAG_DA_FS4 is null or (FLAG_DA_FS4 in ('SI'))),
    DATA_RIENTRO                    DATE                   null    ,
    ID_DOCUMENTALE                  NUMBER(10)             null    ,
    NUM_UTENTE                      VARCHAR2(9)            null    ,
    NOTE                            VARCHAR2(2000)         null    ,
    PROGR_UNITA_ORGANIZZATIVA       NUMBER(8)              null    ,
    TRATTAMENTO_IVA                 VARCHAR2(4)            null    
        constraint FAT_TRATTAMENTO_I_CC check (
            TRATTAMENTO_IVA is null or (TRATTAMENTO_IVA in ('SP','RC'))),
    PROGR_UNITA_ORGANIZZATIVA_INS   NUMBER(8)              null    ,
    STATO                           NUMBER(2)              null    ,
    NOTE_SOSPENSIONE                VARCHAR2(2000)         null    ,
    PROGR_UO_COMPETENZA             NUMBER(8)              null    ,
    BARCODE                         NUMBER(16)             null    ,
    DATA_INIZIO_UT                  DATE                   null    ,
    DATA_FINE_UT                    DATE                   null    ,
    CONSUMI_UT                      NUMBER(14,2)           null    ,
    ANNO_DISTINTA_UT                NUMBER(4)              null    ,
    NUMERO_DISTINTA_UT              NUMBER(5)              null    ,
    DATA_DISTINTA_UT                DATE                   null    ,
    IMG_DOCUMENTALE                 VARCHAR2(2)            null    ,
    MULTISERVIZI                    VARCHAR2(2)            null    
        constraint FAT_MULTISERVIZI_CC check (
            MULTISERVIZI is null or (MULTISERVIZI in ('SI'))),
    ID_ALLEGATO                     NUMBER(10)             null    ,
    DATA_ARRIVO                     DATE                   null    ,
    NUM_PROT_GEN                    NUMBER(10)             null    ,
    CIG                             VARCHAR2(15)           null    ,
    CUP                             VARCHAR2(15)           null    ,
    FSE                             VARCHAR2(2)            null    
        constraint FAT_FSE_CC check (
            FSE is null or (FSE in ('SI'))),
    ACCETTAZIONE_UTENTE             VARCHAR2(8)            null    ,
    ACCETTAZIONE_DATA               DATE                   null    ,
    ESISTE_ALLEGATO                 VARCHAR2(2)            null    ,
    ID_GDM_FE                       NUMBER(10)             null    ,
    ID_FE_DOCUMENTALE               NUMBER(10)             null    ,
    DATA_ARRIVO_FE                  DATE                   null    ,
    DOC_ER_ID                        NUMBER(19)            null    ,
    ANNO_PROG_PADRE                 NUMBER(4)              null    ,
    NUMERO_PROG_PADRE               NUMBER(5)              null    ,
    TIPO_DOC_OLD                    NUMBER(2)              null    ,
    TIPO_REGISTRO_OLD               NUMBER(2)              null    ,
    SERVIZIO_OLD                    NUMBER(2)              null    ,
    ANNO_REG_OLD                    NUMBER(4)              null    ,
    NUMERO_REG_OLD                  NUMBER(5)              null    ,
    DATA_REG_OLD                    NUMBER(7)              null    ,
    TIPO_REGISTRO_S_OLD             NUMBER(2)              null    ,
    TIPO_BOLLATO_S_OLD              NUMBER(2)              null    ,
    ANNO_REG_S_OLD                  NUMBER(4)              null    ,
    NUMERO_REG_S_OLD                NUMBER(5)              null    ,
    DATA_REG_S_OLD                  NUMBER(7)              null    ,
    TIPO_DOC_S_OLD                  NUMBER(2)              null    ,
    D_DATA_REG_OLD                  DATE                   null    ,
    D_DATA_REG_S_OLD                DATE                   null    ,
    DATA_LIQ_OLD                    NUMBER(7)              null    ,
    D_DATA_LIQ_OLD                  DATE                   null    ,
    LIQUIDAZIONE_DEF_OLD            NUMBER(1)              null    ,
    TIPO_ACQUISTO                   VARCHAR2(20)           null    ,
    MOTIVAZIONE_SCADENZA            VARCHAR2(50)           null    ,
    TRATTAMENTO_CONTROLLATO         VARCHAR2(2)            null    ,
    TRATTAMENTO_LOG                 VARCHAR2(4000)         null    ,
    DOC_ER_PROT_NUM                 NUMBER(10)             null    ,
    DOC_ER_PROT_DATA                VARCHAR2(50)           null    ,
    DOC_ER_PROT_ANNO                NUMBER(4)              null    ,
    DOC_ER_PROT_OGGETTO             VARCHAR2(500)          null    ,
    DOC_ER_PROT_REG                 VARCHAR2(50)           null    ,
    DOC_ER_NUMERO_REG               NUMBER(10)             null    ,
    DOC_ER_DATA_REG                 VARCHAR2(50)           null    ,
    DOC_ER_OGGETTO_REG              VARCHAR2(500)          null    ,
    DOC_ER_REGISTRO_REG             VARCHAR2(50)           null    ,
    DOC_ANNI_FASCICOLO              VARCHAR2(1000)         null    ,
    DOC_CLASS_FASCICOLO             VARCHAR2(1000)         null    ,
    DOC_PROGR_FASCICOLO             VARCHAR2(1000)         null    ,
    DOCER_LOG                       CLOB                   null    ,
    CAUSALE_SOSPENSIONE             VARCHAR2(3)            null    ,
    SCADENZA_SOSPENSIONE            DATE                   null    ,
    UTENTE_ULTIMA_VALIDAZIONE       VARCHAR2(8)            null    ,
    DATA_ULTIMA_VALIDAZIONE         DATE                   null    ,
    DOC_NON_COMMERCIALE             VARCHAR2(2)            null    
        constraint FAT_DOC_NON_COMME_CC check (
            DOC_NON_COMMERCIALE is null or (DOC_NON_COMMERCIALE in ('SI'))),
    ALLEGATO                        BLOB                   default EMPTY_BLOB() null    ,
    STATO_VALIDAZIONE               VARCHAR2(20)           null    
        constraint FAT_STATO_VALIDAZ_CC check (
            STATO_VALIDAZIONE is null or (STATO_VALIDAZIONE in ('VALIDATA','RIFIUTATA'))),
    AVVISO_FORNITORE                VARCHAR2(2)            null    
        constraint FAT_AVVISO_FORNIT_CC check (
            AVVISO_FORNITORE is null or (AVVISO_FORNITORE in ('SI'))),
    INIZIO_SOSPENSIONE              DATE                   null    ,
    CONTRIBUENTI_MINIMI             VARCHAR2(2)            null    
        constraint FAT_CONTRIBUENTI__CC check (
            CONTRIBUENTI_MINIMI is null or (CONTRIBUENTI_MINIMI in ('SI'))),
    IMPORTO_RIMBORSI                NUMBER(14,2)           null    ,
    IMPORTO_PRESTAZIONI             NUMBER(14,2)           null    ,
    TEMPI_MEDI                      VARCHAR2(2)            null    
        constraint FAT_TEMPI_MEDI_CC check (
            TEMPI_MEDI is null or (TEMPI_MEDI in ('SI'))),
    REGIME_FISCALE                  VARCHAR2(5)            null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint FAT_PK primary key (ANNO_PROG, NUMERO_PROG)
)
/



-- ============================================================
--   Table: IVA                                                
-- ============================================================
create table IVA
(
    PROGRESSIVO                     NUMBER(10)             not null,
    ANNO_PROG                       NUMBER(4)              not null,
    NUMERO_PROG                     NUMBER(5)              not null,
    CODICE_DOC                      NUMBER(2)              not null,
    IMPONIBILE                      NUMBER(14,2)           not null,
    IVA                             NUMBER(14,2)           not null,
    ALIQUOTA                        NUMBER(2)              null    ,
    IVA_INDED                       NUMBER(1)              null    ,
    CODICE_ESENZIONE                NUMBER(2)              null    ,
    IMPONIBILE_CEE                  NUMBER(15,3)           null    ,
    IMPONIBILE_EURO                 NUMBER(12,2)           null    ,
    IVA_EURO                        NUMBER(12,2)           null    ,
    CODICE_STAT                     VARCHAR2(3)            null    ,
    TIPO_REGISTRO_S                 NUMBER(2)              null    ,
    TIPO_BOLLATO_S                  NUMBER(2)              null    ,
    ANNO_REG_S                      NUMBER(4)              null    ,
    NUMERO_REG_S                    NUMBER(5)              null    ,
    D_DATA_REG_S                    DATE                   null    ,
    TIPO_REGISTRO                   NUMBER(2)              null    ,
    SERVIZIO                        NUMBER(2)              null    ,
    ANNO_REG                        NUMBER(4)              null    ,
    NUMERO_REG                      NUMBER(5)              null    ,
    D_DATA_REG                      DATE                   null    ,
    D_DATA_LIQ                      DATE                   null    ,
    TIPO_DOC                        NUMBER(2)              null    ,
    REC_VENDITE                     VARCHAR2(2)            null    
        constraint IVA_REC_VENDITE_CC check (
            REC_VENDITE is null or (REC_VENDITE in ('SI'))),
    LIQUIDAZIONE_DEF                NUMBER(2)              null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint IVA_PK primary key (PROGRESSIVO)
)
/




-- ============================================================
--   Table: CODICI_UTENZE                                      
-- ============================================================
create table CODICI_UTENZE
(
    TIPO_UTENZA                     VARCHAR2(2)            not null,
    CODICE_UTENZA                   VARCHAR2(16)           not null,
    DESCRIZIONE                     VARCHAR2(40)           null    ,
    INDIRIZZO                       VARCHAR2(35)           null    ,
    UFFICIO_INVIO                   NUMBER(5)              null    ,
    TIPO_BOLLATO                    NUMBER(2)              null    ,
    TIPO_REGISTRO                   NUMBER(2)              null    ,
    CENTRO                          VARCHAR2(16)           null    ,
    COMPETENZA_DAL                  DATE                   null    ,
    COMPETENZA_AL                   DATE                   null    ,
    PROGETTO_ID                     VARCHAR2(9)            null    ,
    FATTORE                         VARCHAR2(16)           null    ,
    PERC_INDETR                     NUMBER(3)              null    
        constraint CODICI_UTENZE_PERC_INDETR_CC check (
            PERC_INDETR is null or (PERC_INDETR between 0 and 100
            )),
    NUM_UTENTE                      VARCHAR2(9)            null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint CODICI_UTENZE_PK primary key (TIPO_UTENZA, CODICE_UTENZA)
)
/


-- ============================================================
--   Table: T04                                                
-- ============================================================
create table T04
(
    TIPO_BOLLATO                    NUMBER(2)              not null,
    DESCRIZIONE                     VARCHAR2(40)           not null,
    TIPO_BOLLATO_DEF                NUMBER(2)              null    ,
    ATTIVITA                        NUMBER(2)              null    ,
    ESENTE                          VARCHAR2(2)            null    ,
    CAPITOLO_IVA                    NUMBER(16)             null    ,
    ARTICOLO_IVA                    NUMBER(2)              null    ,
    VENTILAZIONE_IVA                VARCHAR2(2)            null    
        constraint T04_VENTILAZIONE__CC check (
            VENTILAZIONE_IVA is null or (VENTILAZIONE_IVA in ('SI'))),
    TIPO_ESIGIBILITA                VARCHAR2(1)            null    
        constraint T04_TIPO_ESIGIBIL_CC check (
            TIPO_ESIGIBILITA is null or (TIPO_ESIGIBILITA in ('I','D'))),
    FLAG_IMP_ECO                    VARCHAR2(2)            null    
        constraint T04_FLAG_IMP_ECO_CC check (
            FLAG_IMP_ECO is null or (FLAG_IMP_ECO in ('SI'))),
    CENTRO                          VARCHAR2(16)           null    ,
    FATTORE                         VARCHAR2(16)           null    ,
    FATTORE_IVA                     VARCHAR2(16)           null    ,
    PROGETTO_IVA                    VARCHAR2(9)            null    ,
    RIMBORSI                        VARCHAR2(2)            null    
        constraint T04_RIMBORSI_CC check (
            RIMBORSI is null or (RIMBORSI in ('SI'))),
    CODICE_GESTIONALE               NUMBER(4)              null    ,
    RILEVANTE_IVA                   VARCHAR2(2)            null    
        constraint T04_RILEVANTE_IVA_CC check (
            RILEVANTE_IVA is null or (RILEVANTE_IVA in ('NO'))),
    CORRISPETTIVI                   VARCHAR2(2)            null    
        constraint T04_CORRISPETTIVI_CC check (
            CORRISPETTIVI is null or (CORRISPETTIVI in ('SI'))),
    FATTURA_PERSONALIZZATA          VARCHAR2(2)            null    
        constraint T04_FATTURA_PERSO_CC check (
            FATTURA_PERSONALIZZATA is null or (FATTURA_PERSONALIZZATA in ('SI'))),
    BOLLETTINI                      VARCHAR2(2)            null    
        constraint T04_BOLLETTINI_CC check (
            BOLLETTINI is null or (BOLLETTINI in ('NO'))),
    IMP_BOLLO_DA_CAUSALE            VARCHAR2(2)            null    
        constraint T04_IMP_BOLLO_DA__CC check (
            IMP_BOLLO_DA_CAUSALE is null or (IMP_BOLLO_DA_CAUSALE in ('SI'))),
    COD_LIVELLO_5                   NUMBER(10)             null    ,
    TIPO_REGISTRO                   NUMBER(1)              not null
        constraint T04_TIPO_REGISTRO_CC check (
            TIPO_REGISTRO in (1,2,3,4,5,6)),
    ID_MODELLO                      NUMBER(10)             null    ,
    TIPO_BOLLATO_VENDITE_SP         NUMBER(2)              null    ,
    TIPO_BOLLATO_VENDITE_RC         NUMBER(2)              null    ,
    ANNO_ACC_SP                     NUMBER(4)              null    ,
    NUMERO_ACC_SP                   NUMBER(5)              null    ,
    ANNO_IMP_SP                     NUMBER(4)              null    ,
    NUMERO_IMP_SP                   NUMBER(5)              null    ,
    ANNO_IMP_RC                     NUMBER(4)              null    ,
    NUMERO_IMP_RC                   NUMBER(5)              null    ,
    ANNO_ACC_RC                     NUMBER(4)              null    ,
    NUMERO_ACC_RC                   NUMBER(5)              null    ,
    ESIGIBILITA_IVA                 VARCHAR2(1)            null    ,
    PAGO_PA                         VARCHAR2(2)            null    
        constraint T04_PAGO_PA_CC check (
            PAGO_PA is null or (PAGO_PA in ('SI'))),
    COD_SERVIZIO_PAGOPA             VARCHAR2(100)          null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint T04_PK primary key (TIPO_BOLLATO, TIPO_REGISTRO)
)
/




-- ============================================================
--   Table: CAPTER                                             
-- ============================================================
create table CAPTER
(
    E_S                             VARCHAR2(1)            not null,
    CAPITOLO                        NUMBER(2)              not null,
    DESCRIZIONE                     VARCHAR2(140)          not null,
    CONTROPARTITA                   VARCHAR2(8)            null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint CAPTER_PK primary key (E_S, CAPITOLO)
)
/



-- ============================================================
--   Table: BEN                                                
-- ============================================================
create table BEN
(
    CODICE                          NUMBER                 not null,
    RAGIONE_SOCIALE                 VARCHAR2(40)           not null,
    INDIRIZZO                       VARCHAR2(35)           null    ,
    CAP                             NUMBER(5)              null    ,
    PROVINCIA                       NUMBER(3)              null    ,
    COMUNE                          NUMBER(3)              null    ,
    TELEFONO                        VARCHAR2(15)           null    ,
    CODICE_FISCALE                  VARCHAR2(16)           null    ,
    PARTITA_IVA                     VARCHAR2(11)           null    ,
    TELEX                           VARCHAR2(17)           null    ,
    CATEGORIA                       NUMBER(3)              null    ,
    TIPO_PAGAMENTO                  NUMBER(2)              not null,
    DATA_NASCITA                    NUMBER(7)              null    ,
    SESSO                           VARCHAR2(1)            null    
        constraint BEN_SESSO_CC check (
            SESSO is null or (SESSO in ('M','F'))),
			
			
    PROVINCIA_NASCITA               NUMBER(3)              null    ,
    COMUNE_NASCITA                  NUMBER(3)              null    ,
    STATO_ESTERO                    VARCHAR2(20)           null    ,
    ENTE_DATORE_LAV                 NUMBER                 null    
        constraint BEN_ENTE_DATORE_L_CC check (
            ENTE_DATORE_LAV is null or (ENTE_DATORE_LAV >= 1
            )),
    DOMICILIO                       VARCHAR2(35)           null    ,
    COMUNE_DOMICILIO                NUMBER(3)              null    ,
    PROVINCIA_DOMICILIO             NUMBER(3)              null    ,
    CAP_DOMICILIO                   NUMBER(5)              null    ,
    SCADENZA                        NUMBER(7)              null    ,
    D_SCADENZA                      DATE                   null    ,
    D_DATA_NASCITA                  DATE                   null    ,
    COD_IMP_ECO                     VARCHAR2(16)           null    ,
    PAGAMENTO_IN_EURO               VARCHAR2(2)            null    
        constraint BEN_PAGAMENTO_IN__CC check (
            PAGAMENTO_IN_EURO is null or (PAGAMENTO_IN_EURO in ('SI'))),
    CLASSE_LISTINO                  VARCHAR2(6)            null    ,
    E_MAIL                          VARCHAR2(100)          null    ,
    E_MAIL_REF_WEB                  VARCHAR2(100)          null    ,
    CELLULARE                       NUMBER(15)             null    ,
    INVIO_STAMPE                    VARCHAR2(1)            null    
        constraint BEN_INVIO_STAMPE_CC check (
            INVIO_STAMPE is null or (INVIO_STAMPE in ('F','M'))),
    RAGIONE_SOCIALE_ESTESA          VARCHAR2(60)           not null,
    STATO_CEE                       VARCHAR2(2)            null    ,
    NOTE                            VARCHAR2(2000)         null    ,
    PARTITA_IVA_CEE                 VARCHAR2(12)           null    ,
    SPESE                           NUMBER(1)              null    ,
    CODICE_IPA                      VARCHAR2(15)           null    ,
    RIFERIMENTO_AMMINISTRAZIONE     VARCHAR2(20)           null    ,
    ID_MODELLO                      NUMBER(10)             null    ,
    CODICE_EORI                     VARCHAR2(20)           null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    TRATTAMENTO_IVA_DEFAULT         VARCHAR2(2)            null    ,
    TAG_UTENZA                      VARCHAR2(255)          null    ,
    CODICE_SDI                      VARCHAR2(7)            null    ,
    E_MAIL_FE                       VARCHAR2(100)          null    ,
    TIPO_SOGGETTO                   VARCHAR2(1)            null    ,
    NI                              NUMBER(8)              null    ,
    DAL                             DATE                   null    ,
    AL                              DATE                   null    ,
    CONTRIBUENTI_MINIMI             VARCHAR2(2)            null    ,
    COMPETENZA                      VARCHAR2(8)            null    ,
    COMPETENZA_ESCLUSIVA            VARCHAR(1)             null    ,
    TEL_DOM                         VARCHAR2(100)          null    ,
    PROVENIENZA_INSERIMENTO         VARCHAR2(50)           null    ,
    constraint BEN_PK primary key (CODICE)
)
/



-- ============================================================
--   Table: QTN                                                
-- ============================================================
create table QTN
(
    CODICE                          NUMBER                 not null,
    NUM_QUIETANZA                   NUMBER(2)              not null,
    TIPO_QUIETANZA                  NUMBER(2)              not null,
    CONTO_CORRENTE                  VARCHAR2(12)           null    ,
    DES_BANCA                       VARCHAR2(40)           null    ,
    COD_BANCA                       NUMBER(5)              null    ,
    COD_SPORTELLO                   NUMBER(5)              null    ,
    INTESTATARIO_1                  VARCHAR2(40)           null    ,
    INTESTATARIO_2                  VARCHAR2(40)           null    ,
    INTESTATARIO_3                  VARCHAR2(40)           null    ,
    SCADENZA                        DATE                   null    ,
    CIN_BANCARIO                    VARCHAR2(1)            null    ,
    IBAN_PAESE                      VARCHAR2(2)            null    ,
    IBAN_CIN_EUROPA                 VARCHAR2(2)            null    ,
    QUIETANZANTE                    NUMBER                 null    ,
    IBAN_ID_NAZIONALE               VARCHAR2(10)           null    ,
    IBAN_CONTO                      VARCHAR2(18)           null    ,
    IBAN_EXTRA_UE                   VARCHAR2(34)           null    ,
    BIC                             VARCHAR2(11)           null    ,
    SPESE                           NUMBER(1)              null    ,
    CONTO_DEDICATO                  VARCHAR2(2)            null    
        constraint QTN_CONTO_DEDICAT_CC check (
            CONTO_DEDICATO is null or (CONTO_DEDICATO in ('SI'))),
    IBAN_LOG                        VARCHAR2(4000)         null    ,
    TIPO_POSTALIZZAZIONE            NUMBER(2)              null    ,
    ORD_SP_RC                       VARCHAR2(2)            null    
        constraint QTN_ORD_SP_RC_CC check (
            ORD_SP_RC is null or (ORD_SP_RC in ('SI'))),
    NI                              NUMBER                 null    ,
    PREVALENTE                      VARCHAR2(2)            null    
        constraint QTN_PREVALENTE_CC check (
            PREVALENTE is null or (PREVALENTE in ('SI'))),
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint QTN_PK primary key (CODICE, NUM_QUIETANZA)
)
/



-- ============================================================
--   Table: T56                                                
-- ============================================================
create table T56
(
    CODICE                          NUMBER(2)              not null,
    DESCRIZIONE                     VARCHAR2(50)           not null,
    MOTIVO                          VARCHAR2(3)            null    ,
    VAR_AUTO                        VARCHAR2(2)            null    
        constraint T56_VAR_AUTO_CC check (
            VAR_AUTO is null or (VAR_AUTO in ('SI'))),
    FATTORE                         VARCHAR2(16)           null    ,
    RIACCERTAMENTO                  VARCHAR2(2)            null    
        constraint T56_RIACCERTAMENT_CC check (
            RIACCERTAMENTO is null or (RIACCERTAMENTO in ('SI'))),
    GESTIONE_AVANZO                 VARCHAR2(2)            null    
        constraint T56_GESTIONE_AVAN_CC check (
            GESTIONE_AVANZO is null or (GESTIONE_AVANZO in ('SI'))),
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint T56_PK primary key (CODICE)
)
/

-- ============================================================
--   Table: T55                                                
-- ============================================================
create table T55
(
    CODICE                          NUMBER(2)              not null,
    DESCRIZIONE                     VARCHAR2(40)           not null,
    MOTIVO                          VARCHAR2(3)            null    ,
    FATTORE                         VARCHAR2(816)          null    ,
    RIACCERTAMENTO                  VARCHAR2(2)            null    
        constraint T55_RIACCERTAMENT_CC check (
            RIACCERTAMENTO is null or (RIACCERTAMENTO in ('SI'))),
    GESTIONE_AVANZO                 VARCHAR2(2)            null    
        constraint T55_GESTIONE_AVAN_CC check (
            GESTIONE_AVANZO is null or (GESTIONE_AVANZO in ('SI'))),
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint T55_PK primary key (CODICE)
)
/




-- ============================================================
--   Table: WRK_GESTIONE_AVANZO                                
-- ============================================================
create table WRK_GESTIONE_AVANZO
(
    ESERCIZIO                       NUMBER(4)              not null,
    SESSIONE                        NUMBER(10)             not null,
    TIPO_RIGA                       VARCHAR2(10)           not null,
    CODICE_RIGA                     VARCHAR2(50)           not null,
    PROGRESSIVO                     NUMBER(10)             default 1 not null,
    E_S                             VARCHAR2(1)            not null,
    CAPITOLO_ORIGINE                NUMBER(16)             not null,
    ARTICOLO_ORIGINE                NUMBER(2)              not null,
    TITOLO                          VARCHAR2(2)            null    ,
    ANNO_IMPACC                     NUMBER(4)              null    ,
    NUMERO_IMPACC                   NUMBER(5)              null    ,
    ANNO_VAR                        NUMBER(4)              null    ,
    IMPORTO_VARIAZIONE              NUMBER(14,2)           null    ,
    IMPORTO_AVANZO                  NUMBER(14,2)           null    ,
    IMPORTO_AVANZO_INIZIALE         NUMBER(14,2)           null    ,
    IMPORTO_BILANCIO                NUMBER(14,2)           null    ,
    E_S_DESTINAZIONE                VARCHAR2(1)            null    ,
    CAPITOLO_DESTINAZIONE           NUMBER(16)             null    ,
    ARTICOLO_DESTINAZIONE           NUMBER(2)              null    ,
    TIPO_AVANZO                     NUMBER(10)             null    ,
    NOTE                            VARCHAR2(2000)         null    ,
    CK_GESTIONE_AVANZO              VARCHAR2(2)            null    ,
    STATO                           VARCHAR2(2)            null    ,
    PRIMO_ANNO                      VARCHAR2(2)            null    ,
    MODIFICABILE                    VARCHAR2(2)            null    ,
    DATA_REG                        DATE                   null    ,
    OPERA                           NUMBER(5)              null    ,
    FINANZIAMENTO                   NUMBER(5)              null    ,
    constraint WRK_GESTIONE_AVANZO_PK primary key (ESERCIZIO, SESSIONE, TIPO_RIGA, CODICE_RIGA, PROGRESSIVO)
)
/



-- ============================================================
--   Table: IMPUTAZIONI_CRONOPROGRAMMI                         
-- ============================================================
create table IMPUTAZIONI_CRONOPROGRAMMI
(
    CRONOPROGRAMMA_ID               NUMBER(10)             not null,
    PROGRESSIVO_IMPUTAZIONE         NUMBER(10)             not null,
    CAPITOLO                        NUMBER(16)             not null,
    ARTICOLO                        NUMBER(2)              not null,
    PROGR_UNITA_ORGANIZZATIVA       NUMBER(8)              null    ,
    IMPORTO                         NUMBER(14,2)           null    ,
    PROGETTO_ID                     VARCHAR2(8)            null    ,
    COD_LIVELLO_5                   NUMBER(10)             null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint IMPUTAZIONI_CRONOPROGRAMMI_PK primary key (CRONOPROGRAMMA_ID, PROGRESSIVO_IMPUTAZIONE)
)
/




-- ============================================================
--   Table: IMP_ECO_BEN                                        
-- ============================================================
create table IMP_ECO_BEN
(
    CODICE                          VARCHAR2(4)            not null,
    DESCRIZIONE                     VARCHAR2(60)           not null,
    FATTORE_FAT_FOR                 VARCHAR2(16)           null    ,
    FATTORE_FAT_CLI                 VARCHAR2(16)           null    ,
    FATTORE_LIQ_FOR                 VARCHAR2(16)           null    ,
    FATTORE_PRE_CLI                 VARCHAR2(16)           null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint IMP_ECO_BEN_PK primary key (CODICE)
)
/



-- ============================================================
--   Table: IMP                                                
-- ============================================================
create table IMP
(
    CAPITOLO                        NUMBER(16)             not null,
    ARTICOLO                        NUMBER(2)              not null,
    ANNO_IMP                        NUMBER(4)              not null,
    NUMERO_IMP                      NUMBER(5)              not null,
    ANNO_DEL                        NUMBER(4)              null    ,
    NUMERO_DEL                      NUMBER(6)              null    ,
    SEDE_DEL                        VARCHAR2(255)          null    ,
    DATA_REG                        NUMBER(7)              null    ,
    IMPORTO                         NUMBER(14,2)           not null
        constraint IMP_IMPORTO_CC check (
            IMPORTO >= 0),
    DESCRIZIONE                     VARCHAR2(140)          not null,
    CAUSALE                         NUMBER(4)              null    ,
    IMPEGNO_OBBLIG                  VARCHAR2(2)            null    
        constraint IMP_IMPEGNO_OBBLI_CC check (
            IMPEGNO_OBBLIG is null or (IMPEGNO_OBBLIG in ('SI'))),
    ESERCIZIO_SCADENZA              NUMBER(4)              null    ,
    ANNO_INTROD                     NUMBER(4)              null    ,
    BENEFICIARIO                    NUMBER                 null    
        constraint IMP_BENEFICIARIO_CC check (
            BENEFICIARIO is null or (BENEFICIARIO >= 1
            )),
    SETTORE                         NUMBER(2)              null    ,
    SERVIZIO                        NUMBER(2)              null    ,
    TIPOLOGIA_SPESA                 NUMBER(2)              null    ,
    ANNO_PROPOSTA                   NUMBER(4)              null    ,
    UNITA_PROPONENTE                VARCHAR2(255)          null    ,
    NUMERO_PROPOSTA                 NUMBER(10)             null    ,
    TIPO                            VARCHAR2(1)            null    ,
    SERVIZIO_CC                     NUMBER(3)              null    ,
    PRENOTAZIONE                    VARCHAR2(2)            null    
        constraint IMP_PRENOTAZIONE_CC check (
            PRENOTAZIONE is null or (PRENOTAZIONE in ('SI'))),
    VOCE_ECON                       NUMBER(2)              null    ,
    TIPO_VINCOLO                    NUMBER(6)              null    ,
    INVESTIMENTO                    VARCHAR2(6)            null    ,
    CONS_SVILUPPO                   VARCHAR2(1)            null    ,
    REGOLA_CONT                     VARCHAR2(2)            null    
        constraint IMP_REGOLA_CONT_CC check (
            REGOLA_CONT is null or (REGOLA_CONT in ('SI'))),
    CONTRIB_STR                     NUMBER(3)              null    ,
    TITOLO_GIURIDICO                VARCHAR2(60)           null    ,
    S                               VARCHAR2(1)            default 'S' not null,
    D_DATA_REG                      DATE                   default SYSDATE null    ,
    ANNO_PLUR                       NUMBER(4)              null    ,
    NUMERO_PLUR                     NUMBER(5)              null    ,
    CENTRO                          VARCHAR2(16)           null    ,
    FATTORE                         VARCHAR2(16)           null    ,
    COMPETENZA_DAL                  DATE                   null    ,
    COMPETENZA_AL                   DATE                   null    ,
    NOTE                            VARCHAR2(2000)         null    ,
    RILEVANTE_ECO                   VARCHAR2(2)            null    
        constraint IMP_RILEVANTE_ECO_CC check (
            RILEVANTE_ECO is null or (RILEVANTE_ECO in ('SI'))),
    COD_IMP_ECO                     VARCHAR2(16)           null    ,
    PROGETTO_ID                     VARCHAR2(9)            null    ,
    OPERA                           NUMBER(5)              null    ,
    COMUNE_ZONA                     NUMBER(3)              null    ,
    PROVINCIA_ZONA                  NUMBER(3)              null    ,
    OBIETTIVO                       VARCHAR2(9)            null    ,
    CODICE_GESTIONALE               NUMBER(4)              null    ,
    CUP                             VARCHAR2(15)           null    ,
    RESPONSABILE_RES                VARCHAR2(40)           null    ,
    PROGR_UNITA_ORGANIZZATIVA       NUMBER(8)              null    ,
    COD_MONITORAGGIO                VARCHAR2(5)            null    ,
    PROGR_UNITA_ORGANIZZATIVA_INS   NUMBER(8)              null    ,
    SCHEDA_OBIETTIVO_ID             NUMBER(10)             null    ,
    CIG                             VARCHAR2(15)           null    ,
    COD_LIVELLO_5                   NUMBER(10)             null    ,
    CODICE_EUROPEO                  NUMBER(1)              null    ,
    CODICE_COFOG                    NUMBER(3)              null    ,
    ANNO_IMP_PROVENIENZA            NUMBER(4)              null    ,
    NUMERO_IMP_PROVENIENZA          NUMBER(5)              null    ,
    ANNO_ENTRATA_PROVENIENZA        NUMBER(4)              null    ,
    IMP_DA_REISCR_STN               VARCHAR2(2)            null    
        constraint IMP_IMP_DA_REISCR_CC check (
            IMP_DA_REISCR_STN is null or (IMP_DA_REISCR_STN in ('SI'))),
    DATA_REG_ECONOMICA              DATE                   null    ,
    CRONOPROGRAMMA_ID               NUMBER(10)             null    ,
    PROGR_IMPUTAZIONE_CRONO         NUMBER(10)             null    ,
    DATA_SCADENZA                   DATE                   null    ,
    VOCE_TECNICA_OPERA              NUMBER(2)              null    ,
    ESCLUSIONE_12                   VARCHAR2(2)            null    
        constraint IMP_ESCLUSIONE_12_CC check (
            ESCLUSIONE_12 is null or (ESCLUSIONE_12 in ('SI'))),
    FINANZIAMENTO_LIGHT             NUMBER(5)              null    ,
    OPERA_LIGHT                     NUMBER(5)              null    ,
    PROGR_VARIMP_PROVENIENZA        NUMBER(10)             null    ,
    ANNO_DEL_PROVENIENZA            NUMBER(4)              null    ,
    NUMERO_DEL_PROVENIENZA          NUMBER(6)              null    ,
    SEDE_DEL_PROVENIENZA            VARCHAR2(255)          null    ,
    ANNO_PROPOSTA_PROVENIENZA       NUMBER(4)              null    ,
    NUMERO_PROPOSTA_PROVENIENZA     NUMBER(10)             null    ,
    UNITA_PROPONENTE_PROVENIENZA    VARCHAR2(255)          null    ,
    IMPORTO_APPROVATO               NUMBER(14,2)           null    ,
    ANNO_IMP_PREC                   NUMBER(4)              null    ,
    NUMERO_IMP_PREC                 NUMBER(5)              null    ,
    ANNO_IMP_PROV_CRONO             NUMBER(4)              null    ,
    NUMERO_IMP_PROV_CRONO           NUMBER(5)              null    ,
    TIPO_AVANZO                     NUMBER(10)             null    ,
    PKID_ANAC                       NUMBER(10)             null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint IMP_PK primary key (ANNO_IMP, NUMERO_IMP)
)
/



-- ============================================================
--   Table: VARIMP                                             
-- ============================================================
create table VARIMP
(
    PROGRESSIVO                     NUMBER(10)             not null,
    COD_REC                         NUMBER(1)              not null
        constraint VARIMP_COD_REC_CC check (
            COD_REC in (1,2)),
    ANNO_VAR                        NUMBER(4)              not null,
    CAPITOLO                        NUMBER(16)             not null,
    ARTICOLO                        NUMBER(2)              not null,
    ANNO_IMP                        NUMBER(4)              not null,
    NUMERO_IMP                      NUMBER(5)              not null,
    ANNO_DEL                        NUMBER(4)              null    ,
    NUMERO_DEL                      NUMBER(6)              null    ,
    SEDE_DEL                        VARCHAR2(255)          null    ,
    DATA_REG                        NUMBER(7)              null    ,
    TIPO_VAR                        NUMBER(2)              not null,
    IMPORTO                         NUMBER(14,2)           not null,
    DESCRIZIONE                     VARCHAR2(140)          not null,
    ANNO_PROPOSTA                   NUMBER(4)              null    ,
    UNITA_PROPONENTE                VARCHAR2(255)          null    ,
    NUMERO_PROPOSTA                 NUMBER(10)             null    ,
    D_DATA_REG                      DATE                   default SYSDATE null    ,
    FINANZIAMENTO                   NUMBER(5)              null    ,
    PROGRESSIVO_CF4                 NUMBER(10)             null    ,
    ANNO_ESIGIBILITA                NUMBER(4)              null    ,
    VARIAZIONE_GENERATA             VARCHAR2(2)            null    
        constraint VARIMP_VARIAZIONE_GE_CC check (
            VARIAZIONE_GENERATA is null or (VARIAZIONE_GENERATA in ('SI'))),
    IMP_GENERATO                    VARCHAR2(2)            null    ,
    CAPITOLO_REISCR                 NUMBER(16)             null    ,
    ARTICOLO_REISCR                 NUMBER(2)              null    ,
    ANNO_ENTRATA                    NUMBER(4)              null    ,
    PROGR_VARIMP_PROVENIENZA        NUMBER(10)             null    ,
    LOG                             VARCHAR2(2000)         null    ,
    TIPO_AVANZO                     NUMBER(10)             null    ,
    ANNO_ESIGIBILITA_CRONO          NUMBER(4)              null    ,
    ANNO_ENTRATA_CRONO              NUMBER(4)              null    ,
    FINANZIAMENTO_DESTINAZIONE      NUMBER(5)              null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint VARIMP_PK primary key (PROGRESSIVO)
)
/


-- ============================================================
--   Table: ESEACC                                             
-- ============================================================
create table ESEACC
(
    ESERCIZIO                       NUMBER(4)              not null,
    CAPITOLO                        NUMBER(16)             not null,
    ARTICOLO                        NUMBER(2)              not null,
    ANNO_ACC                        NUMBER(4)              not null,
    NUMERO_ACC                      NUMBER(5)              not null,
    SALDO_INI                       NUMBER(14,2)           not null,
    VARIAZIONI                      NUMBER(14,2)           not null,
    VARIAZIONI_RES                  NUMBER(14,2)           not null,
    ORDINATIVI                      NUMBER(14,2)           not null
        constraint ESEACC_ORDINATIVI_CC check (
            ORDINATIVI >= 0),
    DISPONIBILITA                   NUMBER(14,2)           null    
        constraint ESEACC_DISPONIBILITA_CC check (
            DISPONIBILITA is null or (DISPONIBILITA >= 0
            )),
    constraint ESEACC_PK primary key (ESERCIZIO, ANNO_ACC, NUMERO_ACC)
)
/



-- ============================================================
--   Table: VARSUB                                             
-- ============================================================
create table VARSUB
(
    PROGRESSIVO                     NUMBER(10)             not null,
    ANNO_VAR                        NUMBER(4)              not null,
    CAPITOLO                        NUMBER(16)             not null,
    ARTICOLO                        NUMBER(2)              not null,
    ANNO_IMP                        NUMBER(4)              not null,
    NUMERO_IMP                      NUMBER(5)              not null,
    ANNO_SUBIMP                     NUMBER(4)              not null,
    NUMERO_SUBIMP                   NUMBER(5)              not null,
    ANNO_DEL                        NUMBER(4)              null    ,
    NUMERO_DEL                      NUMBER(6)              null    ,
    SEDE_DEL                        VARCHAR2(255)          null    ,
    DATA_REG                        NUMBER(7)              null    ,
    IMPORTO                         NUMBER(14,2)           not null,
    DESCRIZIONE                     VARCHAR2(140)          not null,
    TIPO_VAR                        NUMBER(2)              not null,
    ANNO_PROPOSTA                   NUMBER(4)              null    ,
    UNITA_PROPONENTE                VARCHAR2(255)          null    ,
    NUMERO_PROPOSTA                 NUMBER(10)             null    ,
    D_DATA_REG                      DATE                   default SYSDATE null    ,
    COD_REC                         NUMBER(1)              not null,
    FINANZIAMENTO                   NUMBER(5)              null    ,
    PROGRESSIVO_CF4                 NUMBER(10)             null    ,
    SUBIMP_GENERATO                 VARCHAR2(2)            null    ,
    ANNO_ESIGIBILITA                NUMBER(4)              null    ,
    ANNO_ENTRATA                    NUMBER(4)              null    ,
    PROGR_VARSUB_PROVENIENZA        NUMBER(10)             null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint VARSUB_PK primary key (PROGRESSIVO)
)
/



-- ============================================================
--   Table: T07                                                
-- ============================================================
create table T07
(
    TIPO_REGISTRO                   NUMBER(1)              not null,
    TIPO_BOLLATO                    NUMBER(2)              not null,
    ANNO                            NUMBER(4)              not null,
    ULTIMO_NUMERO                   NUMBER(5)              not null,
    ULTIMA_DATA                     NUMBER(7)              null    ,
    D_ULTIMA_DATA                   DATE                   null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint T07_PK primary key (TIPO_REGISTRO, TIPO_BOLLATO, ANNO)
)
/




-- ============================================================
--   Table: N03                                                
-- ============================================================
create table N03
(
    ESERCIZIO                       NUMBER(4)              not null,
    CODICE                          VARCHAR2(6)            not null,
    NUMERO                          NUMBER(10)             not null,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint N03_PK primary key (ESERCIZIO, CODICE)
)
/



-- ============================================================
--   Table: N04                                                
-- ============================================================
create table N04
(
    ESERCIZIO                       NUMBER(4)              not null,
    MANDATI_STAMPATI                NUMBER(5)              default 0 not null,
    ORDINATIVI_STAMPATI             NUMBER(5)              default 0 not null,
    ELENCO_MANDATI                  NUMBER(4)              default 0 not null,
    ELENCO_ORDINATIVI               NUMBER(4)              default 0 not null,
    ULTIMO_MANDATO_PREC             NUMBER(5)              null    ,
    ULTIMO_ORDINATIVO_PREC          NUMBER(5)              null    ,
    ULT_ORD_TESO                    NUMBER(5)              null    ,
    ULT_MAN_TESO                    NUMBER(5)              null    ,
    ULT_DATA_TESO                   DATE                   null    ,
    ULT_PROG_DATA_TESO              NUMBER(1)              null    ,
    ULT_DATA_BIL_TESO               DATE                   null    ,
    ULT_PROG_DATA_BIL_TESO          NUMBER(1)              null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    ULT_DISTINTA_UTENZE             NUMBER(5)              null    ,
    constraint N04_PK primary key (ESERCIZIO)
)
/



-- ============================================================
--   Table: N05                                                
-- ============================================================
create table N05
(
    ANNO                            NUMBER(4)              not null,
    NUMERO                          NUMBER(10)             not null,
    constraint N05_PK primary key (ANNO)
)
/


-- ============================================================
--   Table: N06                                                
-- ============================================================
create table N06
(
    ANNO                            NUMBER(4)              not null,
    NUMERO                          NUMBER(7)              not null,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint N06_PK primary key (ANNO)
)
/


-- ============================================================
--   Table: N07                                                
-- ============================================================
create table N07
(
    ANNO                            NUMBER(4)              not null,
    NUMERO                          NUMBER(5)              not null,
    constraint N07_PK primary key (ANNO)
)
/


-- ============================================================
--   Table: N08                                                
-- ============================================================
create table N08
(
    ANNO                            NUMBER(4)              not null,
    NUMERO                          NUMBER(5)              not null,
    constraint N08_PK primary key (ANNO)
)
/


-- ============================================================
--   Table: N09                                                
-- ============================================================
create table N09
(
    NUMERO                          NUMBER(5)              not null,
    PROGRESSIVO                     NUMBER(1)              not null,
    constraint N09_PK primary key (PROGRESSIVO)
)
/



-- ============================================================
--   Table: T64                                                
-- ============================================================
create table T64
(
    INDIRIZZO                       VARCHAR2(30)           not null,
    COMUNE                          VARCHAR2(30)           null    ,
    PROVINCIA                       VARCHAR2(2)            null    ,
    CAP                             NUMBER(5)              null    ,
    COD_FISCALE                     VARCHAR2(16)           null    ,
    PARTITA_IVA                     NUMBER(11)             null    ,
    ATTIVITA                        VARCHAR2(8)            null    ,
    TESORIERE                       VARCHAR2(60)           null    ,
    COD_ENTE                        VARCHAR2(10)           null    ,
    COD_TESORERIA                   NUMBER(4)              null    ,
    DES_PROVINCIA                   VARCHAR2(30)           null    ,
    ESATTORIA                       VARCHAR2(37)           null    ,
    CODICE_FILIALE                  NUMBER(5)              null    ,
    SEDE_INPS                       VARCHAR2(30)           null    ,
    COD_ENTE_MI                     NUMBER(10)             null    ,
    PROGRESSIVO                     NUMBER(1)              default 1 not null,
    DENOMINAZIONE                   VARCHAR2(40)           null    ,
    PRIMO_PROG_TESO                 NUMBER(1)              null    ,
    TIPO_ESATTORIA                  VARCHAR2(1)            null    
        constraint T64_TIPO_ESATTORI_CC check (
            TIPO_ESATTORIA is null or (TIPO_ESATTORIA in ('C','T'))),
    TIPO_MO                         VARCHAR2(4)            null    ,
    SE_INC_PAGAM                    VARCHAR2(2)            null    
        constraint T64_SE_INC_PAGAM_CC check (
            SE_INC_PAGAM is null or (SE_INC_PAGAM in ('SI'))),
    TIPO_RIFERIMENTO_SUB            NUMBER(2)              null    ,
    TIPO_PROVV                      VARCHAR2(4)            null    ,
    UNIONE                          VARCHAR2(2)            null    
        constraint T64_UNIONE_CC check (
            UNIONE is null or (UNIONE in ('SI'))),
    TIPO_SUPPORTO_CERT              VARCHAR2(1)            null    
        constraint T64_TIPO_SUPPORTO_CC check (
            TIPO_SUPPORTO_CERT is null or (TIPO_SUPPORTO_CERT in ('C'))),
    TIPO_INCASSI_FS4                VARCHAR2(3)            null    ,
    CODICE_EORI                     VARCHAR2(20)           null    ,
    MAIL_AZIENDALE                  VARCHAR2(50)           null    ,
    FAX_AZIENDALE                   VARCHAR2(12)           null    ,
    TELEFONO_AZIENDALE              VARCHAR2(12)           null    ,
    CODICE_BDAP                     VARCHAR2(18)           null    ,
    SCARTA_PROVV_DOPPI              VARCHAR2(2)            null    
        constraint T64_SCARTA_PROVV__CC check (
            SCARTA_PROVV_DOPPI is null or (SCARTA_PROVV_DOPPI in ('SI'))),
    CODICE_IPA                      VARCHAR2(15)           null    ,
    CODICE_UNIONE                   VARCHAR2(10)           null    ,
    DATA_INGRESSO_UNIONE            DATE                   null    ,
    DATA_USCITA_UNIONE              DATE                   null    ,
    SOGGETTO_ENTE                   NUMBER                 null    ,
    ALTRO_ENTE                      VARCHAR2(2)            null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint T64_PK primary key (PROGRESSIVO)
)
/


-- ============================================================
--   Table: T67                                                
-- ============================================================
create table T67
(
    CODICE                          VARCHAR2(3)            not null,
    PROGRESSIVO                     NUMBER(1)              not null,
    DESCRIZIONE                     VARCHAR2(200)          not null,
    BITMAP                          VARCHAR2(80)           null    ,
    IMMAGINE                        BLOB                   default EMPTY_BLOB() null    ,
    ESTENSIONE_FILE                 VARCHAR2(5)            null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint T67_PK primary key (CODICE, PROGRESSIVO)
)
/



-- ============================================================
--   Table: T99                                                
-- ============================================================
create table T99
(
    ESERCIZIO                       NUMBER(4)              not null,
    VARCOM_OBBLIG                   VARCHAR2(2)            null    
        constraint T99_VARCOM_OBBLIG_CC check (
            VARCOM_OBBLIG is null or (VARCOM_OBBLIG in ('SI'))),
    PROTOCOLLO_AUTO                 VARCHAR2(2)            null    
        constraint T99_PROTOCOLLO_AU_CC check (
            PROTOCOLLO_AUTO is null or (PROTOCOLLO_AUTO in ('SI'))),
    REG_IVA_AUTO                    VARCHAR2(2)            null    ,
    CC_OBBLIG                       VARCHAR2(2)            null    
        constraint T99_CC_OBBLIG_CC check (
            CC_OBBLIG is null or (CC_OBBLIG in ('SI'))),
    LIQ_AUTO                        VARCHAR2(2)            null    
        constraint T99_LIQ_AUTO_CC check (
            LIQ_AUTO is null or (LIQ_AUTO in ('SI'))),
    DIFFERENZA_MAG                  NUMBER(6)              null    ,
    CONTROLLO_CF                    VARCHAR2(2)            null    
        constraint T99_CONTROLLO_CF_CC check (
            CONTROLLO_CF is null or (CONTROLLO_CF in ('SI'))),
    CONTROLLO_IMPUTAZIONE           VARCHAR2(2)            null    
        constraint T99_CONTROLLO_IMP_CC check (
            CONTROLLO_IMPUTAZIONE is null or (CONTROLLO_IMPUTAZIONE in ('SI'))),
    TIPO_BIL_BUDGET                 NUMBER(1)              null    
        constraint T99_TIPO_BIL_BUDG_CC check (
            TIPO_BIL_BUDGET is null or (TIPO_BIL_BUDGET in (1,2,3,4))),
    TIPO_ORD                        NUMBER(1)              null    
        constraint T99_TIPO_ORD_CC check (
            TIPO_ORD is null or (TIPO_ORD in (3))),
    CODICE_PERS                     VARCHAR2(4)            null    ,
    PROC_DEL                        VARCHAR2(2)            null    
        constraint T99_PROC_DEL_CC check (
            PROC_DEL is null or (PROC_DEL in ('SI'))),
    CONTROLLO_COMPETENZA            VARCHAR2(2)            null    
        constraint T99_CONTROLLO_COM_CC check (
            CONTROLLO_COMPETENZA is null or (CONTROLLO_COMPETENZA in ('SI'))),
    CORR_MOD                        VARCHAR2(2)            null    
        constraint T99_CORR_MOD_CC check (
            CORR_MOD is null or (CORR_MOD in ('SI'))),
    CONTROLLO_BEN                   VARCHAR2(2)            null    
        constraint T99_CONTROLLO_BEN_CC check (
            CONTROLLO_BEN is null or (CONTROLLO_BEN in ('SI'))),
    TIPO_TOTALE_FC                  NUMBER(1)              not null
        constraint T99_TIPO_TOTALE_F_CC check (
            TIPO_TOTALE_FC in (0,1,2,3)),
    ESERCIZIO_RIF_PL                NUMBER(4)              null    ,
    TIPO_ENTE                       VARCHAR2(1)            null    
        constraint T99_TIPO_ENTE_CC check (
            TIPO_ENTE is null or (TIPO_ENTE in ('C','P','M'))),
    CONTROLLO_PC                    VARCHAR2(2)            null    
        constraint T99_CONTROLLO_PC_CC check (
            CONTROLLO_PC is null or (CONTROLLO_PC in ('SI'))),
    INTESTAZIONE_ENTE_IVA           VARCHAR2(2)            null    
        constraint T99_INTEST_IVA check (
            INTESTAZIONE_ENTE_IVA is null or (INTESTAZIONE_ENTE_IVA in ('SI'))),
    INTESTAZIONE_BOLLATO_IVA        VARCHAR(2)             null    ,
    INTERESSI_LT                    NUMBER(5,3)            null    ,
    PROCEDURA_BUONI                 VARCHAR2(2)            null    
        constraint T99_PROCEDURA_BUO_CC check (
            PROCEDURA_BUONI is null or (PROCEDURA_BUONI in ('SI'))),
    DATA_RIF_RITENUTE               VARCHAR(1)             null    
        constraint T99_DATA_RIF_RITE_CC check (
            DATA_RIF_RITENUTE is null or (DATA_RIF_RITENUTE in ('M','P'))),
    ORDINE_EMISSIONE_MANDATI        NUMBER(1)              null    
        constraint T99_ORDINE_EMISSI_CC check (
            ORDINE_EMISSIONE_MANDATI is null or (ORDINE_EMISSIONE_MANDATI in (1,2,3))),
    TIPO_EMISSIONE_MANDATI          NUMBER(1)              null    
        constraint T99_TIPO_EMISSION_CC check (
            TIPO_EMISSIONE_MANDATI is null or (TIPO_EMISSIONE_MANDATI in (1,2,3))),
    DATA_RIF_PRO_CASSA              VARCHAR2(1)            null    
        constraint T99_DATA_RIF_PRO__CC check (
            DATA_RIF_PRO_CASSA is null or (DATA_RIF_PRO_CASSA in ('M','P'))),
    INTESTAZIONE_ENTE_CERT          VARCHAR2(2)            null    
        constraint T99_INTEST_ENTE_CC check (
            INTESTAZIONE_ENTE_CERT is null or (INTESTAZIONE_ENTE_CERT in ('SI'))),
    PROC_PERS                       NUMBER(1)              null    
        constraint T99_PROC_PERS_CC check (
            PROC_PERS is null or (PROC_PERS in (0,1))),
    CAUSALE_LIQ_AUTO                VARCHAR2(2)            null    
        constraint T99_CAUSALE_LIQ_A_CC check (
            CAUSALE_LIQ_AUTO is null or (CAUSALE_LIQ_AUTO in ('SI'))),
    CAUSALE_PRE_AUTO                VARCHAR2(2)            null    
        constraint T99_CAUSALE_PRE_A_CC check (
            CAUSALE_PRE_AUTO is null or (CAUSALE_PRE_AUTO in ('SI'))),
    GESTIONE_IMPEGNABILE            VARCHAR2(2)            null    
        constraint T99_GESTIONE_IMPE_CC check (
            GESTIONE_IMPEGNABILE is null or (GESTIONE_IMPEGNABILE in ('SI'))),
    DATA_ESIG_IVA                   VARCHAR2(2)            null    
        constraint T99_DATA_ESIG_IVA_CC check (
            DATA_ESIG_IVA is null or (DATA_ESIG_IVA in ('E','P'))),
    GESTIONE_ECONOMICA              NUMBER(1)              null    
        constraint T99_GESTIONE_ECON_CC check (
            GESTIONE_ECONOMICA is null or (GESTIONE_ECONOMICA in (1,2))),
    MODALITA_IMPUTAZIONE            VARCHAR2(2)            null    
        constraint T99_MODALITA_IMPU_CC check (
            MODALITA_IMPUTAZIONE is null or (MODALITA_IMPUTAZIONE in ('FA','LI'))),
    G_U                             VARCHAR2(2)            null    
        constraint T99_G_U_CC check (
            G_U is null or (G_U in ('SI'))),
    G_I                             VARCHAR2(2)            null    
        constraint T99_G_I_CC check (
            G_I is null or (G_I in ('SI'))),
    COLONNA_AVANZO                  VARCHAR2(1)            null    
        constraint T99_COLONNA_AVANZ_CC check (
            COLONNA_AVANZO is null or (COLONNA_AVANZO in ('A','E'))),
    VAR_NQ                          VARCHAR2(2)            null    
        constraint T99_VAR_NQ_CC check (
            VAR_NQ is null or (VAR_NQ in ('SI'))),
    FLAG_BUONI                      VARCHAR2(2)            null    
        constraint T99_FLAG_BUONI_CC check (
            FLAG_BUONI is null or (FLAG_BUONI in ('SI'))),
    FLAG_INT_CERTIF                 VARCHAR2(2)            null    
        constraint T99_FLAG_INT_CERT_CC check (
            FLAG_INT_CERTIF is null or (FLAG_INT_CERTIF in ('SI'))),
    GESTIONE_CESPITI                NUMBER(1)              null    
        constraint T99_GESTIONE_CESP_CC check (
            GESTIONE_CESPITI is null or (GESTIONE_CESPITI in (null,1,2,3))),
    INTESTAZIONE_REGISTRO_IVA       VARCHAR2(2)            null    
        constraint T99_INTESTAZIONE_REG_CC check (
            INTESTAZIONE_REGISTRO_IVA is null or (INTESTAZIONE_REGISTRO_IVA in ('SI'))),
    FLAG_IVA_NON_SOG                VARCHAR2(2)            null    
        constraint T99_FLAG_IVA_NON__CC check (
            FLAG_IVA_NON_SOG is null or (FLAG_IVA_NON_SOG in ('SI'))),
    CLASSE_ORD                      NUMBER(1)              null    
        constraint T99_CLASSE_ORD_CC check (
            CLASSE_ORD is null or (CLASSE_ORD in (3,4))),
    CASSA_ECONOMALE                 NUMBER(1)              null    
        constraint T99_CASSA_ECONOMA_CC check (
            CASSA_ECONOMALE is null or (CASSA_ECONOMALE in (3,4))),
    GESTIONE_FATTURAZIONE           VARCHAR2(2)            null    
        constraint T99_GESTIONE_FATT_CC check (
            GESTIONE_FATTURAZIONE is null or (GESTIONE_FATTURAZIONE in ('SI'))),
    DESCRIZIONE_DOC_REG_IVA         VARCHAR2(2)            null    
        constraint T99_DESCRIZIONE_D_CC check (
            DESCRIZIONE_DOC_REG_IVA is null or (DESCRIZIONE_DOC_REG_IVA in ('SI'))),
    CONTROLLO_BUONI_RES             VARCHAR2(2)            null    
        constraint T99_CONTROLLO_BUO_CC check (
            CONTROLLO_BUONI_RES is null or (CONTROLLO_BUONI_RES in ('SI'))),
    PREVENTIVO_EURO                 VARCHAR2(2)            null    
        constraint T99_PREVENTIVO_EU_CC check (
            PREVENTIVO_EURO is null or (PREVENTIVO_EURO in ('SI'))),
    PREVENTIVO_UNITA_EURO           VARCHAR2(2)            null    
        constraint T99_PREVENTIVO_UN_CC check (
            PREVENTIVO_UNITA_EURO is null or (PREVENTIVO_UNITA_EURO in ('SI'))),
    PASSAGGIO_CI4                   VARCHAR2(2)            null    
        constraint T99_PASSAGGIO_CI4_CC check (
            PASSAGGIO_CI4 is null or (PASSAGGIO_CI4 in ('SI'))),
    TIPO_CAST_MANDATI               NUMBER(1)              null    
        constraint T99_TIPO_CAST_MAN_CC check (
            TIPO_CAST_MANDATI is null or (TIPO_CAST_MANDATI in (0,1))),
    BLOCCO_AUMENTO_RESIDUI          VARCHAR2(2)            null    ,
    CONTROLLO_RIL_IVA               VARCHAR2(2)            null    
        constraint T99_CONTROLLO_RIL_CC check (
            CONTROLLO_RIL_IVA is null or (CONTROLLO_RIL_IVA in ('SI'))),
    MODALITA_IMPUTAZIONE_E          VARCHAR2(2)            null    
        constraint T99_MODALITA_IMPU_E_CC check (
            MODALITA_IMPUTAZIONE_E is null or (MODALITA_IMPUTAZIONE_E in ('FA','AC','LI'))),
    RESP_SETTORE                    VARCHAR2(2)            null    
        constraint T99_RESP_SETTORE_CC check (
            RESP_SETTORE is null or (RESP_SETTORE in ('SI'))),
    CONTROLLO_BIL_FIN               VARCHAR2(1)            null    
        constraint T99_CONTROLLO_BIL_CC check (
            CONTROLLO_BIL_FIN is null or (CONTROLLO_BIL_FIN in ('E','S'))),
    CONTROLLO_COMPETENZA_FIN        VARCHAR2(2)            null    
        constraint T99_CONTROLLO_COM_FIN_CC check (
            CONTROLLO_COMPETENZA_FIN is null or (CONTROLLO_COMPETENZA_FIN in ('SI'))),
    NUM_FIN_AUTO                    VARCHAR2(2)            null    
        constraint T99_NUM_FIN_AUTO_CC check (
            NUM_FIN_AUTO is null or (NUM_FIN_AUTO in ('SI'))),
    NUM_OPE_AUTO                    VARCHAR2(2)            null    
        constraint T99_NUM_OPE_AUTO_CC check (
            NUM_OPE_AUTO is null or (NUM_OPE_AUTO in ('SI'))),
    CONTROLLO_FIN_IMPEGNO           VARCHAR2(2)            null    
        constraint T99_CONTROLLO_FIN_CC check (
            CONTROLLO_FIN_IMPEGNO is null or (CONTROLLO_FIN_IMPEGNO in ('SI'))),
    FC_RPP_OBBLIG                   VARCHAR2(2)            null    
        constraint T99_FC_RPP_OBBLIG_CC check (
            FC_RPP_OBBLIG is null or (FC_RPP_OBBLIG in ('SI'))),
    TIPO_VIS_ESPL_E_CF4OF           VARCHAR2(2)            null    
        constraint T99_TIPO_VIS_ESPE_CC check (
            TIPO_VIS_ESPL_E_CF4OF is null or (TIPO_VIS_ESPL_E_CF4OF in ('C'))),
    TIPO_VIS_ESPL_S_CF4OF           VARCHAR2(2)            null    
        constraint T99_TIPO_VIS_ESPS_CC check (
            TIPO_VIS_ESPL_S_CF4OF is null or (TIPO_VIS_ESPL_S_CF4OF in ('C'))),
    BLOCCO_STN_TESTATA              VARCHAR2(2)            null    
        constraint T99_BLOCCO_STN_TE_CC check (
            BLOCCO_STN_TESTATA is null or (BLOCCO_STN_TESTATA in ('SI'))),
    LIQ_MO                          VARCHAR2(2)            null    
        constraint T99_LIQ_MO_CC check (
            LIQ_MO is null or (LIQ_MO in ('SI'))),
    NO_AGG_PROG_RES                 VARCHAR2(2)            null    
        constraint T99_NO_AGG_PROG_R_CC check (
            NO_AGG_PROG_RES is null or (NO_AGG_PROG_RES in ('null','SI ','NO'))),
    CARICA_IMP_NEG_PERS             VARCHAR2(2)            null    
        constraint T99_CARICA_IMP_NE_CC check (
            CARICA_IMP_NEG_PERS is null or (CARICA_IMP_NEG_PERS in ('SI'))),
    SE_IMP_NEG_LIQ_PERS             VARCHAR2(1)            default 'S' null    
        constraint T99_SE_IMP_NEG_LI_CC check (
            SE_IMP_NEG_LIQ_PERS is null or (SE_IMP_NEG_LIQ_PERS in ('E','S'))),
    TIPO_SFMA                       VARCHAR2(1)            null    
        constraint T99_TIPO_SFMA_CC check (
            TIPO_SFMA is null or (TIPO_SFMA in ('F','O'))),
    RPP_ZERO                        VARCHAR2(2)            null    
        constraint T99_RPP_ZERO_CC check (
            RPP_ZERO is null or (RPP_ZERO in ('NO'))),
    RETTE                           VARCHAR2(2)            null    
        constraint T99_RETTE_CC check (
            RETTE is null or (RETTE in ('SI'))),
    ACQUISIZIONE_CESPITE            VARCHAR2(2)            null    
        constraint T99_ACQUISIZIONE__CC check (
            ACQUISIZIONE_CESPITE is null or (ACQUISIZIONE_CESPITE in ('SI'))),
    TIPO_AGG_DATA_BUONO             NUMBER(1)              null    
        constraint T99_TIPO_AGG_DATA_CC check (
            TIPO_AGG_DATA_BUONO is null or (TIPO_AGG_DATA_BUONO in (1,2))),
    TIPO_SFOR                       VARCHAR2(1)            null    
        constraint T99_TIPO_SFOR_CC check (
            TIPO_SFOR is null or (TIPO_SFOR in ('F','O'))),
    OBIETTIVO_OBBLIG                VARCHAR2(2)            null    
        constraint T99_OBIETTIVO_OBB_CC check (
            OBIETTIVO_OBBLIG is null or (OBIETTIVO_OBBLIG in ('SI'))),
    MOD_RESP_SERV                   VARCHAR2(2)            null    
        constraint T99_MOD_RESP_SERV_CC check (
            MOD_RESP_SERV is null or (MOD_RESP_SERV in ('NO'))),
    NUMERAZIONE_RPP                 VARCHAR2(2)            null    
        constraint T99_NUMERAZIONE_R_CC check (
            NUMERAZIONE_RPP is null or (NUMERAZIONE_RPP in ('SI'))),
    TITOLO_3_RPP                    VARCHAR2(2)            null    
        constraint T99_TITOLO_3_RPP_CC check (
            TITOLO_3_RPP is null or (TITOLO_3_RPP in ('SI'))),
    ACC_CF4OF                       VARCHAR2(2)            null    
        constraint T99_ACC_CF4OF_CC check (
            ACC_CF4OF is null or (ACC_CF4OF in ('NO'))),
    FIN_QD_PR                       VARCHAR2(2)            null    
        constraint T99_FIN_QD_PR_CC check (
            FIN_QD_PR is null or (FIN_QD_PR in ('SI'))),
    TRACCIATO_PERS                  VARCHAR2(2)            null    ,
    FIN_SUB                         VARCHAR2(2)            null    
        constraint T99_FIN_SUB_CC check (
            FIN_SUB is null or (FIN_SUB in ('NO'))),
    PROGETTO_OBBLIG_IST             VARCHAR2(2)            null    
        constraint T99_PROGETTO_OBBL_CC check (
            PROGETTO_OBBLIG_IST is null or (PROGETTO_OBBLIG_IST in ('SI'))),
    SALDI_CON_DECIMALI              VARCHAR2(2)            null    
        constraint T99_SALDI_CON_DEC_CC check (
            SALDI_CON_DECIMALI is null or (SALDI_CON_DECIMALI in ('SI'))),
    INS_AUTOMATICO_GD               VARCHAR2(2)            null    
        constraint T99_INS_AUTOMATIC_CC check (
            INS_AUTOMATICO_GD is null or (INS_AUTOMATICO_GD in ('SI'))),
    DATA_INIZIO_SIOPE               DATE                   null    ,
    ORDINE_STAMPA_MANDATI           NUMBER(1)              null    
        constraint T99_ORDINE_STAMPA_CC check (
            ORDINE_STAMPA_MANDATI is null or (ORDINE_STAMPA_MANDATI in (1,2))),
    DES_IMP_MAN                     VARCHAR2(2)            null    
        constraint T99_DES_IMP_MAN_CC check (
            DES_IMP_MAN is null or (DES_IMP_MAN in ('SI'))),
    MOD_PREV_FIN                    VARCHAR2(2)            null    
        constraint T99_MOD_PREV_FIN_CC check (
            MOD_PREV_FIN is null or (MOD_PREV_FIN in ('SI'))),
    VOCE_ECON_BUONI                 VARCHAR2(2)            null    
        constraint T99_VOCE_ECON_BUO_CC check (
            VOCE_ECON_BUONI is null or (VOCE_ECON_BUONI in ('SI'))),
    BLOCCO_TIPO_VAR                 VARCHAR2(2)            null    
        constraint T99_BLOCCO_TIPO_V_CC check (
            BLOCCO_TIPO_VAR is null or (BLOCCO_TIPO_VAR in ('SI'))),
    NOTE_FAT                        VARCHAR2(2)            null    
        constraint T99_NOTE_FAT_CC check (
            NOTE_FAT is null or (NOTE_FAT in ('SI'))),
    CONTROLLO_COMPETENZA_RPP        VARCHAR2(2)            null    
        constraint T99_CONTROLLO_CPT_CC check (
            CONTROLLO_COMPETENZA_RPP is null or (CONTROLLO_COMPETENZA_RPP in ('SI'))),
    CONTROLLO_IMPACC_FIN            VARCHAR2(2)            null    
        constraint T99_CONTROLLO_IMP_FIN_CC check (
            CONTROLLO_IMPACC_FIN is null or (CONTROLLO_IMPACC_FIN in ('SI'))),
    FILTRO_EC                       NUMBER(1)              null    ,
    CONTROLLO_IMPACC_OPE            VARCHAR2(2)            null    
        constraint T99_CONTROLLO_IMP_OPE_CC check (
            CONTROLLO_IMPACC_OPE is null or (CONTROLLO_IMPACC_OPE in ('SI'))),
    RESPONSABILE_RES                VARCHAR2(2)            null    
        constraint T99_RESPONSABILE__CC check (
            RESPONSABILE_RES is null or (RESPONSABILE_RES in ('SI'))),
    ORDIN_PROGETTI                  VARCHAR2(4)            null    
        constraint T99_ORDIN_PROGETT_CC check (
            ORDIN_PROGETTI is null or (ORDIN_PROGETTI in ('DAIN'))),
    CAP_E_UNIVOCI                   VARCHAR2(2)            null    
        constraint T99_CAP_E_UNIVOCI_CC check (
            CAP_E_UNIVOCI is null or (CAP_E_UNIVOCI in ('SI'))),
    CAP_S_UNIVOCI                   VARCHAR2(2)            null    
        constraint T99_CAP_S_UNIVOCI_CC check (
            CAP_S_UNIVOCI is null or (CAP_S_UNIVOCI in ('SI'))),
    ABILITA_IMP_DOC                 VARCHAR2(2)            null    
        constraint T99_ABILITA_IMP_D_CC check (
            ABILITA_IMP_DOC is null or (ABILITA_IMP_DOC in ('SI'))),
    ANNULLO_PRENOTAZIONE_DEL        VARCHAR2(2)            null    ,
    CONTROLLO_COD_UTENZA            VARCHAR2(2)            null    
        constraint T99_CONTROLLO_COD_CC check (
            CONTROLLO_COD_UTENZA is null or (CONTROLLO_COD_UTENZA in ('SI'))),
    FLAG_EC_MO                      NUMBER(1)              null    ,
    FILTRO_OBIETTIVO                VARCHAR2(4)            null    
        constraint T99_FILTRO_OBIETT_CC check (
            FILTRO_OBIETTIVO is null or (FILTRO_OBIETTIVO in ('C','CB'))),
    PVB_PS4                         NUMBER(1)              null    
        constraint T99_PVB_PS4_CC check (
            PVB_PS4 is null or (PVB_PS4 in (1,2))),
    TIPO_CAP_ISTITUZIONE            NUMBER(1)              null    ,
    TIPO_NUM_PROPOSTE               NUMBER(1)              null    
        constraint T99_TIPO_NUM_PROP_CC check (
            TIPO_NUM_PROPOSTE is null or (TIPO_NUM_PROPOSTE in (1))),
    PROPOSTA_ACC                    VARCHAR2(2)            null    
        constraint T99_PROPOSTA_ACC_CC check (
            PROPOSTA_ACC is null or (PROPOSTA_ACC in ('SI'))),
    ST_DES_INTERVENTO               VARCHAR2(2)            null    
        constraint T99_ST_DES_INTERV_CC check (
            ST_DES_INTERVENTO is null or (ST_DES_INTERVENTO in ('SI'))),
    CONTROLLO_PROG_DOPPI            VARCHAR2(2)            null    
        constraint T99_CONTROLLO_PRO_CC check (
            CONTROLLO_PROG_DOPPI is null or (CONTROLLO_PROG_DOPPI in ('SI'))),
    ORD_ELENCO_DOC                  NUMBER(1)              null    
        constraint T99_ORD_ELENCO_DO_CC check (
            ORD_ELENCO_DOC is null or (ORD_ELENCO_DOC in (1))),
    GP4_IMP_DISP                    VARCHAR2(2)            null    
        constraint T99_GP4_IMP_DISP_CC check (
            GP4_IMP_DISP is null or (GP4_IMP_DISP in ('SI'))),
    SALP_FI                         VARCHAR2(2)            null    
        constraint T99_SALP_FI_CC check (
            SALP_FI is null or (SALP_FI in ('SI'))),
    CONTROLLO_SEQUENZA_MAN          VARCHAR2(2)            null    
        constraint T99_CONTROLLO_SEQ_CC check (
            CONTROLLO_SEQUENZA_MAN is null or (CONTROLLO_SEQUENZA_MAN in ('NO'))),
    CONTROLLO_SEQUENZA_ORD          VARCHAR2(2)            null    
        constraint T99_CONTROLLO_SEO_CC check (
            CONTROLLO_SEQUENZA_ORD is null or (CONTROLLO_SEQUENZA_ORD in ('NO'))),
    TIPO_EMISS_ACC_PROVV            NUMBER(1)              null    ,
    CONTROLLO_PROPOSTA_IMP          VARCHAR2(2)            null    
        constraint T99_CONTROLLO_PRI_CC check (
            CONTROLLO_PROPOSTA_IMP is null or (CONTROLLO_PROPOSTA_IMP in ('SI'))),
    TIPO_TOT_LIQ_MULTIPLA           NUMBER(1)              null    ,
    CONTROLLO_IVA_LIQ               VARCHAR2(2)            null    
        constraint T99_CONTROLLO_IVA_CC check (
            CONTROLLO_IVA_LIQ is null or (CONTROLLO_IVA_LIQ in ('SI'))),
    BLOCCO_FATTURA_DOPPIA           VARCHAR2(2)            null    
        constraint T99_BLOCCO_FATTUR_CC check (
            BLOCCO_FATTURA_DOPPIA is null or (BLOCCO_FATTURA_DOPPIA in ('SI'))),
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    IVA_DEF_GC4                     VARCHAR2(2)            null    
        constraint T99_IVA_DEF_GC4_CC check (
            IVA_DEF_GC4 is null or (IVA_DEF_GC4 in ('SI'))),
    FLAG_RITORNO_CC_PROVV           VARCHAR2(2)            null    
        constraint T99_FLAG_RITORNO__CC check (
            FLAG_RITORNO_CC_PROVV is null or (FLAG_RITORNO_CC_PROVV in ('SI'))),
    TIPO_CAR_SOGG                   VARCHAR2(3)            null    ,
    CONTROLLO_SERCOS                VARCHAR2(1)            null    
        constraint T99_CONTROLLO_SER_CC check (
            CONTROLLO_SERCOS is null or (CONTROLLO_SERCOS in ('E','S'))),
    GESTIONE_BARCODE                VARCHAR2(2)            null    
        constraint T99_GESTIONE_BARC_CC check (
            GESTIONE_BARCODE is null or (GESTIONE_BARCODE in ('SI'))),
    ESERCIZIO_INIZIO_WEB            NUMBER(4)              null    ,
    INS_SOG_PROV                    VARCHAR2(2)            null    
        constraint T99_INS_SOG_PROV_CC check (
            INS_SOG_PROV is null or (INS_SOG_PROV in ('SI'))),
    CUP_SUBIMP                      VARCHAR2(2)            null    
        constraint T99_CUP_SUBIMP_CC check (
            CUP_SUBIMP is null or (CUP_SUBIMP in ('SI'))),
    ORDINE_BEN_MANDATI              NUMBER(1)              null    
        constraint T99_ORDINE_BEN_MA_CC check (
            ORDINE_BEN_MANDATI is null or (ORDINE_BEN_MANDATI in (1,2))),
    IMPORTO_CONTROLLO_EQUITALIA     NUMBER(14,2)           null    ,
    IMPORTO_ART18                   NUMBER(14,2)           null    ,
    TIPO_IMP_DA_ESIG                VARCHAR2(2)            null    ,
    CONTROLLO_CASSA_VPRO_LIQ        NUMBER(1)              null    
        constraint T99_CONTROLLO_CAS_CC check (
            CONTROLLO_CASSA_VPRO_LIQ is null or (CONTROLLO_CASSA_VPRO_LIQ in (1,2))),
    CONTROLLO_CASSA_VPRO_IN_EMISS   NUMBER(1)              null    
        constraint T99_CONTROLLO_CAS_EM_CC check (
            CONTROLLO_CASSA_VPRO_IN_EMISS is null or (CONTROLLO_CASSA_VPRO_IN_EMISS in (1,2))),
    DATA_RIS_AMM_PRESUNTO           DATE                   null    ,
    DATA_INIZIO_GEST_CRONO_UO       DATE                   null    ,
    DATA_FINE_GEST_CRONO_UO         DATE                   null    ,
    CONTROLLO_IMP_PROV              VARCHAR2(2)            null    ,
    FILTRO_FATTORI_PCF              VARCHAR2(2)            null    
        constraint T99_FILTRO_FATTOR_CC check (
            FILTRO_FATTORI_PCF is null or (FILTRO_FATTORI_PCF in ('SI'))),
    CONTROLLO_MANORD_FIN            VARCHAR2(2)            null    
        constraint T99_CONTR_MANFIN_CC check (
            CONTROLLO_MANORD_FIN is null or (CONTROLLO_MANORD_FIN in ('SI'))),
    CONTROLLO_MANORD_OPE            VARCHAR2(2)            null    
        constraint T99_CONTR_MANOPE_CC check (
            CONTROLLO_MANORD_OPE is null or (CONTROLLO_MANORD_OPE in ('SI'))),
    BLOCCO_REISCR_STN_FIN           VARCHAR2(2)            null    
        constraint T99_BL_REISCR_STN_CC check (
            BLOCCO_REISCR_STN_FIN is null or (BLOCCO_REISCR_STN_FIN in ('SI'))),
    BLOCCO_REISCR_IMPACC_FIN        VARCHAR2(2)            null    
        constraint T99_BL_REISCR_IMP_CC check (
            BLOCCO_REISCR_IMPACC_FIN is null or (BLOCCO_REISCR_IMPACC_FIN in ('SI'))),
    VOCE_TECNICA_OPERA              VARCHAR2(5)            null    ,
    RATEI_COSTI_RIC_PROVENTI_EME    VARCHAR2(2)            null    
        constraint T99_RATEI_COSTI_R_CC check (
            RATEI_COSTI_RIC_PROVENTI_EME is null or (RATEI_COSTI_RIC_PROVENTI_EME in ('SI'))),
    PERIODICITA_VERS_IVA            VARCHAR2(2)            default 'M' null    
        constraint T99_PERIODICITA_V_CC check (
            PERIODICITA_VERS_IVA is null or (PERIODICITA_VERS_IVA in ('M','G'))),
    RAGGRUPPAMENTO_VERS_IVA         VARCHAR2(5)            default 'FAT' null    
        constraint T99_RAGGRUPPAMENT_CC check (
            RAGGRUPPAMENTO_VERS_IVA is null or (RAGGRUPPAMENTO_VERS_IVA in ('FAT','BEN','TOT'))),
    TIPO_GEN_ACC_DA_FS              VARCHAR2(1)            null    ,
    GESTIONE_FINANZIAMENTI          VARCHAR2(2)            null    ,
    CONTROLLO_REGISTRI_LIQ_FAT      VARCHAR2(2)            null    
        constraint T99_CONTROLLO_REG_CC check (
            CONTROLLO_REGISTRI_LIQ_FAT is null or (CONTROLLO_REGISTRI_LIQ_FAT in ('B','NB'))),
    FATTORI_ARCONET                 VARCHAR2(2)            null    
        constraint T99_FATTORI_ARCON_CC check (
            FATTORI_ARCONET is null or (FATTORI_ARCONET in ('SI'))),
    ECO_STAND_ALONE                 VARCHAR2(2)            null    
        constraint T99_ECO_STAND_ALO_CC check (
            ECO_STAND_ALONE is null or (ECO_STAND_ALONE in ('SI'))),
    NUM_MAX_LIQ                     NUMBER(5)              null    ,
    NUM_MAX_PRE                     NUMBER(5)              null    ,
    DUP_APPROVAZIONE_PEG            DATE                   null    ,
    DUP_APPROVAZIONE_PEG_2P         DATE                   null    ,
    MACROAGGREGATO_CI4              VARCHAR2(50)           null    ,
    TIPO_AVANZO_OBBLIG              VARCHAR2(2)            null    
        constraint T99_TIPO_AVANZO_O_CC check (
            TIPO_AVANZO_OBBLIG is null or (TIPO_AVANZO_OBBLIG in ('SI'))),
    BLOCCO_CASSA_COMP_TITOLO_7      VARCHAR2(2)            null    
        constraint BLOCCO_CASSA_COMP_TITOLO_7 check (
            BLOCCO_CASSA_COMP_TITOLO_7 is null or (BLOCCO_CASSA_COMP_TITOLO_7 in ('SI'))),
    BLOCCO_CASSA_COMP_TITOLO_5      VARCHAR2(2)            null    
        constraint T99_BLOCCO_CASSA_5_CC check (
            BLOCCO_CASSA_COMP_TITOLO_5 is null or (BLOCCO_CASSA_COMP_TITOLO_5 in ('SI'))),
    DUP_APPROVAZIONE_DUP            DATE                   null    ,
    DUP_APPROVAZIONE_DUP_2P         DATE                   null    ,
    GPS_GESTIONE_TIPI_COSTO         VARCHAR2(2)            null    ,
    EMISS_PARZ_PROVV_S              VARCHAR2(2)            null    
        constraint T99_EMISS_PARZ_PROVV_S_CC check (
            EMISS_PARZ_PROVV_S is null or (EMISS_PARZ_PROVV_S in ('SI'))),
    DUP_DATA_INIZIO_VAR_PEG         DATE                   null    ,
    DUP_DATA_FINE_VAR_PEG           DATE                   null    ,
    DUP_DATA_INIZIO_VAR_DUP         DATE                   null    ,
    DUP_DATA_FINE_VAR_DUP           DATE                   null    ,
    MOVI_LIQ_CI4_SU_IMMOB           VARCHAR2(2)            null    
        constraint T99_MOVI_LIQ_CI4__CC check (
            MOVI_LIQ_CI4_SU_IMMOB is null or (MOVI_LIQ_CI4_SU_IMMOB in ('SI'))),
    COLLEGAMENTO_DUP                VARCHAR2(3)            null    ,
    BLOCCO_DISP_PURA_STANZ_OBIET    VARCHAR2(2)            null    
        constraint T99_BLOCCO_DISP_P_CC check (
            BLOCCO_DISP_PURA_STANZ_OBIET is null or (BLOCCO_DISP_PURA_STANZ_OBIET in ('SI'))),
    DUP_OTTICA_GR_PERFORM           VARCHAR2(20)           null    ,
    DUP_OTTICA_GR_ANTICOR           VARCHAR2(20)           null    ,
    constraint T99_PK primary key (ESERCIZIO)
)
/





-- ============================================================
--   Table: IMPUTAZIONI_CONTABILI                              
-- ============================================================
create table IMPUTAZIONI_CONTABILI
(
    DATA                            DATE                   not null,
    DIVISIONE                       VARCHAR2(4)            not null,
    ESERCIZIO                       NUMBER(4)              not null,
    E_S                             VARCHAR2(1)            not null,
    INTERVENTO                      NUMBER(7)              null    ,
    CAPITOLO                        NUMBER(16)             not null,
    ARTICOLO                        NUMBER(6)              not null,
    GESTIONE                        NUMBER(4)              null    ,
    FUNZIONALE                      VARCHAR2(6)            null    ,
    SEDE_DEL                        VARCHAR2(255)          null    ,
    ANNO_DEL                        NUMBER(4)              null    ,
    NUMERO_DEL                      NUMBER(7)              null    ,
    IMPEGNO                         NUMBER(6)              null    ,
    SUB                             NUMBER(6)              null    ,
    SOGGETTO                        NUMBER(9)              not null,
    COSTO                           VARCHAR2(1)            not null,
    IMPORTO                         NUMBER(14,2)           not null
        constraint IMPCON_IMPORTO_CC check (
            IMPORTO >= 0),
    CAUSALE                         VARCHAR2(60)           null    ,
    SEZIONE                         VARCHAR2(8)            null    ,
    ANNO_IMPEGNO                    NUMBER(4)              null    ,
    ANNO_SUB                        NUMBER(4)              null    ,
    NUM_QUIETANZA                   NUMBER(2)              null    ,
    CODICE_SIOPE                    NUMBER(4)              null    ,
    CODICE_COFOG                    NUMBER(3)              null    ,
    COD_LIVELLO_5                   NUMBER(10)             null    ,
    CODICE_EUROPEO                  NUMBER(1)              null    
)
/



-- ============================================================
--   Table: XML_DATI                                           
-- ============================================================
create table XML_DATI
(
    ESERCIZIO                       NUMBER(4)              not null,
    DELIBERA_CC                     NUMBER(5)              not null,
    DATA_DEL_CC                     DATE                   not null,
    ABITANTI                        NUMBER(7)              not null,
    SUPERFICIE                      NUMBER(7)              not null,
    CODICE_ISTAT                    VARCHAR2(6)            not null,
    CODICE_ENTE                     VARCHAR2(10)           null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint XML_DATI_PK primary key (ESERCIZIO)
)
/



-- ============================================================
--   Table: XML_GEST_E                                         
-- ============================================================
create table XML_GEST_E
(
    ESERCIZIO                       NUMBER(4)              not null,
    TITOLO                          NUMBER(2)              null    ,
    CATEGORIA                       NUMBER(2)              null    ,
    COD_TERZI                       NUMBER(2)              null    ,
    RISORSA                         NUMBER(7)              null    ,
    DESCRIZIONE                     VARCHAR2(140)          null    ,
    RESIDUI_CONSERVATI_RS           VARCHAR2(18)           null    ,
    RESIDUI_CONSERVATI_CP           VARCHAR2(18)           null    ,
    RESIDUI_CONSERVATI_T            VARCHAR2(18)           null    ,
    NRIF                            NUMBER(7)              null    ,
    RISCOSSIONI_RS                  VARCHAR2(18)           null    ,
    RISCOSSIONI_CP                  VARCHAR2(18)           null    ,
    RISCOSSIONI_T                   VARCHAR2(18)           null    ,
    RESIDUI_DA_RIPORTARE_RS         VARCHAR2(18)           null    ,
    RESIDUI_DA_RIPORTARE_CP         VARCHAR2(18)           null    ,
    RESIDUI_DA_RIPORTARE_T          VARCHAR2(18)           null    ,
    ACCERTAMENTI_RS                 VARCHAR2(18)           null    ,
    ACCERTAMENTI_CP                 VARCHAR2(18)           null    ,
    ACCERTAMENTI_T                  VARCHAR2(18)           null    ,
    MAG_MIN_RS                      VARCHAR2(18)           null    ,
    MAG_MIN_CP                      VARCHAR2(18)           null    
)
/



-- ============================================================
--   Table: XML_GEST_S                                         
-- ============================================================
create table XML_GEST_S
(
    TIPO                            VARCHAR2(1)            null    ,
    ESERCIZIO                       NUMBER(4)              null    ,
    TITOLO                          NUMBER(2)              null    ,
    FUNZIONE                        NUMBER(2)              null    ,
    SERVIZIO                        NUMBER(2)              null    ,
    INTERVENTO                      NUMBER(2)              null    ,
    COD_TERZI                       NUMBER(2)              null    ,
    RESIDUI_CONSERVATI_RS           VARCHAR2(18)           null    ,
    RESIDUI_CONSERVATI_CP           VARCHAR2(18)           null    ,
    RESIDUI_CONSERVATI_T            VARCHAR2(18)           null    ,
    CORRELATE                       VARCHAR2(18)           null    ,
    NRIF                            NUMBER(7)              null    ,
    PAGAMENTI_RS                    VARCHAR2(18)           null    ,
    PAGAMENTI_CP                    VARCHAR2(18)           null    ,
    PAGAMENTI_T                     VARCHAR2(18)           null    ,
    RESIDUI_DA_RIPORTARE_RS         VARCHAR2(18)           null    ,
    RESIDUI_DA_RIPORTARE_CP         VARCHAR2(18)           null    ,
    RESIDUI_DA_RIPORTARE_T          VARCHAR2(18)           null    ,
    IMPEGNI_RS                      VARCHAR2(18)           null    ,
    IMPEGNI_CP                      VARCHAR2(18)           null    ,
    IMPEGNI_T                       VARCHAR2(18)           null    ,
    MAG_MIN_RS                      VARCHAR2(18)           null    ,
    MAG_MIN_CP                      VARCHAR2(18)           null    
)
/



-- ============================================================
--   Table: TIPI_STAMPE                                        
-- ============================================================
create table TIPI_STAMPE
(
    CODICE                          VARCHAR2(4)            not null,
    DESCRIZIONE                     VARCHAR2(60)           not null,
    NUM_MAX_RIGHE                   NUMBER(2)              null    ,
    DIM_FONT_DEFAULT                NUMBER(2)              null    ,
    constraint TIPI_STAMPE_PK primary key (CODICE)
)
/



-- ============================================================
--   Table: PROGRAMMI_CG                                       
-- ============================================================
create table PROGRAMMI_CG
(
    PROGRAMMA                       VARCHAR2(4)            not null,
    DESCRIZIONE                     VARCHAR2(100)          null    ,
    DESCRIZIONE_ESTESA              VARCHAR2(2000)         null    ,
    RESPONSABILE                    VARCHAR2(40)           null    ,
    PROPRIETARIO                    VARCHAR2(2)            null    ,
    constraint PROGRAMMI_CG_PK primary key (PROGRAMMA)
)
/




-- ============================================================
--   Table: PARAMETRI_MINF                                     
-- ============================================================
create table PARAMETRI_MINF
(
    PARA_MINF_PK                    NUMBER(1)              not null,
    DATA_INIZIO_MAND_INF            DATE                   null    ,
    DATA_INIZIO_ORD_INF             DATE                   null    ,
    TIPO_MINF                       VARCHAR2(3)            null    ,
    CODICE_TESORERIA                VARCHAR2(20)           null    ,
    CODICE_ENTE                     VARCHAR2(20)           null    ,
    CODICE_FILIALE                  VARCHAR2(20)           null    ,
    PRIMO_PROG_TESO                 NUMBER(1)              null    
        constraint PARAMETRI_MIN_PRIMO_PROG_TE_CC check (
            PRIMO_PROG_TESO is null or (PRIMO_PROG_TESO between 0 and 1
            )),
    TIPO_SUB_MAN                    VARCHAR2(1)            null    
        constraint PARAMETRI_MIN_TIPO_SUB_MAN_CC check (
            TIPO_SUB_MAN is null or (TIPO_SUB_MAN in ('B','L','S','C'))),
    MOD_PAGAM_DIVERSE               VARCHAR2(2)            null    
        constraint PARAMETRI_MIN_MOD_PAGAM_DIV_CC check (
            MOD_PAGAM_DIVERSE is null or (MOD_PAGAM_DIVERSE in ('SI'))),
    GESTIONE_SPESE                  VARCHAR2(2)            null    
        constraint PARAMETRI_MIN_GESTIONE_SPES_CC check (
            GESTIONE_SPESE is null or (GESTIONE_SPESE in ('SI'))),
    GESIONE_COMMISSIONI             VARCHAR2(2)            null    
        constraint PARAMETRI_MIN_GESIONE_COMMI_CC check (
            GESIONE_COMMISSIONI is null or (GESIONE_COMMISSIONI in ('SI'))),
    GESTIONE_ALLEGATI               VARCHAR2(2)            null    
        constraint PARAMETRI_MIN_GESTIONE_ALLE_CC check (
            GESTIONE_ALLEGATI is null or (GESTIONE_ALLEGATI in ('SI'))),
    GESTIONE_INFO_TESORIERE         VARCHAR2(2)            null    
        constraint PARAMETRI_MIN_GESTIONE_INFO_CC check (
            GESTIONE_INFO_TESORIERE is null or (GESTIONE_INFO_TESORIERE in ('SI'))),
    GESTIONE_ORD_ASSOCIATI          VARCHAR2(2)            null    
        constraint PARAMETRI_MIN_GESTIONE_ORD__CC check (
            GESTIONE_ORD_ASSOCIATI is null or (GESTIONE_ORD_ASSOCIATI in ('SI'))),
    GESTIONE_ANNULLI                VARCHAR2(2)            null    
        constraint PARAMETRI_MIN_GESTIONE_ANNU_CC check (
            GESTIONE_ANNULLI is null or (GESTIONE_ANNULLI in ('SI'))),
    GESTIONE_SOSTITUZIONI           VARCHAR2(2)            null    
        constraint PARAMETRI_MIN_GESTIONE_SOST_CC check (
            GESTIONE_SOSTITUZIONI is null or (GESTIONE_SOSTITUZIONI in ('SI'))),
    TIPO_SUB_ORD                    VARCHAR2(1)            null    
        constraint PARAMETRI_MIN_TIPO_SUB_ORD_CC check (
            TIPO_SUB_ORD is null or (TIPO_SUB_ORD in ('D','P'))),
    GESTIONE_VARIAZIONI             VARCHAR2(2)            null    
        constraint PARAMETRI_MIN_GESTIONE_VARI_CC check (
            GESTIONE_VARIAZIONI is null or (GESTIONE_VARIAZIONI in ('SI'))),
    TIPO_INC_PAG                    VARCHAR2(3)            null    ,
    GENERA_XML                      VARCHAR2(2)            null    
        constraint PARAMETRI_MIN_GENERA_XML_CC check (
            GENERA_XML is null or (GENERA_XML in ('SI'))),
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    SPESE_DA_SOGGETTO               VARCHAR2(2)            null    
        constraint PARAMETRI_MIN_SPESE_DA_SOGG_CC check (
            SPESE_DA_SOGGETTO is null or (SPESE_DA_SOGGETTO in ('SI'))),
    CUP_CAUSALE                     VARCHAR2(2)            null    
        constraint PARAMETRI_MIN_CUP_CAUSALE_CC check (
            CUP_CAUSALE is null or (CUP_CAUSALE in ('SI'))),
    TIPI_SPESA_DB                   VARCHAR2(2)            null    ,
    MANDATI_COPERTURA               VARCHAR2(2)            null    
        constraint PARAMETRI_MIN_MANDATI_COPER_CC check (
            MANDATI_COPERTURA is null or (MANDATI_COPERTURA in ('SI'))),
    CODICE_ISTAT                    VARCHAR2(50)           null    ,
    CODICE_TRAMITE_ENTE             VARCHAR2(50)           null    ,
    CODICE_TRAMITE_BT               VARCHAR2(50)           null    ,
    constraint PARAMETRI_MINF_PK primary key (PARA_MINF_PK)
)
/



-- ============================================================
--   Table: MAN_INF_TESTATA                                    
-- ============================================================
create table MAN_INF_TESTATA
(
    IDENTIFICATIVO_RECORD           NUMBER(10)             not null,
    ANNO_MAND                       NUMBER(4)              not null,
    NUMERO_MAND                     NUMBER(5)              not null,
    VERSIONE                        NUMBER(2)              not null,
    DATA_MAND                       DATE                   null    ,
    IMPORTO                         NUMBER(14,2)           null    ,
    IMPORTO_PRECEDENTE              NUMBER(14,2)           null    ,
    RIF_TESO_1_VINCOLO              VARCHAR2(2)            null    ,
    RIF_TESO_2_VINCOLO              VARCHAR2(2)            null    ,
    RIF_TESO_3_VINCOLO              VARCHAR2(4)            null    ,
    CC_VINCOLO                      VARCHAR2(20)           null    ,
    CODICE_BILANCIO                 NUMBER(7)              null    ,
    VOCE_ECONOMICA                  NUMBER(3)              null    ,
    RISORSA_INTERVENTO              NUMBER(7)              null    ,
    CAPITOLO                        NUMBER(16)             null    ,
    ARTICOLO                        NUMBER(2)              null    ,
    DES_CODICE_BILANCIO             VARCHAR2(500)          null    ,
    GESTIONE                        VARCHAR2(1)            null    ,
    ANNO_IMP                        NUMBER(4)              null    ,
    STANZIAMENTO                    NUMBER(14,2)           null    ,
    TOT_MANDATI                     NUMBER(14,2)           null    ,
    DISPONIBILITA                   NUMBER(14,2)           null    ,
    ANNO_DEL_LIQ                    NUMBER(4)              null    ,
    NUMERO_DEL_LIQ                  NUMBER(6)              null    ,
    SEDE_DEL_LIQ                    VARCHAR2(255)          null    ,
    DELIBERE_LIQUIDAZIONE           VARCHAR2(150)          null    ,
    ANNO_DEL_IMP                    NUMBER(4)              null    ,
    NUMERO_DEL_IMP                  NUMBER(6)              null    ,
    SEDE_DEL_IMP                    VARCHAR2(255)          null    ,
    ANNO_ELENCO                     NUMBER(4)              null    ,
    DESCR_VINCOLO                   VARCHAR2(50)           null    ,
    NUMERO_ELENCO                   NUMBER(5)              null    ,
    UTENTE                          VARCHAR2(8)            null    ,
    NOMINATIVO_UTENTE               VARCHAR2(40)           null    ,
    DATA_DEL_IMP                    DATE                   null    ,
    DATA_REG_IMP                    DATE                   null    ,
    NUMERO_IMP                      NUMBER(5)              null    ,
    DATA_ELENCO                     DATE                   null    ,
    UFFICIO                         NUMBER(5)              null    ,
    UTENTE_MAN                      VARCHAR2(8)            null    ,
    STANZIAMENTO_INI                NUMBER(14,2)           null    ,
    VARIAZIONI                      NUMBER(14,2)           null    ,
    TOT_MANDATI_COM_RES             NUMBER(14,2)           null    ,
    DISPONIBILITA_COM_RES           NUMBER(14,2)           null    ,
    STANZIAMENTO_CA                 NUMBER(14,2)           null    ,
    TOT_MANDATI_CA                  NUMBER(14,2)           null    ,
    DISPONIBILITA_CA                NUMBER(14,2)           null    ,
    COPERTURA                       VARCHAR2(2)            null    
        constraint MAN_INF_TESTA_COPERTURA_CC check (
            COPERTURA is null or (COPERTURA in ('SI'))),
    ID_IDENTIFICATIVO_FLUSSO        VARCHAR2(20)           null    ,
    ID_DETTAGLIO_FLUSSO             NUMBER(20)             null    ,
    STATO                           VARCHAR2(50)           null    ,
    constraint MAN_INF_TESTATA_PK primary key (IDENTIFICATIVO_RECORD)
)
/


-- ============================================================
--   Index: MAN_INF_TESTATA_MAN_FK                             
-- ============================================================
create index MAN_INF_TESTATA_MAN_FK on MAN_INF_TESTATA (ANNO_MAND asc, NUMERO_MAND asc)
/

-- ============================================================
--   Table: MAN_INF_SUB                                        
-- ============================================================
create table MAN_INF_SUB
(
    IDENTIFICATIVO_TESTATA          NUMBER(10)             not null,
    PROGRESSIVO_TESO                NUMBER(5)              not null,
    RAGIONE_SOCIALE_BEN             VARCHAR2(60)           null    ,
    INDIRIZZO_BEN                   VARCHAR2(100)          null    ,
    CAP_BEN                         NUMBER(5)              null    ,
    COMUNE_BEN                      VARCHAR2(40)           null    ,
    PROVINCIA_BEN                   VARCHAR2(2)            null    ,
    PARTITA_IVA_BEN                 VARCHAR2(11)           null    ,
    CODICE_FISCALE_BEN              VARCHAR2(16)           null    ,
    RAGIONE_SOCIALE_DIV_BEN         VARCHAR2(60)           null    ,
    INDIRIZZO_DIV_BEN               VARCHAR2(100)          null    ,
    CAP_DIV_BEN                     NUMBER(5)              null    ,
    COMUNE_DIV_BEN                  VARCHAR2(40)           null    ,
    PROVINCIA_DIV_BEN               VARCHAR2(2)            null    ,
    PARTITA_IVA_DIV_BEN             VARCHAR2(11)           null    ,
    CODICE_FISCALE_DIV_BEN          VARCHAR2(16)           null    ,
    ABI                             NUMBER(5)              null    ,
    CAB                             NUMBER(5)              null    ,
    CONTO_CORRENTE                  VARCHAR2(12)           null    ,
    CIN_BANCARIO                    VARCHAR2(1)            null    ,
    IBAN_PAESE                      VARCHAR2(2)            null    ,
    IBAN_CIN_EUROPA                 VARCHAR2(2)            null    ,
    DES_BANCA                       VARCHAR2(40)           null    ,
    INTESTATARIO_1                  VARCHAR2(40)           null    ,
    INTESTATARIO_2                  VARCHAR2(40)           null    ,
    INTESTATARIO_3                  VARCHAR2(40)           null    ,
    RIF_TESO_1_BOLLO                VARCHAR2(2)            null    ,
    RIF_TESO_2_BOLLO                VARCHAR2(4)            null    ,
    DES_BOLLO                       VARCHAR2(40)           null    ,
    SPESE                           NUMBER(1)              null    ,
    COMMISSIONI                     NUMBER(1)              null    ,
    RIF_TESO_MINF                   VARCHAR2(3)            null    ,
    DES_TIPO_PAGAMENTO              VARCHAR2(100)          null    ,
    IMPORTO                         NUMBER(14,2)           null    ,
    IMPORTO_NETTO                   NUMBER(14,2)           null    ,
    DESCRIZIONE                     VARCHAR2(140)          null    ,
    DATA_VALUTA                     DATE                   null    ,
    SCADENZA                        DATE                   null    ,
    ALLEGATI                        VARCHAR2(150)          null    ,
    INFO_TESORIERE                  VARCHAR2(200)          null    ,
    SOSPESI                         VARCHAR2(1)            null    ,
    DES_CAPITOLO                    VARCHAR2(140)          null    ,
    ANNO_SUBIMP                     NUMBER(4)              null    ,
    NUMERO_IMP                      NUMBER(5)              null    ,
    NUMERO_SUBIMP                   NUMBER(5)              null    ,
    CODICE_DIV_BEN                  NUMBER                 null    ,
    CODICE_BEN                      NUMBER(6)              null    ,
    CODICE_QUIETANZANTE             NUMBER(6)              null    ,
    RAG_SOC_QUIETANZANTE            VARCHAR2(60)           null    ,
    INDIRIZZO_QUIETANZANTE          VARCHAR2(100)          null    ,
    CAP_QUIETANZANTE                NUMBER(5)              null    ,
    COMUNE_QUIETANZANTE             VARCHAR2(40)           null    ,
    PROVINCIA_QUIETANZANTE          VARCHAR2(2)            null    ,
    COD_FISC_QUIETANZANTE           VARCHAR2(16)           null    ,
    INFO_FATTURE                    VARCHAR2(750)          null    ,
    ANNO_DEL                        NUMBER(4)              null    ,
    NUMERO_DEL                      NUMBER(6)              null    ,
    SEDE_DEL                        VARCHAR2(255)          null    ,
    IBAN_ID_NAZIONALE               VARCHAR2(10)           null    ,
    IBAN_CONTO                      VARCHAR2(18)           null    ,
    IBAN_EXTRA_UE                   VARCHAR2(34)           null    ,
    BIC                             VARCHAR2(11)           null    ,
    COD_STATO_BEN                   VARCHAR2(2)            null    ,
    COD_STATO_QUIETANZANTE          VARCHAR2(2)            null    ,
    STRINGA_CODICI_ARM              VARCHAR2(290)          null    ,
    ID_IDENTIFICATIVO_FLUSSO        VARCHAR2(20)           null    ,
    DES_TIPO_PAGAMENTO_2            VARCHAR2(100)          null    ,
    CAUSALE                         VARCHAR2(2000)         null    ,
    IMPIGNORABILI                   VARCHAR2(2)            null    
        constraint MAN_INF_SUB_IMPIGNORABILI_CC check (
            IMPIGNORABILI is null or (IMPIGNORABILI in ('SI'))),
    NUMERO_AVVISO_PAGOPA            NUMBER                 null    ,
    constraint MAN_INF_SUB_PK primary key (IDENTIFICATIVO_TESTATA, PROGRESSIVO_TESO)
)
/



-- ============================================================
--   Table: MAN_INF_SUB_ORD_ASS                                
-- ============================================================
create table MAN_INF_SUB_ORD_ASS
(
    IDENTIFICATIVO_TESTATA          NUMBER(10)             not null,
    PROGRESSIVO_TESO                NUMBER(5)              null    ,
    ANNO_ORD                        NUMBER(4)              null    ,
    NUMERO_ORD                      NUMBER(5)              null    ,
    PROGRESSIVO_TESO_ORD            NUMBER(5)              null    ,
    IMPORTO                         NUMBER(14,2)           null    ,
    TIPO                            VARCHAR2(4)            null    ,
    ID_IDENTIFICATIVO_FLUSSO        VARCHAR2(20)           null    
)
/



-- ============================================================
--   Table: MAN_INF_SUB_SOSP                                   
-- ============================================================
create table MAN_INF_SUB_SOSP
(
    IDENTIFICATIVO_TESTATA          NUMBER(10)             not null,
    PROGRESSIVO_TESO                NUMBER(5)              null    ,
    NUMERO_CONTABILE                VARCHAR(10)            null    ,
    DATA_CONTABILE                  DATE                   null    ,
    IMPORTO                         NUMBER(14,2)           null    ,
    IMPORTO_NETTO                   NUMBER(14,2)           null    ,
    ID_IDENTIFICATIVO_FLUSSO        VARCHAR2(20)           null    
)
/



-

-- ============================================================
--   Table: MAN_INF_SUB_SIOPE                                  
-- ============================================================
create table MAN_INF_SUB_SIOPE
(
    IDENTIFICATIVO_TESTATA          NUMBER(10)             not null,
    PROGRESSIVO_TESO                NUMBER(5)              null    ,
    CODICE_CGE                      VARCHAR2(15)           null    ,
    DES_CGE                         VARCHAR2(100)          null    ,
    CODICE_CUP                      VARCHAR2(15)           null    ,
    CODICE_CPV                      VARCHAR2(15)           null    ,
    DES_CPV                         VARCHAR2(100)          null    ,
    IMPORTO_RITENUTE                NUMBER(14,2)           null    ,
    IMPORTO                         NUMBER(14,2)           null    ,
    ID_IDENTIFICATIVO_FLUSSO        VARCHAR2(20)           null    ,
    TIPO_DEBITO                     VARCHAR2(50)           null    ,
    IMPORTO_TIPO_DEB                NUMBER(14,2)           null    ,
    FAT_ANNO_PROG                   NUMBER(4)              null    ,
    FAT_NUMERO_PROG                 NUMBER(5)              null    ,
    FAT_IMPORTO                     NUMBER(14,2)           null    ,
    CODICE_CIG_SIOPE                VARCHAR2(15)           null    ,
    MOTIVO_ESCLUSIONE_CIG_SIOPE     VARCHAR2(50)           null    ,
    CODICE_UE_SIOPE                 NUMBER(2)              null    ,
    CODICE_COFOG_SIOPE              VARCHAR2(50)           null    ,
    IMPORTO_COFOG_SIOPE             NUMBER(14,2)           null    ,
    PROGR_RETFAT                    NUMBER(10)             null    
)
/



-- ============================================================
--   Index: MAN_INF_SUB_SIOPE_FK                               
-- ============================================================
create index MAN_INF_SUB_SIOPE_FK on MAN_INF_SUB_SIOPE (IDENTIFICATIVO_TESTATA asc, PROGRESSIVO_TESO asc)
/

-- ============================================================
--   Table: MAN_INF_STATO                                      
-- ============================================================
create table MAN_INF_STATO
(
    ANNO_MAND                       NUMBER(4)              not null,
    NUMERO_MAND                     NUMBER(5)              not null,
    PROGRESSIVO_TESO                NUMBER(5)              not null,
    VERSIONE                        NUMBER(2)              not null,
    PROGRESSIVO                     NUMBER(2)              not null,
    TIPO                            VARCHAR2(1)            not null
        constraint MAN_INF_STATO_TIPO_CC check (
            TIPO in ('I','A','V','S')),
    DATA                            DATE                   not null,
    DATA_INVIO                      DATE                   null    ,
    ANNO_MAND_SOST                  NUMBER(4)              null    ,
    NUMERO_MAND_SOST                NUMBER(5)              null    ,
    PROGRESSIVO_TESO_SOST           NUMBER(5)              null    ,
    ID_IDENTIFICATIVO_FLUSSO        VARCHAR2(20)           null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint MAN_INF_STATO_PK primary key (ANNO_MAND, NUMERO_MAND, PROGRESSIVO_TESO, VERSIONE, PROGRESSIVO)
)
/



-- ============================================================
--   Table: ORD_INF_TESTATA                                    
-- ============================================================
create table ORD_INF_TESTATA
(
    IDENTIFICATIVO_RECORD           NUMBER(10)             not null,
    ANNO_ORD                        NUMBER(4)              not null,
    NUMERO_ORD                      NUMBER(5)              not null,
    VERSIONE                        NUMBER(2)              not null,
    DATA_ORD                        DATE                   null    ,
    IMPORTO                         NUMBER(14,2)           null    ,
    IMPORTO_PRECEDENTE              NUMBER(14,2)           null    ,
    RIF_TESO_1_VINCOLO              VARCHAR2(2)            null    ,
    RIF_TESO_2_VINCOLO              VARCHAR2(2)            null    ,
    RIF_TESO_3_VINCOLO              VARCHAR2(4)            null    ,
    CC_VINCOLO                      VARCHAR2(20)           null    ,
    CODICE_BILANCIO                 NUMBER(7)              null    ,
    VOCE_ECONOMICA                  NUMBER(3)              null    ,
    RISORSA_INTERVENTO              NUMBER(7)              null    ,
    CAPITOLO                        NUMBER(16)             null    ,
    ARTICOLO                        NUMBER(2)              null    ,
    DES_CODICE_BILANCIO             VARCHAR2(500)          null    ,
    GESTIONE                        VARCHAR2(1)            null    ,
    ANNO_ACC                        NUMBER(4)              null    ,
    STANZIAMENTO                    NUMBER(14,2)           null    ,
    TOT_ORDINATIVI                  NUMBER(14,2)           null    ,
    DISPONIBILITA                   NUMBER(14,2)           null    ,
    ANNO_DEL_ACC                    NUMBER(4)              null    ,
    NUMERO_DEL_ACC                  NUMBER(6)              null    ,
    SEDE_DEL_ACC                    VARCHAR2(255)          null    ,
    ANNO_ELENCO                     NUMBER(4)              null    ,
    DESCR_VINCOLO                   VARCHAR2(50)           null    ,
    NUMERO_ELENCO                   NUMBER(5)              null    ,
    UTENTE                          VARCHAR2(8)            null    ,
    NOMINATIVO_UTENTE               VARCHAR2(40)           null    ,
    DATA_DEL_ACC                    DATE                   null    ,
    DATA_REG_ACC                    DATE                   null    ,
    NUMERO_ACC                      NUMBER(5)              null    ,
    DATA_ELENCO                     DATE                   null    ,
    UFFICIO                         NUMBER(5)              null    ,
    UTENTE_ORD                      VARCHAR2(8)            null    ,
    STANZIAMENTO_INI                NUMBER(14,2)           null    ,
    VARIAZIONI                      NUMBER(14,2)           null    ,
    TOT_ORDINATIVI_COM_RES          NUMBER(14,2)           null    ,
    DISPONIBILITA_COM_RES           NUMBER(14,2)           null    ,
    STANZIAMENTO_CA                 NUMBER(14,2)           null    ,
    TOT_ORDINATIVI_CA               NUMBER(14,2)           null    ,
    DISPONIBILITA_CA                NUMBER(14,2)           null    ,
    ID_IDENTIFICATIVO_FLUSSO        VARCHAR2(20)           null    ,
    ID_DETTAGLIO_FLUSSO             NUMBER(20)             null    ,
    STATO                           VARCHAR2(50)           null    ,
    constraint ORD_INF_TESTATA_PK primary key (IDENTIFICATIVO_RECORD)
)
/



-- ============================================================
--   Index: ORD_INF_TESTATA_ORD_FK                             
-- ============================================================
create index ORD_INF_TESTATA_ORD_FK on ORD_INF_TESTATA (ANNO_ORD asc, NUMERO_ORD asc)
/

-- ============================================================
--   Table: ORD_INF_SUB                                        
-- ============================================================
create table ORD_INF_SUB
(
    IDENTIFICATIVO_TESTATA          NUMBER(10)             not null,
    PROGRESSIVO_TESO                NUMBER(5)              not null,
    RAGIONE_SOCIALE                 VARCHAR2(60)           null    ,
    INDIRIZZO                       VARCHAR2(100)          null    ,
    CAP                             NUMBER(5)              null    ,
    COMUNE                          VARCHAR2(40)           null    ,
    PROVINCIA                       VARCHAR2(2)            null    ,
    PARTITA_IVA                     VARCHAR2(11)           null    ,
    CODICE_FISCALE                  VARCHAR2(16)           null    ,
    ABI                             NUMBER(5)              null    ,
    CAB                             NUMBER(5)              null    ,
    CONTO_CORRENTE                  VARCHAR2(12)           null    ,
    CIN_BANCARIO                    VARCHAR2(1)            null    ,
    IBAN_PAESE                      VARCHAR2(2)            null    ,
    IBAN_CIN_EUROPA                 VARCHAR2(2)            null    ,
    DES_BANCA                       VARCHAR2(40)           null    ,
    INTESTATARIO_1                  VARCHAR2(40)           null    ,
    INTESTATARIO_2                  VARCHAR2(40)           null    ,
    INTESTATARIO_3                  VARCHAR2(40)           null    ,
    RIF_TESO_1_BOLLO                VARCHAR2(2)            null    ,
    RIF_TESO_2_BOLLO                VARCHAR2(4)            null    ,
    DES_BOLLO                       VARCHAR2(40)           null    ,
    SPESE                           NUMBER(1)              null    ,
    COMMISSIONI                     NUMBER(1)              null    ,
    RIF_TESO_MINF                   VARCHAR2(3)            null    ,
    DES_TIPO_PAGAMENTO              VARCHAR2(100)          null    ,
    IMPORTO                         NUMBER(14,2)           null    ,
    DESCRIZIONE                     VARCHAR2(150)          null    ,
    ALLEGATI                        VARCHAR2(150)          null    ,
    INFO_TESORIERE                  VARCHAR2(200)          null    ,
    SOSPESI                         VARCHAR2(1)            null    ,
    DES_CAPITOLO                    VARCHAR2(140)          null    ,
    NUMERO_ACC                      NUMBER(5)              null    ,
    INFO_FATTURE                    VARCHAR2(750)          null    ,
    CODICE_DEBITORE                 NUMBER(6)              null    ,
    IBAN_ID_NAZIONALE               VARCHAR2(10)           null    ,
    IBAN_CONTO                      VARCHAR2(18)           null    ,
    IBAN_EXTRA_UE                   VARCHAR2(34)           null    ,
    BIC                             VARCHAR2(11)           null    ,
    STRINGA_CODICI_ARM              VARCHAR2(260)          null    ,
    ID_IDENTIFICATIVO_FLUSSO        VARCHAR2(20)           null    ,
    CAUSALE                         VARCHAR2(2000)         null    ,
    constraint ORD_INF_SUB_PK primary key (IDENTIFICATIVO_TESTATA, PROGRESSIVO_TESO)
)
/



-- ============================================================
--   Table: ORD_INF_SUB_MAN_ASS                                
-- ============================================================
create table ORD_INF_SUB_MAN_ASS
(
    IDENTIFICATIVO_TESTATA          NUMBER(10)             not null,
    PROGRESSIVO_TESO                NUMBER(5)              null    ,
    ANNO_MAND                       NUMBER(4)              null    ,
    NUMERO_MAND                     NUMBER(5)              null    ,
    PROGRESSIVO_TESO_MAND           NUMBER(5)              null    ,
    IMPORTO                         NUMBER(14,2)           null    ,
    ID_IDENTIFICATIVO_FLUSSO        VARCHAR2(20)           null    
)
/



-- ============================================================
--   Index: ORD_INF_SUB_MAN_ASS                                
-- ============================================================
create index ORD_INF_SUB_MAN_ASS on ORD_INF_SUB_MAN_ASS (IDENTIFICATIVO_TESTATA asc, PROGRESSIVO_TESO asc)
/

-- ============================================================
--   Table: ORD_INF_SUB_SOSP                                   
-- ============================================================
create table ORD_INF_SUB_SOSP
(
    IDENTIFICATIVO_TESTATA          NUMBER(10)             not null,
    PROGRESSIVO_TESO                NUMBER(5)              null    ,
    NUMERO_CONTABILE                VARCHAR(10)            null    ,
    DATA_CONTABILE                  DATE                   null    ,
    IMPORTO                         NUMBER(14,2)           null    ,
    ID_IDENTIFICATIVO_FLUSSO        VARCHAR2(20)           null    
)
/



-- ============================================================
--   Index: ORD_INF_SUB_SOSP                                   
-- ============================================================
create index ORD_INF_SUB_SOSP on ORD_INF_SUB_SOSP (IDENTIFICATIVO_TESTATA asc, PROGRESSIVO_TESO asc)
/

-- ============================================================
--   Table: ORD_INF_SUB_SIOPE                                  
-- ============================================================
create table ORD_INF_SUB_SIOPE
(
    IDENTIFICATIVO_TESTATA          NUMBER(10)             not null,
    PROGRESSIVO_TESO                NUMBER(5)              null    ,
    CODICE_CGE                      VARCHAR2(15)           null    ,
    DES_CGE                         VARCHAR2(100)          null    ,
    CODICE_CPV                      VARCHAR2(15)           null    ,
    DES_CPV                         VARCHAR2(100)          null    ,
    IMPORTO                         NUMBER(14,2)           null    ,
    ID_IDENTIFICATIVO_FLUSSO        VARCHAR2(20)           null    ,
    TIPO_DEBITO                     VARCHAR2(50)           null    ,
    IMPORTO_TIPO_DEB                NUMBER(14,2)           null    ,
    FAT_ANNO_PROG                   NUMBER(4)              null    ,
    FAT_NUMERO_PROG                 NUMBER(5)              null    ,
    FAT_IMPORTO                     NUMBER(14,2)           null    ,
    CODICE_UE                       NUMBER(2)              null    
)
/



-- ============================================================
--   Index: ORD_INF_SUB_SIOPE_FK                               
-- ============================================================
create index ORD_INF_SUB_SIOPE_FK on ORD_INF_SUB_SIOPE (IDENTIFICATIVO_TESTATA asc, PROGRESSIVO_TESO asc)
/

-- ============================================================
--   Table: ORD_INF_STATO                                      
-- ============================================================
create table ORD_INF_STATO
(
    ANNO_ORD                        NUMBER(4)              not null,
    NUMERO_ORD                      NUMBER(5)              not null,
    PROGRESSIVO_TESO                NUMBER(5)              not null,
    VERSIONE                        NUMBER(2)              not null,
    PROGRESSIVO                     NUMBER(2)              not null,
    TIPO                            VARCHAR2(1)            not null
        constraint ORD_INF_STATO_TIPO_CC check (
            TIPO in ('I','A','V','S')),
    DATA                            DATE                   not null,
    DATA_INVIO                      DATE                   null    ,
    ANNO_ORD_SOST                   NUMBER(4)              null    ,
    NUMERO_ORD_SOST                 NUMBER(5)              null    ,
    PROGRESSIVO_TESO_SOST           NUMBER(5)              null    ,
    ID_IDENTIFICATIVO_FLUSSO        VARCHAR2(20)           null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint ORD_INF_STATO_PK primary key (ANNO_ORD, NUMERO_ORD, PROGRESSIVO_TESO, VERSIONE, PROGRESSIVO)
)
/


-- ============================================================
--   Table: STATI_CEE                                          
-- ============================================================
create table STATI_CEE
(
    CODICE                          VARCHAR2(2)            not null,
    DESCRIZIONE                     VARCHAR2(30)           null    ,
    constraint STATI_CEE_PK primary key (CODICE)
)
/



-- ============================================================
--   Table: PARAMETRI_MANORD_INF_XML                           
-- ============================================================
create table PARAMETRI_MANORD_INF_XML
(
    PARAMETRO                       VARCHAR2(50)           not null,
    TITOLO                          VARCHAR2(200)          not null,
    DESCRIZIONE                     VARCHAR2(2000)         null    ,
    TIPO_PARAMETRO                  VARCHAR2(10)           null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint PARAMETRI_MANORD_INF_XML_PK primary key (PARAMETRO)
)
/



-- ============================================================
--   Table: CF4WEB_WRK_SIT_IMPACC                              
-- ============================================================
create table CF4WEB_WRK_SIT_IMPACC
(
    PROGRESSIVO                     NUMBER(10)             not null,
    PROGR_SESSIONE                  NUMBER(12)             not null,
    TIPO_STRUTTURA                  VARCHAR2(1)            null    ,
    TIPO_STAMPA                     VARCHAR2(4)            null    ,
    CODICE_UO_GESTIONE              VARCHAR2(50)           null    ,
    DESCR_UO_GESTIONE               VARCHAR2(120)          null    ,
    PROGR_UO_GESTIONE               NUMBER(8)              null    ,
    CODICE_UO_UTILIZZO              VARCHAR2(50)           null    ,
    DESCR_UO_UTILIZZO               VARCHAR2(150)          null    ,
    PROGR_UO_UTILIZZO               NUMBER(8)              null    ,
    ESERCIZIO                       NUMBER(4)              null    ,
    E_S                             VARCHAR2(1)            null    ,
    CAPITOLO                        NUMBER(16)             null    ,
    ARTICOLO                        NUMBER(2)              null    ,
    VOCE_PEG                        VARCHAR2(20)           null    ,
    ANNO_IMPACC                     NUMBER(4)              null    ,
    NUMERO_IMPACC                   NUMBER(5)              null    ,
    ESTREMI_IMPACC                  VARCHAR2(15)           null    ,
    ANNO_SUBIMP                     NUMBER(4)              null    ,
    NUMERO_SUBIMP                   NUMBER(5)              null    ,
    ESTREMI_SUBIMP                  VARCHAR2(15)           null    ,
    DATA_IMPACC                     DATE                   null    ,
    DETERMINA_PROPOSTA              VARCHAR2(50)           null    ,
    OBBLIGATORIO                    VARCHAR2(2)            null    ,
    RAGIONE_SOCIALE                 VARCHAR2(60)           null    ,
    IMPORTO_IMPACC                  NUMBER(14,2)           null    ,
    SUBIMPEGNATO                    NUMBER(14,2)           null    ,
    LIQUIDATO                       NUMBER(14,2)           null    ,
    MAN_ORD                         NUMBER(14,2)           null    ,
    DISPONIBILITA                   NUMBER(14,2)           null    ,
    DESCR_IMPACC                    VARCHAR2(140)          null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    constraint CF4WEB_WRK_SIT_IMPACC_PK primary key (PROGRESSIVO, PROGR_SESSIONE)
)
/



-- ============================================================
--   Table: PARAMETRI_WEB                                      
-- ============================================================
create table PARAMETRI_WEB
(
    PROGRESSIVO                     NUMBER(1)              not null,
    OTTICA                          VARCHAR2(18)           null    ,
    SUDDIVISIONE_UNITA_SUP          NUMBER(8)              null    ,
    COMPETENZA_FINANZIAMENTI        VARCHAR2(2)            null    
        constraint PARAMETRI_WEB_COMPETENZA_FI_CC check (
            COMPETENZA_FINANZIAMENTI is null or (COMPETENZA_FINANZIAMENTI in ('SI'))),
    ATTI_LIQ                        VARCHAR2(2)            null    
        constraint PARAMETRI_WEB_ATTI_LIQ_CC check (
            ATTI_LIQ is null or (ATTI_LIQ in ('SI'))),
    DATA_STRUTTURA_ORGANIZZATIVA    DATE                   null    ,
    RUOLO_RESP_UO                   VARCHAR2(8)            null    ,
    TIPO_ASSEGNAZIONE_SO4           VARCHAR2(4)            null    
        constraint PARAMETRI_WEB_TIPO_ASSEGNAZ_CC check (
            TIPO_ASSEGNAZIONE_SO4 is null or (TIPO_ASSEGNAZIONE_SO4 in ('I','F'))),
    SUDDIVISIONE_UNITA_SUP_2        NUMBER(8)              null    ,
    SUDDIVISIONE_UFFICIO            NUMBER(8)              null    ,
    ESE_INI_SIOPE_ARM               NUMBER(4)              null    ,
    ESE_FINE_SIOPE_ARM              NUMBER(4)              null    ,
    PLUGIN_SFERA                    VARCHAR2(2)            null    
        constraint PARAMETRI_WEB_PLUGIN_SFERA_CC check (
            PLUGIN_SFERA is null or (PLUGIN_SFERA in ('SI'))),
    ATTI_LIGHT                      VARCHAR2(2)            null    ,
    ANAGRAFE_CONDIVISA              VARCHAR2(2)            null    
        constraint PARAMETRI_WEB_ANAGRAFE_COND_CC check (
            ANAGRAFE_CONDIVISA is null or (ANAGRAFE_CONDIVISA in ('SI'))),
    PLUGIN_DISTLIQ                  VARCHAR2(2)            null    
        constraint PARAMETRI_WEB_PLUGIN_DISTLI_CC check (
            PLUGIN_DISTLIQ is null or (PLUGIN_DISTLIQ in ('SI'))),
    PLUGIN_DISTORD                  VARCHAR2(2)            null    
        constraint PARAMETRI_WEB_PLUGIN_DISTOR_CC check (
            PLUGIN_DISTORD is null or (PLUGIN_DISTORD in ('SI'))),
    PLUGIN_DISTECON                 VARCHAR2(2)            null    
        constraint PARAMETRI_WEB_PLUGIN_DISTEC_CC check (
            PLUGIN_DISTECON is null or (PLUGIN_DISTECON in ('SI'))),
    PLUGIN_DISTUTENZE               VARCHAR2(2)            null    
        constraint PARAMETRI_WEB_PLUGIN_DISTUT_CC check (
            PLUGIN_DISTUTENZE is null or (PLUGIN_DISTUTENZE in ('SI'))),
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint PARAMETRI_WEB_PK primary key (PROGRESSIVO)
)
/

-- ============================================================
--   Table: CF4WEB_STRUTTURA                                   
-- ============================================================
create table CF4WEB_STRUTTURA
(
    PROGRESSIVO                     NUMBER(10)             not null,
    TIPO_STRUTTURA                  VARCHAR2(4)            not null,
    PROGR_SESSIONE                  NUMBER(12)             not null,
    CODICE_UO                       VARCHAR2(50)           not null,
    DESCRIZIONE                     VARCHAR2(240)          not null,
    PROGR_UNITA_ORGANIZZATIVA       NUMBER(8)              not null,
    PROGR_UNITA_PADRE               NUMBER(8)              null    ,
    IMMAGINE                        VARCHAR2(100)          null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    constraint CF4WEB_STRUTTURA_PK primary key (PROGRESSIVO, TIPO_STRUTTURA)
)
/



-- ============================================================
--   Index: CF4WEB_STRUTTURA_IK                                
-- ============================================================
create index CF4WEB_STRUTTURA_IK on CF4WEB_STRUTTURA (PROGR_SESSIONE asc, TIPO_STRUTTURA asc)
/

-- ============================================================
--   Table: OTTICHE_IST                                        
-- ============================================================
create table OTTICHE_IST
(
    OTTICA                          VARCHAR2(18)           null    ,
    DESCR_OTTICA                    VARCHAR2(120)          null    ,
    AMMINISTRAZIONE                 VARCHAR2(16)           null    ,
    DESCR_AMMINISTRAZIONE           VARCHAR2(2000)         null    
)
/



-- ============================================================
--   Table: T10                                                
-- ============================================================
create table T10
(
    CODICE                          NUMBER(2)              not null,
    DESCRIZIONE                     VARCHAR2(30)           not null,
    P_D_E                           VARCHAR2(1)            not null
        constraint T10_P_D_E_CC check (
            P_D_E in ('D','E')),
    PREVALENTE                      VARCHAR2(2)            null    
        constraint T10_PREVALENTE_CC check (
            PREVALENTE is null or (PREVALENTE in ('SI'))),
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint T10_PK primary key (CODICE)
)
/



-- ============================================================
--   Table: T11                                                
-- ============================================================
create table T11
(
    CODICE                          VARCHAR2(255)          not null,
    DESCRIZIONE                     VARCHAR2(30)           not null,
    TIPO                            VARCHAR2(1)            default 'D' null    
        constraint T11_TIPO_CC check (
            TIPO is null or (TIPO in ('D','O','P','T','A','L'))),
    RIF_TESO                        VARCHAR2(4)            null    ,
    DISAB_UTENZE                    VARCHAR2(2)            null    
        constraint T11_DISAB_UTENZE_CC check (
            DISAB_UTENZE is null or (DISAB_UTENZE in ('SI'))),
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint T11_PK primary key (CODICE)
)
/



-- ============================================================
--   Table: T01                                                
-- ============================================================
create table T01
(
    CODICE                          NUMBER(2)              not null,
    DESCRIZIONE                     VARCHAR2(60)           not null,
    NUM_GIORNI                      NUMBER(3)              null    ,
    DECORRENZA1                     VARCHAR2(1)            default 'P' null    
        constraint T01_DECORRENZA1_CC check (
            DECORRENZA1 is null or (DECORRENZA1 in ('E','P','A'))),
    DECORRENZA2                     NUMBER(1)              null    
        constraint T01_DECORRENZA2_CC check (
            DECORRENZA2 is null or (DECORRENZA2 in (1,2,3))),
    PREVALENTE                      VARCHAR2(2)            null    
        constraint T01_PREVALENTE_CC check (
            PREVALENTE is null or (PREVALENTE in ('SI'))),
    SE_PERSONALE                    VARCHAR2(2)            null    
        constraint T01_SE_PERSONALE_CC check (
            SE_PERSONALE is null or (SE_PERSONALE in ('SI'))),
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint T01_PK primary key (CODICE)
)
/



-- ============================================================
--   Table: T02                                                
-- ============================================================
create table T02
(
    CODICE                          NUMBER(2)              not null,
    DESCRIZIONE                     VARCHAR2(40)           not null,
    STAMPA_AVVISO                   VARCHAR2(2)            null    
        constraint T02_STAMPA_AVVISO_CC check (
            STAMPA_AVVISO is null or (STAMPA_AVVISO in ('SI'))),
    TIPO                            VARCHAR2(1)            null    ,
    RIFERIMENTO                     NUMBER(2)              null    ,
    RIF_TESO_MINF                   VARCHAR2(3)            null    ,
    DESCRIZIONE_MINF                VARCHAR2(100)          null    ,
    CODICE_FE                       VARCHAR2(4)            null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    CODICE_PEPPOL                   VARCHAR2(4)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint T02_PK primary key (CODICE)
)
/



-- ============================================================
--   Table: T05                                                
-- ============================================================
create table T05
(
    CODICE                          NUMBER(3)              not null,
    DESCRIZIONE                     VARCHAR2(40)           not null,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint T05_PK primary key (CODICE)
)
/


-- ============================================================
--   Table: T06                                                
-- ============================================================
create table T06
(
    CODICE                          NUMBER(2)              not null,
    DESCRIZIONE                     VARCHAR2(30)           not null,
    TIPO                            NUMBER(1)              null    ,
    TIPO_ECF                        NUMBER(1)              null    ,
    CODICE_FE                       VARCHAR2(2)            null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint T06_PK primary key (CODICE)
)
/



-- ============================================================
--   Table: T57                                                
-- ============================================================
create table T57
(
    CODICE                          NUMBER(4)              not null,
    DESCRIZIONE                     VARCHAR2(50)           not null,
    STATO                           VARCHAR2(1)            null    
        constraint T57_STATO_CC check (
            STATO is null or (STATO in ('U','D'))),
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint T57_PK primary key (CODICE)
)
/



-- ============================================================
--   Table: T63                                                
-- ============================================================
create table T63
(
    CODICE                          NUMBER(2)              not null
        constraint T63_CODICE_CC check (
            CODICE in (0,1,2,3,5,8,9,10,99)),
    DESCRIZIONE                     VARCHAR2(30)           not null,
    constraint T63_PK primary key (CODICE)
)
/



-- ============================================================
--   Table: T53                                                
-- ============================================================
create table T53
(
    CODICE                          NUMBER(5)              not null,
    DESCRIZIONE                     VARCHAR2(60)           not null,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint T53_PK primary key (CODICE)
)
/



-- ============================================================
--   Table: T75                                                
-- ============================================================
create table T75
(
    CODICE                          NUMBER(3)              not null,
    DESCRIZIONE                     VARCHAR2(40)           not null,
    TIPO                            VARCHAR2(1)            null    
        constraint T75_TIPO_CC check (
            TIPO is null or (TIPO in ('G','D','P'))),
    ECONOMIA_IVA                    VARCHAR2(2)            null    
        constraint T75_ECONOMIA_IVA_CC check (
            ECONOMIA_IVA is null or (ECONOMIA_IVA in ('SI'))),
    CODICE_CP                       NUMBER(5)              null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint T75_PK primary key (CODICE)
)
/



-- ============================================================
--   Table: T03                                                
-- ============================================================
create table T03
(
    CODICE                          NUMBER(2)              not null,
    STORNO                          NUMBER(1)              not null
        constraint T03_STORNO_CC check (
            STORNO in (0,1)),
    DESCRIZIONE                     VARCHAR2(40)           not null,
    ESCLUSIONE_ECF                  VARCHAR2(2)            null    
        constraint T03_ESCLUSIONE_EC_CC check (
            ESCLUSIONE_ECF is null or (ESCLUSIONE_ECF in ('SI'))),
    TIPO_DOCUMENTO                  VARCHAR2(100)          null    ,
    TIPO_DOC_PEPPOL                 VARCHAR2(50)           null    ,
    constraint T03_PK primary key (CODICE, STORNO)
)
/



-- ============================================================
--   Table: T08                                                
-- ============================================================
create table T08
(
    CODICE                          VARCHAR2(6)            not null,
    DESCRIZIONE                     VARCHAR2(40)           not null,
    CENTRO_COSTO                    VARCHAR2(8)            null    ,
    FATTORE_PRO                     VARCHAR2(8)            null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint T08_PK primary key (CODICE)
)
/


-- ============================================================
--   Table: T09                                                
-- ============================================================
create table T09
(
    CODICE                          NUMBER(2)              not null,
    DESCRIZIONE                     VARCHAR2(40)           not null,
    CODICE_IVA                      VARCHAR2(8)            not null,
    PRORATA                         NUMBER(5,2)            null    ,
    TIPO_LIQUIDAZIONE               VARCHAR2(1)            null    
        constraint T09_TIPO_LIQUIDAZ_CC check (
            TIPO_LIQUIDAZIONE is null or (TIPO_LIQUIDAZIONE in ('M','T'))),
    DETR_IVA_CI4                    VARCHAR2(2)            null    
        constraint T09_DETR_IVA_CI4_CC check (
            DETR_IVA_CI4 is null or (DETR_IVA_CI4 in ('SI'))),
    ISTITUZIONALE                   VARCHAR2(2)            null    
        constraint T09_ISTITUZIONALE_CC check (
            ISTITUZIONALE is null or (ISTITUZIONALE in ('SI'))),
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint T09_PK primary key (CODICE)
)
/


-- ============================================================
--   Table: T60                                                
-- ============================================================
create table T60
(
    CODICE                          NUMBER(2)              not null,
    DESCRIZIONE                     VARCHAR2(40)           not null,
    TIPO                            VARCHAR2(1)            null    ,
    IMPORTO_MASSIMO                 NUMBER(10,2)           null    ,
    RIF_TESO_1                      VARCHAR2(2)            null    ,
    RIF_TESO_2                      VARCHAR2(4)            null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    ORD_PROV                        VARCHAR2(2)            null    
        constraint T60_ORD_PROV_CC check (
            ORD_PROV is null or (ORD_PROV in ('SI'))),
    constraint T60_PK primary key (CODICE)
)
/



-- ============================================================
--   Table: T62                                                
-- ============================================================
create table T62
(
    CODICE                          NUMBER(2)              not null,
    QUADRO                          VARCHAR2(2)            null    ,
    DESCRIZIONE                     VARCHAR2(30)           not null,
    DES_ABBREVIATA                  VARCHAR2(9)            null    ,
    TIPO_CERT                       VARCHAR2(1)            null    
        constraint T62_TIPO_CERT_CC check (
            TIPO_CERT is null or (TIPO_CERT in ('E'))),
    ARTICOLO                        VARCHAR2(30)           null    ,
    SUB_QUADRO                      VARCHAR2(3)            null    ,
    CODICE_TS                       VARCHAR2(2)            null    
        constraint T62_CODICE_TS_CC check (
            CODICE_TS is null or (CODICE_TS >= '0'
            )),
    TIPO_RITENUTA                   VARCHAR2(1)            null    
        constraint T62_TIPO_RITENUTA_CC check (
            TIPO_RITENUTA is null or (TIPO_RITENUTA in ('A','I'))),
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint T62_PK primary key (CODICE)
)
/



-- ============================================================
--   Table: T82                                                
-- ============================================================
create table T82
(
    CODICE                          NUMBER(1)              not null,
    ALIQ_SSN_CD                     NUMBER(5,3)            not null,
    ALIQ_SSN_CE                     NUMBER(5,3)            not null,
    DESCRIZIONE                     VARCHAR2(30)           not null,
    ANNO_IMP                        NUMBER(4)              null    ,
    NUMERO_IMP                      NUMBER(5)              null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint T82_PK primary key (CODICE)
)
/



-- ============================================================
--   Table: T83                                                
-- ============================================================
create table T83
(
    CODICE                          NUMBER(2)              not null,
    DESCRIZIONE                     VARCHAR2(50)           not null,
    PERC_IMPONIBILE                 NUMBER(6,3)            not null,
    ALIQUOTA_INPS                   NUMBER(5,3)            not null,
    ALIQUOTA_INPS_CP                NUMBER(5,3)            not null,
    ALIQUOTA_INPS_CE                NUMBER(5,3)            not null,
    ANNO_ACC                        NUMBER(4)              null    ,
    NUMERO_ACC                      NUMBER(5)              null    ,
    ANNO_IMP_CP                     NUMBER(4)              null    ,
    NUMERO_IMP_CP                   NUMBER(5)              null    ,
    ANNO_IMP_CE                     NUMBER(4)              null    ,
    NUMERO_IMP_CE                   NUMBER(5)              null    ,
    TIPO                            VARCHAR2(1)            null    ,
    CODICE_FE                       VARCHAR2(10)           null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint T83_PK primary key (CODICE)
)
/



-- ============================================================
--   Table: T69                                                
-- ============================================================
create table T69
(
    CODICE                          NUMBER(2)              not null,
    DESCRIZIONE                     VARCHAR2(140)          not null,
    DESC_ABB                        VARCHAR2(33)           null    ,
    TIPO                            VARCHAR2(1)            null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint T69_PK primary key (CODICE)
)
/



-- ============================================================
--   Table: T86                                                
-- ============================================================
create table T86
(
    CODICE                          NUMBER(3)              not null,
    DESCRIZIONE                     VARCHAR2(60)           null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint T86_PK primary key (CODICE)
)
/



-- ============================================================
--   Table: T58                                                
-- ============================================================
create table T58
(
    CODICE                          NUMBER(4)              not null,
    DESCRIZIONE                     VARCHAR2(50)           not null,
    UTENTE_INSERIMENTO              VARCHAR(8)             null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint T58_PK primary key (CODICE)
)
/



-- ============================================================
--   Table: CLASSI                                             
-- ============================================================
create table CLASSI
(
    CLASSE                          NUMBER(2)              not null,
    DESCRIZIONE                     VARCHAR2(50)           not null,
    TIPO_GENERAZIONE                VARCHAR2(1)            not null
        constraint CLASSI_TIPO_GENERAZI_CC check (
            TIPO_GENERAZIONE in ('A','M')),
    TIPO_VALIDITA                   VARCHAR2(1)            not null
        constraint CLASSI_TIPO_VALIDITA_CC check (
            TIPO_VALIDITA in ('P','T')),
    TIPO_TOTALIZZAZIONE             VARCHAR2(1)            null    
        constraint CLASSI_TIPO_TOTALIZZ_CC check (
            TIPO_TOTALIZZAZIONE is null or (TIPO_TOTALIZZAZIONE in ('I','F','A'))),
    CLASSE_CG4                      NUMBER(3)              null    ,
    COLONNA_PC                      NUMBER(1)              null    
        constraint CLASSI_COLONNA_PC_CC check (
            COLONNA_PC is null or (COLONNA_PC in (1,2,3,4,5))),
    SIMULAZIONE                     VARCHAR2(2)            null    
        constraint CLASSI_SIMULAZIONE_CC check (
            SIMULAZIONE is null or (SIMULAZIONE in ('SI'))),
    constraint CLASSI_PK primary key (CLASSE)
)
/



-- ============================================================
--   Table: CATEGORIE_MUTUI                                    
-- ============================================================
create table CATEGORIE_MUTUI
(
    CODICE                          NUMBER(3)              not null,
    DESCRIZIONE                     VARCHAR2(50)           not null,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint CATEGORIE_MUTUI_PK primary key (CODICE)
)
/





-- ============================================================
--   Table: LIQ                                                
-- ============================================================
create table LIQ
(
    CAPITOLO                        NUMBER(16)             not null,
    ARTICOLO                        NUMBER(2)              not null,
    ANNO_LIQ                        NUMBER(4)              not null,
    NUMERO_LIQ                      NUMBER(5)              not null,
    ANNO_IMP                        NUMBER(4)              not null,
    NUMERO_IMP                      NUMBER(5)              not null,
    ANNO_SUBIMP                     NUMBER(4)              null    ,
    NUMERO_SUBIMP                   NUMBER(5)              null    ,
    ANNO_DEL                        NUMBER(4)              null    ,
    NUMERO_DEL                      NUMBER(6)              null    ,
    SEDE_DEL                        VARCHAR2(255)          null    ,
    DATA_REG                        NUMBER(7)              null    ,
    IMPORTO                         NUMBER(14,2)           not null
        constraint LIQ_IMPORTO_CC check (
            IMPORTO >= 0),
    RITENUTE                        NUMBER(14,2)           null    
        constraint LIQ_RITENUTE_CC check (
            RITENUTE is null or (RITENUTE >= 0
            )),
    IMPORTO_IVA                     NUMBER(14,2)           null    ,
    IMPORTO_IVA_IST                 NUMBER(14,2)           null    ,
    DESCRIZIONE                     VARCHAR2(140)          not null,
    DIVERSO_BEN                     NUMBER                 null    
        constraint LIQ_DIVERSO_BEN_CC check (
            DIVERSO_BEN is null or (DIVERSO_BEN >= 1
            )),
    BENEFICIARIO                    NUMBER                 null    
        constraint LIQ_BENEFICIARIO_CC check (
            BENEFICIARIO is null or (BENEFICIARIO >= 1
            )),
    ANNO_DOC                        NUMBER(4)              null    ,
    NUMERO_DOC                      VARCHAR2(20)           null    ,
    NUM_QUIETANZA                   NUMBER(2)              null    ,
    CAUSALE                         NUMBER(4)              null    ,
    BOLLO                           NUMBER(2)              null    ,
    ANNO_MAND                       NUMBER(4)              null    ,
    NUMERO_MAND                     NUMBER(5)              null    ,
    DATA_PAGAM                      NUMBER(7)              null    ,
    IMPORTO_PAGAM                   NUMBER(14,2)           null    
        constraint LIQ_IMPORTO_PAGAM_CC check (
            IMPORTO_PAGAM is null or (IMPORTO_PAGAM >= 0
            )),
    CODICE                          NUMBER(4)              null    ,
    CAUSALE_IRPEF                   NUMBER(2)              null    ,
    IMPONIBILE                      NUMBER(14,2)           null    
        constraint LIQ_IMPONIBILE_CC check (
            IMPONIBILE is null or (IMPONIBILE >= 0
            )),
    ALIQUOTA                        NUMBER(4,2)            null    ,
    TIPO_VINCOLO                    NUMBER(6)              null    ,
    RITENUTE_IRPEF                  NUMBER(14,2)           null    
        constraint LIQ_RITENUTE_IRPE_CC check (
            RITENUTE_IRPEF is null or (RITENUTE_IRPEF >= 0
            )),
    IMPORTO_NON_SOG                 NUMBER(14,2)           null    
        constraint LIQ_IMPORTO_NON_S_CC check (
            IMPORTO_NON_SOG is null or (IMPORTO_NON_SOG >= 0
            )),
    NUMERO_PAGAM                    VARCHAR2(10)           null    ,
    NUM_QUIETANZA_DIV_BEN           NUMBER(2)              null    ,
    UFFICIO                         NUMBER(5)              null    ,
    ANNO_PROPOSTA                   NUMBER(4)              null    ,
    UNITA_PROPONENTE                VARCHAR2(255)          null    ,
    NUMERO_PROPOSTA                 NUMBER(10)             null    ,
    CODICE_SSN                      NUMBER(1)              null    ,
    ALIQ_SSN_CD                     NUMBER(5,3)            null    ,
    ALIQ_SSN_CE                     NUMBER(5,3)            null    ,
    IMPONIBILE_SSN                  NUMBER(14,2)           null    ,
    RITENUTE_SSN                    NUMBER(14,2)           null    
        constraint LIQ_RITENUTE_SSN_CC check (
            RITENUTE_SSN is null or (RITENUTE_SSN >= 0
            )),
    RITENUTE_SSN_CE                 NUMBER(14,2)           null    
        constraint LIQ_RITENUTE_SSN__CC check (
            RITENUTE_SSN_CE is null or (RITENUTE_SSN_CE >= 0
            )),
    CASSA                           NUMBER(2)              null    ,
    IMPONIBILE_INPS                 NUMBER(14,2)           null    
        constraint LIQ_IMPONIBILE_IN_CC check (
            IMPONIBILE_INPS is null or (IMPONIBILE_INPS >= 0
            )),
    ALIQUOTA_INPS                   NUMBER(5,3)            null    ,
    RITENUTE_INPS                   NUMBER(14,2)           null    
        constraint LIQ_RITENUTE_INPS_CC check (
            RITENUTE_INPS is null or (RITENUTE_INPS >= 0
            )),
    RITENUTE_INPS_CE                NUMBER(14,2)           null    ,
    VOCE_ECON                       NUMBER(2)              null    ,
    CODICE_PTC                      NUMBER(4)              null    ,
    FAT_ANNO_PROG                   NUMBER(4)              null    ,
    FAT_NUMERO_PROG                 NUMBER(5)              null    ,
    S                               VARCHAR2(1)            default 'S' null    ,
    D_DATA_REG                      DATE                   default SYSDATE null    ,
    D_DATA_PAGAM                    DATE                   null    ,
    NUMERO_CONTABILE                VARCHAR2(10)           null    ,
    DATA_CONTABILE                  DATE                   null    ,
    PROGRESSIVO_TESO                NUMBER(5)              null    
        constraint LIQ_PROGRESSIVO_T_CC check (
            PROGRESSIVO_TESO is null or (PROGRESSIVO_TESO >= 0
            )),
    ANNO_DISTINTA                   NUMBER(4)              null    ,
    NUMERO_DISTINTA                 NUMBER(6)              null    ,
    ALIQUOTA_ADD                    NUMBER(5,3)            null    ,
    RITENUTE_ADD                    NUMBER(14,2)           null    
        constraint LIQ_RITENUTE_ADD_CC check (
            RITENUTE_ADD is null or (RITENUTE_ADD >= 0
            )),
    LIRE_EURO                       VARCHAR2(1)            null    
        constraint LIQ_LIRE_EURO_CC check (
            LIRE_EURO is null or (LIRE_EURO in ('L','E'))),
    PAGAMENTO_IN_EURO               VARCHAR2(2)            null    
        constraint LIQ_PAGAMENTO_IN__CC check (
            PAGAMENTO_IN_EURO is null or (PAGAMENTO_IN_EURO in ('SI'))),
    IMPORTO_EURO                    NUMBER(12,2)           null    ,
    RITENUTE_EURO                   NUMBER(12,2)           null    ,
    IMPONIBILE_EURO                 NUMBER(12,2)           null    ,
    IMPORTO_NON_SOG_EURO            NUMBER(12,2)           null    ,
    RITENUTE_IRPEF_EURO             NUMBER(12,2)           null    ,
    IMPONIBILE_SSN_EURO             NUMBER(12,2)           null    ,
    RITENUTE_SSN_EURO               NUMBER(12,2)           null    ,
    RITENUTE_SSN_CE_EURO            NUMBER(12,2)           null    ,
    IMPONIBILE_INPS_EURO            NUMBER(12,2)           null    ,
    RITENUTE_INPS_EURO              NUMBER(12,2)           null    ,
    RITENUTE_INPS_CE_EURO           NUMBER(12,2)           null    ,
    RITENUTE_ADD_EURO               NUMBER(12,2)           null    ,
    RITENUTE_CASSE_PROF             NUMBER(14,2)           null    ,
    RITENUTE_CASSE_PROF_EURO        NUMBER(12,2)           null    ,
    ALIQUOTA_ADD_COM                NUMBER(5,3)            null    ,
    RITENUTE_ADD_COM                NUMBER(14,2)           null    
        constraint LIQ_RITENUTE_ADDC_CC check (
            RITENUTE_ADD_COM is null or (RITENUTE_ADD_COM >= 0
            )),
    RITENUTE_ADD_COM_EURO           NUMBER(12,2)           null    ,
    COD_IMP_ECO                     VARCHAR2(16)           null    ,
    CODICE_INAIL                    NUMBER(2)              null    ,
    ALIQUOTA_INAIL                  NUMBER(5,3)            null    ,
    IMPONIBILE_INAIL                NUMBER(14,2)           null    ,
    RITENUTE_INAIL                  NUMBER(14,2)           null    ,
    RITENUTE_INAIL_CE               NUMBER(14,2)           null    ,
    IMPONIBILE_INAIL_EURO           NUMBER(12,2)           null    ,
    RITENUTE_INAIL_EURO             NUMBER(12,2)           null    ,
    RITENUTE_INAIL_CE_EURO          NUMBER(12,2)           null    ,
    TIPO_DISTINTA                   VARCHAR2(1)            null    
        constraint LIQ_TIPO_DISTINTA_CC check (
            TIPO_DISTINTA is null or (TIPO_DISTINTA in ('B','D','C','E','L'))),
    FINANZIAMENTO                   NUMBER(5)              null    ,
    SPESE                           NUMBER(1)              null    ,
    SCADENZA                        DATE                   null    ,
    ALLEGATI                        VARCHAR(150)           null    ,
    COMMISSIONI                     NUMBER(1)              null    ,
    INFO_TESORIERE                  VARCHAR2(200)          null    ,
    CODICE_GESTIONALE               NUMBER(4)              null    ,
    NOTE                            VARCHAR2(2000)         null    ,
    PROGRESSIVO_BOAC                NUMBER(9)              null    ,
    CIG                             VARCHAR2(15)           null    ,
    CUP                             VARCHAR2(15)           null    ,
    COD_LIVELLO_5                   NUMBER(10)             null    ,
    CODICE_EUROPEO                  NUMBER(1)              null    ,
    CODICE_COFOG                    NUMBER(3)              null    ,
    LIQ_PARZ                        VARCHAR2(2)            null    
        constraint LIQ_LIQ_PARZ_CC check (
            LIQ_PARZ is null or (LIQ_PARZ in ('SI'))),
    ANNO_LIQ_IVA                    NUMBER(4)              null    ,
    NUMERO_LIQ_IVA                  NUMBER(5)              null    ,
    ANNO_LIQ_RC                     NUMBER(4)              null    ,
    NUMERO_LIQ_RC                   NUMBER(5)              null    ,
    TIPO_REGISTRO_DEF               NUMBER(2)              null    ,
    TIPO_BOLLATO_DEF                NUMBER(2)              null    ,
    TIPO_REGISTRO_IST               NUMBER(2)              null    ,
    TIPO_BOLLATO_IST                NUMBER(2)              null    ,
    MOTIVO_ESCLUSIONE_CIG           VARCHAR2(50)           null    ,
    TIPO_DEBITO_SIOPE               VARCHAR2(20)           null    ,
    PROVENIENZA                     VARCHAR2(20)           null    ,
    NUMERO_AVVISO_PAGOPA            VARCHAR2(20)           null    ,
    ESERCIZIO_PROVV                 NUMBER(4)              null    ,
    PROGRESSIVO_PROVV               NUMBER(10)             null    ,
    PROGRESSIVO_PROV_DETT           NUMBER(4)              null    ,
    ESIGIBILITA_TRATTATA            VARCHAR2(2)            null    ,
    STIPENDI                        VARCHAR2(2)            null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint LIQ_PK primary key (ANNO_LIQ, NUMERO_LIQ)
)
/



-- ============================================================
--   Table: VARMAN                                             
-- ============================================================
create table VARMAN
(
    PROGRESSIVO                     NUMBER(10)             not null,
    CAPITOLO                        NUMBER(16)             not null,
    ARTICOLO                        NUMBER(2)              not null,
    ANNO_IMP                        NUMBER(4)              not null,
    NUMERO_IMP                      NUMBER(5)              not null,
    ANNO_LIQ                        NUMBER(4)              not null,
    NUMERO_LIQ                      NUMBER(5)              not null,
    ANNO_MAND                       NUMBER(4)              not null,
    NUMERO_MAND                     NUMBER(5)              not null,
    DATA_REG                        NUMBER(7)              not null,
    IMPORTO                         NUMBER(14,2)           not null,
    BENEFICIARIO                    NUMBER                 null    
        constraint VARMAN_BENEFICIARIO_CC check (
            BENEFICIARIO is null or (BENEFICIARIO >= 1
            )),
    DATA_MAND                       NUMBER(7)              null    ,
    VOCE_ECON                       NUMBER(2)              null    ,
    S                               VARCHAR2(1)            default 'S' not null,
    D_DATA_REG                      DATE                   default SYSDATE null    ,
    D_DATA_MAND                     DATE                   null    ,
    PROGRESSIVO_TESO                NUMBER(5)              null    ,
    NUM_QUIETANZA                   NUMBER(2)              null    ,
    RITENUTE                        NUMBER(14,2)           null    ,
    CODICE_GESTIONALE               NUMBER(4)              null    ,
    constraint VARMAN_PK primary key (PROGRESSIVO)
)
/


-- ============================================================
--   Table: VARORD                                             
-- ============================================================
create table VARORD
(
    PROGRESSIVO                     NUMBER(10)             not null,
    CAPITOLO                        NUMBER(16)             not null,
    ARTICOLO                        NUMBER(2)              not null,
    ANNO_ACC                        NUMBER(4)              not null,
    NUMERO_ACC                      NUMBER(5)              not null,
    ANNO_PRE                        NUMBER(4)              not null,
    NUMERO_PRE                      NUMBER(5)              not null,
    ANNO_ORD                        NUMBER(4)              not null,
    NUMERO_ORD                      NUMBER(5)              not null,
    DATA_REG                        NUMBER(7)              not null,
    IMPORTO                         NUMBER(14,2)           not null,
    DEBITORE                        NUMBER                 null    
        constraint VARORD_DEBITORE_CC check (
            DEBITORE is null or (DEBITORE >= 1
            )),
    DATA_ORD                        NUMBER(7)              null    ,
    VOCE_ECON                       NUMBER(2)              null    ,
    E                               VARCHAR2(1)            default 'E' not null,
    D_DATA_REG                      DATE                   default SYSDATE null    ,
    D_DATA_ORD                      DATE                   null    ,
    CODICE_GESTIONALE               NUMBER(4)              null    ,
    constraint VARORD_PK primary key (PROGRESSIVO)
)
/


-- ============================================================
--   Table: RETFAT                                             
-- ============================================================
create table RETFAT
(
    PROGRESSIVO                     NUMBER(10)             not null,
    DESCRIZIONE                     VARCHAR2(40)           null    ,
    IMPORTO                         NUMBER(14,2)           not null
        constraint RETFAT_IMPORTO_CC check (
            IMPORTO >= 0),
    D_DATA_REG                      DATE                   default SYSDATE not null,
    FAT_ANNO_PROG_FAT               NUMBER(4)              null    ,
    FAT_NUMERO_PROG_FAT             NUMBER(5)              null    ,
    FAT_ANNO_PROG_NAC               NUMBER(4)              null    ,
    FAT_NUMERO_PROG_NAC             NUMBER(5)              null    ,
    COD_REC                         VARCHAR2(1)            null    ,
    FATTORE                         VARCHAR2(16)           null    ,
    CENTRO                          VARCHAR2(16)           null    ,
    COMPETENZA_DAL                  DATE                   null    ,
    COMPETENZA_AL                   DATE                   null    ,
    IMPORTO_EURO                    NUMBER(12,2)           null    
        constraint RETFAT_IMPORTO_EURO_CC check (
            IMPORTO_EURO is null or (IMPORTO_EURO >= 0
            )),
    PROGETTO_ID                     VARCHAR2(9)            null    ,
    PROVENIENZA                     VARCHAR2(10)           null    ,
    IMPORTO_IVA                     NUMBER(14,2)           null    ,
    IMPORTO_IVA_IST                 NUMBER(14,2)           null    ,
    TIPO_REGISTRO_DEF               NUMBER(2)              null    ,
    TIPO_BOLLATO_DEF                NUMBER(2)              null    ,
    ID_MAN_INF                      NUMBER(10)             null    ,
    PROGRESSIVO_TESO                NUMBER(5)              null    ,
    ANNO_MAND                       NUMBER(4)              null    ,
    NUMERO_MAND                     NUMBER(5)              null    ,
    IMPORTO_MANINF                  NUMBER(14,2)           null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint RETFAT_PK primary key (PROGRESSIVO)
)
/



-- ============================================================
--   Table: TIPI_UTENZA                                        
-- ============================================================
create table TIPI_UTENZA
(
    CODICE                          VARCHAR2(2)            not null,
    BENEFICIARIO                    NUMBER                 not null,
    NUM_QUIETANZA                   NUMBER(2)              not null,
    DATA_ULTIMA_ELAB                DATE                   null    ,
    FATTORE                         VARCHAR2(16)           null    ,
    DESCRIZIONE                     VARCHAR2(50)           null    ,
    TIPO_TRACCIATO                  VARCHAR2(2)            null    ,
    CODICE_GESTIONALE               NUMBER(4)              null    ,
    CODICE_STAT                     VARCHAR2(3)            null    ,
    DATA_ULTIMA_ELAB_CONSUMI        DATE                   null    ,
    COD_IMP_ECO                     VARCHAR2(16)           null    ,
    CIG                             VARCHAR2(15)           null    ,
    CUP                             VARCHAR2(15)           null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    DATA_EMISS_NO_FILE              VARCHAR2(2)            null    
        constraint TIPI_UTENZA_DATA_EMISS_NO_CC check (
            DATA_EMISS_NO_FILE is null or (DATA_EMISS_NO_FILE in ('SI'))),
    COD_LIVELLO_5                   NUMBER(10)             null    ,
    CODICE_COFOG                    NUMBER(3)              null    ,
    CODICE_EUROPEO                  NUMBER(1)              null    ,
    constraint TIPI_UTENZA_PK primary key (CODICE)
)
/



-- ============================================================
--   Table: TESTATE_MUTUI                                      
-- ============================================================
create table TESTATE_MUTUI
(
    ANNO_MUTUO                      NUMBER(4)              not null
        constraint TESTATE_MUTUI_ANNO_MUTUO_CC check (
            ANNO_MUTUO between 1000 and 2999),
    NUMERO_MUTUO                    VARCHAR2(10)           not null,
    ISTITUTO                        NUMBER(6)              not null,
    CAUSALE                         VARCHAR2(100)          not null,
    NOTE                            VARCHAR2(2000)         null    ,
    ANNO_DEL                        NUMBER(4)              null    
        constraint TESTATE_MUTUI_ANNO_DEL_CC check (
            ANNO_DEL is null or (ANNO_DEL between 1000 and 2999
            )),
    NUMERO_DEL                      NUMBER(6)              null    ,
    SEDE_DEL                        VARCHAR2(255)          null    ,
    POSIZIONE_INTERNA               VARCHAR2(12)           null    ,
    CATEGORIA                       NUMBER(3)              null    ,
    TIPO_TASSO                      VARCHAR2(1)            not null
        constraint TESTATE_MUTUI_TIPO_TASSO_CC check (
            TIPO_TASSO in ('F','V')),
    TASSO_INIZIALE                  NUMBER(8,5)            not null,
    TASSO_ATTUALE                   NUMBER(8,5)            not null,
    SCONTO_TASSO                    NUMBER(8,5)            null    ,
    NUMERO_RATE                     NUMBER(4)              not null,
    TIPO_NUMERAZIONE_RATE           VARCHAR2(1)            not null
        constraint TESTATE_MUTUI_TIPO_NUMERAZI_CC check (
            TIPO_NUMERAZIONE_RATE in ('A','D')),
    NUMERO_QUOTE                    NUMBER(2)              null    
        constraint TESTATE_MUTUI_NUMERO_QUOTE_CC check (
            NUMERO_QUOTE is null or (NUMERO_QUOTE in (2,3,4,6,12))),
    TITOLARITA                      VARCHAR2(2)            null    
        constraint TESTATE_MUTUI_TITOLARITA_CC check (
            TITOLARITA is null or (TITOLARITA in ('SI'))),
    TIPO_PAGAMENTO                  VARCHAR2(1)            not null
        constraint TESTATE_MUTUI_TIPO_PAGAMENT_CC check (
            TIPO_PAGAMENTO in ('T','P','N')),
    TIPO_AMMORTAMENTO               VARCHAR2(1)            null    ,
    ANNO_INIZIO_AMMORTAMENTO        NUMBER(4)              null    
        constraint TESTATE_MUTUI_ANNO_INIZIO_A_CC check (
            ANNO_INIZIO_AMMORTAMENTO is null or (ANNO_INIZIO_AMMORTAMENTO between 1000 and 2999
            )),
    DATA_PRIMA_SCADENZA             DATE                   not null,
    PERIODICITA                     NUMBER(2)              not null
        constraint TESTATE_MUTUI_PERIODICITA_CC check (
            PERIODICITA in (1,2,3,4,6,12)),
    IMPORTO                         NUMBER(14,2)           not null
        constraint TESTATE_MUTUI_IMPORTO_CC check (
            IMPORTO >= 0),
    IMPORTO_EURO                    NUMBER(14,2)           null    
        constraint TESTATE_MUTUI_IMPORTO_EURO_CC check (
            IMPORTO_EURO is null or (IMPORTO_EURO >= 0
            )),
    IMPORTO_CONTRATTO               NUMBER(14,2)           not null
        constraint TESTATE_MUTUI_IMPORTO_CONTR_CC check (
            IMPORTO_CONTRATTO >= 0),
    IMPORTO_CONTRATTO_EURO          NUMBER(14,2)           null    
        constraint TESTATE_MUTUI_IMPEURO_CONTR_CC check (
            IMPORTO_CONTRATTO_EURO is null or (IMPORTO_CONTRATTO_EURO >= 0
            )),
    DATA_SCADENZA_PREAMM            DATE                   null    ,
    NUMERO_CONTRIBUTO               VARCHAR2(10)           null    ,
    DATA_CONTRIBUTO                 DATE                   null    ,
    CONTRIBUTO_DA_DETRARRE          VARCHAR2(2)            null    
        constraint TESTATE_MUTUI_CONTRIBUTO_DA_CC check (
            CONTRIBUTO_DA_DETRARRE is null or (CONTRIBUTO_DA_DETRARRE in ('SI'))),
    CONCORSO_STATO                  NUMBER(14,2)           null    
        constraint TESTATE_MUTUI_CONCORSO_STAT_CC check (
            CONCORSO_STATO is null or (CONCORSO_STATO >= 0
            )),
    CONCORSO_STATO_EURO             NUMBER(14,2)           null    
        constraint TESTATE_MUTUI_CONCEURO_STAT_CC check (
            CONCORSO_STATO_EURO is null or (CONCORSO_STATO_EURO >= 0
            )),
    LIRE_EURO                       VARCHAR2(1)            null    ,
    DATA_CONCESSIONE                DATE                   null    ,
    TIPO_CALCOLO                    VARCHAR2(1)            null    
        constraint TESTATE_MUTUI_TIPO_CALCOLO_CC check (
            TIPO_CALCOLO is null or (TIPO_CALCOLO in ('A','T','S'))),
    NUM_QUIETANZA                   NUMBER(2)              null    ,
    TIPO_MUTUO                      NUMBER(1)              null    ,
    SPREAD                          NUMBER(8,5)            null    ,
    CIG                             VARCHAR2(15)           null    ,
    CUP                             VARCHAR2(15)           null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint TESTATE_MUTUI_PK primary key (ANNO_MUTUO, NUMERO_MUTUO, ISTITUTO)
)
/



-- ============================================================
--   Index: TEMU_DEL_FK                                        
-- ============================================================
create index TEMU_DEL_FK on TESTATE_MUTUI (ANNO_DEL asc, NUMERO_DEL asc, SEDE_DEL asc)
/

-- ============================================================
--   Index: TEMU_IST_FK                                        
-- ============================================================
create index TEMU_IST_FK on TESTATE_MUTUI (ISTITUTO asc)
/

-- ============================================================
--   Index: TEMU_CMU_FK                                        
-- ============================================================
create index TEMU_CMU_FK on TESTATE_MUTUI (CATEGORIA asc)
/

-- ============================================================
--   Index: TEMU_POS_FK                                        
-- ============================================================
create index TEMU_POS_FK on TESTATE_MUTUI (POSIZIONE_INTERNA asc)
/

-- ============================================================
--   Index: TEMU_IMP_FK                                        
-- ============================================================
create index TEMU_IMP_FK on TESTATE_MUTUI (IMPORTO asc)
/

-- ============================================================
--   Table: TESTATE_ONERI                                      
-- ============================================================
create table TESTATE_ONERI
(
    PROGRESSIVO                     NUMBER(6)              not null,
    TIPO_ONERE                      NUMBER(2)              null    ,
    DEBITORE                        NUMBER                 null    ,
    DATA_INIZIO_CALC                DATE                   null    ,
    NUMERO_RATE                     NUMBER(2)              null    
        constraint TESTATE_ONERI_NUMERO_RATE_CC check (
            NUMERO_RATE is null or (NUMERO_RATE >= 0
            )),
    ANNO_ACC_UP                     NUMBER(4)              null    
        constraint TESTATE_ONERI_ANNO_ACC_UP_CC check (
            ANNO_ACC_UP is null or (ANNO_ACC_UP between 1900 and 2999
            )),
    NUM_ACC_UP                      NUMBER(5)              null    
        constraint TESTATE_ONERI_NUM_ACC_UP_CC check (
            NUM_ACC_UP is null or (NUM_ACC_UP >= 1
            )),
    ANNO_ACC_US                     NUMBER(4)              null    
        constraint TESTATE_ONERI_ANNO_ACC_US_CC check (
            ANNO_ACC_US is null or (ANNO_ACC_US between 1900 and 2999
            )),
    NUM_ACC_US                      NUMBER(5)              null    
        constraint TESTATE_ONERI_NUM_ACC_US_CC check (
            NUM_ACC_US is null or (NUM_ACC_US >= 1
            )),
    ANNO_ACC_CC                     NUMBER(4)              null    
        constraint TESTATE_ONERI_ANNO_ACC_CC_CC check (
            ANNO_ACC_CC is null or (ANNO_ACC_CC between 1900 and 2999
            )),
    NUM_ACC_CC                      NUMBER(5)              null    
        constraint TESTATE_ONERI_NUM_ACC_CC_CC check (
            NUM_ACC_CC is null or (NUM_ACC_CC >= 1
            )),
    SOGG_FIDEJU_PAGAM               NUMBER(6)              null    ,
    NOTE_FIDEJU_PAGAM               VARCHAR2(100)          null    ,
    SOGG_FIDEJU_RISARC              NUMBER(6)              null    ,
    NOTE_FIDEJU_RISARC              VARCHAR2(100)          null    ,
    SOSPESO                         VARCHAR2(2)            null    
        constraint TESTATE_ONERI_SOSPESO_CC check (
            SOSPESO is null or (SOSPESO in ('SI'))),
    NOTE                            VARCHAR(500)           null    ,
    constraint TESTATE_ONERI_PK primary key (PROGRESSIVO)
)
/



-- ============================================================
--   Index: TEON_TION_FK                                       
-- ============================================================
create index TEON_TION_FK on TESTATE_ONERI (TIPO_ONERE asc)
/

-- ============================================================
--   Index: TEON_BEN_FK                                        
-- ============================================================
create index TEON_BEN_FK on TESTATE_ONERI (DEBITORE asc)
/

-- ============================================================
--   Index: TEON_BEN_PAGAM_FK                                  
-- ============================================================
create index TEON_BEN_PAGAM_FK on TESTATE_ONERI (SOGG_FIDEJU_PAGAM asc)
/

-- ============================================================
--   Index: TEON_ACC_UP_FK                                     
-- ============================================================
create index TEON_ACC_UP_FK on TESTATE_ONERI (ANNO_ACC_UP asc, NUM_ACC_UP asc)
/

-- ============================================================
--   Index: TEON_ACC_US_FK                                     
-- ============================================================
create index TEON_ACC_US_FK on TESTATE_ONERI (ANNO_ACC_US asc, NUM_ACC_US asc)
/

-- ============================================================
--   Index: TEON_ACC_CC_FK                                     
-- ============================================================
create index TEON_ACC_CC_FK on TESTATE_ONERI (ANNO_ACC_CC asc, NUM_ACC_CC asc)
/

-- ============================================================
--   Index: TEON_BEN_RISARC_FK                                 
-- ============================================================
create index TEON_BEN_RISARC_FK on TESTATE_ONERI (SOGG_FIDEJU_RISARC asc)
/

-- ============================================================
--   Table: FINANZIAMENTI                                      
-- ============================================================
create table FINANZIAMENTI
(
    CODICE                          NUMBER(5)              not null
        constraint FINANZIAMENTI_CODICE_CC check (
            CODICE >= 1),
    DESCRIZIONE                     VARCHAR2(200)          not null,
    ENTE                            NUMBER(6)              null    ,
    ANNO_MUTUO                      NUMBER(4)              null    
        constraint FINANZIAMENTI_ANNO_MUTUO_CC check (
            ANNO_MUTUO is null or (ANNO_MUTUO between 1000 and 2999
            )),
    NUMERO_MUTUO                    VARCHAR2(10)           null    ,
    NOTE                            VARCHAR2(2000)         null    ,
    CATEGORIA                       NUMBER(3)              null    ,
    COD_ALLEGATO                    NUMBER(2)              null    ,
    IMPORTO_ORIG                    NUMBER(14,2)           null    ,
    TIPO_DURATA                     VARCHAR2(1)            null    
        constraint FINANZIAMENTI_TIPO_DURATA_CC check (
            TIPO_DURATA is null or (TIPO_DURATA in ('A','P'))),
    SCADENZA                        NUMBER(4)              null    
        constraint FINANZIAMENTI_SCADENZA_CC check (
            SCADENZA is null or (SCADENZA between 1000 and 2999
            )),
    COD_FIN_DISAV                   NUMBER(2)              null    ,
    SALDO_INI_CASSA                 NUMBER(14,2)           null    ,
    SALDO_INI_TESORERIA             NUMBER(14,2)           null    ,
    LEGGE_REG                       VARCHAR2(50)           null    ,
    CAPITOLO_REG                    VARCHAR2(50)           null    ,
    ATTO_ASS                        VARCHAR2(50)           null    ,
    DIPARTIMENTO                    VARCHAR2(150)          null    ,
    UTENTE_INSERIMENTO              VARCHAR2(8)            null    ,
    SETTORE_OPERATIVO               NUMBER(6)              null    ,
    SERVIZIO_OPERATIVO              NUMBER(6)              null    ,
    FLESSIBILITA                    VARCHAR2(4)            null    ,
    REND_AL_MEF                     VARCHAR2(2)            null    
        constraint FINANZIAMENTI_REND_AL_MEF_CC check (
            REND_AL_MEF is null or (REND_AL_MEF in ('SI'))),
    DATA_INSERIMENTO                DATE                   null    ,
    UTENTE_ULTIMO_AGG               VARCHAR2(8)            null    ,
    DATA_ULTIMO_AGG                 DATE                   null    ,
    constraint FINANZIAMENTI_PK primary key (CODICE)
)
/


