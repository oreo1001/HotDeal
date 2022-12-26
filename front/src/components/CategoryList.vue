<template>
  <v-container>
    <v-row>
      <v-col
        v-for="category in categoryNames"
        :key="category['name']"
        class="align-center"
        @click="onClick"
      >
        <div class="text-center">
          <v-card>
            <v-img 
              class="bg-white"
              :aspect-ratio="1"
              src="https://cdn.vuetifyjs.com/images/parallax/material.jpg"
            />
            <!-- <h1>이미지 들어갈 곳</h1> -->
            <h3> {{ category['name'] }}</h3>
            <h3> {{ counter }}</h3>
          </v-card>
        </div>
      </v-col>
    </v-row>
  </v-container>
</template>

  
<script>
import axios from 'axios'
import { inject, ref } from 'vue'

export default {
  name: 'CategoryList',
  components: {}, 
  setup() {
    let counter = ref(0)

    const categoryNames = inject('categoryNames')

    const onClick = (evt) => {
      if (evt) {
        counter.value++
      }
    }

    return {
      counter,
      categoryNames,
      onClick
    }
  }, 
}
</script>