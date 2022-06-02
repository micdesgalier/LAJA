<template>
  <div class="login">
    <h1>Page de connexion</h1>
    <user-login />
  </div>
</template>

<script>
// @ is an alias to /src
import UserLogin from '@/components/UserLogin.vue'

export default {
  name: 'LoginView',
  components: {
    UserLogin
  }
}
</script>