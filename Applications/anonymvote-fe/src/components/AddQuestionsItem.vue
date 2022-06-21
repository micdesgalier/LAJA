<template>
  <div class="addQuestionItem">
      <h3><button v-on:click="$emit('addQuestion')">AJOUTER UNE QUESTION</button></h3>
  </div>
</template>

<script>
export default {
  name: 'AddQuestionsItem'
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
.addQuestionItem {
  margin-top: 2%;
}
</style>