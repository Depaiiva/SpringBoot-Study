package depaiva.com.estudos.models;

public class User {
    private String nome;
    private String age;

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [nome=" + nome + ", age=" + age + "]";
    }    
}
