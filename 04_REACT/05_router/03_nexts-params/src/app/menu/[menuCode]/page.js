'use client';
import { useState, useEffect } from 'react';
import { useParams } from 'next/navigation';
import { getMenuByMenuCode } from '@/api/MenuAPI';

export default function MenuDetail() {
  const { menuCode } = useParams(); // pathVariable 값을 가져올 수 있다.
  console.log(menuCode);

  const [menu, setMenu] = useState(null);

  useEffect(() => {
    const foundMenu = getMenuByMenuCode(menuCode);
    console.log('찾은 메뉴:', foundMenu);
    setMenu(foundMenu[0]);
  }, []);

  if (!menu) {
    return <h1>로딩 중...</h1>;
  }

  return (
    <>
      <h1>{menu.menuName} 상세 페이지!</h1>
      <h3>메뉴가격: {menu.menuPrice}원</h3>
      <h3>메뉴종류: {menu.categoryName}</h3>
      <h3>메뉴설명: {menu.detail?.description || '설명 없음'}</h3>
      {menu.detail?.image && (
        <img
          src={menu.detail.image}
          style={{ maxWidth: 500 }}
          alt={menu.menuName}
        />
      )}
    </>
  );
}
