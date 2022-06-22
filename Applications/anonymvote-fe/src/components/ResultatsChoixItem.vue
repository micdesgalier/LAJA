<template>
  <div class="itemChoix">
    <h4 :id="choix.id_choix">{{ choix.choix }}</h4>
  </div>
</template>

<script>
export default {
  name: 'ResultatsChoixItem',
  props: {
    choix: Object
  }
}
</script>

<style scoped>
h4 {
  margin-top: 0;
  margin-bottom: 0;
  padding: 0.8%;
  margin-left: 5%;
  margin-right: 5%;
  background-color: #FBE5D5;
  border: black solid 1px;
}
input {
  float: right;
}
</style>