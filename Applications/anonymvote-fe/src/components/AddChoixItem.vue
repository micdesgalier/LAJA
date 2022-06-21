<template>
  <div class="AddItemChoix">
    <h4><button v-on:click="$emit('addChoix')">AJOUTER UN CHOIX</button></h4>
  </div>
</template>

<script>
export default {
  name: 'AddChoixItem'
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
</style>