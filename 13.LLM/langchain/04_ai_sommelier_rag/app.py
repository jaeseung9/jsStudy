import streamlit as st
from PIL import Image
import requests
from io import BytesIO
from ai_sommelier_rag import ai_sommelier_rag

st.title("AI Sommelier RAG")
st.write("🍖음식 이미지 URL을 작성하면, 어울리는 와인을 추천해드립니다.")

# 사용자 입력 폼
with st.form(key='image_form'):
    image_url = st.text_input("음식 이미지 URL을 입력하세요:", "")
    submit_button = st.form_submit_button(label='추천 받기')

# 결과 처리 및 출력
if submit_button and image_url:
    try: 
        # URL에서 이미지 다운로드 및 화면표시
        response = requests.get(image_url)
        response.raise_for_status()  # HTTP 오류 발생 시 예외 발생
        image = Image.open(BytesIO(response.content))
        st.image(image, caption='입력된 음식 이미지', use_column_width=True)
        # AI 메세지 출력
        with st.spinner('와인을 추천하는 중입니다...'):
            response_stream = ai_sommelier_rag(image_urls=[image_url])
            st.subheader("추천 와인:")
            st.write_stream(response_stream)
    except requests.exceptions.RequestException as e:
        st.error(f"이미지를 불러오는 중 오류가 발생했습니다: {e}")
else:
    st.warning("이미지 URL을 입력하고 '추천 받기' 버튼을 눌러주세요.")