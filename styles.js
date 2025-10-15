// styles.js - 팀 공통 스타일 가이드

// ========== 색상 ==========
export const colors = {
  // 메인 컬러
  primary: '#4A90E2', // 파란색
  secondary: '#7B68EE', // 보라색

  // 배경색
  background: '#F5F5F5', // 연한 회색
  white: '#FFFFFF',

  // 텍스트
  textBlack: '#333333',
  textGray: '#666666',
  textLight: '#999999',

  // 상태 색상
  success: '#4CAF50', // 초록 (성공)
  warning: '#FF9800', // 주황 (경고)
  error: '#F44336', // 빨강 (에러)
  info: '#2196F3', // 하늘색 (정보)

  // 테두리
  border: '#DDDDDD',
  borderDark: '#CCCCCC',
};

// ========== 간격 (padding, margin) ==========
export const spacing = {
  xs: '4px',
  sm: '8px',
  md: '16px',
  lg: '24px',
  xl: '32px',
  xxl: '48px',
};

// ========== 폰트 크기 ==========
export const fontSize = {
  small: '12px',
  medium: '14px',
  large: '16px',
  xlarge: '20px',
  xxlarge: '24px',
  title: '32px',
};

// ========== 폰트 굵기 ==========
export const fontWeight = {
  light: 300,
  normal: 400,
  medium: 500,
  bold: 700,
};

// ========== 그림자 ==========
export const shadow = {
  small: '0 2px 4px rgba(0,0,0,0.1)',
  medium: '0 4px 8px rgba(0,0,0,0.15)',
  large: '0 8px 16px rgba(0,0,0,0.2)',
};

// ========== 테두리 반경 ==========
export const borderRadius = {
  small: '4px',
  medium: '8px',
  large: '12px',
  circle: '50%',
};

// ========== 공통 스타일 컴포넌트 ==========
export const commonStyles = {
  // 컨테이너
  container: {
    maxWidth: '1200px',
    margin: '0 auto',
    padding: spacing.md,
  },

  // 카드
  card: {
    backgroundColor: colors.white,
    padding: spacing.lg,
    borderRadius: borderRadius.medium,
    boxShadow: shadow.small,
  },

  // 버튼 기본
  button: {
    padding: `${spacing.sm} ${spacing.lg}`,
    fontSize: fontSize.medium,
    fontWeight: fontWeight.medium,
    border: 'none',
    borderRadius: borderRadius.small,
    cursor: 'pointer',
    transition: 'all 0.3s',
  },

  // 주요 버튼
  buttonPrimary: {
    backgroundColor: colors.primary,
    color: colors.white,
  },

  // 보조 버튼
  buttonSecondary: {
    backgroundColor: colors.secondary,
    color: colors.white,
  },

  // 삭제 버튼
  buttonDanger: {
    backgroundColor: colors.error,
    color: colors.white,
  },

  // input
  input: {
    padding: spacing.md,
    fontSize: fontSize.medium,
    border: `1px solid ${colors.border}`,
    borderRadius: borderRadius.small,
    width: '100%',
  },

  // 제목
  heading: {
    fontSize: fontSize.title,
    fontWeight: fontWeight.bold,
    color: colors.textBlack,
    margin: `${spacing.lg} 0`,
  },
};
// ========== 사용 예시 (주석) ==========
/*

// import는 export된 값을 가져올 때 쓰며,
같은 폴더 안에 있는 파일을 불러올 땐 './파일명.js' 형태로 경로를 쓴다.

import { colors, spacing, commonStyles } from './styles.js';  ('./styles.js' : 같은 위치에 있다.)

// 1. 직접 사용
<div style={{ backgroundColor: colors.primary, padding: spacing.md }}>

// 2. 공통 스타일 사용
<button style={commonStyles.buttonPrimary}>클릭</button>

// 3. 스타일 합치기 (...spread 연산자)
<button style={{ ...commonStyles.button, ...commonStyles.buttonPrimary }}>
  클릭
</button>

// 4. 추가 스타일과 합치기
<div style={{ ...commonStyles.card, marginTop: spacing.lg }}>
  내용
</div>
*/

/* 간단한 예시 */

/* 

import { colors, spacing } from './styles.js'; // 다른파일에서 가져온다.

function Header() {   
  return (
    <div style={{

      backgroundColor: colors.black,  ※                                  ※
      color: colors.white,                요소에 이렇게 넣어주시면 됩니다.
      padding: spacing.large          ※                                  ※

    }}>
      <h1>오늘의 할일!</h1>
    </div>
  );
}

*/
