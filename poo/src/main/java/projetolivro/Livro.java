package projetolivro;

public abstract class Livro implements Publicacao {
	
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public String detalhes() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", totPaginas=" + totPaginas + ", pagAtual=" + pagAtual
				+ ", aberto=" + aberto + ", leitor=" + leitor + "]";
	}
	public Livro(String titulo, String autor, int totPaginas, int pagAtual, boolean aberto, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.pagAtual = pagAtual;
		this.aberto = aberto;
		this.leitor = leitor;
	}

	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean getAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
 
	
	}

	
	

