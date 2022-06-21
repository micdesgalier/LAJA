<template>
  <div class="itemSondage">
    <router-link :to="{ name: 'sondage', params: { id: sondage.id_sondage }}"><h3 :id="sondage.id_sondage">{{ sondage.sujet }}</h3></router-link>
  </div>
</template>

<script>
export default {
  name: 'SondagesItem',
  props: {
    sondage: Object
  }
}
</script>