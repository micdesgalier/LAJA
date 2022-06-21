<template>
  <div class="EditItemChoix">
    <h4 :id="choix.id_choix"><input type="text" :value="choix.choix" :id="'choix'+choix.id_choix" class="choix"/><button v-on:click="saveChoix(choix.id_choix)">S</button></h4>
  </div>
</template>

<script>
import SondageService from '../store/modules/SondageService.js'

export default {
  name: 'EditChoixItem',
  props: {
    choix: Object
  },
  methods: {
    saveChoix(idChoix) {

      var choix = document.getElementById('choix'+idChoix).value;
      SondageService.saveChoix(idChoix, choix);
    } 
  },
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
  text-align: center;
  width: 70%;
  margin-bottom: 0;
  font-size: 18px;
}
</style>