<template>
  <div class="sondage">
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