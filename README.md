# PeerPlay - Plataforma de Revisão Colaborativa de Vídeos 🎬

Este projeto é o backend da **PeerPlay**, uma plataforma voltada para revisão colaborativa de vídeos, permitindo que usuários comentem, compartilhem e colaborem em vídeos de forma prática e organizada.

## 🔧 Arquitetura

Utilizamos uma **Arquitetura Híbrida em Camadas** com boas práticas de **Domain-Driven Design (DDD)**, equilibrando rapidez no desenvolvimento com escalabilidade e organização a longo prazo.

### 🔍 Estilo Arquitetural

- **Separação em camadas** para manter clareza e responsabilidade de cada parte.
- **Modelagem rica de domínio**, com entidades que encapsulam regras de negócio.
- **Camada de infraestrutura desacoplada**, facilitando substituição de tecnologias externas.
- **Modularização por recurso** (ex: vídeos, comentários, projetos).

## 📁 Estrutura de Pastas

```
📂br.peerplay
│
├───📂presentation       -> // Código que interage com o mundo externo (controllers e handlers)
│   ├───📂videos         -> // Controllers de vídeos
│   ├───📂comments       -> // Controllers de comentários
│   ├───📂users          -> // Controllers de usuários
│   ├───📂review_links   -> // Controllers de links de compartilhamento
│   └───📂exceptionhandlers -> // Tratamento global de exceções
│
├───📂app                -> // Orquestra os casos de uso (ligação entre domain e infra)
│   ├───📂videos
│   │   ├───📂dtos       -> // Objetos de transferência de dados (entrada/saída)
│   │   └───📂services   -> // Serviços de aplicação (regras de orquestração)
│   ├───📂comments
│   │   ├───📂dtos
│   │   └───📂services
│   ├───📂users
│   │   ├───📂dtos
│   │   └───📂services
│   └───📂review_links
│       ├───📂dtos
│       └───📂services
│
├───📂domain             -> // Lógica de negócio pura
│   ├───📂entities       -> // Entidades ricas do domínio (ex: Video, Comment, User)
│   ├───📂valueobjects   -> // Objetos de valor (ex: Token, Timestamp)
│   ├───📂repositories   -> // Interfaces dos repositórios (sem implementação)
│   └───📂services       -> // Serviços de domínio com regras que envolvem múltiplas entidades
│
├───📂infra              -> // Implementações técnicas e integrações externas
│   ├───📂persistence    -> // Implementações dos repositórios (JPA, Hibernate)
│   ├───📂storage        -> // Código para acessar o AWS S3
│   ├───📂supabase       -> // Código para lidar com autenticação via Supabase
│   └───📂external       -> // Integrações com APIs de IA e outros serviços
│
└───📂config             -> // Classes de configuração
    ├───📂auth           -> // Configurações de segurança/autenticação
    ├───📂aws            -> // Configurações relacionadas ao AWS S3
    └───📂web            -> // Configurações Web: CORS, filtros, etc
```
**Obs.:** O esquema acima não necessariamente representa a real estrutura
do diretório. Alguns subdiretórios não estão sendo mostrados. Esta é apenas
uma visão geral da estrutura.