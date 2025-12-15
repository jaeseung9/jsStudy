from my_parser import parse_qa_data_to_list
import os
import json

def runpipeline():
    """전체 데이터 처리 파이프라인을 실행하는 메인 함수"""
    print("텍스트를 JSON으로 변환하는 파이프라인 시작...")

    # 현재 실행 중인 파일(main.py)의 절대 경로를 기준으로 경로 설정 
    base_dir = os.path.dirname(os.path.abspath(__file__))
    # 입/출력 파일 경로 만들기
    input_file_path = os.path.join(base_dir, 'data', 'qa_data.txt')
    output_file_path = os.path.join(base_dir, 'data', 'qa_for_llm.json')

    qa_data = parse_qa_data_to_list(input_file_path)
    if qa_data:
        print(f"총 {len(qa_data)}개의 Q&A 쌍을 파싱했습니다.")
        try:
            with open(output_file_path, 'w', encoding='utf-8') as f:
                json.dump(qa_data, f, indent=2, ensure_ascii=False)
            print(f"JSON 파일로 저장 완료: {output_file_path}")
        except Exception as e:
            print(f"파일 저장 중 오류 발생: {e}")
    else:
        print("파싱된 Q&A 데이터가 없습니다.")
    
    print("파이프라인 종료.")

if __name__ == "__main__":
    runpipeline()

