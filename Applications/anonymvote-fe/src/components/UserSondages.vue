<template>
  <div class="userSondages">
    <h2>Liste des sondages</h2>
  </div>
</template>

<script>
import SondageService from '../store/modules/SondageService.js'

export default {
  name: 'UserSondages',
  data() {
		return {
			sondages: []
		};
	},
  methods: {
    getSondagesUtilisateur(login) {
        
        alert("t");
        SondageService.sondagesUtilisateur(login);
    }
  },
  created() {
    this.getSondagesUtilisateur("marilou26");
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
