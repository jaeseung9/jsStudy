'use client';
import { searchMenu } from '@/api/MenuAPI';
import { useSearchParams } from 'next/navigation';
import { useEffect, useState } from 'react';
import MenuItem from '@/item/MenuItem'; // 추가!

export default function MenuSearchResult() {
  const searchParam = useSearchParams(); // () 괄호 추가!

  const menuName = searchParam.get('menuName'); // 쿼리스트링의 '키' 에 해당하는 값(value)을 가져온다.
  console.log(menuName);

  const [menuList, setMenuList] = useState([]);

  useEffect(() => {
    if (menuName) {
      setMenuList(searchMenu(menuName));
    }
  }, [menuName]); // [] → [menuName]

  return (
    <>
      <h1>검색결과: {menuName}</h1>
      <div>
        {menuList.length > 0 ? (
          menuList.map((menu) => <MenuItem key={menu.menuCode} menu={menu} />)
        ) : (
          <p>검색 결과가 없습니다.</p>
        )}
      </div>
    </>
  );
}
