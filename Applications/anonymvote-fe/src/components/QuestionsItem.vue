<template>
  <div class="questionItem">
    <h3>{{ question.question }}</h3>
    <div class="choixSection">
        <choix-item v-for="choix in choixList" v-bind:choix="choix" v-bind:key="choix.id_choix"/>
    </div>
  </div>
</template>

<script>
import ChoixItem from './ChoixItem.vue'
import SondageService from '../store/modules/SondageService.js'

export default {
  name: 'QuestionsItem',
  components: {
    ChoixItem
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
.questionItem {
  margin-top: 2%;
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