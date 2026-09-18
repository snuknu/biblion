package snuknu.biblion.modules.autor;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.Objects;

@Entity
@Table(name = "Autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long AutorId;

    @NotBlank
    private String nome;

    @NotBlank
    @Column(unique = true, nullable = false)
    private String url;

    public Autor() {
    }

    public Autor(Long autorId, String nome, String url) {
        AutorId = autorId;
        this.nome = nome;
        this.url = url;
    }

    public Long getAutorId() {
        return AutorId;
    }

    public void setAutorId(Long autorId) {
        AutorId = autorId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public int hashCode() {
        return Objects.hash(AutorId, nome, url);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(AutorId, autor.AutorId) && Objects.equals(nome, autor.nome) && Objects.equals(url, autor.url);
    }
}
