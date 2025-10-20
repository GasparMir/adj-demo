import TestController from "./modules/test/test.controller"

function App() {
  return (
    <>
      <nav className='bg-gray-200 p-3 flex w-full gap-4'>
        <a href="">ADJ-Demo</a>
        <ul>
          <li>
            <a href="">Home</a>
          </li>
        </ul>
      </nav>
      <div className='flex flex-col p-8'>
        <h2 className='text-2xl font-bold uppercase mb-4'>Inicio</h2>
        <div>
          <button
            className='px-4 py-2 rounded bg-green-600 text-white cursor-pointer hover:bg-green-700 duration-300'
            onClick={() => TestController.callToApi()}
          >
            Llamar a mi API
          </button>
        </div>
      </div>
    </>
  )
}

export default App
