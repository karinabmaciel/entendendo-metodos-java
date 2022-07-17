# Entendendo Métodos Java
## Métodos Estáticos
* Métodos estáticos pertecem a classe

```
public class Calculadora {

    public static void soma(double numero1, double numero2) {
            double resultado = numero1 + numero2;
    
            System.out.println("a soma de " + numero1 + " mais " + numero2 + " é " + resultado);
            
        }
    
}

```
## Métodos da Classe

* Métodos da classe pertencem a instância

```
public class Calculadora {

    public void soma(double numero1, double numero2) {
            double resultado = numero1 + numero2;
    
            System.out.println("a soma de " + numero1 + " mais " + numero2 + " é " + resultado);
            
        }
    
}

```

## Exemplos

* static

```
public class Main {
    public static void main(String[] args) {

        Calculadora.soma(3.0, 5.0);
        
    }
}
```

* instância

```
public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.somar(5, 10);
        
    }
}
```