import FirstComponent, {AnotherComponent} from "./FirstComponent";
import ClassComponent from "./ClassComponent";
import JavaScriptTest from "./JavaScriptTest";


export default function ComponentMain() {
    return (
        <div>
            <FirstComponent/>
            <ClassComponent></ClassComponent>
            <AnotherComponent></AnotherComponent>
            <JavaScriptTest></JavaScriptTest>
        </div>
    )
}