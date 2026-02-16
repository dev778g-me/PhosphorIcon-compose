package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.StarFourFill: ImageVector
    get() {
        if (_StarFourFill != null) {
            return _StarFourFill!!
        }
        _StarFourFill = ImageVector.Builder(
            name = "Filled.StarFourFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 128f)
                arcToRelative(15.79f, 15.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.5f, 15f)
                lineToRelative(-63.44f, 23.07f)
                lineTo(143f, 229.5f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -30f, 0f)
                lineTo(89.94f, 166.06f)
                lineTo(26.5f, 143f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -30f)
                lineTo(89.94f, 89.94f)
                lineTo(113f, 26.5f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 30f, 0f)
                lineToRelative(23.07f, 63.44f)
                lineTo(229.5f, 113f)
                arcTo(15.79f, 15.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 128f)
                close()
            }
        }.build()

        return _StarFourFill!!
    }

@Suppress("ObjectPropertyName")
private var _StarFourFill: ImageVector? = null
