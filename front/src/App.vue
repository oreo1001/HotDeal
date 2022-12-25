<template>
  <v-app>
    <v-main>
      <TitleHeader />
      <HelloWorld />
    </v-main>
  </v-app>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'
import TitleHeader from './components/TitleHeader.vue';

export default {
  name: 'App',

  components: {
    HelloWorld,
    TitleHeader
  },

  data: () => ({
    //
  }),
}
</script>
