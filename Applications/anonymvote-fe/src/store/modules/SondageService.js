import axios from 'axios'
import router from '@/router'

class SondageService {

    static createSondage(idSondage, idUtilisateur) {

        var p_sondage = {
            id_utilisateur: idUtilisateur,
            sujet: "",
            ouvert: false,
            bloque: false
        }

        axios.post('http://localhost:9090/api/sondages', { id_utilisateur: p_sondage.id_utilisateur, sujet: p_sondage.sujet, ouvert: p_sondage.ouvert, bloque: p_sondage.bloque})
        .then(()=>{
            router.push({name: 'mysondage', params: { id: idSondage }});
        });
    }

    static sondagesOwnByUtilisateur(login) {

        const promise = axios.get('http://localhost:9090/api/sondages/utilisateur/' + login + '/my')
        
        const dataPromise = promise.then((response) => response.data)

        return dataPromise;
    }
    
    static sondagesUtilisateur(login) {
        
        const promise = axios.get('http://localhost:9090/api/sondages/utilisateur/' + login)
        
        const dataPromise = promise.then((response) => response.data)

        return dataPromise;
    }

    static getSondageById(id) {
        
        const promise = axios.get('http://localhost:9090/api/sondages/' + id)
        
        const dataPromise = promise.then((response) => response.data)

        return dataPromise;
    }

    static getQuestionById(id) {
        
        const promise = axios.get('http://localhost:9090/api/questions/' + id)
        
        const dataPromise = promise.then((response) => response.data)

        return dataPromise;
    }

    static getChoixById(id) {
        
        const promise = axios.get('http://localhost:9090/api/choix/' + id)
        
        const dataPromise = promise.then((response) => response.data)

        return dataPromise;
    }

    static getQuestionsByIdSondage(id) {
        
        const promise = axios.get('http://localhost:9090/api/sondages/' + id + '/questions')
        
        const dataPromise = promise.then((response) => response.data)

        return dataPromise;
    }

    static getChoixByIdQuestion(id) {
        
        const promise = axios.get('http://localhost:9090/api/questions/' + id + '/choix')
        
        const dataPromise = promise.then((response) => response.data)

        return dataPromise;
    }

    static saveSondage(idSondage, p_sujet) {
        
        var sondage;

        SondageService.getSondageById(idSondage)
          .then(data => {
            sondage = data;
            sondage.sujet = p_sujet
            
            axios.put('http://localhost:9090/api/sondages/' + idSondage, { id_utilisateur: sondage.id_utilisateur, sujet: sondage.sujet, ouvert: sondage.ouvert, bloque: sondage.bloque});
          })
          .catch(err => console.log(err));
    }

    static deleteSondage(idSondage) {

        axios.delete('http://localhost:9090/api/sondages/' + idSondage);
    }

    static deleteQuestion(idQuestion) {

        axios.delete('http://localhost:9090/api/questions/' + idQuestion);
    }

    static deleteChoix(idChoix) {

        axios.delete('http://localhost:9090/api/choix/' + idChoix);
    }

    static saveQuestion(idQuestion, p_idSondage, p_question) 
    {
        var question;

        SondageService.getQuestionById(idQuestion)
            .then(data => {
                question = data;
                question.id_sondage = p_idSondage;
                question.question = p_question;
                    
                axios.put('http://localhost:9090/api/questions/' + idQuestion, { id_sondage: question.id_sondage, question: question.question});
            })
            .catch(err => console.log(err));
    }

    static saveChoix(idChoix, p_choix) 
    {
        var choix;

        SondageService.getChoixById(idChoix)
            .then(data => {
                choix = data;
                choix.choix = p_choix;
                
                axios.put('http://localhost:9090/api/choix/' + choix.id_choix, { id_question: choix.id_question, choix: choix.choix, nb_choisi: choix.nb_choisi});
            })
            .catch(err => console.log(err));
    }

    static getLastSondageId() {

        const promise = axios.get('http://localhost:9090/api/sondages/lastid')
        
        const dataPromise = promise.then((response) => response.data)

        return dataPromise;
    }

    static getLastQuestionId() {

        const promise = axios.get('http://localhost:9090/api/questions/lastid')
        
        const dataPromise = promise.then((response) => response.data)

        return dataPromise;
    }

    static getLastChoixId() {

        const promise = axios.get('http://localhost:9090/api/choix/lastid')
        
        const dataPromise = promise.then((response) => response.data)

        return dataPromise;
    }

    static addQuestion(p_question)
    {
        axios.post('http://localhost:9090/api/questions', { id_question: p_question.id_question, id_sondage: p_question.id_sondage, question: p_question.question});
    }

    static addChoix(p_choix)
    {
        axios.post('http://localhost:9090/api/choix', { id_choix: p_choix.id_choix, id_question: p_choix.id_question, choix: p_choix.choix, nb_choisi: p_choix.nb_choisi});
    }
}

export default SondageService;