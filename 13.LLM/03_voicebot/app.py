import streamlit as st
from audiorecorder import audiorecorder
from streamlit_chat import message as msg
import openai_api



st.set_page_config(layout="wide")
st.header("🎵voice Chatbot")

# Session State 초기화
if 'messages' not in st.session_state:
    st.session_state.messages = [
        {"role": "system", "content": "당신은 유쾌한 대화형 AI 비서입니다. 사용자가 음성으로 질문하면, 친절하고 유머러스하게 답변해 주세요."}
    ]

# 초기화 플래그( 녹음 후 화면 리셋 방지용)
if 'check_reset' not in st.session_state:
    st.session_state['check_reset'] = False

with st.sidebar:
    model = st.radio("모델 선택", ("gpt-3.5-turbo", "gpt-5-nano"))
    if st.button("초기화"):
        st.session_state['messages'] = [{"role":"system", "content": " ..."}]
        st.session_state['check_reset'] = True

# 레이아웃 구성
col1, col2 = st.columns(2)

with col1:
    st.subheader("녹음하기")

    audio = audiorecorder("🎙️ Start recording", "⏹️ Stop recording")

    st.write("audio:", audio)
    st.write("duration:", audio.duration_seconds)
    st.write("raw length:", len(audio.raw_data) if audio else None)

    if audio and len(audio.raw_data) > 0 and not st.session_state['check_reset']:
        st.success("녹음 완료")

        st.audio(audio.export().read())

        # STT
        text = openai_api.stt(audio)
        st.write("인식 결과:", text)

        # TTS
        audio_tag = openai_api.tts(text)
        st.components.v1.html(audio_tag)
