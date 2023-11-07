package estudopilha;

public class PilhaDinamica {
	No topo;
	int tam;
	
	PilhaDinamica() {
		topo = null;
		tam = 0;

	}
	
	void empilhar(int info) {
		
		No no = new No();
		no.info = info;
		no.prox = topo;
		tam++;
		topo = no;	
	}
	void exibirPilha() {
		No aux = topo;
		
		while(aux!=null) {
			System.out.println("Info = " +aux.info);
			aux = aux.prox;
		}
	
	}
	
	void desempilhar() {
		if(tam > 0) {
		System.out.println("O "+topo.info+" foi desempilhado.");
		topo = topo.prox;
		tam--;
	}
		else {
			System.out.println("Pilha vazia.");
		}
	}
	void exibirTopo() {
		System.out.println("O topo da pilha é: "+topo.info);
	}
	
	void exibirTam() {
		System.out.println("O tamanho da pilha é: "+tam);
	}
}

