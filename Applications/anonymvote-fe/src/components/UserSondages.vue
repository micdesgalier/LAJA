<template>
  <div class="userSondages">
    <h1>{{ this.nomUtilisateur }}</h1>
    <h2>Liste des sondages auquels vous avez accès</h2>
    <sondages-list :sondages="userSondagesList"/>
  </div>
</template>

<script>
import SondageService from '../store/modules/SondageService.js'
import SondagesList from './SondagesList.vue'
import Login from '../store/modules/Login.js'

export default {
  name: 'UserSondages',
  components: {
    SondagesList
  },
  data() {
		return {
      nomUtilisateur: "",
			userSondagesList: []
		};
	},
  methods: {
    getSondagesUtilisateur(login) {

        SondageService.sondagesUtilisateur(login)
          .then(data => {
            data.forEach(element => {
              this.userSondagesList.push(element);
            });
            this.nomUtilisateur = Login.login;
          })
          .catch(err => console.log(err));
    }
  },
  created() {
    this.getSondagesUtilisateur(Login.login);
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
