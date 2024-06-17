package com.example.demo;

public class DiscoService {
    // Supondo que você tenha uma lista de discos
    private List<Disco> discos;

    // Método para calcular o preço total dos discos
    public double calcularPrecoTotal() {
        double total = 0;
        for (Disco disco : discos) {
            total += disco.getPreco();
        }
        return total;
    }

    // Método para verificar se um disco está em estoque
    public boolean estaEmEstoque(int idDisco) {
        for (Disco disco : discos) {
            if (disco.getId() == idDisco && disco.getQuantidadeEmEstoque() > 0) {
                return true;
            }
        }
        return false;
    }
}

// Em CdService.java
public class CdService {
    // Supondo que você tenha uma lista de CDs
    private List<Cd> cds;

    // Método para calcular o preço total dos CDs
    public double calcularPrecoTotal() {
        double total = 0;
        for (Cd cd : cds) {
            total += cd.getPreco();
        }
        return total;
    }

    // Método para verificar se um CD está em estoque
    public boolean estaEmEstoque(int idCd) {
        for (Cd cd : cds) {
            if (cd.getId() == idCd && cd.getQuantidadeEmEstoque() > 0) {
                return true;
            }
        }
        return false;
    }
}