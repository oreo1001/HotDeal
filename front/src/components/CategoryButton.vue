<template>
  <div class="text-center">
    <v-card>
      <v-img 
        class="bg-white"
        :aspect-ratio="1"
        :src="imgLink"
      />
      <h3> {{ categoryName }}</h3>
    </v-card>
  </div>
</template>

<script>
import { toRef } from '@vue/reactivity'
export default {
    name: CategoryButton,
    props: {
        categoryName: {
            type: String,
            required: true,
            validator: function (value) {
                return typeof value == String
            }
        }
    },
    setup(props) {

        const categoryName = toRef(props, 'categoryName')
        const imgLink = '../assets/' + categoryName

        return {
            imgLink
        }
    }
}
</script>