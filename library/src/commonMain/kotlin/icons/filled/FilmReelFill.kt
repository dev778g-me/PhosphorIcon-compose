package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FilmReelFill: ImageVector
    get() {
        if (_FilmReelFill != null) {
            return _FilmReelFill!!
        }
        _FilmReelFill = ImageVector.Builder(
            name = "Filled.FilmReelFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 216f)
                lineTo(183.36f, 216f)
                arcTo(103.95f, 103.95f, 0f, isMoreThanHalf = true, isPositiveArc = false, 128f, 232f)
                lineTo(232f, 232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(80f, 148f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, -20f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 148f)
                close()
                moveTo(128f, 196f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, -20f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 196f)
                close()
                moveTo(128f, 100f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, -20f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 100f)
                close()
                moveTo(156f, 128f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 20f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 156f, 128f)
                close()
            }
        }.build()

        return _FilmReelFill!!
    }

@Suppress("ObjectPropertyName")
private var _FilmReelFill: ImageVector? = null
