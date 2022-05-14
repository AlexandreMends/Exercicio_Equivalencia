package inatel.cdg.br.Empresario;

    public abstract class Empresario implements Comparable<Empresario>{
        protected String nome;
        protected Double preco;

        public Empresario (String nome,Double preco){
           this.nome = nome;
           this.preco = preco;
        }
        public String nome(){
        return nome;
        }
        public double preco(){
            return preco;
        }
        public void info(){
            System.out.println("Nome: " + nome+" preco: " + preco);
        }

        public String getNome() {
            return nome;
        }

        public Double getPreco() {
            return preco;
        }

        @Override
        public int compareTo(Empresario o){
          if (this.preco < getPreco()) return 1;
          else if (this.preco > o.getPreco()) return -1;
          return 0;
        }

    }
