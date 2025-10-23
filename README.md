+-------------------+           +-------------------+
|     Category      |<>---------|     Product       |
+-------------------+           +-------------------+
| - name: String    |           | - name: String    |
| - description: String |       | - price: double   |
+-------------------+           +-------------------+
| +getInfo(): String|           | +getInfo(): String|
+-------------------+           +-------------------+

          (Aggregation)
             (1)             (*)


+-------------------+           +-------------------+
|     Customer      |-----------|      Order        |
+-------------------+           +-------------------+
| - name: String    |           | - date: String    |
| - email: String   |           | - total: double   |
+-------------------+           +-------------------+
| +placeOrder(): void|          | +addProduct(p: Product): void |
+-------------------+           | +getInfo(): String |
                                +-------------------+

         (Association)            (Composition)
              (1)                      (1)----(*) Products
