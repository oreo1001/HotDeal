import axios from'axios'

export default function() {
  const BASE_URL = 'http://localhost:8000'
  const axiosGet = (URL, onSuccess = null, onFailed = null) => {
    const final_URL = URL.startsWith('http') ? URL : BASE_URL + URL
    axios.get(final_URL).then((resp) => {
      if (resp.status === 200 && resp.data.rsp === 'ok') {
        if (onSuccess) {
          onSuccess(resp.data)
        }
      } else {
        if (onFailed) {
          onFailed(resp.data)
        }
      }
    })
  }

  return {
    axiosGet,
  }
}
