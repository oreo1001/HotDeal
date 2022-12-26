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
import { provide, ref } from 'vue'

export default {
  name: 'App',

  components: {
    TitleHeader,
    CategoryList,
    ProductContainer,
    ProductList
},

  setup() {

    const categoryNames = ref([])
    provide('categoryNames', categoryNames)

    const currentCategory = ref('all')
    provide('currentCategory', currentCategory)

    const productList = ref([])
    provide('productList', productList)


    axios.get('/api/category/names')
    .then(res => {
      categoryNames.value = res.data['result']
      console.log(categoryNames.value)
    })

    // axios.get('api/category/'+currentCategory.value+'/list')
    // .then(res => {
    //   productList.value = res.data['result']
    //   console.log(productList.value)
    // })




  },
}
</script>
