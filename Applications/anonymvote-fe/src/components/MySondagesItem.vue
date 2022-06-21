<template>
  <div class="myItemSondage">
    <router-link :to="{ name: 'mysondage', params: { id: sondage.id_sondage }}"><h3 :id="sondage.id_sondage">{{ sondage.sujet }}</h3></router-link>
    <div id="status">
        <div id="statusOuvert" v-if="sondage.ouvert">
            <p>OUVERT</p>
        </div>
        <div id="statusFerme" v-else>
            <p>FERME</p>
        </div>
    </div>
    <br>
  </div>
</template>

<script>
export default {
  name: 'MySondagesItem',
  props: {
    sondage: Object
  }
}
</script>

<style scoped>
h3 {
  margin-left: 5%;
  width: 25%;
  margin-bottom: 0;
  background-color: darkorange;
  padding: 0.9%;
  color: white;
  border: black solid 2px;
  display: inline-block !important;
}
#statusOuvert {
    background-color: green;
    padding: 0.6%;
    border: black solid 2px;
    margin-left: 5%;
}
#statusFerme {
    background-color: red;
    padding: 0.6%;
    border: black solid 2px;
    margin-left: 5%;
}
#status {
  display: inline-block;
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