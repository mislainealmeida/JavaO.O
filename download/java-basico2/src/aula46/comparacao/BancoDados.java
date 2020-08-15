package aula46.comparacao;

public interface BancoDados extends SqlDCL, SqlDML, SqlDDL{
	void abrirConexao();
	void fecharConexao();
	

}
