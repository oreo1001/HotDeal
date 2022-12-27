<template>
  <v-container>
    <v-row>
      <v-col
        v-for="category in categoryNames"
        :key="category['name']"
        class="align-center"
        @click="onClick"
      >
        <CategoryButton :category-name="카테고리이름" />
      </v-col>
    </v-row>
  </v-container>
</template>

  
<script>
import { inject, ref } from 'vue'
import CategoryButton from './CategoryButton.vue'

export default {
  name: 'CategoryList',

  components: {
    CategoryButton
  },

  setup() {

    currentCategory: ""

    categoryNames: []

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
  
  async created() {
    await this.$store.dispatch("GetProductListApi/FETCH_PRODUCTLIST_API")
    this.currentCategory = this.$store.state.GetProductListApi.currentCategory
    this.categoryNames = this.$store.state.GetProductListApi.categoryNames
  }
}
</script>