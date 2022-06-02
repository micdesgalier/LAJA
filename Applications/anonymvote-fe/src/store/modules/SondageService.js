import axios from 'axios'
//import router from '@/router'

class SondageService {
    
    static sondagesUtilisateur(login) {

        const params = new URLSearchParams([['login', login]]);

        axios.get('http://localhost:9090/api/sondages/utilisateur', {params})
            .then(res => {
                this.sondagesList = res.data;

                if(this.sondagesList != null)
                {
                    alert("test");
                    //return this.sondagesList;
                } 
            })
            .catch(err => console.log(err));
    }
}

export default SondageService;