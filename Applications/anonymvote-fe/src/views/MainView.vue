<template>
  <div class="main">
    <user-sondages />
  </div>
</template>

<script>
// @ is an alias to /src
import UserSondages from '@/components/UserSondages.vue'

export default {
  name: 'MainView',
  components: {
    UserSondages
  }
}
</script>