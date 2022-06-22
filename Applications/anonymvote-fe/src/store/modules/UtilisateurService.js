import axios from 'axios'
import router from '@/router'
import Login from './Login.js'

class UtilisateurService {
    
    static login(login, password) {

        const params = new URLSearchParams([['login', login], ['password', password]]);

        axios.get('http://localhost:9090/api/connexion', {params})
            .then(res => {
                this.token = res.data;

                if(this.token != null) {
                    Login.login = login;
                    router.push({name: 'main'});
                } 
            })
            .catch(err => console.log(err));
    }

    static getUtilisateurByLogin(login) {

        const promise = axios.get('http://localhost:9090/api/utilisateurs/login/' + login)
        
        const dataPromise = promise.then((response) => response.data)

        return dataPromise;
    }
}

export default UtilisateurService;