<template>
  <v-app>
    <v-main>
      <TitleHeader />
      <CategoryList />
      <ProductList />
    </v-main>
  </v-app>
</template>

<script>
import TitleHeader from './components/TitleHeader.vue';
import CategoryList from './components/CategoryList.vue';
import ProductList from './components/ProductList.vue';

export default {
  name: 'App',

  components: {
    TitleHeader,
    CategoryList,
    ProductList
  },
}
</script>
