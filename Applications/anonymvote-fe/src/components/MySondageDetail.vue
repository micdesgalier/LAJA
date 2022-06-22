<template>
  <div class="detailMySondage">
    <div id="sondageStatus">
        <p>Ouvrir le sondage</p>
    </div>
    <p>Ajouter l'accès à un utilisateur : <input id="addUtilisateurSondage" type="text" /><button>Ajouter</button></p>
    <h1><input type="text" :value="sondage.sujet" id="sujet" name="sujet"/><button v-on:click="saveSondage()">S</button></h1>
    <edit-questions-item v-for="question in questions" v-bind:question="question" v-bind:key="question.id_question" v-on:saveQuestionValue="saveQuestion($event)" v-on:removeQuestion="removeQuestion($event)"/>
    <add-questions-item v-on:addQuestion="addQuestion()"/>
  </div>
</template>

<script>
import SondageService from '../store/modules/SondageService.js'
import EditQuestionsItem from './EditQuestionsItem.vue'
import AddQuestionsItem from './AddQuestionsItem.vue'


export default {
    name: 'MySondageDetail',
    data() {
		return {
			sondage: {},
            questions: []
		};
    },
    components: {
        EditQuestionsItem,
        AddQuestionsItem
    },
    methods: {
        getSondage(id) {
            SondageService.getSondageById(id)
            .then(data => {
                this.sondage = data;
                this.getQuestions(this.sondage.id_sondage);
            })
            .catch(err => console.log(err));
        },
        getQuestions(id) {
            SondageService.getQuestionsByIdSondage(id)
            .then(data => {
                data.forEach(element => {
                    this.questions.push(element);
                });
            })
            .catch(err => console.log(err));
        },
        saveSondage() {
            
            var sujet = document.getElementById("sujet").value;
            SondageService.saveSondage(this.$route.params.id, sujet);
        },
        saveQuestion(questionData) {
            
            this.questions.find(x => x.id_question === questionData[0]).question = questionData[1];
        },
        addQuestion() {

            SondageService.getLastQuestionId()
            .then(data => {

                var newId = data+1;

                var newQuestion = {
                    id_question: newId,
                    id_sondage: this.$route.params.id,
                    question: ""
                }

                this.questions.push(newQuestion);

                SondageService.addQuestion(newQuestion);
            })
            .catch(err => console.log(err));
        },
        removeQuestion(idQuestion) {

            let pos = this.questions.indexOf(this.questions.find(x => x.id_question === idQuestion))
            this.questions.splice(pos, 1);
        }
    },
    created() {
        this.getSondage(this.$route.params.id);
    }
}
</script>

<style scoped>
#addUtilisateurSondage {
  text-align: center;
  width: 20%;
  font-size: 20px;
}
#sujet {
  text-align: center;
  width: 40%;
  margin-bottom: 0;
  font-size: 25px;
}
#sondageStatus {
    width: 100%;
}
#sondageStatus p {
    padding: 0.5%;
    margin-left: 45%;
    margin-right: 45%;
    background-color: green;
    text-align: center;
    color: white;
}
button {
    margin-top: 1.6%;
    font-size: 15px;
    padding: 0.6%;
}
</style>