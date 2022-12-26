<template>
  <ProductContainer
    v-for="i in 4"
    :key="i"
  />
</template>

<script>
import axios from 'axios';
import ProductContainer from './ProductContainer.vue';

export default {
    components: { ProductContainer }, 
    setup() {
    
    }
}
</script>