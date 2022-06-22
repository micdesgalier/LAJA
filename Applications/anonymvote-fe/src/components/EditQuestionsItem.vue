<template>
  <div class="editQuestionItem">
      <h3><input type="text" :value="question.question" :id="'question'+question.id_question" class="question"/><button v-on:click="saveQuestion(question.id_question)">S</button><br><br><button v-on:click="deleteQuestion(question.id_question)">SUPPRIMER</button></h3>
      <div class="choixSection">
        <edit-choix-item v-for="choix in choixList" v-bind:choix="choix" v-bind:key="choix.id_choix" v-on:removeChoix="removeChoix($event)"/>
        <add-choix-item v-on:addChoix="addChoix(question.id_question)"/>
      </div>
  </div>
</template>

<script>
import EditChoixItem from './EditChoixItem.vue'
import AddChoixItem from './AddChoixItem.vue'
import SondageService from '../store/modules/SondageService.js'

export default {
  name: 'EditQuestionsItem',
  components: {
    EditChoixItem,
    AddChoixItem
  },
  data() {
	return {
        choixList: []
	};
  },
  props: {
    question: Object,
  },
  methods: {
    getChoix(id) {
      SondageService.getChoixByIdQuestion(id)
        .then(data => {
            data.forEach(element => {
              this.choixList.push(element);
            });
        })
        .catch(err => console.log(err));
    },
    saveQuestion(idQuestion) {

      var question = document.getElementById('question'+idQuestion).value

      var emitData = []; 
      
      emitData.push(idQuestion);
      emitData.push(question);

      this.$emit('saveQuestionValue', emitData);

      SondageService.saveQuestion(idQuestion, this.$route.params.id, question);
    },
    addChoix(idQuestion) {
      
      SondageService.getLastChoixId()
          .then(data => {

              var newId = data+1;

              var newChoix = {
                  id_choix: newId,
                  id_question: idQuestion,
                  choix: "",
                  nb_choisi: 0
              }

              this.choixList.push(newChoix);

              SondageService.addChoix(newChoix);
          })
          .catch(err => console.log(err));
    },
    deleteQuestion(id) {
        
      SondageService.deleteQuestion(id);
      this.$emit('removeQuestion', id);
    },
    removeChoix(idChoix) {
      let pos = this.choixList.indexOf(this.choixList.find(x => x.id_choix === idChoix))
      this.choixList.splice(pos, 1);
    }
  },
  created() {
    this.getChoix(this.question.id_question);
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin-left: 27%;
  margin-right: 27%;
  margin-bottom: 0;
  background-color: darkorange;
  padding: 0.8%;
  color: white;
  border: black solid 2px;
}
.editQuestionItem {
  margin-top: 2%;
}
input {
  text-align: center;
  width: 90%;
  margin-bottom: 0;
  font-size: 18px;
}
.choixSection {
  background-color: darkorange;
  margin-left: 27%;
  margin-right: 27%;
  border: black solid 2px;
  padding-bottom: 1%;
  padding-top: 1%;
}
ul {
  list-style-type: none;
  padding: 0;
  margin: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>