package reis.gravata.reis.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Size(min = 3, max = 255)
    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    @NotNull
    @PositiveOrZero
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal preco;

    @NotNull
    @PositiveOrZero
    @Column(nullable = false)
    private Integer quantidadeEstoque;

    // Caracteristicas do produto

    @Size(max = 100)
    private String modelo;

    @PositiveOrZero
    @Column(precision = 5, scale = 2)
    private BigDecimal largura;

    @PositiveOrZero
    @Column(precision = 6, scale = 2)
    private BigDecimal comprimento;

    @Size(max = 100)
    private String cor;

    @Size(max = 100)
    private String textura;

    @Size(max = 100)
    private String desenho;

    @Size(max = 255)
    private String composicao;

    @Size(max = 100)
    private String linha;

    // Relacionamento com Subcategoria

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subcategoria_id")
    private SubCategoria subcategoria;

    // Construtores

    public Produto() {
    }

    public Produto(
            String name,
            String descricao,
            BigDecimal preco,
            Integer quantidadeEstoque,
            String modelo,
            BigDecimal largura,
            BigDecimal comprimento,
            String cor,
            String textura,
            String desenho,
            String composicao,
            String linha,
            SubCategoria subcategoria
    ) {
        this.name = name;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.modelo = modelo;
        this.largura = largura;
        this.comprimento = comprimento;
        this.cor = cor;
        this.textura = textura;
        this.desenho = desenho;
        this.composicao = composicao;
        this.linha = linha;
        this.subcategoria = subcategoria;
    }

    // Getters e Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public BigDecimal getLargura() {
        return largura;
    }

    public void setLargura(BigDecimal largura) {
        this.largura = largura;
    }

    public BigDecimal getComprimento() {
        return comprimento;
    }

    public void setComprimento(BigDecimal comprimento) {
        this.comprimento = comprimento;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    public String getDesenho() {
        return desenho;
    }

    public void setDesenho(String desenho) {
        this.desenho = desenho;
    }

    public String getComposicao() {
        return composicao;
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public SubCategoria getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(SubCategoria subcategoria) {
        this.subcategoria = subcategoria;
    }
}
