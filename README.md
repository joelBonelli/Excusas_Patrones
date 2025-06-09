# 📌 Sistema de Gestión de Excusas

Este repositorio contiene una aplicación que simula el flujo de gestión de excusas laborales dentro de una organización jerárquica. El sistema permite a los empleados generar excusas que son evaluadas por distintos niveles de autoridad (Recepcionista, Supervisor, Gerente de Recursos Humanos y CEO), utilizando patrones de diseño para modular la lógica y mejorar la escalabilidad del sistema.

---

## ✅ Funcionalidades Principales

- Generación de excusas por parte de los empleados.
- Evaluación automática de excusas por una cadena de responsables.
- Resolución de excusas basada en estrategias de comportamiento.
- Notificación automática de nuevas excusas a los CEOs.
- Gestión centralizada de prontuarios mediante una instancia única.

---

## 1 – Diagrama de Casos de Uso

```mermaid
%%{init: {'theme': 'default'}}%%
graph TB
    Empleado -->|Genera| UC1[Generar Excusa]
    UC1 --> UC2[Evaluar Excusa]

    Recepcionista --> UC2
    Supervisor["Supervisor de Área"] --> UC2
    Gerente["Gerente de HR"] --> UC2
    CEO --> UC2

    UC2 -->|include| UC3[Resolver Excusa]

    Recepcionista --> UC3
    Supervisor --> UC3
    Gerente --> UC3

    CEO --> UC4[Generar Prontuario]
    CEO --> UC5[Notificar a CEOs]
````

## 3 – Justificación de Patrones de Diseño

### 3.1 – Chain of Responsibility

**Clases:** `Encargado`, `Recepcionista`, `Gerente de Recursos Humanos`, `Supervisor de Área`, `CEO`.

Este patrón permite que una excusa pase por una cadena de jerarquías hasta que algún responsable la procese o se rechace.

**Participantes:**
- `AbstractHandler`: Encargado  
- `ConcreteHandler`: Recepcionista, Supervisor de Área, Gerente de HR, CEO  
- `Cliente`: Empleado (al generar la excusa)

---

### 3.2 – Strategy

**Clases:** `Normal`, `Vago`, `Productivo`. Se implementa una estrategia de resolución.

Este patrón permite aplicar diferentes criterios de validación de excusas según el tipo de resolución.

**Participantes:**
- `Contexto`: modoDeResolver  
- `Estrategia (interfaz)`: Resolvible  
- `EstrategiaConcreta`: Normal, Vago, Productivo

---

### 3.3 – Observer

**Clases:** `CEO`, `Observador (interface)`, `AdministraciónProntuario`, `Prontuario`, `Admin (abstract)`, `Observable (interface)`.

Al crearse un nuevo prontuario, el sistema notifica a ciertos usuarios (CEOs) mediante el envío de un email.

**Participantes:**
- `Subject (Interface)`: Observable  
- `ConcreteSubject`: AdministradorProntuario  
- `Observer (Interface)`: Observador  
- `ConcreteObserver`: CEO  
- `Clase asociada a CEO`: Prontuario  
- `Clase abstracta`: Admin (implementa Observable)

---

### 3.4 – Singleton

**Clase:** `AdministradorProntuario`

Hay una instancia única que maneja las notificaciones y la lista de CEOs.
