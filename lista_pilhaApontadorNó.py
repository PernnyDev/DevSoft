class No:
    def __init__(self, valor):
        self.valor = valor
        self.proximo = None


class Pilha:
    def __init__(self):
        self.topo = None

    def __pilha_vazia(self):
        return self.topo is None

    def empilhar(self, valor):
        novo = No(valor)
        novo.proximo = self.topo
        self.topo = novo

    def desempilhar(self):
        if self.__pilha_vazia():
            return None
        else:
            temp = self.topo
            self.topo = self.topo.proximo
            return temp.valor

    def mostrar_pilha(self):
        atual = self.topo
        while atual:
            print(atual.valor)
            atual = atual.proximo


pilha = Pilha()
pilha.empilhar(1)
pilha.empilhar(2)
pilha.empilhar(3)
pilha.empilhar(4)
pilha.desempilhar()
pilha.mostrar_pilha()
