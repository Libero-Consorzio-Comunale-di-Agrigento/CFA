REM  
REM  Creazione TableSpace
REM
REM  Argomenti:
REM  1 = Nome TableSpace
REM  2 = File TableSpace
REM  3 = Dim. TableSpace

create TableSpace &1 datafile '&2' size &3
/
exit
