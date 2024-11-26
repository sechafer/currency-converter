@echo off
REM Verificar si estamos en la raíz de currency-converter-main
if not exist "backend" (
    echo No estas en la raiz de currency-converter-main
    exit /b 1
)

REM Cambiar al directorio backend
cd backend

REM Ejecutar los comandos Maven en el backend en una nueva ventana de comando minimizada
echo Ejecutando mvn clean install en backend...
start /min cmd /k "mvn clean install"

REM Esperar un poco para asegurarse de que la primera ventana se abra
timeout /t 5

REM Ejecutar el siguiente comando en una nueva ventana de comando minimizada
echo Ejecutando mvn spring-boot:run en backend...
start /min cmd /k "mvn spring-boot:run"

REM Volver al nivel superior
cd ..

REM Cambiar al directorio frontend
cd frontend

REM Ejecutar los comandos Maven en el frontend en una nueva ventana de comando minimizada
echo Ejecutando mvn clean install en frontend...
start /min cmd /k "mvn clean install"

REM Esperar un poco para asegurarse de que la primera ventana se abra
timeout /t 5

REM Ejecutar el siguiente comando en una nueva ventana de comando minimizada
echo Ejecutando mvn javafx:run en frontend...
start /min cmd /k "mvn javafx:run"

REM Volver al nivel superior
cd ..

echo Todos los comandos se ejecutaron correctamente.
