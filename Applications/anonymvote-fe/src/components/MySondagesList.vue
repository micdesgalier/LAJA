<template>
  <div class="myListSondages">
    <my-sondages-item v-for="sondage in sondages" v-bind:sondage="sondage" v-bind:key="sondage.id_sondage"/>
  </div>
</template>

<script>
import MySondagesItem from './MySondagesItem.vue'
export default {
  name: 'MySondagesList',
  components: {
    MySondagesItem
  },
  props: {
    sondages: Array,
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 0;
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