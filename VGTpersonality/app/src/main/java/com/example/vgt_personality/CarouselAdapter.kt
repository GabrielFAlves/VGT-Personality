import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.RoundedCornersTransformation
import com.example.vgt_personality.R

class CarouselAdapter(private val images: List<String>) :
    RecyclerView.Adapter<CarouselAdapter.CarouselViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarouselViewHolder {
        return CarouselViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.image_item, parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: CarouselViewHolder, position: Int) {
        holder.bind(images[position], position)
    }

    override fun getItemCount(): Int {
        return images.size
    }

    inner class CarouselViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val carouselImageView: AppCompatImageView =
            view.findViewById(R.id.carouselImageView)

        fun bind(imageUrl: String, position: Int) {
            carouselImageView.load(imageUrl) {
                transformations(RoundedCornersTransformation(8f))
            }
            carouselImageView.setOnClickListener {
                val context = carouselImageView.context
                val intent = when (position) {
                    0 -> Intent(Intent.ACTION_VIEW, Uri.parse("https://pro-barbearia.vercel.app/"))
                    1 -> Intent(Intent.ACTION_VIEW, Uri.parse("https://pizza-robot.vercel.app/"))
                    2 -> Intent(Intent.ACTION_VIEW, Uri.parse("https://gvfirmeza.github.io/EnglishVocabularyQuiz/"))
                    else -> null
                }
                intent?.let {
                    context.startActivity(it)
                }
            }
        }
    }
}
