package aula46.comparacao;

public interface SqlDDL {

	void create (String query);
	void alter (String query);
	void drop (String query);
}
