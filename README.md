# Sobrescrita
## Descrição
Esse código exemplifica a instanciação de classes em uma estrutura de herança que utiliza de Sobrescrita. O código foi escrito na linguagem Java utilizando a IDE NetBeans na versão 8.2. Esse projeto foi construido durante uma aula sobre Sobrecarga de métodos com a finalidade de colocar em prática os conceitos teóricos vistos em sala.
## Uso no Java
Estando na classe principal Zoológico, você pode instanciar um objeto das demais classes presentes no projeto, sendo Mamífero, Anfíbio ou mesmo da superclasse Animal. Cada classe filha de Animal altera um método de sua classe, ou seja, para que a visualização de seu funcionamento seja eficiente, é recomendado a instanciação de diferentes objetos de diferentes classes.
```java
Anfíbio animal = new Anfíbio("Anura", "Verde", 1, true, false, 12.5f);

animal.exibirDadosAnimal();
animal.alimentarAnimal("mosca");
```
