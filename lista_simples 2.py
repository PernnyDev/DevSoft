class No:
    def __init__(self, valor):
        self.valor = valor
        self.proximo = None


class ListaSimplesmenteEncadeada:
    def __init__(self):
        self.primeiro = None

    def __lista_vazia(self):
        return self.primeiro is None

    def inserir_inicio(self, valor):
        novo = No(valor)
        novo.proximo = self.primeiro
        self.primeiro = novo

    def inserir_final(self, valor):
        novo = No(valor)
        if self.__lista_vazia():
            self.primeiro = novo
        else:
            atual = self.primeiro
            while atual.proximo:
                atual = atual.proximo
            atual.proximo = novo

    def remover_inicio(self):
        if self.__lista_vazia():
            return None
        else:
            temp = self.primeiro
            self.primeiro = self.primeiro.proximo
            return temp.valor

    def mostrar_lista(self):
        atual = self.primeiro
        while atual:
            print(atual.valor)
            atual = atual.proximo


lista = ListaSimplesmenteEncadeada()
lista.inserir_inicio(1)
lista.inserir_final(2)
lista.inserir_final(3)
lista.inserir_final(4)
lista.remover_inicio()
lista.mostrar_lista()
