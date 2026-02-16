package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ChatDotsFill: ImageVector
    get() {
        if (_ChatDotsFill != null) {
            return _ChatDotsFill!!
        }
        _ChatDotsFill = ImageVector.Builder(
            name = "Filled.ChatDotsFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 48f)
                lineTo(40f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 64f)
                lineTo(24f, 224f)
                arcToRelative(15.84f, 15.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.25f, 14.5f)
                arcTo(16.05f, 16.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 240f)
                arcToRelative(15.89f, 15.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.25f, -3.78f)
                lineToRelative(0.09f, -0.07f)
                lineTo(83f, 208f)
                lineTo(216f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(232f, 64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 48f)
                close()
                moveTo(84f, 140f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84f, 140f)
                close()
                moveTo(128f, 140f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 140f)
                close()
                moveTo(172f, 140f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 172f, 140f)
                close()
            }
        }.build()

        return _ChatDotsFill!!
    }

@Suppress("ObjectPropertyName")
private var _ChatDotsFill: ImageVector? = null
