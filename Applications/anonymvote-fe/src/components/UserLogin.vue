<template>
  <div class="connection">
    <form @submit.prevent="login">
        <label for="login">Login : <input type="text" name="login" id="login"></label><br><br>
        <label for="motDePasse">Mot-de-passe : <input type="password" name="motDePasse" id="motDePasse"></label><br><br>
        <button type="submit">Connexion</button>
    </form>
  </div>
</template>

<script>
import UtilisateurService from '../store/modules/UtilisateurService.js'

export default {
  name: 'UserLogin',
  data() {
		return {
			token: null
		};
	},
  methods: {
      login(submitEvent) {

          UtilisateurService.login(submitEvent.target.elements.login.value, submitEvent.target.elements.motDePasse.value);
      }
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
