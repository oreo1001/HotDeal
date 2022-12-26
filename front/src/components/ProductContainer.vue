<template>
  <v-container>
    <v-row>
      <v-img 
        class="bg-white rounded-sm"
        max-height="100"
        src="https://cdn.vuetifyjs.com/images/parallax/material.jpg"
      />
      <!-- <h1>이미지 들어갈 곳</h1> -->
      <v-card
        title="Nike Sportswear Club Fleece"
        subtitle="$99"
        text="133,145₩"
      />
    </v-row>
  </v-container>
</template>

<script>
export default {
    name: 'ProductContainer',
    components: {}, 
    setup() {}, 
    data() {
        return {
            sampleData: ''
        }
    }, 
    created() {},
    mounted() {}, 
    unmounted() {},
    methods: {}
}
</script>