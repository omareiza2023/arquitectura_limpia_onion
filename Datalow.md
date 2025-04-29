# ElectroCorhuila – Backend (Arquitectura Limpia / Onion)

Proyecto backend para la empresa de servicios públicos **ElectroCorhuila**.  
Este sistema permite la **creación de usuarios** y la **definición de tarifas** según el **estrato socioeconómico**.

## 🧱 Arquitectura Limpia (Onion Architecture)

El proyecto sigue la arquitectura en capas (Onion Architecture), separando claramente la lógica de negocio, infraestructura y puntos de entrada.

### 📘 Flujo de Datos

```text
[Client HTTP Request]
        |
        v
┌────────────────────────────┐
│  Interfaces (Controllers) │  ←— Punto de entrada (REST API)
└────────────────────────────┘
        |
        v
┌────────────────────────────┐
│  Application (Use Cases)  │  ←— Lógica de negocio orquestada
│  - CrearUsuario           │
│  - DefinirTarifa          │
└────────────────────────────┘
        |
        v
┌────────────────────────────┐
│  Domain (Entities + Repo) │  ←— Entidades centrales + abstracciones
│  - Usuario, Tarifa         │
│  - UsuarioRepository       │
│  - TarifaRepository        │
└────────────────────────────┘
        |
        v
┌──────────────────────────────┐
│ Infrastructure (Adapters)   │  ←— Implementaciones técnicas (JPA, etc)
│ - UsuarioRepositoryImpl      │
│ - TarifaRepositoryImpl       │
│ - UsuarioEntity, TarifaEntity│
└──────────────────────────────┘
        |
        v
[Base de Datos]

