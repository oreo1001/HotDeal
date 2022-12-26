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

export default {
  name: 'HomeView',

  components: {
    TitleHeader,
    CategoryList,
    ProductContainer,
    ProductList
},

  data: () => ({
    //
  }),
}
</script>
