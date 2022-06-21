<template>
  <div class="sondage">
    <my-sondage-detail />
  </div>
</template>

<script>
// @ is an alias to /src
import MySondageDetail from '@/components/MySondageDetail.vue'

export default {
  name: 'MySondageView',
  components: {
    MySondageDetail
  }
}
</script>