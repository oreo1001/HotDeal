<template>
  <v-app>
    <v-main>
      <TitleHeader />
      <CategoryList />
      <ProductContainer />
      <ProductList />
    </v-main>
  </v-app>
</template>

<script>
import TitleHeader from './components/TitleHeader.vue';
import CategoryList from './components/CategoryList.vue';
import ProductContainer from './components/ProductContainer.vue';
import ProductList from './components/ProductList.vue';
import axios from 'axios';

export default {
  name: 'App',

  components: {
    TitleHeader,
    CategoryList,
    ProductContainer,
    ProductList
},

  setup() {

    // const categoryNames = ref([])


    // axios.get('/api/category/names')
    // .then(res => {

    // })
  },
}
</script>
