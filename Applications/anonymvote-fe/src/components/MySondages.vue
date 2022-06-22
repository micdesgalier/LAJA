<template>
  <div class="mySondages">
    <h1>{{ this.nomUtilisateur }}</h1>
    <h2>Liste des sondages créé par l'utilisateur</h2>
    <my-sondages-list :sondages="mySondagesList" v-on:removeSondage="removeSondage($event)"/>
  </div>
</template>

<script>
import SondageService from '../store/modules/SondageService.js'
import MySondagesList from './MySondagesList.vue'
import Login from '../store/modules/Login.js'

export default {
  name: 'MySondages',
  components: {
    MySondagesList
  },
  data() {
		return {
      nomUtilisateur: "",
			mySondagesList: []
		};
	},
  methods: {
    getMySondages(login) {

        SondageService.sondagesOwnByUtilisateur(login)
          .then(data => {
            data.forEach(element => {
              this.mySondagesList.push(element);
            });
            this.nomUtilisateur = Login.login;
          })
          .catch(err => console.log(err));
    },
    removeSondage(idSondage) {

        let pos = this.mySondagesList.indexOf(this.mySondagesList.find(x => x.id_sondage === idSondage))
        this.mySondagesList.splice(pos, 1);
    }
  },
  created() {
    this.getMySondages(Login.login);
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
