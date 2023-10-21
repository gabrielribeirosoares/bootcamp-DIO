Santander dev-week 2023

## Diagrama de classes

```mermaid
classDiagram
    class User {
        - name: string
        - account: Account
        - features: Features
        - card: Card
        - news: News
    }

    class Account {
        - accountNumber: string
        - accountAgency: string
        - accountBalance: float
        - accountLimit: float
    }

    class Features {
        - icon: string
        - description: string
    }

    class Card {
        - number: string
        - limit: float
    }

    class News {
        - icon: string
        - description: string
    }

    User --> Account
    User --> Features
    User --> Card
    User --> News
```
