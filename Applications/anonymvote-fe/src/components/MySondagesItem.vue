<template>
  <div class="myItemSondage">
    <router-link :to="{ name: 'mysondage', params: { id: sondage.id_sondage }}"><h3 :id="sondage.id_sondage">{{ sondage.sujet }}</h3></router-link>
        <div id="statusOuvert" v-if="sondage.ouvert && sondage.bloque">
            <p>OUVERT</p>
        </div>
        <div id="statusConfig" v-else-if="sondage.ouvert != true && sondage.bloque != true">
            <p>CONFIG</p>
        </div>
        <div id="statusFerme" v-else-if="sondage.ouvert != true && sondage.bloque">
            <p>FERME</p>
        </div>
    <div class="resultatsOn" v-if="sondage.ouvert != true && sondage.bloque">
        <router-link :to="{ name: 'resultats', params: { id: sondage.id_sondage }}"><p>RESULTATS</p></router-link>
    </div>
    <div class="resultatsOff" v-else>
        <router-link :to="{ name: 'resultats', params: { id: sondage.id_sondage }}"><p>RESULTATS</p></router-link>
    </div>
    <div class="delete" v-on:click="deleteSondage(sondage.id_sondage)">
        <p>SUPPRIMER</p>
    </div>
    <br>
  </div>
</template>

<script>
import SondageService from '../store/modules/SondageService.js'

export default {
  name: 'MySondagesItem',
  props: {
    sondage: Object
  },
  methods: {
    deleteSondage(id) {
        
        SondageService.deleteSondage(id)
        this.$emit('removeSondage', id);
    }
  }
}
</script>

<style scoped>
h3 {
  margin-left: 30%;
  width: 25%;
  margin-bottom: 0;
  background-color: darkorange;
  padding: 0.9%;
  color: white;
  border: black solid 2px;
  display: inline-block !important;
}
#statusOuvert {
    display: inline-block;
    background-color: green;
    border: black solid 2px;
    margin-left: 2%;
}
#statusConfig {
    display: inline-block;
    background-color: darkmagenta;
    border: black solid 2px;
    margin-left: 2%;
}
#statusFerme {
    display: inline-block;
    background-color: red;
    border: black solid 2px;
    margin-left: 2%;
}
#status {
  display: inline-block;
}
.delete {
  display: inline-block;
  background-color: red;
  border: black solid 2px;
  margin-left: 2%;
}
.resultatsOn {
  display: inline-block;
  background-color: darkorange;
  border: black solid 2px;
  margin-left: 2%;
}
.resultatsOff {
  display: inline-block;
  background-color: gray;
  border: black solid 2px;
  margin-left: 2%;
}
.myItemSondage {
    width: 75%;
}
p {
    color: white;
    font-size: 12px;
    margin-top: 14px;
    margin-bottom: 11px;
    width: 100px;
}
</style>