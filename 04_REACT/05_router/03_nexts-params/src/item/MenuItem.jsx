import itemStyle from "./MenuItem.module.css"
import Link from "next/link"  // "next/lick" → "next/link", link → Link

export default function MenuItem({menu}) {
    return (
        <Link href={`/menu/${menu.menuCode}`}>  {/* () 괄호 → {} 중괄호 */}
            <div className={itemStyle.MenuItem}>
                <h3>메뉴 이름 : {menu.menuName}</h3>
                <h3>메뉴 가격 : {menu.menuPrice}</h3>
                <h3>메뉴 종류 : {menu.categoryName}</h3>
            </div>
        </Link>
    )
}