import axios from 'axios'
import router from '@/router'

class UtilisateurService {
    
    static login(login, password) {

        const params = new URLSearchParams([['login', login], ['password', password]]);

        axios.get('http://localhost:9090/api/tokens', {params})
            .then(res => {
                this.token = res.data;

                if(this.token != null)
                    router.push({name: 'main'});
            })
            .catch(err => console.log(err));
    }
}

export default UtilisateurService;