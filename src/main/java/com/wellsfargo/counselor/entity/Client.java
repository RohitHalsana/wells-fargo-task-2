
@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private LocalDate createdAt;
    
    @ManyToOne
    @JoinColumn(name = "advisor_id", nullable = false)
    private FinancialAdvisor advisor;
    
    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    private Portfolio portfolio;
    
    public Client() {}
    
    public Client(String name, String email, String phone, LocalDate createdAt, FinancialAdvisor advisor) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.createdAt = createdAt;
        this.advisor = advisor;
    }
    
    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public LocalDate getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDate createdAt) { this.createdAt = createdAt; }
    public FinancialAdvisor getAdvisor() { return advisor; }
    public void setAdvisor(FinancialAdvisor advisor) { this.advisor = advisor; }
}
