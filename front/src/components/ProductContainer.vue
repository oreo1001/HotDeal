<template>
  <v-container>
    <v-row>
      <v-col
        :cols="5"
        class="ma-1 pa-1"
      >
        <a :href="link">
          <v-img 
            sytle="display: block"
            class="bg-white rounded-sm"
            max-height="100"
            :src="imgUrl"
          />
        </a>
      </v-col>
      <v-col
        :cols="6"
        class="ma-0 pa-0"
      >
        <h4> {{ productName }}</h4>
        <p />
        <h4>&nbsp; ${{ productPrice }} {{ discountRate }}%</h4>
        <p />
        <h4>~133,145₩</h4>
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
export default {
  name: 'ProductContainer',
  props: {
    productName: {
      type: String,
      required: true,
    },
    productPrice: {
      type: Number,
      required: true
    },
    discountRate: {
      type: Number,
      required: true
    },
    imgUrl: {
      type: String,
      required: true,
    },
    link: {
      type: String,
      required: true,
    },
  },
}
</script>