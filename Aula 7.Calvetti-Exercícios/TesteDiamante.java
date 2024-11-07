interface A {
    default String funcao() {
        return "Classe A";
    }
}

interface B extends A {
    default String funcao() {
        return "Classe B";
    }
}

interface C extends A {
    default String funcao() {
        return "Classe C";
    }
}

class D implements B, C {
    // Precisa resolver o conflito de implementação
    @Override
    public String funcao() {
        return B.super.funcao(); // Ou C.super.funcao() para escolher qual método usar
    }
}

// Classe principal para testes
public class TesteDiamante {
    public static void main(String[] args) {
        D d = new D();
        System.out.println(d.funcao()); // Exibe o resultado da implementação escolhida
    }
}
