import java.time.LocalDate;
import java.lang.*;

public class Pessoa {
  private Long cpf;
  private String nome;
  private String email;
  private Integer dddTelefone;
  private Integer numTelefone;
  private LocalDate dataNascimento;

  public Long getCpf() {
    return this.cpf;
  }

  public String getNome() {
    return this.nome;
  }

  public String getEmail() {
    return this.email;
  }

  public Integer dddTelefone() {
    return this.dddTelefone;
  }

  public Integer numTelefone() {
    return this.numTelefone
  }

  public Integer dataNacimento() {
    return this.dataNacimento;
  }
}
