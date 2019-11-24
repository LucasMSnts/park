class App {
    constructor() {
        this.teste = [];

        this.logar = document.getElementById('loga');
        this.inputEl = document.querySelector('input[name=cnpj]');

        this.registerHandlers();
    }

    registerHandlers() {
        this.logar.onsubmit = event => this.addRepository(event);        
    }

    async addRepository(event) {
        event.preventDefault();

        const Input = this.inputEl.value;

        if (Input.lenght === 0) return;

        try {
            const response = await axios.get(`http://localhost:8080/estacionamentos/`);

            const { cnpj } = response.data;
            
            this.teste.push({
                cnpj
            });

            this.inputEl.value = '';

            this.render();
        } catch (err) {
            alert('O repositório não existe!');
        }
    }

    render() {
       console.log(this.teste)
    }
}

new App();