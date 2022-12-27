<template>
  <v-container>
    <v-row>
      <v-col
        v-for="categoryName in categoryNames"
        :key="categoryName"
        class="align-center"
        :cols="3"
      >
        <CategoryButton
          :category-name="categoryName"
        />
      </v-col>
    </v-row>
  </v-container>
  <!-- <h1> {{ currentCategory }}</h1> -->
</template>

  
<script>
import CategoryButton from './CategoryButton.vue'

export default {
  name: 'CategoryList',

  components: {
    CategoryButton
  },

  data() {
    return {
      categoryNames: ['fashion_beauty', 'furniture_living', 'homeAppliances_computers', 'travel_car']
    }
  },
  
  // computed: {
  //   currentCategory() {
  //     return this.$store.state.GetProductListApi.currentCategory
  //   }
  // },
}
</script>