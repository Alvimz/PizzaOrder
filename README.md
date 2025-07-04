
# HTTP Listener + Builder

Applying my acknowledgments on this project using Java!





## Objective

Apply this pattern down bellow! 

[Builder article](https://refactoring.guru/design-patterns/builder)




## Payload POSTMAN
```bash
{
  "id": 211,
  "itens": [
    { "type": 1, "id": 1, "qnt": 1 },
    { "type": 2, "id": 2, "qnt": 1 },
    { "type": 2, "id": 1, "qnt": 1 },
    { "type": 1, "id": 1, "qnt": 3 }
  ],
  "client": 101,
  "paymentMethod": 1,
  "valuePayment": 61,
  "restaurant": 1,
  "note": "troco para 100",
  "tip": 25
}

```
## Improvements and TODOS

- Fix and use Enums on PaymentMethod (Order class)
- Add more response codes to Postman!
- Sanitization on HTTP payload.
- Developments patterns.
- Implement PaymentMethods.
- Logger.

## 

DBFake: Simulates a DB!
## UMLS
I'll add the others soon...

![App Screenshot](https://i.imgur.com/FIyy1zV.png)

