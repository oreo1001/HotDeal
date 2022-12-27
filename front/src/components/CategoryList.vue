<template>
  <v-container>
    <v-row>
      ddd
      <!-- <h1>
      {{ categoryNames }}</h1> -->
      <!-- <v-col
        v-for="categoryName in categoryNames"
        :key="categoryName"
        class="align-center"
        @click="onClick"
      >
        <CategoryButton :category-name="카테고리이름" />
        카테고리버튼
      </v-col> -->
    </v-row>
  </v-container>
</template>

  
<script>
// import { ref } from 'vue'
// import CategoryButton from './CategoryButton.vue'

export default {
  name: 'CategoryList',

  components: {
    // CategoryButton
  },

  setup() {

    // currentCategory: ""

    // categoryNames: ['패션 / 뷰티', '가구 / 생활', '가전 / 컴퓨터', '여행 / 자동차']

    // let counter = ref(0)

    // const onClick = (evt) => {
    //   if (evt) {
    //     counter.value++
    //   }
    // }

    return {
      // counter,
      // categoryNames,
      // onClick
    }
  },
  
  // async created() {
  //   // await this.$store.dispatch("GetProductListApi/FETCH_PRODUCTLIST_API")
  //   // this.currentCategory = this.$store.state.GetProductListApi.currentCategory
  //   // this.categoryNames = this.$store.state.GetProductListApi.categoryNames
  // }
}
</script>