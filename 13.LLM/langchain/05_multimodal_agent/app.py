import streamlit as st
import requests
from PIL import Image
from io import BytesIO
from visual_agent_core import TravelAgent

st.set_page_config(page_title="AI 여행 스카우트", page_icon="🚗")
st.title("AI 여행 스카우트")
st.markdown("여행지 사진을 올리면, **AI가 장소를 식별하고 여행 가이드를 만들어드립니다!**")

# 이미지 소스 초기화
image_source = None

# 에이전트 초기화
if "agent" not in st.session_state:
    st.session_state['agent'] = TravelAgent()

tab1, tab2 = st.tabs(["이미지 URL 입력", "파일 업로드"])

with tab1:
    url_input = st.text_input(
        "이미지 URL을 넣어주세요:",
        placeholder="https://example.com/image.jpg"
    )

    if url_input:
        image_source = url_input
        try:
            headers = {
                "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64)"
            }
            response = requests.get(url_input, headers=headers, stream=True)
            response.raise_for_status()

            image_data = Image.open(BytesIO(response.content))
            st.image(image_data)
        except Exception:
            st.error("이미지를 불러올 수 없습니다.")

if st.button("여행 가이드 생성하기"):
    if not image_source:
        st.warning("이미지를 먼저 입력해주세요.")
    else:
        with st.spinner("AI가 사진을 분석하고 정보를 검색중입니다..."):
            try:
                result = st.session_state['agent'].run(image_source)

                st.success("완료!")

                st.subheader(f"식별된 장소: {result['place']}")
                st.markdown(result['guide'])

            except Exception as e:
                st.error(f"오류가 발생했습니다: {e}")
