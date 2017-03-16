# Sensor POJOs

Esta librería de clases contiene el API a utilizar para el intercambio de datos entre una aplicación
Java y la plataforma IoT desarrollada en **WeDeploy**.

Simplemente con importar la dependencia con esta librería, se podrán utilizar las clases relacionadas
con el envío de métricas desde un sensor (por ejemplo un dispositivo móvil) a la plataforma IoT.

## Modo de uso

El siguiente bloque de código muestra cómo instanciar un objeto del tipo `Metric`, populando sus campos
con los valores requeridos por la plataforma IoT.

```java
Metric metric = new SensorMetric(
    uniqueDeviceId, "sensors-android", currentLocation.getLatitude(),
    currentLocation.getLongitude(), speed, "speed", "km/h", new Date().getTime());
```