'use client';
import { getMenuList } from '@/api/MenuAPI';
import MenuItem from '@/item/MenuItem';
import { useState, useEffect } from 'react';
import boxStyle from './Menu.module.css';
import { useRouter } from 'next/navigation';

export default function Menu() {
  const [menuList, setMenuList] = useState([]);
  const [searchValue, setSearchValue] = useState(''); // setSerachValue → setSearchValue

  const router = useRouter();

  useEffect(() => {
    setMenuList(getMenuList());
  }, []);

  const onClickHandler = () => {
    router.push(`/menu/search?menuName=${searchValue}`); // = 빠졌음
  };

  return (
    <>
      <h1>메뉴 페이지 입니다.</h1>
      <div>
        <input
          type="search"
          name="menuName"
          value={searchValue}
          onChange={(e) => setSearchValue(e.target.value)} // 이벤트 핸들러 추가
        />
        <button onClick={onClickHandler}>검색</button> {/* button 태그 수정 */}
      </div>
      <div className={boxStyle.MenuBox}>
        {menuList.map((menu) => (
          <MenuItem key={menu.menuCode} menu={menu} />
        ))}
      </div>
    </>
  );
}
