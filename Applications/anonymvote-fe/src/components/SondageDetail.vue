<template>
  <div class="detailSondage">
    <h1>{{this.sondage.sujet}}</h1>
    <questions-item v-for="question in questions" v-bind:question="question" v-bind:key="question.id_question"/>
    <button v-on:click="saveReponses()">Enregistrer</button>
  </div>
</template>

<script>
import SondageService from '../store/modules/SondageService.js'
import QuestionsItem from './QuestionsItem.vue'

export default {
  name: 'SondageDetail',
  data() {
		return {
			sondage: {},
      questions: []
		};
	},
  components: {
    QuestionsItem
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
    saveReponses() {
        this.questions.forEach(element => {
          SondageService.getChoixByIdQuestion(element.id_question)
            .then(data => {
              data.forEach(element2 => {

                var checkedChoix = document.getElementById('choix'+element2.id_choix).checked

                console.log(checkedChoix);
                
                //if(checkedChoix) {
                  //SondageService.voteChoix(element2.id_choix);
                //}
              });
            })
            .catch(err => console.log(err));
        });
    }
  },
  created() {
    this.getSondage(this.$route.params.id);
  }
}
</script>