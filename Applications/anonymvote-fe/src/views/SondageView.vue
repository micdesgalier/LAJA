<template>
  <div class="sondage">
    <router-link to="/main">Menu princpal</router-link>
    <sondage-detail />
  </div>
</template>

<script>
// @ is an alias to /src
import SondageDetail from '@/components/SondageDetail.vue'

export default {
  name: 'SondageView',
  components: {
    SondageDetail
  }
}
</script>