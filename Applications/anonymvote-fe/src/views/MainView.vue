<template>
  <div class="main">
    <nav>
      <a v-on:click="showMySondages()">Mes sondages</a> |
      <a v-on:click="showUserSondages()">Tous les sondages</a> |
      <a v-on:click="createSondage()">Créer un sondage</a>
    </nav>
    <user-sondages v-show="userSondages"/>
    <my-sondages  v-show="mySondages"/>
  </div>
</template>

<script>
// @ is an alias to /src
import UserSondages from '@/components/UserSondages.vue'
import MySondages from '@/components/MySondages.vue'
import Login from '@/store/modules/Login.js'
import SondageService from '@/store/modules/SondageService.js'
import UtilisateurService from '@/store/modules/UtilisateurService.js'

export default {
  name: 'MainView',
  components: {
    UserSondages,
    MySondages
  },
  data() {
		return {
			mySondages: true,
      userSondages: false,
		};
	},
  methods: {
      showUserSondages() {

        this.mySondages = false;
        this.userSondages = true;
      },
      showMySondages() {

        this.userSondages = false;
        this.mySondages = true;
      },
      createSondage() {
        UtilisateurService.getUtilisateurByLogin(Login.login)
          .then(data => {
              SondageService.getLastSondageId()
                .then(data2 => {
                  console.log(data2);
                  SondageService.createSondage(data2, data.id_utilisateur);
                })
          })
          .catch(err => console.log(err));
      }
  }
}
</script>