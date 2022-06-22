<template>
  <div class="resultatsSondage">
    <router-link to="/main">Menu princpal</router-link>
    <resultats-sondage />
  </div>
</template>

<script>
// @ is an alias to /src
import ResultatsSondage from '@/components/ResultatsSondage.vue'

export default {
  name: 'SondageView',
  components: {
    ResultatsSondage
  }
}
</script>