#!/bin/bash
#Definimos la ruta de trabajo
ROOTDIR="/home/t1000/mc-api"
FILENAME="multichannel"
ENVIRONMENT="integration"

#Limpiamos la carpeta de los binarios obsoletos
cd $ROOTDIR
rm *.bkp|| true

#Realizo el BACKUP
mv nohup.out nohup.bkp || true
mv ${FILENAME}-*.jar ${FILENAME}_$(date +%d%m%Y).bkp || true

#Agregamos el numero de version al FILENAME
FILENAME_TMP=$FILENAME
FILENAME=$FILENAME-$(ls /home/t1000/mc-api-test/build/libs/ | grep 'api-[0-3]\.[0-9][0-9].jar$' | grep -o '[0-3]\.[0-9][0-9]').jar

#DEPLOY
echo "Comienzo el Deploy"
cp /home/t1000/mc-api-test/build/libs/*.jar $FILENAME && echo "Se realizo el DEPLOY"

#Permisos
chown --reference *.jar_$(date +%d%m%Y) $FILENAME || chown appuser:appuser $FILENAME
chmod --reference *.jar_$(date +%d%m%Y) $FILENAME || chmod 775 $FILENAME

#Reiniciamos el proceso
pkill -9 -f $FILENAME_TMP
nohup java -jar -Dgrails.env=$ENVIRONMENT -Dserver.port=443 $FILENAME &
