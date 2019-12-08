package cecilia.moron.recyclerviewlugares

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var lugares = ArrayList<Lugar>()
        lugares.add(Lugar("Egipto", "https://images.memphistours.com/large/878747e5d8c8577f506f41c328d4e5d8.jpg", "Descripcion,Descripcion,Descripcion,Descripcion,Descripcion,Descripcion"))
        lugares.add(Lugar("Egipto", "https://images.memphistours.com/large/878747e5d8c8577f506f41c328d4e5d8.jpg", "Descripcion"))
        lugares.add(Lugar("Egipto", "https://images.memphistours.com/large/878747e5d8c8577f506f41c328d4e5d8.jpg", "Descripcion"))
        lugares.add(Lugar("México", "https://foodandtravel.mx/wp-content/uploads/2019/06/ViajarengloboOk.jpg", "Descripcion"))
        lugares.add(Lugar("México", "https://foodandtravel.mx/wp-content/uploads/2019/06/ViajarengloboOk.jpg", "Descripcion"))
        lugares.add(Lugar("México", "https://foodandtravel.mx/wp-content/uploads/2019/06/ViajarengloboOk.jpg", "Descripcion"))

        miRecycler.adapter = LugarAdapter(lugares = lugares, context = this)
        miRecycler.layoutManager = GridLayoutManager(this, 1,GridLayoutManager.VERTICAL, true)
        //miRecycler.layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        //miRecycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }
}
